package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCellRequest extends StObject {
  
  /**
    * The name of the cell.
    */
  var CellName: string
}
object GetCellRequest {
  
  inline def apply(CellName: string): GetCellRequest = {
    val __obj = js.Dynamic.literal(CellName = CellName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCellRequest]
  }
  
  extension [Self <: GetCellRequest](x: Self) {
    
    inline def setCellName(value: string): Self = StObject.set(x, "CellName", value.asInstanceOf[js.Any])
  }
}
