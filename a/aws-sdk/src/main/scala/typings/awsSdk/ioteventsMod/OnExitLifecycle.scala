package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnExitLifecycle extends js.Object {
  /**
    * Specifies the actions that are performed when the state is exited and the condition is TRUE.
    */
  var events: js.UndefOr[Events] = js.native
}

object OnExitLifecycle {
  @scala.inline
  def apply(events: Events = null): OnExitLifecycle = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExitLifecycle]
  }
}

