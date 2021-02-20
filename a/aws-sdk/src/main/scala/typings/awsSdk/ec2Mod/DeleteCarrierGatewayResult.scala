package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCarrierGatewayResult extends StObject {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateway: js.UndefOr[typings.awsSdk.ec2Mod.CarrierGateway] = js.native
}
object DeleteCarrierGatewayResult {
  
  @scala.inline
  def apply(): DeleteCarrierGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCarrierGatewayResult]
  }
  
  @scala.inline
  implicit class DeleteCarrierGatewayResultMutableBuilder[Self <: DeleteCarrierGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierGateway(value: CarrierGateway): Self = StObject.set(x, "CarrierGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierGatewayUndefined: Self = StObject.set(x, "CarrierGateway", js.undefined)
  }
}
