package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReprocessingSummary extends js.Object {
  /**
    * The time the pipeline reprocessing was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The 'reprocessingId' returned by "StartPipelineReprocessing".
    */
  var id: js.UndefOr[ReprocessingId] = js.native
  /**
    * The status of the pipeline reprocessing.
    */
  var status: js.UndefOr[ReprocessingStatus] = js.native
}

object ReprocessingSummary {
  @scala.inline
  def apply(creationTime: Timestamp = null, id: ReprocessingId = null, status: ReprocessingStatus = null): ReprocessingSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprocessingSummary]
  }
}

