package typings.carbonComponentsReact.dataTableDataTableMod

import typings.carbonComponentsReact.tableMod.TableCarbonProps
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableProps[R /* <: DataTableRow[String] */, H /* <: DataTableHeader[String] */]
  extends StObject
     with InternationalProps[DataTableTranslationKey, Record[String, Any]]
     with TableCarbonProps {
  
  var filterRows: js.UndefOr[
    js.Function1[
      /* data */ FilterRowsData[R, H], 
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any
      ]
    ]
  ] = js.undefined
  
  var headers: js.Array[H]
  
  var locale: js.UndefOr[String] = js.undefined
  
  var radio: js.UndefOr[Boolean] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* props */ DataTableCustomRenderProps[R, H], ReactNode]] = js.undefined
  
  var rows: js.Array[R]
  
  var sortRow: js.UndefOr[js.Function3[/* cellA */ Any, /* cellB */ Any, /* data */ SortRowData, Double]] = js.undefined
  
  var stickyHeader: js.UndefOr[Boolean] = js.undefined
}
object DataTableProps {
  
  inline def apply[R /* <: DataTableRow[String] */, H /* <: DataTableHeader[String] */](headers: js.Array[H], rows: js.Array[R]): DataTableProps[R, H] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps[R, H]]
  }
  
  extension [Self <: DataTableProps[?, ?], R /* <: DataTableRow[String] */, H /* <: DataTableHeader[String] */](x: Self & (DataTableProps[R, H])) {
    
    inline def setFilterRows(
      value: /* data */ FilterRowsData[R, H] => js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any
        ]
    ): Self = StObject.set(x, "filterRows", js.Any.fromFunction1(value))
    
    inline def setFilterRowsUndefined: Self = StObject.set(x, "filterRows", js.undefined)
    
    inline def setHeaders(value: js.Array[H]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: H*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
    
    inline def setRender(value: /* props */ DataTableCustomRenderProps[R, H] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRows(value: js.Array[R]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: R*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSortRow(value: (/* cellA */ Any, /* cellB */ Any, /* data */ SortRowData) => Double): Self = StObject.set(x, "sortRow", js.Any.fromFunction3(value))
    
    inline def setSortRowUndefined: Self = StObject.set(x, "sortRow", js.undefined)
    
    inline def setStickyHeader(value: Boolean): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
  }
}
