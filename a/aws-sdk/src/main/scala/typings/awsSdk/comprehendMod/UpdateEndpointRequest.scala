package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEndpointRequest extends StObject {
  
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: InferenceUnitsInteger = js.native
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being updated.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}
object UpdateEndpointRequest {
  
  @scala.inline
  def apply(DesiredInferenceUnits: InferenceUnitsInteger, EndpointArn: ComprehendEndpointArn): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(DesiredInferenceUnits = DesiredInferenceUnits.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  
  @scala.inline
  implicit class UpdateEndpointRequestMutableBuilder[Self <: UpdateEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "DesiredInferenceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
