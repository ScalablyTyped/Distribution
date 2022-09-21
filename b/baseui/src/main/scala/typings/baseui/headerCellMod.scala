package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.dataTableTypesMod.SortDirections
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerCellMod extends Shortcut {
  
  @JSImport("baseui/data-table/header-cell", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HeaderCellProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait HeaderCellProps extends StObject {
    
    var index: Double
    
    var isHovered: Boolean
    
    var isMeasured: js.UndefOr[Boolean] = js.undefined
    
    var isSelectable: Boolean
    
    var isSelectedAll: Boolean
    
    var isSelectedIndeterminate: Boolean
    
    def onMouseEnter(a: Any): Unit
    
    def onMouseLeave(a: Any): Unit
    
    def onSelectAll(): Unit
    
    def onSelectNone(): Unit
    
    def onSort(a: Double): Unit
    
    var sortDirection: SortDirections
    
    var sortable: Boolean
    
    var title: String
  }
  object HeaderCellProps {
    
    inline def apply(
      index: Double,
      isHovered: Boolean,
      isSelectable: Boolean,
      isSelectedAll: Boolean,
      isSelectedIndeterminate: Boolean,
      onMouseEnter: Any => Unit,
      onMouseLeave: Any => Unit,
      onSelectAll: () => Unit,
      onSelectNone: () => Unit,
      onSort: Double => Unit,
      sortDirection: SortDirections,
      sortable: Boolean,
      title: String
    ): HeaderCellProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], isSelectedAll = isSelectedAll.asInstanceOf[js.Any], isSelectedIndeterminate = isSelectedIndeterminate.asInstanceOf[js.Any], onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onSelectAll = js.Any.fromFunction0(onSelectAll), onSelectNone = js.Any.fromFunction0(onSelectNone), onSort = js.Any.fromFunction1(onSort), sortDirection = sortDirection.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderCellProps]
    }
    
    extension [Self <: HeaderCellProps](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
      
      inline def setIsMeasured(value: Boolean): Self = StObject.set(x, "isMeasured", value.asInstanceOf[js.Any])
      
      inline def setIsMeasuredUndefined: Self = StObject.set(x, "isMeasured", js.undefined)
      
      inline def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedAll(value: Boolean): Self = StObject.set(x, "isSelectedAll", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedIndeterminate(value: Boolean): Self = StObject.set(x, "isSelectedIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnter(value: Any => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeave(value: Any => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnSelectAll(value: () => Unit): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction0(value))
      
      inline def setOnSelectNone(value: () => Unit): Self = StObject.set(x, "onSelectNone", js.Any.fromFunction0(value))
      
      inline def setOnSort(value: Double => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      inline def setSortDirection(value: SortDirections): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[HeaderCellProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `headerCellMod.foo` */
  override def _to: ForwardRefExoticComponent[HeaderCellProps & RefAttributes[HTMLDivElement]] = default
}
