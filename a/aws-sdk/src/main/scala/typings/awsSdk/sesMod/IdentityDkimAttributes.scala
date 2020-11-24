package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityDkimAttributes extends js.Object {
  
  /**
    * Is true if DKIM signing is enabled for email sent from the identity. It's false otherwise. The default value is true.
    */
  var DkimEnabled: Enabled = js.native
  
  /**
    * A set of character strings that represent the domain's identity. Using these tokens, you need to create DNS CNAME records that point to DKIM public keys that are hosted by Amazon SES. Amazon Web Services eventually detects that you've updated your DNS records. This detection process might take up to 72 hours. After successful detection, Amazon SES is able to DKIM-sign email originating from that domain. (This only applies to domain identities, not email address identities.) For more information about creating DNS records using DKIM tokens, see the Amazon SES Developer Guide.
    */
  var DkimTokens: js.UndefOr[VerificationTokenList] = js.native
  
  /**
    * Describes whether Amazon SES has successfully verified the DKIM DNS records (tokens) published in the domain name's DNS. (This only applies to domain identities, not email address identities.)
    */
  var DkimVerificationStatus: VerificationStatus = js.native
}
object IdentityDkimAttributes {
  
  @scala.inline
  def apply(DkimEnabled: Enabled, DkimVerificationStatus: VerificationStatus): IdentityDkimAttributes = {
    val __obj = js.Dynamic.literal(DkimEnabled = DkimEnabled.asInstanceOf[js.Any], DkimVerificationStatus = DkimVerificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityDkimAttributes]
  }
  
  @scala.inline
  implicit class IdentityDkimAttributesOps[Self <: IdentityDkimAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDkimEnabled(value: Enabled): Self = this.set("DkimEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimVerificationStatus(value: VerificationStatus): Self = this.set("DkimVerificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkimTokensVarargs(value: VerificationToken*): Self = this.set("DkimTokens", js.Array(value :_*))
    
    @scala.inline
    def setDkimTokens(value: VerificationTokenList): Self = this.set("DkimTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkimTokens: Self = this.set("DkimTokens", js.undefined)
  }
}
