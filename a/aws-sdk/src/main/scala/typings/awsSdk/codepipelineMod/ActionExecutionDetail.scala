package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionExecutionDetail extends StObject {
  
  /**
    * The action execution ID.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.undefined
  
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.undefined
  
  /**
    * Input details for the action execution, such as role ARN, Region, and input artifacts.
    */
  var input: js.UndefOr[ActionExecutionInput] = js.undefined
  
  /**
    * The last update time of the action execution.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Output details for the action execution, such as the action execution result.
    */
  var output: js.UndefOr[ActionExecutionOutput] = js.undefined
  
  /**
    * The pipeline execution ID for the action execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  
  /**
    * The version of the pipeline where the action was run.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
  
  /**
    * The name of the stage that contains the action.
    */
  var stageName: js.UndefOr[StageName] = js.undefined
  
  /**
    * The start time of the action execution.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.undefined
}
object ActionExecutionDetail {
  
  @scala.inline
  def apply(): ActionExecutionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionDetail]
  }
  
  @scala.inline
  implicit class ActionExecutionDetailMutableBuilder[Self <: ActionExecutionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionExecutionId(value: ActionExecutionId): Self = StObject.set(x, "actionExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionExecutionIdUndefined: Self = StObject.set(x, "actionExecutionId", js.undefined)
    
    @scala.inline
    def setActionName(value: ActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setInput(value: ActionExecutionInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setOutput(value: ActionExecutionOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
    
    @scala.inline
    def setPipelineVersion(value: PipelineVersion): Self = StObject.set(x, "pipelineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineVersionUndefined: Self = StObject.set(x, "pipelineVersion", js.undefined)
    
    @scala.inline
    def setStageName(value: StageName): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ActionExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
