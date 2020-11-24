package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassActionBarActive extends js.Object {
  
  var classActionBarActive: String = js.native
  
  var classExpandableRow: String = js.native
  
  var classExpandableRowHidden: String = js.native
  
  var classExpandableRowHover: String = js.native
  
  var classTableSelected: String = js.native
  
  var classTableSortActive: String = js.native
  
  var classTableSortAscending: String = js.native
  
  var classToolbarSearchActive: String = js.native
  
  var eventAfterExpand: String = js.native
  
  var eventAfterExpandAll: String = js.native
  
  var eventAfterSort: String = js.native
  
  var eventBeforeExpand: String = js.native
  
  var eventBeforeExpandAll: String = js.native
  
  var eventBeforeSort: String = js.native
  
  var eventParentContainer: String = js.native
  
  var eventTrigger: String = js.native
  
  var selectorActionCancel: String = js.native
  
  var selectorActions: String = js.native
  
  var selectorCheckbox: String = js.native
  
  var selectorChildRow: String = js.native
  
  var selectorCount: String = js.native
  
  var selectorExpandCells: String = js.native
  
  var selectorExpandHeader: String = js.native
  
  var selectorExpandableRows: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorParentRows: String = js.native
  
  var selectorSearchInput: String = js.native
  
  var selectorSearchMagnifier: String = js.native
  
  var selectorTableBody: String = js.native
  
  var selectorTableSelected: String = js.native
  
  var selectorTableSort: String = js.native
  
  var selectorToolbar: String = js.native
  
  var selectorToolbarSearchContainer: String = js.native
}
object ClassActionBarActive {
  
  @scala.inline
  def apply(
    classActionBarActive: String,
    classExpandableRow: String,
    classExpandableRowHidden: String,
    classExpandableRowHover: String,
    classTableSelected: String,
    classTableSortActive: String,
    classTableSortAscending: String,
    classToolbarSearchActive: String,
    eventAfterExpand: String,
    eventAfterExpandAll: String,
    eventAfterSort: String,
    eventBeforeExpand: String,
    eventBeforeExpandAll: String,
    eventBeforeSort: String,
    eventParentContainer: String,
    eventTrigger: String,
    selectorActionCancel: String,
    selectorActions: String,
    selectorCheckbox: String,
    selectorChildRow: String,
    selectorCount: String,
    selectorExpandCells: String,
    selectorExpandHeader: String,
    selectorExpandableRows: String,
    selectorInit: String,
    selectorParentRows: String,
    selectorSearchInput: String,
    selectorSearchMagnifier: String,
    selectorTableBody: String,
    selectorTableSelected: String,
    selectorTableSort: String,
    selectorToolbar: String,
    selectorToolbarSearchContainer: String
  ): ClassActionBarActive = {
    val __obj = js.Dynamic.literal(classActionBarActive = classActionBarActive.asInstanceOf[js.Any], classExpandableRow = classExpandableRow.asInstanceOf[js.Any], classExpandableRowHidden = classExpandableRowHidden.asInstanceOf[js.Any], classExpandableRowHover = classExpandableRowHover.asInstanceOf[js.Any], classTableSelected = classTableSelected.asInstanceOf[js.Any], classTableSortActive = classTableSortActive.asInstanceOf[js.Any], classTableSortAscending = classTableSortAscending.asInstanceOf[js.Any], classToolbarSearchActive = classToolbarSearchActive.asInstanceOf[js.Any], eventAfterExpand = eventAfterExpand.asInstanceOf[js.Any], eventAfterExpandAll = eventAfterExpandAll.asInstanceOf[js.Any], eventAfterSort = eventAfterSort.asInstanceOf[js.Any], eventBeforeExpand = eventBeforeExpand.asInstanceOf[js.Any], eventBeforeExpandAll = eventBeforeExpandAll.asInstanceOf[js.Any], eventBeforeSort = eventBeforeSort.asInstanceOf[js.Any], eventParentContainer = eventParentContainer.asInstanceOf[js.Any], eventTrigger = eventTrigger.asInstanceOf[js.Any], selectorActionCancel = selectorActionCancel.asInstanceOf[js.Any], selectorActions = selectorActions.asInstanceOf[js.Any], selectorCheckbox = selectorCheckbox.asInstanceOf[js.Any], selectorChildRow = selectorChildRow.asInstanceOf[js.Any], selectorCount = selectorCount.asInstanceOf[js.Any], selectorExpandCells = selectorExpandCells.asInstanceOf[js.Any], selectorExpandHeader = selectorExpandHeader.asInstanceOf[js.Any], selectorExpandableRows = selectorExpandableRows.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorParentRows = selectorParentRows.asInstanceOf[js.Any], selectorSearchInput = selectorSearchInput.asInstanceOf[js.Any], selectorSearchMagnifier = selectorSearchMagnifier.asInstanceOf[js.Any], selectorTableBody = selectorTableBody.asInstanceOf[js.Any], selectorTableSelected = selectorTableSelected.asInstanceOf[js.Any], selectorTableSort = selectorTableSort.asInstanceOf[js.Any], selectorToolbar = selectorToolbar.asInstanceOf[js.Any], selectorToolbarSearchContainer = selectorToolbarSearchContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassActionBarActive]
  }
  
  @scala.inline
  implicit class ClassActionBarActiveOps[Self <: ClassActionBarActive] (val x: Self) extends AnyVal {
    
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
    def setClassActionBarActive(value: String): Self = this.set("classActionBarActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpandableRow(value: String): Self = this.set("classExpandableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpandableRowHidden(value: String): Self = this.set("classExpandableRowHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpandableRowHover(value: String): Self = this.set("classExpandableRowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassTableSelected(value: String): Self = this.set("classTableSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassTableSortActive(value: String): Self = this.set("classTableSortActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassTableSortAscending(value: String): Self = this.set("classTableSortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassToolbarSearchActive(value: String): Self = this.set("classToolbarSearchActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterExpand(value: String): Self = this.set("eventAfterExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterExpandAll(value: String): Self = this.set("eventAfterExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterSort(value: String): Self = this.set("eventAfterSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeExpand(value: String): Self = this.set("eventBeforeExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeExpandAll(value: String): Self = this.set("eventBeforeExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeSort(value: String): Self = this.set("eventBeforeSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventParentContainer(value: String): Self = this.set("eventParentContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTrigger(value: String): Self = this.set("eventTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorActionCancel(value: String): Self = this.set("selectorActionCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorActions(value: String): Self = this.set("selectorActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorCheckbox(value: String): Self = this.set("selectorCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorChildRow(value: String): Self = this.set("selectorChildRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorCount(value: String): Self = this.set("selectorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorExpandCells(value: String): Self = this.set("selectorExpandCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorExpandHeader(value: String): Self = this.set("selectorExpandHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorExpandableRows(value: String): Self = this.set("selectorExpandableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorParentRows(value: String): Self = this.set("selectorParentRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSearchInput(value: String): Self = this.set("selectorSearchInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSearchMagnifier(value: String): Self = this.set("selectorSearchMagnifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTableBody(value: String): Self = this.set("selectorTableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTableSelected(value: String): Self = this.set("selectorTableSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTableSort(value: String): Self = this.set("selectorTableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorToolbar(value: String): Self = this.set("selectorToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorToolbarSearchContainer(value: String): Self = this.set("selectorToolbarSearchContainer", value.asInstanceOf[js.Any])
  }
}
