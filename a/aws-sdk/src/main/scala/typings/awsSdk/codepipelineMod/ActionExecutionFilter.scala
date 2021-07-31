package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionExecutionFilter extends StObject {
  
  /**
    * The pipeline execution ID used to filter action execution history.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}
object ActionExecutionFilter {
  
  @scala.inline
  def apply(): ActionExecutionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionFilter]
  }
  
  @scala.inline
  implicit class ActionExecutionFilterMutableBuilder[Self <: ActionExecutionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
