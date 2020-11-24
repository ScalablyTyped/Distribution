package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEmailIdentityDkimSigningAttributesResponse extends js.Object {
  
  /**
    * The DKIM authentication status of the identity. Amazon SES determines the authentication status by searching for specific records in the DNS configuration for your domain. If you used Easy DKIM to set up DKIM authentication, Amazon SES tries to find three unique CNAME records in the DNS configuration for your domain. If you provided a public key to perform DKIM authentication, Amazon SES tries to find a TXT record that uses the selector that you specified. The value of the TXT record must be a public key that's paired with the private key that you specified in the process of creating the identity. The status can be one of the following:    PENDING – The verification process was initiated, but Amazon SES hasn't yet detected the DKIM records in the DNS configuration for the domain.    SUCCESS – The verification process completed successfully.    FAILED – The verification process failed. This typically occurs when Amazon SES fails to find the DKIM records in the DNS configuration of the domain.    TEMPORARY_FAILURE – A temporary issue is preventing Amazon SES from determining the DKIM authentication status of the domain.    NOT_STARTED – The DKIM verification process hasn't been initiated for the domain.  
    */
  var DkimStatus: js.UndefOr[typings.awsSdk.sesv2Mod.DkimStatus] = js.native
  
  /**
    * If you used Easy DKIM to configure DKIM authentication for the domain, then this object contains a set of unique strings that you use to create a set of CNAME records that you add to the DNS configuration for your domain. When Amazon SES detects these records in the DNS configuration for your domain, the DKIM authentication process is complete. If you configured DKIM authentication for the domain by providing your own public-private key pair, then this object contains the selector that's associated with your public key. Regardless of the DKIM authentication method you use, Amazon SES searches for the appropriate records in the DNS configuration of the domain for up to 72 hours.
    */
  var DkimTokens: js.UndefOr[DnsTokenList] = js.native
}
object PutEmailIdentityDkimSigningAttributesResponse {
  
  @scala.inline
  def apply(): PutEmailIdentityDkimSigningAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEmailIdentityDkimSigningAttributesResponse]
  }
  
  @scala.inline
  implicit class PutEmailIdentityDkimSigningAttributesResponseOps[Self <: PutEmailIdentityDkimSigningAttributesResponse] (val x: Self) extends AnyVal {
    
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
    def setDkimStatus(value: DkimStatus): Self = this.set("DkimStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkimStatus: Self = this.set("DkimStatus", js.undefined)
    
    @scala.inline
    def setDkimTokensVarargs(value: DnsToken*): Self = this.set("DkimTokens", js.Array(value :_*))
    
    @scala.inline
    def setDkimTokens(value: DnsTokenList): Self = this.set("DkimTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkimTokens: Self = this.set("DkimTokens", js.undefined)
  }
}
