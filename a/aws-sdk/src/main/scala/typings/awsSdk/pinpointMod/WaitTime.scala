package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitTime extends js.Object {
  /**
    * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's conditions have been met or moving participants to the next activity in the journey.
    */
  var WaitFor: js.UndefOr[string] = js.native
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have been met or the activity moves participants to the next activity in the journey.
    */
  var WaitUntil: js.UndefOr[string] = js.native
}

object WaitTime {
  @scala.inline
  def apply(WaitFor: string = null, WaitUntil: string = null): WaitTime = {
    val __obj = js.Dynamic.literal()
    if (WaitFor != null) __obj.updateDynamic("WaitFor")(WaitFor.asInstanceOf[js.Any])
    if (WaitUntil != null) __obj.updateDynamic("WaitUntil")(WaitUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitTime]
  }
}

