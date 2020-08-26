package typings.awsSdkClientPinpointBrowser.typesQuietTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuietTime extends js.Object {
  /**
    * The time at which quiet time should end. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var End: js.UndefOr[String] = js.native
  /**
    * The time at which quiet time should begin. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var Start: js.UndefOr[String] = js.native
}

object QuietTime {
  @scala.inline
  def apply(): QuietTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuietTime]
  }
  @scala.inline
  implicit class QuietTimeOps[Self <: QuietTime] (val x: Self) extends AnyVal {
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
    def setEnd(value: String): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
  }
  
}

