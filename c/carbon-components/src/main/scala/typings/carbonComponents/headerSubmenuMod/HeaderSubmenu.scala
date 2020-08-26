package typings.carbonComponents.headerSubmenuMod

import typings.carbonComponents.anon.ShouldBeExpanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait HeaderSubmenu extends js.Object {
  def _getAction(event: js.Any): js.Any = js.native
  def _getNewState(action: js.Any): Boolean = js.native
  def _handleEvent(event: js.Any): Unit = js.native
  def _handleKeyDown(event: js.Any): Unit = js.native
  def _setState(hasShouldBeExpandedShouldFocusOnOpen: ShouldBeExpanded): Unit = js.native
  def getCurrentNavigation(): js.Any = js.native
  def navigate(direction: js.Any): Unit = js.native
}

object HeaderSubmenu {
  @scala.inline
  def apply(
    _getAction: js.Any => js.Any,
    _getNewState: js.Any => Boolean,
    _handleEvent: js.Any => Unit,
    _handleKeyDown: js.Any => Unit,
    _setState: ShouldBeExpanded => Unit,
    getCurrentNavigation: () => js.Any,
    navigate: js.Any => Unit
  ): HeaderSubmenu = {
    val __obj = js.Dynamic.literal(_getAction = js.Any.fromFunction1(_getAction), _getNewState = js.Any.fromFunction1(_getNewState), _handleEvent = js.Any.fromFunction1(_handleEvent), _handleKeyDown = js.Any.fromFunction1(_handleKeyDown), _setState = js.Any.fromFunction1(_setState), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
    __obj.asInstanceOf[HeaderSubmenu]
  }
  @scala.inline
  implicit class HeaderSubmenuOps[Self <: HeaderSubmenu] (val x: Self) extends AnyVal {
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
    def set_getAction(value: js.Any => js.Any): Self = this.set("_getAction", js.Any.fromFunction1(value))
    @scala.inline
    def set_getNewState(value: js.Any => Boolean): Self = this.set("_getNewState", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleEvent(value: js.Any => Unit): Self = this.set("_handleEvent", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleKeyDown(value: js.Any => Unit): Self = this.set("_handleKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def set_setState(value: ShouldBeExpanded => Unit): Self = this.set("_setState", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentNavigation(value: () => js.Any): Self = this.set("getCurrentNavigation", js.Any.fromFunction0(value))
    @scala.inline
    def setNavigate(value: js.Any => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
  }
  
}

