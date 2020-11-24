package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyDomainIdentityResponse extends js.Object {
  
  /**
    * A TXT record that you must place in the DNS settings of the domain to complete domain verification with Amazon SES. As Amazon SES searches for the TXT record, the domain's verification status is "Pending". When Amazon SES detects the record, the domain's verification status changes to "Success". If Amazon SES is unable to detect the record within 72 hours, the domain's verification status changes to "Failed." In that case, if you still want to verify the domain, you must restart the verification process from the beginning.
    */
  var VerificationToken: typings.awsSdk.sesMod.VerificationToken = js.native
}
object VerifyDomainIdentityResponse {
  
  @scala.inline
  def apply(VerificationToken: VerificationToken): VerifyDomainIdentityResponse = {
    val __obj = js.Dynamic.literal(VerificationToken = VerificationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyDomainIdentityResponse]
  }
  
  @scala.inline
  implicit class VerifyDomainIdentityResponseOps[Self <: VerifyDomainIdentityResponse] (val x: Self) extends AnyVal {
    
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
    def setVerificationToken(value: VerificationToken): Self = this.set("VerificationToken", value.asInstanceOf[js.Any])
  }
}
