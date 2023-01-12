package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSetSubset extends StObject {
  
  var rowCount: Double
  
  var rows: js.Array[js.Array[DbCellValue]]
}
object ResultSetSubset {
  
  inline def apply(rowCount: Double, rows: js.Array[js.Array[DbCellValue]]): ResultSetSubset = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetSubset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultSetSubset] (val x: Self) extends AnyVal {
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[js.Array[DbCellValue]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: js.Array[DbCellValue]*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
