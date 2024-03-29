package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import typings.carbonComponentsReact.anon.Key
import typings.carbonComponentsReact.libComponentsDataTableStateSortingMod.DataTableSortState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomHeaderProps[H /* <: Key */] extends StObject {
  
  var isSortHeader: Boolean
  
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  var key: /* import warning: importer.ImportType#apply Failed type conversion: H['key'] */ js.Any
  
  def onClick(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
  
  var sortDirection: DataTableSortState
}
object DataTableCustomHeaderProps {
  
  inline def apply[H /* <: Key */](
    isSortHeader: Boolean,
    key: /* import warning: importer.ImportType#apply Failed type conversion: H['key'] */ js.Any,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    sortDirection: DataTableSortState
  ): DataTableCustomHeaderProps[H] = {
    val __obj = js.Dynamic.literal(isSortHeader = isSortHeader.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCustomHeaderProps[H]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCustomHeaderProps[?], H /* <: Key */] (val x: Self & DataTableCustomHeaderProps[H]) extends AnyVal {
    
    inline def setIsSortHeader(value: Boolean): Self = StObject.set(x, "isSortHeader", value.asInstanceOf[js.Any])
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setKey(value: /* import warning: importer.ImportType#apply Failed type conversion: H['key'] */ js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setSortDirection(value: DataTableSortState): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
  }
}
