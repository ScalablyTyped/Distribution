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
  
  var data: js.Array[js.Array[js.Any]]
  
  var fontSize: js.UndefOr[Double | String] = js.undefined
  
  var forceFitColumns: js.UndefOr[ColumnSizingMode] = js.undefined
  
  var moveFocusOutWithTab: js.UndefOr[Boolean] = js.undefined
  
  var selectedRows: js.UndefOr[js.Array[Double]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var updateCells: js.UndefOr[js.Array[TableCell]] = js.undefined
}
object TableComponentProperties {
  
  @scala.inline
  def apply(columns: js.Array[String | TableColumn], data: js.Array[js.Array[js.Any]]): TableComponentProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentProperties]
  }
  
  @scala.inline
  implicit class TableComponentPropertiesMutableBuilder[Self <: TableComponentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaColumnCount(value: Double): Self = StObject.set(x, "ariaColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaColumnCountUndefined: Self = StObject.set(x, "ariaColumnCount", js.undefined)
    
    @scala.inline
    def setAriaRowCount(value: Double): Self = StObject.set(x, "ariaRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRowCountUndefined: Self = StObject.set(x, "ariaRowCount", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[String | TableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: (String | TableColumn)*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setForceFitColumns(value: ColumnSizingMode): Self = StObject.set(x, "forceFitColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFitColumnsUndefined: Self = StObject.set(x, "forceFitColumns", js.undefined)
    
    @scala.inline
    def setMoveFocusOutWithTab(value: Boolean): Self = StObject.set(x, "moveFocusOutWithTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveFocusOutWithTabUndefined: Self = StObject.set(x, "moveFocusOutWithTab", js.undefined)
    
    @scala.inline
    def setSelectedRows(value: js.Array[Double]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowsUndefined: Self = StObject.set(x, "selectedRows", js.undefined)
    
    @scala.inline
    def setSelectedRowsVarargs(value: Double*): Self = StObject.set(x, "selectedRows", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUpdateCells(value: js.Array[TableCell]): Self = StObject.set(x, "updateCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCellsUndefined: Self = StObject.set(x, "updateCells", js.undefined)
    
    @scala.inline
    def setUpdateCellsVarargs(value: TableCell*): Self = StObject.set(x, "updateCells", js.Array(value :_*))
  }
}
