package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartInferenceSchedulerRequest extends StObject {
  
  /**
    * The name of the inference scheduler to be started. 
    */
  var InferenceSchedulerName: InferenceSchedulerIdentifier
}
object StartInferenceSchedulerRequest {
  
  inline def apply(InferenceSchedulerName: InferenceSchedulerIdentifier): StartInferenceSchedulerRequest = {
    val __obj = js.Dynamic.literal(InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInferenceSchedulerRequest]
  }
  
  extension [Self <: StartInferenceSchedulerRequest](x: Self) {
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
  }
}
