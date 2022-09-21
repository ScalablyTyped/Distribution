package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarativeTableProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * The column definitions for the table
    */
  var columns: js.Array[DeclarativeTableColumn]
  
  /**
    * @deprecated Use dataValues instead.
    */
  var data: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  /**
    * dataValues will only be used if data is an empty array.
    * To set the dataValues, it is recommended to use the setDataValues method that returns a promise.
    */
  var dataValues: js.UndefOr[js.Array[js.Array[DeclarativeTableCellValue]]] = js.undefined
  
  /**
    * Gets a boolean value determines whether the row selection is enabled. Default value is false.
    */
  var enableRowSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the selected row number of the table. -1 means to no selected row.
    */
  var selectedRow: js.UndefOr[Double] = js.undefined
}
object DeclarativeTableProperties {
  
  inline def apply(columns: js.Array[DeclarativeTableColumn]): DeclarativeTableProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableProperties]
  }
  
  extension [Self <: DeclarativeTableProperties](x: Self) {
    
    inline def setColumns(value: js.Array[DeclarativeTableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: DeclarativeTableColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setData(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataValues(value: js.Array[js.Array[DeclarativeTableCellValue]]): Self = StObject.set(x, "dataValues", value.asInstanceOf[js.Any])
    
    inline def setDataValuesUndefined: Self = StObject.set(x, "dataValues", js.undefined)
    
    inline def setDataValuesVarargs(value: js.Array[DeclarativeTableCellValue]*): Self = StObject.set(x, "dataValues", js.Array(value*))
    
    inline def setDataVarargs(value: js.Array[Any]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEnableRowSelection(value: Boolean): Self = StObject.set(x, "enableRowSelection", value.asInstanceOf[js.Any])
    
    inline def setEnableRowSelectionUndefined: Self = StObject.set(x, "enableRowSelection", js.undefined)
    
    inline def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
    
    inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
  }
}
