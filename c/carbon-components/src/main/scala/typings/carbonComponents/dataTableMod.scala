package typings.carbonComponents

import typings.carbonComponents.anon.Element
import typings.carbonComponents.anon.ForceExpand
import typings.carbonComponents.anon.PartialDataTableOptions
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("carbon-components/components/data-table/data-table", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DataTable {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialDataTableOptions) = this()
    
    /* CompleteClass */
    override def _actionBarCancel(): Unit = js.native
    
    /* CompleteClass */
    override def _actionBarToggle(toggleOn: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def _changeState(detail: Detail, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def _expandableHoverToggle(evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleDocumentClick(evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _keydownHandler(evt: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _rowExpandToggle(hasElementForceExpand: ForceExpand): Unit = js.native
    
    /* CompleteClass */
    override def _rowExpandToggleAll(hasElement: Element): Unit = js.native
    
    /* CompleteClass */
    override def _selectAllToggle(hasElement: Element): Unit = js.native
    
    /* CompleteClass */
    override def _selectToggle(detail: Detail): Unit = js.native
    
    /* CompleteClass */
    override def _sortToggle(detail: Detail): Unit = js.native
    
    /* CompleteClass */
    override def _toggleState(element: HTMLElement, evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def activateSearch(container: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def deactivateSearch(container: HTMLElement, evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def refreshRows(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/data-table/data-table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/data-table/data-table", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object eventHandlers {
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.action-bar-cancel")
      @js.native
      def actionBarCancel: String = js.native
      
      inline def actionBarCancel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action-bar-cancel")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.expand")
      @js.native
      def expand: String = js.native
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.expandAll")
      @js.native
      def expandAll: String = js.native
      inline def expandAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(x.asInstanceOf[js.Any])
      
      inline def expand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.select")
      @js.native
      def select: String = js.native
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.select-all")
      @js.native
      def selectAll: String = js.native
      
      inline def selectAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select-all")(x.asInstanceOf[js.Any])
      
      inline def select_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.sort")
      @js.native
      def sort: String = js.native
      inline def sort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait DataTable extends StObject {
    
    def _actionBarCancel(): Unit
    
    def _actionBarToggle(toggleOn: Boolean): Unit
    
    def _changeState(detail: Detail, callback: js.Function0[Unit]): Unit
    
    def _expandableHoverToggle(evt: MouseEvent): Unit
    
    def _handleDocumentClick(evt: MouseEvent): Unit
    
    def _keydownHandler(evt: KeyboardEvent): Unit
    
    def _rowExpandToggle(hasElementForceExpand: ForceExpand): Unit
    
    def _rowExpandToggleAll(hasElement: Element): Unit
    
    def _selectAllToggle(hasElement: Element): Unit
    
    def _selectToggle(detail: Detail): Unit
    
    def _sortToggle(detail: Detail): Unit
    
    def _toggleState(element: HTMLElement, evt: MouseEvent): Unit
    
    def activateSearch(container: HTMLElement): Unit
    
    def deactivateSearch(container: HTMLElement, evt: MouseEvent): Unit
    
    def refreshRows(): Unit
  }
  object DataTable {
    
    inline def apply(
      _actionBarCancel: () => Unit,
      _actionBarToggle: Boolean => Unit,
      _changeState: (Detail, js.Function0[Unit]) => Unit,
      _expandableHoverToggle: MouseEvent => Unit,
      _handleDocumentClick: MouseEvent => Unit,
      _keydownHandler: KeyboardEvent => Unit,
      _rowExpandToggle: ForceExpand => Unit,
      _rowExpandToggleAll: Element => Unit,
      _selectAllToggle: Element => Unit,
      _selectToggle: Detail => Unit,
      _sortToggle: Detail => Unit,
      _toggleState: (HTMLElement, MouseEvent) => Unit,
      activateSearch: HTMLElement => Unit,
      deactivateSearch: (HTMLElement, MouseEvent) => Unit,
      refreshRows: () => Unit
    ): DataTable = {
      val __obj = js.Dynamic.literal(_actionBarCancel = js.Any.fromFunction0(_actionBarCancel), _actionBarToggle = js.Any.fromFunction1(_actionBarToggle), _changeState = js.Any.fromFunction2(_changeState), _expandableHoverToggle = js.Any.fromFunction1(_expandableHoverToggle), _handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _keydownHandler = js.Any.fromFunction1(_keydownHandler), _rowExpandToggle = js.Any.fromFunction1(_rowExpandToggle), _rowExpandToggleAll = js.Any.fromFunction1(_rowExpandToggleAll), _selectAllToggle = js.Any.fromFunction1(_selectAllToggle), _selectToggle = js.Any.fromFunction1(_selectToggle), _sortToggle = js.Any.fromFunction1(_sortToggle), _toggleState = js.Any.fromFunction2(_toggleState), activateSearch = js.Any.fromFunction1(activateSearch), deactivateSearch = js.Any.fromFunction2(deactivateSearch), refreshRows = js.Any.fromFunction0(refreshRows))
      __obj.asInstanceOf[DataTable]
    }
    
    extension [Self <: DataTable](x: Self) {
      
      inline def setActivateSearch(value: HTMLElement => Unit): Self = StObject.set(x, "activateSearch", js.Any.fromFunction1(value))
      
      inline def setDeactivateSearch(value: (HTMLElement, MouseEvent) => Unit): Self = StObject.set(x, "deactivateSearch", js.Any.fromFunction2(value))
      
      inline def setRefreshRows(value: () => Unit): Self = StObject.set(x, "refreshRows", js.Any.fromFunction0(value))
      
      inline def set_actionBarCancel(value: () => Unit): Self = StObject.set(x, "_actionBarCancel", js.Any.fromFunction0(value))
      
      inline def set_actionBarToggle(value: Boolean => Unit): Self = StObject.set(x, "_actionBarToggle", js.Any.fromFunction1(value))
      
      inline def set_changeState(value: (Detail, js.Function0[Unit]) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction2(value))
      
      inline def set_expandableHoverToggle(value: MouseEvent => Unit): Self = StObject.set(x, "_expandableHoverToggle", js.Any.fromFunction1(value))
      
      inline def set_handleDocumentClick(value: MouseEvent => Unit): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1(value))
      
      inline def set_keydownHandler(value: KeyboardEvent => Unit): Self = StObject.set(x, "_keydownHandler", js.Any.fromFunction1(value))
      
      inline def set_rowExpandToggle(value: ForceExpand => Unit): Self = StObject.set(x, "_rowExpandToggle", js.Any.fromFunction1(value))
      
      inline def set_rowExpandToggleAll(value: Element => Unit): Self = StObject.set(x, "_rowExpandToggleAll", js.Any.fromFunction1(value))
      
      inline def set_selectAllToggle(value: Element => Unit): Self = StObject.set(x, "_selectAllToggle", js.Any.fromFunction1(value))
      
      inline def set_selectToggle(value: Detail => Unit): Self = StObject.set(x, "_selectToggle", js.Any.fromFunction1(value))
      
      inline def set_sortToggle(value: Detail => Unit): Self = StObject.set(x, "_sortToggle", js.Any.fromFunction1(value))
      
      inline def set_toggleState(value: (HTMLElement, MouseEvent) => Unit): Self = StObject.set(x, "_toggleState", js.Any.fromFunction2(value))
    }
  }
  
  trait DataTableOptions extends StObject {
    
    var classActionBarActive: String
    
    var classExpandableRow: String
    
    var classExpandableRowHidden: String
    
    var classExpandableRowHover: String
    
    var classTableSelected: String
    
    var classTableSortActive: String
    
    var classTableSortAscending: String
    
    var classToolbarSearchActive: String
    
    var eventAfterExpand: String
    
    var eventAfterExpandAll: String
    
    var eventAfterSort: String
    
    var eventBeforeExpand: String
    
    var eventBeforeExpandAll: String
    
    var eventBeforeSort: String
    
    var eventParentContainer: String
    
    var eventTrigger: String
    
    var selectorActionCancel: String
    
    var selectorActions: String
    
    var selectorCheckbox: String
    
    var selectorChildRow: String
    
    var selectorCount: String
    
    var selectorExpandCells: String
    
    var selectorExpandHeader: String
    
    var selectorExpandableRows: String
    
    var selectorInit: String
    
    var selectorParentRows: String
    
    var selectorSearchInput: String
    
    var selectorSearchMagnifier: String
    
    var selectorTableBody: String
    
    var selectorTableSelected: String
    
    var selectorTableSort: String
    
    var selectorToolbar: String
    
    var selectorToolbarSearchContainer: String
  }
  object DataTableOptions {
    
    inline def apply(
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
    ): DataTableOptions = {
      val __obj = js.Dynamic.literal(classActionBarActive = classActionBarActive.asInstanceOf[js.Any], classExpandableRow = classExpandableRow.asInstanceOf[js.Any], classExpandableRowHidden = classExpandableRowHidden.asInstanceOf[js.Any], classExpandableRowHover = classExpandableRowHover.asInstanceOf[js.Any], classTableSelected = classTableSelected.asInstanceOf[js.Any], classTableSortActive = classTableSortActive.asInstanceOf[js.Any], classTableSortAscending = classTableSortAscending.asInstanceOf[js.Any], classToolbarSearchActive = classToolbarSearchActive.asInstanceOf[js.Any], eventAfterExpand = eventAfterExpand.asInstanceOf[js.Any], eventAfterExpandAll = eventAfterExpandAll.asInstanceOf[js.Any], eventAfterSort = eventAfterSort.asInstanceOf[js.Any], eventBeforeExpand = eventBeforeExpand.asInstanceOf[js.Any], eventBeforeExpandAll = eventBeforeExpandAll.asInstanceOf[js.Any], eventBeforeSort = eventBeforeSort.asInstanceOf[js.Any], eventParentContainer = eventParentContainer.asInstanceOf[js.Any], eventTrigger = eventTrigger.asInstanceOf[js.Any], selectorActionCancel = selectorActionCancel.asInstanceOf[js.Any], selectorActions = selectorActions.asInstanceOf[js.Any], selectorCheckbox = selectorCheckbox.asInstanceOf[js.Any], selectorChildRow = selectorChildRow.asInstanceOf[js.Any], selectorCount = selectorCount.asInstanceOf[js.Any], selectorExpandCells = selectorExpandCells.asInstanceOf[js.Any], selectorExpandHeader = selectorExpandHeader.asInstanceOf[js.Any], selectorExpandableRows = selectorExpandableRows.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorParentRows = selectorParentRows.asInstanceOf[js.Any], selectorSearchInput = selectorSearchInput.asInstanceOf[js.Any], selectorSearchMagnifier = selectorSearchMagnifier.asInstanceOf[js.Any], selectorTableBody = selectorTableBody.asInstanceOf[js.Any], selectorTableSelected = selectorTableSelected.asInstanceOf[js.Any], selectorTableSort = selectorTableSort.asInstanceOf[js.Any], selectorToolbar = selectorToolbar.asInstanceOf[js.Any], selectorToolbarSearchContainer = selectorToolbarSearchContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableOptions]
    }
    
    extension [Self <: DataTableOptions](x: Self) {
      
      inline def setClassActionBarActive(value: String): Self = StObject.set(x, "classActionBarActive", value.asInstanceOf[js.Any])
      
      inline def setClassExpandableRow(value: String): Self = StObject.set(x, "classExpandableRow", value.asInstanceOf[js.Any])
      
      inline def setClassExpandableRowHidden(value: String): Self = StObject.set(x, "classExpandableRowHidden", value.asInstanceOf[js.Any])
      
      inline def setClassExpandableRowHover(value: String): Self = StObject.set(x, "classExpandableRowHover", value.asInstanceOf[js.Any])
      
      inline def setClassTableSelected(value: String): Self = StObject.set(x, "classTableSelected", value.asInstanceOf[js.Any])
      
      inline def setClassTableSortActive(value: String): Self = StObject.set(x, "classTableSortActive", value.asInstanceOf[js.Any])
      
      inline def setClassTableSortAscending(value: String): Self = StObject.set(x, "classTableSortAscending", value.asInstanceOf[js.Any])
      
      inline def setClassToolbarSearchActive(value: String): Self = StObject.set(x, "classToolbarSearchActive", value.asInstanceOf[js.Any])
      
      inline def setEventAfterExpand(value: String): Self = StObject.set(x, "eventAfterExpand", value.asInstanceOf[js.Any])
      
      inline def setEventAfterExpandAll(value: String): Self = StObject.set(x, "eventAfterExpandAll", value.asInstanceOf[js.Any])
      
      inline def setEventAfterSort(value: String): Self = StObject.set(x, "eventAfterSort", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeExpand(value: String): Self = StObject.set(x, "eventBeforeExpand", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeExpandAll(value: String): Self = StObject.set(x, "eventBeforeExpandAll", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeSort(value: String): Self = StObject.set(x, "eventBeforeSort", value.asInstanceOf[js.Any])
      
      inline def setEventParentContainer(value: String): Self = StObject.set(x, "eventParentContainer", value.asInstanceOf[js.Any])
      
      inline def setEventTrigger(value: String): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
      
      inline def setSelectorActionCancel(value: String): Self = StObject.set(x, "selectorActionCancel", value.asInstanceOf[js.Any])
      
      inline def setSelectorActions(value: String): Self = StObject.set(x, "selectorActions", value.asInstanceOf[js.Any])
      
      inline def setSelectorCheckbox(value: String): Self = StObject.set(x, "selectorCheckbox", value.asInstanceOf[js.Any])
      
      inline def setSelectorChildRow(value: String): Self = StObject.set(x, "selectorChildRow", value.asInstanceOf[js.Any])
      
      inline def setSelectorCount(value: String): Self = StObject.set(x, "selectorCount", value.asInstanceOf[js.Any])
      
      inline def setSelectorExpandCells(value: String): Self = StObject.set(x, "selectorExpandCells", value.asInstanceOf[js.Any])
      
      inline def setSelectorExpandHeader(value: String): Self = StObject.set(x, "selectorExpandHeader", value.asInstanceOf[js.Any])
      
      inline def setSelectorExpandableRows(value: String): Self = StObject.set(x, "selectorExpandableRows", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorParentRows(value: String): Self = StObject.set(x, "selectorParentRows", value.asInstanceOf[js.Any])
      
      inline def setSelectorSearchInput(value: String): Self = StObject.set(x, "selectorSearchInput", value.asInstanceOf[js.Any])
      
      inline def setSelectorSearchMagnifier(value: String): Self = StObject.set(x, "selectorSearchMagnifier", value.asInstanceOf[js.Any])
      
      inline def setSelectorTableBody(value: String): Self = StObject.set(x, "selectorTableBody", value.asInstanceOf[js.Any])
      
      inline def setSelectorTableSelected(value: String): Self = StObject.set(x, "selectorTableSelected", value.asInstanceOf[js.Any])
      
      inline def setSelectorTableSort(value: String): Self = StObject.set(x, "selectorTableSort", value.asInstanceOf[js.Any])
      
      inline def setSelectorToolbar(value: String): Self = StObject.set(x, "selectorToolbar", value.asInstanceOf[js.Any])
      
      inline def setSelectorToolbarSearchContainer(value: String): Self = StObject.set(x, "selectorToolbarSearchContainer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Detail extends StObject {
    
    var element: HTMLElement
  }
  object Detail {
    
    inline def apply(element: HTMLElement): Detail = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detail]
    }
    
    extension [Self <: Detail](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
}
