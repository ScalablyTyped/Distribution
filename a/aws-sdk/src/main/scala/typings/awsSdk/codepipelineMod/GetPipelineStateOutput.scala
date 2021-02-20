package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPipelineStateOutput extends StObject {
  
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
  implicit class GetPipelineStateOutputMutableBuilder[Self <: GetPipelineStateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineNameUndefined: Self = StObject.set(x, "pipelineName", js.undefined)
    
    @scala.inline
    def setPipelineVersion(value: PipelineVersion): Self = StObject.set(x, "pipelineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineVersionUndefined: Self = StObject.set(x, "pipelineVersion", js.undefined)
    
    @scala.inline
    def setStageStates(value: StageStateList): Self = StObject.set(x, "stageStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageStatesUndefined: Self = StObject.set(x, "stageStates", js.undefined)
    
    @scala.inline
    def setStageStatesVarargs(value: StageState*): Self = StObject.set(x, "stageStates", js.Array(value :_*))
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
