package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetTimerAction extends js.Object {
  /**
    * The name of the timer to reset.
    */
  var timerName: TimerName = js.native
}

object ResetTimerAction {
  @scala.inline
  def apply(timerName: TimerName): ResetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetTimerAction]
  }
}

