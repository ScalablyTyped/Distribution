package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    activities: PipelineActivities = null,
    arn: PipelineArn = null,
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    name: PipelineName = null,
    reprocessingSummaries: ReprocessingSummaries = null
  ): Pipeline = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reprocessingSummaries != null) __obj.updateDynamic("reprocessingSummaries")(reprocessingSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pipeline]
  }
}

