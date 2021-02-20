package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellIndexReturn extends StObject {
  
  var column: Double = js.native
  
  var columnVisible: Double = js.native
  
  var row: Double = js.native
}
object CellIndexReturn {
  
  @scala.inline
  def apply(column: Double, columnVisible: Double, row: Double): CellIndexReturn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnVisible = columnVisible.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellIndexReturn]
  }
  
  @scala.inline
  implicit class CellIndexReturnMutableBuilder[Self <: CellIndexReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnVisible(value: Double): Self = StObject.set(x, "columnVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
