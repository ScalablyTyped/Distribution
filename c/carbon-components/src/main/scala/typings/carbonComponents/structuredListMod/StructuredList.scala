package typings.carbonComponents.structuredListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait StructuredList extends js.Object {
  def _direction(evt: js.Any): js.Any = js.native
  def _getInput(index: js.Any): js.Any = js.native
  def _handleClick(evt: js.Any): Unit = js.native
  def _handleInputChecked(index: js.Any): Unit = js.native
  def _handleKeydownArrow(evt: js.Any): Unit = js.native
  def _handleKeydownChecked(evt: js.Any): Unit = js.native
  def _nextIndex(array: js.Any, arrayItem: js.Any, direction: js.Any): js.Any = js.native
}

object StructuredList {
  @scala.inline
  def apply(
    _direction: js.Any => js.Any,
    _getInput: js.Any => js.Any,
    _handleClick: js.Any => Unit,
    _handleInputChecked: js.Any => Unit,
    _handleKeydownArrow: js.Any => Unit,
    _handleKeydownChecked: js.Any => Unit,
    _nextIndex: (js.Any, js.Any, js.Any) => js.Any
  ): StructuredList = {
    val __obj = js.Dynamic.literal(_direction = js.Any.fromFunction1(_direction), _getInput = js.Any.fromFunction1(_getInput), _handleClick = js.Any.fromFunction1(_handleClick), _handleInputChecked = js.Any.fromFunction1(_handleInputChecked), _handleKeydownArrow = js.Any.fromFunction1(_handleKeydownArrow), _handleKeydownChecked = js.Any.fromFunction1(_handleKeydownChecked), _nextIndex = js.Any.fromFunction3(_nextIndex))
    __obj.asInstanceOf[StructuredList]
  }
  @scala.inline
  implicit class StructuredListOps[Self <: StructuredList] (val x: Self) extends AnyVal {
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
    def set_direction(value: js.Any => js.Any): Self = this.set("_direction", js.Any.fromFunction1(value))
    @scala.inline
    def set_getInput(value: js.Any => js.Any): Self = this.set("_getInput", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleClick(value: js.Any => Unit): Self = this.set("_handleClick", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleInputChecked(value: js.Any => Unit): Self = this.set("_handleInputChecked", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleKeydownArrow(value: js.Any => Unit): Self = this.set("_handleKeydownArrow", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleKeydownChecked(value: js.Any => Unit): Self = this.set("_handleKeydownChecked", js.Any.fromFunction1(value))
    @scala.inline
    def set_nextIndex(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("_nextIndex", js.Any.fromFunction3(value))
  }
  
}

