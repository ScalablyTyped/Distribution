package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExecutionTrigger extends StObject {
  
  /**
    * The user-specified reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.undefined
}
object StopExecutionTrigger {
  
  inline def apply(): StopExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopExecutionTrigger]
  }
  
  extension [Self <: StopExecutionTrigger](x: Self) {
    
    inline def setReason(value: StopPipelineExecutionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
