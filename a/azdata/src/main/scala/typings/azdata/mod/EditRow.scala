package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditRow extends StObject {
  
  var cells: js.Array[DbCellValue]
  
  var id: Double
  
  var isDirty: Boolean
  
  var state: EditRowState
}
object EditRow {
  
  inline def apply(cells: js.Array[DbCellValue], id: Double, isDirty: Boolean, state: EditRowState): EditRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRow]
  }
  
  extension [Self <: EditRow](x: Self) {
    
    inline def setCells(value: js.Array[DbCellValue]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: DbCellValue*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setState(value: EditRowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
