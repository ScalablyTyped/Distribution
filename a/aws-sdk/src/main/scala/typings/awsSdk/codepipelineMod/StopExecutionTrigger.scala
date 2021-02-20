package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopExecutionTrigger extends StObject {
  
  /**
    * The user-specified reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.native
}
object StopExecutionTrigger {
  
  @scala.inline
  def apply(): StopExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopExecutionTrigger]
  }
  
  @scala.inline
  implicit class StopExecutionTriggerMutableBuilder[Self <: StopExecutionTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: StopPipelineExecutionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
