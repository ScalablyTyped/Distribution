package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCarrierGatewayResult extends StObject {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateway: js.UndefOr[typings.awsSdk.ec2Mod.CarrierGateway] = js.undefined
}
object CreateCarrierGatewayResult {
  
  @scala.inline
  def apply(): CreateCarrierGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCarrierGatewayResult]
  }
  
  @scala.inline
  implicit class CreateCarrierGatewayResultMutableBuilder[Self <: CreateCarrierGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierGateway(value: CarrierGateway): Self = StObject.set(x, "CarrierGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierGatewayUndefined: Self = StObject.set(x, "CarrierGateway", js.undefined)
  }
}
