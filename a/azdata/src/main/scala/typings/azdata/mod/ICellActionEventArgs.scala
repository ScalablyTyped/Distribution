package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellActionEventArgs extends StObject {
  
  var column: Double = js.native
  
  var columnName: Double = js.native
  
  var row: Double = js.native
}
object ICellActionEventArgs {
  
  @scala.inline
  def apply(column: Double, columnName: Double, row: Double): ICellActionEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellActionEventArgs]
  }
  
  @scala.inline
  implicit class ICellActionEventArgsMutableBuilder[Self <: ICellActionEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnName(value: Double): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
