package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("carbon-components/components/data-table/data-table", JSImport.Default)
  @js.native
  class default protected () extends DataTable {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/data-table/data-table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/data-table/data-table", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object eventHandlers {
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.action-bar-cancel")
      @js.native
      def actionBarCancel: String = js.native
      
      @scala.inline
      def actionBarCancel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action-bar-cancel")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.expand")
      @js.native
      def expand: String = js.native
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.expandAll")
      @js.native
      def expandAll: String = js.native
      @scala.inline
      def expandAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def expand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.select")
      @js.native
      def select: String = js.native
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.select-all")
      @js.native
      def selectAll: String = js.native
      
      @scala.inline
      def selectAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select-all")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def select_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/data-table/data-table", "default.eventHandlers.sort")
      @js.native
      def sort: String = js.native
      @scala.inline
      def sort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait DataTable extends StObject {
    
    def _actionBarCancel(): Unit = js.native
    
    def _actionBarToggle(toggleOn: js.Any): Unit = js.native
    
    def _changeState(detail: js.Any, callback: js.Any): Unit = js.native
    
    def _expandableHoverToggle(evt: js.Any): Unit = js.native
    
    def _handleDocumentClick(evt: js.Any): Unit = js.native
    
    def _keydownHandler(evt: js.Any): Unit = js.native
    
    def _rowExpandToggle(hasElementForceExpand: js.Any): Unit = js.native
    
    def _rowExpandToggleAll(hasElement: js.Any): Unit = js.native
    
    def _selectAllToggle(hasElement: js.Any): Unit = js.native
    
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
      _rowExpandToggle: js.Any => Unit,
      _rowExpandToggleAll: js.Any => Unit,
      _selectAllToggle: js.Any => Unit,
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
    implicit class DataTableMutableBuilder[Self <: DataTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivateSearch(value: js.Any => Unit): Self = StObject.set(x, "activateSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeactivateSearch(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "deactivateSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefreshRows(value: () => Unit): Self = StObject.set(x, "refreshRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_actionBarCancel(value: () => Unit): Self = StObject.set(x, "_actionBarCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_actionBarToggle(value: js.Any => Unit): Self = StObject.set(x, "_actionBarToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_changeState(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_expandableHoverToggle(value: js.Any => Unit): Self = StObject.set(x, "_expandableHoverToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleDocumentClick(value: js.Any => Unit): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_keydownHandler(value: js.Any => Unit): Self = StObject.set(x, "_keydownHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_rowExpandToggle(value: js.Any => Unit): Self = StObject.set(x, "_rowExpandToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_rowExpandToggleAll(value: js.Any => Unit): Self = StObject.set(x, "_rowExpandToggleAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_selectAllToggle(value: js.Any => Unit): Self = StObject.set(x, "_selectAllToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_selectToggle(value: js.Any => Unit): Self = StObject.set(x, "_selectToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_sortToggle(value: js.Any => Unit): Self = StObject.set(x, "_sortToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_toggleState(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_toggleState", js.Any.fromFunction2(value))
    }
  }
}
