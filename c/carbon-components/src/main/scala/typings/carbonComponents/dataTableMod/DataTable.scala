package typings.carbonComponents.dataTableMod

import typings.carbonComponents.anon.Element
import typings.carbonComponents.anon.ForceExpand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait DataTable extends js.Object {
  def _actionBarCancel(): Unit = js.native
  def _actionBarToggle(toggleOn: js.Any): Unit = js.native
  def _changeState(detail: js.Any, callback: js.Any): Unit = js.native
  def _expandableHoverToggle(evt: js.Any): Unit = js.native
  def _handleDocumentClick(evt: js.Any): Unit = js.native
  def _keydownHandler(evt: js.Any): Unit = js.native
  def _rowExpandToggle(hasElementForceExpand: ForceExpand): Unit = js.native
  def _rowExpandToggleAll(hasElement: Element): Unit = js.native
  def _selectAllToggle(hasElement: Element): Unit = js.native
  def _selectToggle(detail: js.Any): Unit = js.native
  def _sortToggle(detail: js.Any): Unit = js.native
  def _toggleState(element: js.Any, evt: js.Any): Unit = js.native
  def activateSearch(container: js.Any): Unit = js.native
  def deactivateSearch(container: js.Any, evt: js.Any): Unit = js.native
  def refreshRows(): Unit = js.native
}

object DataTable {
  @scala.inline
  def apply(
    _actionBarCancel: () => Unit,
    _actionBarToggle: js.Any => Unit,
    _changeState: (js.Any, js.Any) => Unit,
    _expandableHoverToggle: js.Any => Unit,
    _handleDocumentClick: js.Any => Unit,
    _keydownHandler: js.Any => Unit,
    _rowExpandToggle: ForceExpand => Unit,
    _rowExpandToggleAll: Element => Unit,
    _selectAllToggle: Element => Unit,
    _selectToggle: js.Any => Unit,
    _sortToggle: js.Any => Unit,
    _toggleState: (js.Any, js.Any) => Unit,
    activateSearch: js.Any => Unit,
    deactivateSearch: (js.Any, js.Any) => Unit,
    refreshRows: () => Unit
  ): DataTable = {
    val __obj = js.Dynamic.literal(_actionBarCancel = js.Any.fromFunction0(_actionBarCancel), _actionBarToggle = js.Any.fromFunction1(_actionBarToggle), _changeState = js.Any.fromFunction2(_changeState), _expandableHoverToggle = js.Any.fromFunction1(_expandableHoverToggle), _handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _keydownHandler = js.Any.fromFunction1(_keydownHandler), _rowExpandToggle = js.Any.fromFunction1(_rowExpandToggle), _rowExpandToggleAll = js.Any.fromFunction1(_rowExpandToggleAll), _selectAllToggle = js.Any.fromFunction1(_selectAllToggle), _selectToggle = js.Any.fromFunction1(_selectToggle), _sortToggle = js.Any.fromFunction1(_sortToggle), _toggleState = js.Any.fromFunction2(_toggleState), activateSearch = js.Any.fromFunction1(activateSearch), deactivateSearch = js.Any.fromFunction2(deactivateSearch), refreshRows = js.Any.fromFunction0(refreshRows))
    __obj.asInstanceOf[DataTable]
  }
  @scala.inline
  implicit class DataTableOps[Self <: DataTable] (val x: Self) extends AnyVal {
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
    def set_actionBarCancel(value: () => Unit): Self = this.set("_actionBarCancel", js.Any.fromFunction0(value))
    @scala.inline
    def set_actionBarToggle(value: js.Any => Unit): Self = this.set("_actionBarToggle", js.Any.fromFunction1(value))
    @scala.inline
    def set_changeState(value: (js.Any, js.Any) => Unit): Self = this.set("_changeState", js.Any.fromFunction2(value))
    @scala.inline
    def set_expandableHoverToggle(value: js.Any => Unit): Self = this.set("_expandableHoverToggle", js.Any.fromFunction1(value))
    @scala.inline
    def set_handleDocumentClick(value: js.Any => Unit): Self = this.set("_handleDocumentClick", js.Any.fromFunction1(value))
    @scala.inline
    def set_keydownHandler(value: js.Any => Unit): Self = this.set("_keydownHandler", js.Any.fromFunction1(value))
    @scala.inline
    def set_rowExpandToggle(value: ForceExpand => Unit): Self = this.set("_rowExpandToggle", js.Any.fromFunction1(value))
    @scala.inline
    def set_rowExpandToggleAll(value: Element => Unit): Self = this.set("_rowExpandToggleAll", js.Any.fromFunction1(value))
    @scala.inline
    def set_selectAllToggle(value: Element => Unit): Self = this.set("_selectAllToggle", js.Any.fromFunction1(value))
    @scala.inline
    def set_selectToggle(value: js.Any => Unit): Self = this.set("_selectToggle", js.Any.fromFunction1(value))
    @scala.inline
    def set_sortToggle(value: js.Any => Unit): Self = this.set("_sortToggle", js.Any.fromFunction1(value))
    @scala.inline
    def set_toggleState(value: (js.Any, js.Any) => Unit): Self = this.set("_toggleState", js.Any.fromFunction2(value))
    @scala.inline
    def setActivateSearch(value: js.Any => Unit): Self = this.set("activateSearch", js.Any.fromFunction1(value))
    @scala.inline
    def setDeactivateSearch(value: (js.Any, js.Any) => Unit): Self = this.set("deactivateSearch", js.Any.fromFunction2(value))
    @scala.inline
    def setRefreshRows(value: () => Unit): Self = this.set("refreshRows", js.Any.fromFunction0(value))
  }
  
}

