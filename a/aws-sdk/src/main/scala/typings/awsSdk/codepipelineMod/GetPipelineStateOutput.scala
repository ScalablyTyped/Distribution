package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPipelineStateOutput extends js.Object {
  
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the pipeline for which you want to get the state.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  
  /**
    * The version number of the pipeline.  A newly created pipeline is always assigned a version number of 1. 
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.native
  
  /**
    * A list of the pipeline stage output information, including stage name, state, most recent run details, whether the stage is disabled, and other data.
    */
  var stageStates: js.UndefOr[StageStateList] = js.native
  
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.native
}
object GetPipelineStateOutput {
  
  @scala.inline
  def apply(): GetPipelineStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineStateOutput]
  }
  
  @scala.inline
  implicit class GetPipelineStateOutputOps[Self <: GetPipelineStateOutput] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineName: Self = this.set("pipelineName", js.undefined)
    
    @scala.inline
    def setPipelineVersion(value: PipelineVersion): Self = this.set("pipelineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineVersion: Self = this.set("pipelineVersion", js.undefined)
    
    @scala.inline
    def setStageStatesVarargs(value: StageState*): Self = this.set("stageStates", js.Array(value :_*))
    
    @scala.inline
    def setStageStates(value: StageStateList): Self = this.set("stageStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageStates: Self = this.set("stageStates", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
