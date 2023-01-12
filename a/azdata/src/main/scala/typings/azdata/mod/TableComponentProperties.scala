package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableComponentProperties
  extends StObject
     with ComponentProperties {
  
  var ariaColumnCount: js.UndefOr[Double] = js.undefined
  
  var ariaRowCount: js.UndefOr[Double] = js.undefined
  
  var columns: js.Array[String | TableColumn]
  
  var data: js.Array[js.Array[Any]]
  
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  var forceFitColumns: js.UndefOr[ColumnSizingMode] = js.undefined
  
  var moveFocusOutWithTab: js.UndefOr[Boolean] = js.undefined
  
  var selectedRows: js.UndefOr[js.Array[Double]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var updateCells: js.UndefOr[js.Array[TableCell]] = js.undefined
}
object TableComponentProperties {
  
  inline def apply(columns: js.Array[String | TableColumn], data: js.Array[js.Array[Any]]): TableComponentProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableComponentProperties] (val x: Self) extends AnyVal {
    
    inline def setAriaColumnCount(value: Double): Self = StObject.set(x, "ariaColumnCount", value.asInstanceOf[js.Any])
    
    inline def setAriaColumnCountUndefined: Self = StObject.set(x, "ariaColumnCount", js.undefined)
    
    inline def setAriaRowCount(value: Double): Self = StObject.set(x, "ariaRowCount", value.asInstanceOf[js.Any])
    
    inline def setAriaRowCountUndefined: Self = StObject.set(x, "ariaRowCount", js.undefined)
    
    inline def setColumns(value: js.Array[String | TableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: (String | TableColumn)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setData(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Array[Any]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setForceFitColumns(value: ColumnSizingMode): Self = StObject.set(x, "forceFitColumns", value.asInstanceOf[js.Any])
    
    inline def setForceFitColumnsUndefined: Self = StObject.set(x, "forceFitColumns", js.undefined)
    
    inline def setMoveFocusOutWithTab(value: Boolean): Self = StObject.set(x, "moveFocusOutWithTab", value.asInstanceOf[js.Any])
    
    inline def setMoveFocusOutWithTabUndefined: Self = StObject.set(x, "moveFocusOutWithTab", js.undefined)
    
    inline def setSelectedRows(value: js.Array[Double]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    inline def setSelectedRowsVarargs(value: Double*): Self = StObject.set(x, "selectedRows", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateCells(value: js.Array[TableCell]): Self = StObject.set(x, "updateCells", value.asInstanceOf[js.Any])
    
    inline def setUpdateCellsUndefined: Self = StObject.set(x, "updateCells", js.undefined)
    
    inline def setUpdateCellsVarargs(value: TableCell*): Self = StObject.set(x, "updateCells", js.Array(value*))
  }
}
