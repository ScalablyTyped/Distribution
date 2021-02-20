package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePipelineRequest extends StObject {
  
  /**
    * A list of PipelineActivity objects. Activities perform transformations on your messages, such as removing, renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda functions on messages for advanced processing; or performing mathematical transformations to normalize device data. The list can be 2-25 PipelineActivity objects and must contain both a channel and a datastore activity. Each entry in the list must contain only one activity. For example:  pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ] 
    */
  var pipelineActivities: PipelineActivities = js.native
  
  /**
    * The name of the pipeline.
    */
  var pipelineName: PipelineName = js.native
  
  /**
    * Metadata which can be used to manage the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreatePipelineRequest {
  
  @scala.inline
  def apply(pipelineActivities: PipelineActivities, pipelineName: PipelineName): CreatePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineActivities = pipelineActivities.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineRequest]
  }
  
  @scala.inline
  implicit class CreatePipelineRequestMutableBuilder[Self <: CreatePipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineActivities(value: PipelineActivities): Self = StObject.set(x, "pipelineActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineActivitiesVarargs(value: PipelineActivity*): Self = StObject.set(x, "pipelineActivities", js.Array(value :_*))
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
