package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectedLogEventsInfo extends js.Object {
  /**
    * The expired log events.
    */
  var expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.native
  /**
    * The log events that are too new.
    */
  var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.native
  /**
    * The log events that are too old.
    */
  var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.native
}

object RejectedLogEventsInfo {
  @scala.inline
  def apply(
    expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined,
    tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined,
    tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
  ): RejectedLogEventsInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiredLogEventEndIndex)) __obj.updateDynamic("expiredLogEventEndIndex")(expiredLogEventEndIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tooNewLogEventStartIndex)) __obj.updateDynamic("tooNewLogEventStartIndex")(tooNewLogEventStartIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tooOldLogEventEndIndex)) __obj.updateDynamic("tooOldLogEventEndIndex")(tooOldLogEventEndIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectedLogEventsInfo]
  }
}

