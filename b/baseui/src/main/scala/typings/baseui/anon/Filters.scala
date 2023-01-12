package typings.baseui.anon

import typings.baseui.dataTableTypesMod.Row
import typings.baseui.dataTableTypesMod.SortDirections
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  var filters: Map[String, Description]
  
  def onFilterAdd(title: String, filterParams: Description): Unit
  
  def onFilterRemove(title: String): Unit
  
  def onIncludedRowsChange(rows: js.Array[Row]): Unit
  
  def onRowHighlightChange(rowIndex: Double, row: Row): Unit
  
  def onSelectMany(rows: js.Array[Row]): Unit
  
  def onSelectNone(): Unit
  
  def onSelectOne(row: Row): Unit
  
  def onSort(columnIndex: Double): Unit
  
  def onTextQueryChange(query: String): Unit
  
  var resizableColumnWidths: Boolean
  
  var rowHighlightIndex: js.UndefOr[Double] = js.undefined
  
  var selectedRowIds: Set[String | Double]
  
  var sortDirection: SortDirections
  
  var sortIndex: Double
  
  var textQuery: String
}
object Filters {
  
  inline def apply(
    filters: Map[String, Description],
    onFilterAdd: (String, Description) => Unit,
    onFilterRemove: String => Unit,
    onIncludedRowsChange: js.Array[Row] => Unit,
    onRowHighlightChange: (Double, Row) => Unit,
    onSelectMany: js.Array[Row] => Unit,
    onSelectNone: () => Unit,
    onSelectOne: Row => Unit,
    onSort: Double => Unit,
    onTextQueryChange: String => Unit,
    resizableColumnWidths: Boolean,
    selectedRowIds: Set[String | Double],
    sortDirection: SortDirections,
    sortIndex: Double,
    textQuery: String
  ): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], onFilterAdd = js.Any.fromFunction2(onFilterAdd), onFilterRemove = js.Any.fromFunction1(onFilterRemove), onIncludedRowsChange = js.Any.fromFunction1(onIncludedRowsChange), onRowHighlightChange = js.Any.fromFunction2(onRowHighlightChange), onSelectMany = js.Any.fromFunction1(onSelectMany), onSelectNone = js.Any.fromFunction0(onSelectNone), onSelectOne = js.Any.fromFunction1(onSelectOne), onSort = js.Any.fromFunction1(onSort), onTextQueryChange = js.Any.fromFunction1(onTextQueryChange), resizableColumnWidths = resizableColumnWidths.asInstanceOf[js.Any], selectedRowIds = selectedRowIds.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], sortIndex = sortIndex.asInstanceOf[js.Any], textQuery = textQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: Map[String, Description]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setOnFilterAdd(value: (String, Description) => Unit): Self = StObject.set(x, "onFilterAdd", js.Any.fromFunction2(value))
    
    inline def setOnFilterRemove(value: String => Unit): Self = StObject.set(x, "onFilterRemove", js.Any.fromFunction1(value))
    
    inline def setOnIncludedRowsChange(value: js.Array[Row] => Unit): Self = StObject.set(x, "onIncludedRowsChange", js.Any.fromFunction1(value))
    
    inline def setOnRowHighlightChange(value: (Double, Row) => Unit): Self = StObject.set(x, "onRowHighlightChange", js.Any.fromFunction2(value))
    
    inline def setOnSelectMany(value: js.Array[Row] => Unit): Self = StObject.set(x, "onSelectMany", js.Any.fromFunction1(value))
    
    inline def setOnSelectNone(value: () => Unit): Self = StObject.set(x, "onSelectNone", js.Any.fromFunction0(value))
    
    inline def setOnSelectOne(value: Row => Unit): Self = StObject.set(x, "onSelectOne", js.Any.fromFunction1(value))
    
    inline def setOnSort(value: Double => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
    
    inline def setOnTextQueryChange(value: String => Unit): Self = StObject.set(x, "onTextQueryChange", js.Any.fromFunction1(value))
    
    inline def setResizableColumnWidths(value: Boolean): Self = StObject.set(x, "resizableColumnWidths", value.asInstanceOf[js.Any])
    
    inline def setRowHighlightIndex(value: Double): Self = StObject.set(x, "rowHighlightIndex", value.asInstanceOf[js.Any])
    
    inline def setRowHighlightIndexUndefined: Self = StObject.set(x, "rowHighlightIndex", js.undefined)
    
    inline def setSelectedRowIds(value: Set[String | Double]): Self = StObject.set(x, "selectedRowIds", value.asInstanceOf[js.Any])
    
    inline def setSortDirection(value: SortDirections): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
    
    inline def setTextQuery(value: String): Self = StObject.set(x, "textQuery", value.asInstanceOf[js.Any])
  }
}
