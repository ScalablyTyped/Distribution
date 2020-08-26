package typings.carbonComponents.headerNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait HeaderNav extends js.Object {
  def _handleKeyDown(event: js.Any): Unit = js.native
  def getCurrentNavigation(): js.Any = js.native
  def navigate(direction: js.Any): Unit = js.native
}

object HeaderNav {
  @scala.inline
  def apply(_handleKeyDown: js.Any => Unit, getCurrentNavigation: () => js.Any, navigate: js.Any => Unit): HeaderNav = {
    val __obj = js.Dynamic.literal(_handleKeyDown = js.Any.fromFunction1(_handleKeyDown), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
    __obj.asInstanceOf[HeaderNav]
  }
  @scala.inline
  implicit class HeaderNavOps[Self <: HeaderNav] (val x: Self) extends AnyVal {
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
    def set_handleKeyDown(value: js.Any => Unit): Self = this.set("_handleKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentNavigation(value: () => js.Any): Self = this.set("getCurrentNavigation", js.Any.fromFunction0(value))
    @scala.inline
    def setNavigate(value: js.Any => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
  }
  
}

