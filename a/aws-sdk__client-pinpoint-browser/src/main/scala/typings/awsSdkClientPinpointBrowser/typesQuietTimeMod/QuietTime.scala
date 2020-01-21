package typings.awsSdkClientPinpointBrowser.typesQuietTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuietTime extends js.Object {
  /**
    * The time at which quiet time should end. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var End: js.UndefOr[String] = js.undefined
  /**
    * The time at which quiet time should begin. The value that you specify has to be in HH:mm format, where HH is the hour in 24-hour format (with a leading zero, if applicable), and mm is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var Start: js.UndefOr[String] = js.undefined
}

object QuietTime {
  @scala.inline
  def apply(End: String = null, Start: String = null): QuietTime = {
    val __obj = js.Dynamic.literal()
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuietTime]
  }
}

