package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleExecuteResult extends StObject {
  
  var columnInfo: js.Array[IDbColumn]
  
  var rowCount: Double
  
  var rows: js.Array[js.Array[DbCellValue]]
}
object SimpleExecuteResult {
  
  inline def apply(columnInfo: js.Array[IDbColumn], rowCount: Double, rows: js.Array[js.Array[DbCellValue]]): SimpleExecuteResult = {
    val __obj = js.Dynamic.literal(columnInfo = columnInfo.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleExecuteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleExecuteResult] (val x: Self) extends AnyVal {
    
    inline def setColumnInfo(value: js.Array[IDbColumn]): Self = StObject.set(x, "columnInfo", value.asInstanceOf[js.Any])
    
    inline def setColumnInfoVarargs(value: IDbColumn*): Self = StObject.set(x, "columnInfo", js.Array(value*))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[js.Array[DbCellValue]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: js.Array[DbCellValue]*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
