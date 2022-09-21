package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveCustomerRequest extends StObject {
  
  /**
    * When a buyer visits your website during the registration process, the buyer submits a registration token through the browser. The registration token is resolved to obtain a CustomerIdentifier along with the CustomerAWSAccountId and ProductCode.
    */
  var RegistrationToken: NonEmptyString
}
object ResolveCustomerRequest {
  
  inline def apply(RegistrationToken: NonEmptyString): ResolveCustomerRequest = {
    val __obj = js.Dynamic.literal(RegistrationToken = RegistrationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCustomerRequest]
  }
  
  extension [Self <: ResolveCustomerRequest](x: Self) {
    
    inline def setRegistrationToken(value: NonEmptyString): Self = StObject.set(x, "RegistrationToken", value.asInstanceOf[js.Any])
  }
}
