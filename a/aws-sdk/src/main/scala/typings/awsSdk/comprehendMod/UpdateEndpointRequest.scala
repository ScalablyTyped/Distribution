package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointRequest extends StObject {
  
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: InferenceUnitsInteger
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being updated.
    */
  var EndpointArn: ComprehendEndpointArn
}
object UpdateEndpointRequest {
  
  inline def apply(DesiredInferenceUnits: InferenceUnitsInteger, EndpointArn: ComprehendEndpointArn): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(DesiredInferenceUnits = DesiredInferenceUnits.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  
  extension [Self <: UpdateEndpointRequest](x: Self) {
    
    inline def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "DesiredInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
