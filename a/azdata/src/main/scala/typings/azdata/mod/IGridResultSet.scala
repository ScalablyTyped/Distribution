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
  
  @scala.inline
  def apply(columns: js.Array[IDbColumn], numberOfRows: Double, rowsUri: String): IGridResultSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], rowsUri = rowsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridResultSet]
  }
  
  @scala.inline
  implicit class IGridResultSetMutableBuilder[Self <: IGridResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[IDbColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: IDbColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setNumberOfRows(value: Double): Self = StObject.set(x, "numberOfRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUri(value: String): Self = StObject.set(x, "rowsUri", value.asInstanceOf[js.Any])
  }
}
