package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxCell extends TableCell {
  
  var checked: Boolean = js.native
  
  var columnName: String = js.native
}
object CheckBoxCell {
  
  @scala.inline
  def apply(checked: Boolean, column: Double, columnName: String, row: Double, value: js.Any): CheckBoxCell = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxCell]
  }
  
  @scala.inline
  implicit class CheckBoxCellMutableBuilder[Self <: CheckBoxCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
  }
}
