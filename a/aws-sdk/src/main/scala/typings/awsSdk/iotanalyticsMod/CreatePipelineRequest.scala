package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineRequest extends StObject {
  
  /**
    * A list of PipelineActivity objects. Activities perform transformations on your messages, such as removing, renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda functions on messages for advanced processing; or performing mathematical transformations to normalize device data. The list can be 2-25 PipelineActivity objects and must contain both a channel and a datastore activity. Each entry in the list must contain only one activity. For example:  pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ] 
    */
  var pipelineActivities: PipelineActivities
  
  /**
    * The name of the pipeline.
    */
  var pipelineName: PipelineName
  
  /**
    * Metadata which can be used to manage the pipeline.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreatePipelineRequest {
  
  inline def apply(pipelineActivities: PipelineActivities, pipelineName: PipelineName): CreatePipelineRequest = {
    val __obj = js.Dynamic.literal(pipelineActivities = pipelineActivities.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineRequest]
  }
  
  extension [Self <: CreatePipelineRequest](x: Self) {
    
    inline def setPipelineActivities(value: PipelineActivities): Self = StObject.set(x, "pipelineActivities", value.asInstanceOf[js.Any])
    
    inline def setPipelineActivitiesVarargs(value: PipelineActivity*): Self = StObject.set(x, "pipelineActivities", js.Array(value :_*))
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
