package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DkimAttributes extends js.Object {
  /**
    * A string that indicates how DKIM was configured for the identity. There are two possible values:    AWS_SES – Indicates that DKIM was configured for the identity by using Easy DKIM.    EXTERNAL – Indicates that DKIM was configured for the identity by using Bring Your Own DKIM (BYODKIM).  
    */
  var SigningAttributesOrigin: js.UndefOr[DkimSigningAttributesOrigin] = js.native
  /**
    * If the value is true, then the messages that you send from the identity are signed using DKIM. If the value is false, then the messages that you send from the identity aren't DKIM-signed.
    */
  var SigningEnabled: js.UndefOr[Enabled] = js.native
  /**
    * Describes whether or not Amazon SES has successfully located the DKIM records in the DNS records for the domain. The status can be one of the following:    PENDING – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM records in the DNS configuration for the domain.    SUCCESS – The verification process completed successfully.    FAILED – The verification process failed. This typically occurs when Amazon SES fails to find the DKIM records in the DNS configuration of the domain.    TEMPORARY_FAILURE – A temporary issue is preventing Amazon SES from determining the DKIM authentication status of the domain.    NOT_STARTED – The DKIM verification process hasn't been initiated for the domain.  
    */
  var Status: js.UndefOr[DkimStatus] = js.native
  /**
    * If you used Easy DKIM to configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. If you configured DKIM authentication for the domain by providing your own public-private key pair, then this object contains the selector for the public key. Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS configuration of the domain for up to 72 hours.
    */
  var Tokens: js.UndefOr[DnsTokenList] = js.native
}

object DkimAttributes {
  @scala.inline
  def apply(): DkimAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DkimAttributes]
  }
  @scala.inline
  implicit class DkimAttributesOps[Self <: DkimAttributes] (val x: Self) extends AnyVal {
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
    def setSigningAttributesOrigin(value: DkimSigningAttributesOrigin): Self = this.set("SigningAttributesOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningAttributesOrigin: Self = this.set("SigningAttributesOrigin", js.undefined)
    @scala.inline
    def setSigningEnabled(value: Enabled): Self = this.set("SigningEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningEnabled: Self = this.set("SigningEnabled", js.undefined)
    @scala.inline
    def setStatus(value: DkimStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTokensVarargs(value: DnsToken*): Self = this.set("Tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: DnsTokenList): Self = this.set("Tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("Tokens", js.undefined)
  }
  
}

