package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridResultSet extends StObject {
  
  var columns: js.Array[IDbColumn]
  
  var numberOfRows: Double
  
  var rowsUri: String
}
object IGridResultSet {
  
  inline def apply(columns: js.Array[IDbColumn], numberOfRows: Double, rowsUri: String): IGridResultSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], rowsUri = rowsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridResultSet]
  }
  
  extension [Self <: IGridResultSet](x: Self) {
    
    inline def setColumns(value: js.Array[IDbColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: IDbColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setNumberOfRows(value: Double): Self = StObject.set(x, "numberOfRows", value.asInstanceOf[js.Any])
    
    inline def setRowsUri(value: String): Self = StObject.set(x, "rowsUri", value.asInstanceOf[js.Any])
  }
}
