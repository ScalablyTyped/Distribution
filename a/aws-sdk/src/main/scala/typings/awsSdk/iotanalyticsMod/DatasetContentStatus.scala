package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentStatus extends js.Object {
  /**
    * The reason the data set contents are in this state.
    */
  var reason: js.UndefOr[Reason] = js.native
  /**
    * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
    */
  var state: js.UndefOr[DatasetContentState] = js.native
}

object DatasetContentStatus {
  @scala.inline
  def apply(reason: Reason = null, state: DatasetContentState = null): DatasetContentStatus = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentStatus]
  }
}

