package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointRequest extends StObject {
  
  /**
    * Data access role ARN to use in case the new model is encrypted with a customer CMK.
    */
  var DesiredDataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.undefined
  
  /**
    * The ARN of the new model to use when updating an existing endpoint.
    */
  var DesiredModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being updated.
    */
  var EndpointArn: ComprehendEndpointArn
}
object UpdateEndpointRequest {
  
  inline def apply(EndpointArn: ComprehendEndpointArn): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  
  extension [Self <: UpdateEndpointRequest](x: Self) {
    
    inline def setDesiredDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DesiredDataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDesiredDataAccessRoleArnUndefined: Self = StObject.set(x, "DesiredDataAccessRoleArn", js.undefined)
    
    inline def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "DesiredInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setDesiredInferenceUnitsUndefined: Self = StObject.set(x, "DesiredInferenceUnits", js.undefined)
    
    inline def setDesiredModelArn(value: ComprehendModelArn): Self = StObject.set(x, "DesiredModelArn", value.asInstanceOf[js.Any])
    
    inline def setDesiredModelArnUndefined: Self = StObject.set(x, "DesiredModelArn", js.undefined)
    
    inline def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
