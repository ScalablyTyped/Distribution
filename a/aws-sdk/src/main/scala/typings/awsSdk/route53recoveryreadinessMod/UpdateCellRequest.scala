package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCellRequest extends StObject {
  
  /**
    * The name of the cell.
    */
  var CellName: string
  
  /**
    * A list of cell Amazon Resource Names (ARNs), which completely replaces the previous list.
    */
  var Cells: listOfString
}
object UpdateCellRequest {
  
  inline def apply(CellName: string, Cells: listOfString): UpdateCellRequest = {
    val __obj = js.Dynamic.literal(CellName = CellName.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCellRequest]
  }
  
  extension [Self <: UpdateCellRequest](x: Self) {
    
    inline def setCellName(value: string): Self = StObject.set(x, "CellName", value.asInstanceOf[js.Any])
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
  }
}
