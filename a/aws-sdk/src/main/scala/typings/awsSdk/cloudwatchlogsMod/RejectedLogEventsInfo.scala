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
  def apply(): RejectedLogEventsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectedLogEventsInfo]
  }
  @scala.inline
  implicit class RejectedLogEventsInfoOps[Self <: RejectedLogEventsInfo] (val x: Self) extends AnyVal {
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
    def setExpiredLogEventEndIndex(value: LogEventIndex): Self = this.set("expiredLogEventEndIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiredLogEventEndIndex: Self = this.set("expiredLogEventEndIndex", js.undefined)
    @scala.inline
    def setTooNewLogEventStartIndex(value: LogEventIndex): Self = this.set("tooNewLogEventStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooNewLogEventStartIndex: Self = this.set("tooNewLogEventStartIndex", js.undefined)
    @scala.inline
    def setTooOldLogEventEndIndex(value: LogEventIndex): Self = this.set("tooOldLogEventEndIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooOldLogEventEndIndex: Self = this.set("tooOldLogEventEndIndex", js.undefined)
  }
  
}

