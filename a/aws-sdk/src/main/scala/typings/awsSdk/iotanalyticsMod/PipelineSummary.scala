package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSummary extends js.Object {
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * When the pipeline was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.native
}

object PipelineSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    lastUpdateTime: Timestamp = null,
    pipelineName: PipelineName = null,
    reprocessingSummaries: ReprocessingSummaries = null
  ): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (pipelineName != null) __obj.updateDynamic("pipelineName")(pipelineName.asInstanceOf[js.Any])
    if (reprocessingSummaries != null) __obj.updateDynamic("reprocessingSummaries")(reprocessingSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineSummary]
  }
}

