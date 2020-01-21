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
    expiredLogEventEndIndex: Int | Double = null,
    tooNewLogEventStartIndex: Int | Double = null,
    tooOldLogEventEndIndex: Int | Double = null
  ): RejectedLogEventsInfo = {
    val __obj = js.Dynamic.literal()
    if (expiredLogEventEndIndex != null) __obj.updateDynamic("expiredLogEventEndIndex")(expiredLogEventEndIndex.asInstanceOf[js.Any])
    if (tooNewLogEventStartIndex != null) __obj.updateDynamic("tooNewLogEventStartIndex")(tooNewLogEventStartIndex.asInstanceOf[js.Any])
    if (tooOldLogEventEndIndex != null) __obj.updateDynamic("tooOldLogEventEndIndex")(tooOldLogEventEndIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectedLogEventsInfo]
  }
}

