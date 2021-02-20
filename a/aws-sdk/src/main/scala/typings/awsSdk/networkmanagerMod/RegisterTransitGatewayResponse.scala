package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTransitGatewayResponse extends StObject {
  
  /**
    * Information about the transit gateway registration.
    */
  var TransitGatewayRegistration: js.UndefOr[typings.awsSdk.networkmanagerMod.TransitGatewayRegistration] = js.native
}
object RegisterTransitGatewayResponse {
  
  @scala.inline
  def apply(): RegisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTransitGatewayResponse]
  }
  
  @scala.inline
  implicit class RegisterTransitGatewayResponseMutableBuilder[Self <: RegisterTransitGatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayRegistration(value: TransitGatewayRegistration): Self = StObject.set(x, "TransitGatewayRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRegistrationUndefined: Self = StObject.set(x, "TransitGatewayRegistration", js.undefined)
  }
}
