package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyDomainDkimResponse extends js.Object {
  
  /**
    * A set of character strings that represent the domain's identity. If the identity is an email address, the tokens represent the domain of that address. Using these tokens, you need to create DNS CNAME records that point to DKIM public keys that are hosted by Amazon SES. Amazon Web Services eventually detects that you've updated your DNS records. This detection process might take up to 72 hours. After successful detection, Amazon SES is able to DKIM-sign email originating from that domain. (This only applies to domain identities, not email address identities.) For more information about creating DNS records using DKIM tokens, see the Amazon SES Developer Guide.
    */
  var DkimTokens: VerificationTokenList = js.native
}
object VerifyDomainDkimResponse {
  
  @scala.inline
  def apply(DkimTokens: VerificationTokenList): VerifyDomainDkimResponse = {
    val __obj = js.Dynamic.literal(DkimTokens = DkimTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainDkimResponse]
  }
  
  @scala.inline
  implicit class VerifyDomainDkimResponseOps[Self <: VerifyDomainDkimResponse] (val x: Self) extends AnyVal {
    
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
    def setDkimTokensVarargs(value: VerificationToken*): Self = this.set("DkimTokens", js.Array(value :_*))
    
    @scala.inline
    def setDkimTokens(value: VerificationTokenList): Self = this.set("DkimTokens", value.asInstanceOf[js.Any])
  }
}
