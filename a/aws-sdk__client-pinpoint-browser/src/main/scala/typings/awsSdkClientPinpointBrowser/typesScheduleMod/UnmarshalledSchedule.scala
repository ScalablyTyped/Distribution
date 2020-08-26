package typings.awsSdkClientPinpointBrowser.typesScheduleMod

import typings.awsSdkClientPinpointBrowser.typesQuietTimeMod.UnmarshalledQuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSchedule extends Schedule {
  /**
    * The time during which the campaign sends no messages.
    */
  @JSName("QuietTime")
  var QuietTime_UnmarshalledSchedule: js.UndefOr[UnmarshalledQuietTime] = js.native
}

object UnmarshalledSchedule {
  @scala.inline
  def apply(): UnmarshalledSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSchedule]
  }
  @scala.inline
  implicit class UnmarshalledScheduleOps[Self <: UnmarshalledSchedule] (val x: Self) extends AnyVal {
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
    def setQuietTime(value: UnmarshalledQuietTime): Self = this.set("QuietTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuietTime: Self = this.set("QuietTime", js.undefined)
  }
  
}

