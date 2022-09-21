package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartModelRequest extends StObject {
  
  /**
    * ClientToken is an idempotency token that ensures a call to StartModel completes only once. You choose the value to pass. For example, An issue might prevent you from getting a response from StartModel. In this case, safely retry your call to StartModel by using the same ClientToken parameter value.  If you don't supply a value for ClientToken, the AWS SDK you are using inserts a value for you. This prevents retries after a network error from making multiple start requests. You'll need to provide your own value for other use cases.  An error occurs if the other input parameters are not the same as in the first request. Using a different value for ClientToken is considered a new call to StartModel. An idempotency token is active for 8 hours. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.lookoutvisionMod.ClientToken] = js.undefined
  
  /**
    * The maximum number of inference units to use for auto-scaling the model. If you don't specify a value, Amazon Lookout for Vision doesn't auto-scale the model.
    */
  var MaxInferenceUnits: js.UndefOr[InferenceUnits] = js.undefined
  
  /**
    * The minimum number of inference units to use. A single inference unit represents 1 hour of processing. Use a higher number to increase the TPS throughput of your model. You are charged for the number of inference units that you use. 
    */
  var MinInferenceUnits: InferenceUnits
  
  /**
    * The version of the model that you want to start.
    */
  var ModelVersion: typings.awsSdk.lookoutvisionMod.ModelVersion
  
  /**
    * The name of the project that contains the model that you want to start.
    */
  var ProjectName: typings.awsSdk.lookoutvisionMod.ProjectName
}
object StartModelRequest {
  
  inline def apply(MinInferenceUnits: InferenceUnits, ModelVersion: ModelVersion, ProjectName: ProjectName): StartModelRequest = {
    val __obj = js.Dynamic.literal(MinInferenceUnits = MinInferenceUnits.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartModelRequest]
  }
  
  extension [Self <: StartModelRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setMaxInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MaxInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxInferenceUnitsUndefined: Self = StObject.set(x, "MaxInferenceUnits", js.undefined)
    
    inline def setMinInferenceUnits(value: InferenceUnits): Self = StObject.set(x, "MinInferenceUnits", value.asInstanceOf[js.Any])
    
    inline def setModelVersion(value: ModelVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
