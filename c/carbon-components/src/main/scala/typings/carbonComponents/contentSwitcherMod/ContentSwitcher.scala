package typings.carbonComponents.contentSwitcherMod

import typings.carbonComponents.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait ContentSwitcher extends js.Object {
  def _changeState(hasItem: Item, callback: js.Any): Unit = js.native
  def _handleClick(event: js.Any): Unit = js.native
  def setActive(item: js.Any, callback: js.Any): Unit = js.native
}

object ContentSwitcher {
  @scala.inline
  def apply(
    _changeState: (Item, js.Any) => Unit,
    _handleClick: js.Any => Unit,
    setActive: (js.Any, js.Any) => Unit
  ): ContentSwitcher = {
    val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction2(_changeState), _handleClick = js.Any.fromFunction1(_handleClick), setActive = js.Any.fromFunction2(setActive))
    __obj.asInstanceOf[ContentSwitcher]
  }
  @scala.inline
  implicit class ContentSwitcherOps[Self <: ContentSwitcher] (val x: Self) extends AnyVal {
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
    def set_changeState(value: (Item, js.Any) => Unit): Self = this.set("_changeState", js.Any.fromFunction2(value))
    @scala.inline
    def set_handleClick(value: js.Any => Unit): Self = this.set("_handleClick", js.Any.fromFunction1(value))
    @scala.inline
    def setSetActive(value: (js.Any, js.Any) => Unit): Self = this.set("setActive", js.Any.fromFunction2(value))
  }
  
}

