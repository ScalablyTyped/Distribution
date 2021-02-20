package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePipelineRequest extends StObject {
  
  /**
    * A list of PipelineActivity objects. Activities perform transformations on your messages, such as removing, renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda functions on messages for advanced processing; or performing mathematical transformations to normalize device data. The list can be 2-25 PipelineActivity objects and must contain both a channel and a datastore activity. Each entry in the list must contain only one activity. For example:  pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ] 
    */
  var pipelineActivities: PipelineActivities = js.native
  
  /**
    * The name of the pipeline to update.
    */
  var pipelineName: PipelineName = js.native
}
object UpdatePipelineRequest {
  
  @scala.inline
  def apply(pipelineActivities: PipelineActivities, pipelineName: PipelineName): UpdatePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineActivities = pipelineActivities.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineRequest]
  }
  
  @scala.inline
  implicit class UpdatePipelineRequestMutableBuilder[Self <: UpdatePipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineActivities(value: PipelineActivities): Self = StObject.set(x, "pipelineActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineActivitiesVarargs(value: PipelineActivity*): Self = StObject.set(x, "pipelineActivities", js.Array(value :_*))
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
