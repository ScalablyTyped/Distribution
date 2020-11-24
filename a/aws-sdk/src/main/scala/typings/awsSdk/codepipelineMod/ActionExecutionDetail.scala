package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionExecutionDetail extends js.Object {
  
  /**
    * The action execution ID.
    */
  var actionExecutionId: js.UndefOr[ActionExecutionId] = js.native
  
  /**
    * The name of the action.
    */
  var actionName: js.UndefOr[ActionName] = js.native
  
  /**
    * Input details for the action execution, such as role ARN, Region, and input artifacts.
    */
  var input: js.UndefOr[ActionExecutionInput] = js.native
  
  /**
    * The last update time of the action execution.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Output details for the action execution, such as the action execution result.
    */
  var output: js.UndefOr[ActionExecutionOutput] = js.native
  
  /**
    * The pipeline execution ID for the action execution.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
  
  /**
    * The version of the pipeline where the action was run.
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  
  /**
    * The name of the stage that contains the action.
    */
  var stageName: js.UndefOr[StageName] = js.native
  
  /**
    * The start time of the action execution.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The status of the action execution. Status categories are InProgress, Succeeded, and Failed.
    */
  var status: js.UndefOr[ActionExecutionStatus] = js.native
}
object ActionExecutionDetail {
  
  @scala.inline
  def apply(): ActionExecutionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionDetail]
  }
  
  @scala.inline
  implicit class ActionExecutionDetailOps[Self <: ActionExecutionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionExecutionId(value: ActionExecutionId): Self = this.set("actionExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionExecutionId: Self = this.set("actionExecutionId", js.undefined)
    
    @scala.inline
    def setActionName(value: ActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    
    @scala.inline
    def setInput(value: ActionExecutionInput): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setOutput(value: ActionExecutionOutput): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPipelineExecutionId(value: PipelineExecutionId): Self = this.set("pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineExecutionId: Self = this.set("pipelineExecutionId", js.undefined)
    
    @scala.inline
    def setPipelineVersion(value: PipelineVersion): Self = this.set("pipelineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineVersion: Self = this.set("pipelineVersion", js.undefined)
    
    @scala.inline
    def setStageName(value: StageName): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ActionExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
