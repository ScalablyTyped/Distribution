package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPositionConfigurationResponse extends StObject {
  
  /**
    * The position data destination that describes the AWS IoT rule that processes the device's position data for use by AWS IoT Core for LoRaWAN.
    */
  var Destination: js.UndefOr[DestinationName] = js.undefined
  
  /**
    * The wrapper for the solver configuration details object.
    */
  var Solvers: js.UndefOr[PositionSolverDetails] = js.undefined
}
object GetPositionConfigurationResponse {
  
  inline def apply(): GetPositionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPositionConfigurationResponse]
  }
  
  extension [Self <: GetPositionConfigurationResponse](x: Self) {
    
    inline def setDestination(value: DestinationName): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setSolvers(value: PositionSolverDetails): Self = StObject.set(x, "Solvers", value.asInstanceOf[js.Any])
    
    inline def setSolversUndefined: Self = StObject.set(x, "Solvers", js.undefined)
  }
}
