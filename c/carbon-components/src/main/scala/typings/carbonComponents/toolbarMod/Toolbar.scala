package typings.carbonComponents.toolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Toolbar extends js.Object {
  def _handleDocumentClick(event: js.Any): Unit = js.native
  def _handleKeyDown(event: js.Any): Unit = js.native
  def _handleRowHeightChange(event: js.Any, boundTable: js.Any): Unit = js.native
}

object Toolbar {
  @scala.inline
  def apply(
    _handleDocumentClick: js.Any => Unit,
    _handleKeyDown: js.Any => Unit,
    _handleRowHeightChange: (js.Any, js.Any) => Unit
  ): Toolbar = {
    val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _handleKeyDown = js.Any.fromFunction1(_handleKeyDown), _handleRowHeightChange = js.Any.fromFunction2(_handleRowHeightChange))
    __obj.asInstanceOf[Toolbar]
  }
  @scala.inline
  implicit class ToolbarOps[Self <: Toolbar] (val x: Self) extends AnyVal {
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
    def set_handleDocumentClick(value: js.Any => Unit): Self = this.set("_handleDocumentClick", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleKeyDown(value: js.Any => Unit): Self = this.set("_handleKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleRowHeightChange(value: (js.Any, js.Any) => Unit): Self = this.set("_handleRowHeightChange", js.Any.fromFunction2(value))
  }
  
}

