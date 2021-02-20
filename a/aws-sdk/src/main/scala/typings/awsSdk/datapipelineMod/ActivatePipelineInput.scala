package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivatePipelineInput extends StObject {
  
  /**
    * A list of parameter values to pass to the pipeline at activation.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  
  /**
    * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
    */
  var startTimestamp: js.UndefOr[timestamp] = js.native
}
object ActivatePipelineInput {
  
  @scala.inline
  def apply(pipelineId: id): ActivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatePipelineInput]
  }
  
  @scala.inline
  implicit class ActivatePipelineInputMutableBuilder[Self <: ActivatePipelineInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterValues(value: ParameterValueList): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValuesUndefined: Self = StObject.set(x, "parameterValues", js.undefined)
    
    @scala.inline
    def setParameterValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "parameterValues", js.Array(value :_*))
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestamp(value: timestamp): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
  }
}
