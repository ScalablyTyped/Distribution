package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveCustomerRequest extends js.Object {
  
  /**
    * When a buyer visits your website during the registration process, the buyer submits a registration token through the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
    */
  var RegistrationToken: NonEmptyString = js.native
}
object ResolveCustomerRequest {
  
  @scala.inline
  def apply(RegistrationToken: NonEmptyString): ResolveCustomerRequest = {
    val __obj = js.Dynamic.literal(RegistrationToken = RegistrationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCustomerRequest]
  }
  
  @scala.inline
  implicit class ResolveCustomerRequestOps[Self <: ResolveCustomerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegistrationToken(value: NonEmptyString): Self = this.set("RegistrationToken", value.asInstanceOf[js.Any])
  }
}
