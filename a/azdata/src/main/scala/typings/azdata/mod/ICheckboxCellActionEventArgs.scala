package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICheckboxCellActionEventArgs
  extends StObject
     with ICellActionEventArgs {
  
  var checked: Boolean
}
object ICheckboxCellActionEventArgs {
  
  inline def apply(checked: Boolean, column: Double, columnName: Double, row: Double): ICheckboxCellActionEventArgs = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnName = columnName.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckboxCellActionEventArgs]
  }
  
  extension [Self <: ICheckboxCellActionEventArgs](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
  }
}
