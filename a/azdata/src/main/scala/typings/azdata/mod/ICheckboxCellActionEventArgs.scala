package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckboxCellActionEventArgs extends ICellActionEventArgs {
  
  var checked: Boolean = js.native
}
object ICheckboxCellActionEventArgs {
  
  @scala.inline
  def apply(checked: Boolean, column: Double, columnName: Double, row: Double): ICheckboxCellActionEventArgs = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxCellActionEventArgs]
  }
  
  @scala.inline
  implicit class ICheckboxCellActionEventArgsMutableBuilder[Self <: ICheckboxCellActionEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
  }
}
