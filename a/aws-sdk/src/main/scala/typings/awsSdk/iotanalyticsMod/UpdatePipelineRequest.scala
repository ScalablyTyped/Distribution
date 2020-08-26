package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineRequest extends js.Object {
  /**
    * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing, renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda functions on messages for advanced processing; or performing mathematical transformations to normalize device data. The list can be 2-25 PipelineActivity objects and must contain both a channel and a datastore activity. Each entry in the list must contain only one activity, for example:  pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ] 
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
  implicit class UpdatePipelineRequestOps[Self <: UpdatePipelineRequest] (val x: Self) extends AnyVal {
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
    def setPipelineActivitiesVarargs(value: PipelineActivity*): Self = this.set("pipelineActivities", js.Array(value :_*))
    @scala.inline
    def setPipelineActivities(value: PipelineActivities): Self = this.set("pipelineActivities", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
  }
  
}

