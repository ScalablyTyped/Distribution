package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInferenceSchedulerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the inference scheduler being started. 
    */
  var InferenceSchedulerArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.InferenceSchedulerArn] = js.undefined
  
  /**
    * The name of the inference scheduler being started. 
    */
  var InferenceSchedulerName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.InferenceSchedulerName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the ML model being used by the inference scheduler. 
    */
  var ModelArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelArn] = js.undefined
  
  /**
    * The name of the ML model being used by the inference scheduler. 
    */
  var ModelName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.ModelName] = js.undefined
  
  /**
    * Indicates the status of the inference scheduler. 
    */
  var Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
}
object StartInferenceSchedulerResponse {
  
  inline def apply(): StartInferenceSchedulerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInferenceSchedulerResponse]
  }
  
  extension [Self <: StartInferenceSchedulerResponse](x: Self) {
    
    inline def setInferenceSchedulerArn(value: InferenceSchedulerArn): Self = StObject.set(x, "InferenceSchedulerArn", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerArnUndefined: Self = StObject.set(x, "InferenceSchedulerArn", js.undefined)
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerName): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerNameUndefined: Self = StObject.set(x, "InferenceSchedulerName", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setStatus(value: InferenceSchedulerStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
