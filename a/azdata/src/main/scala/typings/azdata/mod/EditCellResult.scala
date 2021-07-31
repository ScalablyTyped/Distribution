package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditCellResult extends StObject {
  
  var cell: EditCell
  
  var isRowDirty: Boolean
}
object EditCellResult {
  
  @scala.inline
  def apply(cell: EditCell, isRowDirty: Boolean): EditCellResult = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], isRowDirty = isRowDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCellResult]
  }
  
  @scala.inline
  implicit class EditCellResultMutableBuilder[Self <: EditCellResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: EditCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRowDirty(value: Boolean): Self = StObject.set(x, "isRowDirty", value.asInstanceOf[js.Any])
  }
}
