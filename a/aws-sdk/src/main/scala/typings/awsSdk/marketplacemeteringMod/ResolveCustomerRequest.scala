package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveCustomerRequest extends StObject {
  
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
  implicit class ResolveCustomerRequestMutableBuilder[Self <: ResolveCustomerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistrationToken(value: NonEmptyString): Self = StObject.set(x, "RegistrationToken", value.asInstanceOf[js.Any])
  }
}
