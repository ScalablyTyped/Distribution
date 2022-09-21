package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCellRequest extends StObject {
  
  /**
    * The name of the cell to create.
    */
  var CellName: string
  
  /**
    * A list of cell Amazon Resource Names (ARNs) contained within this cell, for use in nested cells. For example, Availability Zones within specific Amazon Web Services Regions.
    */
  var Cells: js.UndefOr[listOfString] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.Tags] = js.undefined
}
object CreateCellRequest {
  
  inline def apply(CellName: string): CreateCellRequest = {
    val __obj = js.Dynamic.literal(CellName = CellName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCellRequest]
  }
  
  extension [Self <: CreateCellRequest](x: Self) {
    
    inline def setCellName(value: string): Self = StObject.set(x, "CellName", value.asInstanceOf[js.Any])
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "Cells", js.undefined)
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
