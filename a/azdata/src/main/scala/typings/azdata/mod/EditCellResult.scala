package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditCellResult extends StObject {
  
  var cell: EditCell
  
  var isRowDirty: Boolean
}
object EditCellResult {
  
  inline def apply(cell: EditCell, isRowDirty: Boolean): EditCellResult = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], isRowDirty = isRowDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCellResult]
  }
  
  extension [Self <: EditCellResult](x: Self) {
    
    inline def setCell(value: EditCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setIsRowDirty(value: Boolean): Self = StObject.set(x, "isRowDirty", value.asInstanceOf[js.Any])
  }
}
