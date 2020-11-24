package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipeline extends js.Object {
  
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
  implicit class PipelineOps[Self <: Pipeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivitiesVarargs(value: PipelineActivity*): Self = this.set("activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: PipelineActivities): Self = this.set("activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    
    @scala.inline
    def setArn(value: PipelineArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    
    @scala.inline
    def setName(value: PipelineName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReprocessingSummariesVarargs(value: ReprocessingSummary*): Self = this.set("reprocessingSummaries", js.Array(value :_*))
    
    @scala.inline
    def setReprocessingSummaries(value: ReprocessingSummaries): Self = this.set("reprocessingSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReprocessingSummaries: Self = this.set("reprocessingSummaries", js.undefined)
  }
}
