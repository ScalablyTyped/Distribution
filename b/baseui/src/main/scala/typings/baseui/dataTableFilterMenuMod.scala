package typings.baseui

import typings.baseui.anon.Description
import typings.baseui.dataTableTypesMod.ColumnOptions
import typings.react.mod.global.JSX.Element
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableFilterMenuMod {
  
  @JSImport("baseui/data-table/filter-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var columns: js.Array[ColumnOptions[Any, Any]]
    
    var filters: Map[String, Any]
    
    def onSetFilter(columnTitle: String, filterParams: Description): Unit
    
    var rows: js.Array[Any]
  }
  object Props {
    
    inline def apply(
      columns: js.Array[ColumnOptions[Any, Any]],
      filters: Map[String, Any],
      onSetFilter: (String, Description) => Unit,
      rows: js.Array[Any]
    ): Props = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], onSetFilter = js.Any.fromFunction2(onSetFilter), rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnOptions[Any, Any]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (ColumnOptions[Any, Any])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setFilters(value: Map[String, Any]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setOnSetFilter(value: (String, Description) => Unit): Self = StObject.set(x, "onSetFilter", js.Any.fromFunction2(value))
      
      inline def setRows(value: js.Array[Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: Any*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
}
