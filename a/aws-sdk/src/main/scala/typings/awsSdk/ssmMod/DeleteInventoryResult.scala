package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInventoryResult extends StObject {
  
  /**
    * Every DeleteInventory operation is assigned a unique ID. This option returns a unique ID. You can use this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has completed before you begin other operations. 
    */
  var DeletionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * A summary of the delete operation. For more information about this summary, see Deleting custom inventory in the Amazon Web Services Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined
  
  /**
    * The name of the inventory data type specified in the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
}
object DeleteInventoryResult {
  
  inline def apply(): DeleteInventoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInventoryResult]
  }
  
  extension [Self <: DeleteInventoryResult](x: Self) {
    
    inline def setDeletionId(value: UUID): Self = StObject.set(x, "DeletionId", value.asInstanceOf[js.Any])
    
    inline def setDeletionIdUndefined: Self = StObject.set(x, "DeletionId", js.undefined)
    
    inline def setDeletionSummary(value: InventoryDeletionSummary): Self = StObject.set(x, "DeletionSummary", value.asInstanceOf[js.Any])
    
    inline def setDeletionSummaryUndefined: Self = StObject.set(x, "DeletionSummary", js.undefined)
    
    inline def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
