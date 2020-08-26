package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEnterLifecycle extends js.Object {
  /**
    * Specifies the actions that are performed when the state is entered and the condition is TRUE.
    */
  var events: js.UndefOr[Events] = js.native
}

object OnEnterLifecycle {
  @scala.inline
  def apply(): OnEnterLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnterLifecycle]
  }
  @scala.inline
  implicit class OnEnterLifecycleOps[Self <: OnEnterLifecycle] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: Events): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
  
}

