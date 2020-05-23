package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryRunTimeline extends js.Object {
  /**
    * The end time of the run.
    */
  var Completed: js.UndefOr[Timestamp] = js.native
  /**
    * The start time of the run.
    */
  var Started: js.UndefOr[Timestamp] = js.native
}

object CanaryRunTimeline {
  @scala.inline
  def apply(Completed: Timestamp = null, Started: Timestamp = null): CanaryRunTimeline = {
    val __obj = js.Dynamic.literal()
    if (Completed != null) __obj.updateDynamic("Completed")(Completed.asInstanceOf[js.Any])
    if (Started != null) __obj.updateDynamic("Started")(Started.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryRunTimeline]
  }
}

