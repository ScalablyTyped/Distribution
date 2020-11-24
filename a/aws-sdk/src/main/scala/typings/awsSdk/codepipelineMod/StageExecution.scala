package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageExecution extends js.Object {
  
  /**
    * The ID of the pipeline execution associated with the stage.
    */
  var pipelineExecutionId: PipelineExecutionId = js.native
  
  /**
    * The status of the stage, or for a completed stage, the last status of the stage.
    */
  var status: StageExecutionStatus = js.native
}
object StageExecution {
  
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId, status: StageExecutionStatus): StageExecution = {
    val __obj = js.Dynamic.literal(pipelineExecutionId = pipelineExecutionId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageExecution]
  }
  
  @scala.inline
  implicit class StageExecutionOps[Self <: StageExecution] (val x: Self) extends AnyVal {
    
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
    def setPipelineExecutionId(value: PipelineExecutionId): Self = this.set("pipelineExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StageExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
