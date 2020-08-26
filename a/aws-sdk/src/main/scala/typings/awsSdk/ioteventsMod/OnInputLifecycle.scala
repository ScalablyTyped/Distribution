package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnInputLifecycle extends js.Object {
  /**
    * Specifies the actions performed when the condition evaluates to TRUE.
    */
  var events: js.UndefOr[Events] = js.native
  /**
    * Specifies the actions performed, and the next state entered, when a condition evaluates to TRUE.
    */
  var transitionEvents: js.UndefOr[TransitionEvents] = js.native
}

object OnInputLifecycle {
  @scala.inline
  def apply(): OnInputLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnInputLifecycle]
  }
  @scala.inline
  implicit class OnInputLifecycleOps[Self <: OnInputLifecycle] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTransitionEventsVarargs(value: TransitionEvent*): Self = this.set("transitionEvents", js.Array(value :_*))
    @scala.inline
    def setTransitionEvents(value: TransitionEvents): Self = this.set("transitionEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionEvents: Self = this.set("transitionEvents", js.undefined)
  }
  
}

