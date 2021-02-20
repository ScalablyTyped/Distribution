package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipeline extends StObject {
  
  /**
    * The activities that perform transformations on the messages.
    */
  var activities: js.UndefOr[PipelineActivities] = js.native
  
  /**
    * The ARN of the pipeline.
    */
  var arn: js.UndefOr[PipelineArn] = js.native
  
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time the pipeline was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[PipelineName] = js.native
  
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.native
}
object Pipeline {
  
  @scala.inline
  def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  
  @scala.inline
  implicit class PipelineMutableBuilder[Self <: Pipeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: PipelineActivities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: PipelineActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setArn(value: PipelineArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReprocessingSummaries(value: ReprocessingSummaries): Self = StObject.set(x, "reprocessingSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprocessingSummariesUndefined: Self = StObject.set(x, "reprocessingSummaries", js.undefined)
    
    @scala.inline
    def setReprocessingSummariesVarargs(value: ReprocessingSummary*): Self = StObject.set(x, "reprocessingSummaries", js.Array(value :_*))
  }
}
