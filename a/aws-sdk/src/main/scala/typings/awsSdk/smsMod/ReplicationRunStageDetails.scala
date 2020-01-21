package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRunStageDetails extends js.Object {
  /**
    * String describing the current stage of a replication run.
    */
  var stage: js.UndefOr[ReplicationRunStage] = js.native
  /**
    * String describing the progress of the current stage of a replication run.
    */
  var stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.native
}

object ReplicationRunStageDetails {
  @scala.inline
  def apply(stage: ReplicationRunStage = null, stageProgress: ReplicationRunStageProgress = null): ReplicationRunStageDetails = {
    val __obj = js.Dynamic.literal()
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (stageProgress != null) __obj.updateDynamic("stageProgress")(stageProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRunStageDetails]
  }
}

