package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInventoryResult extends js.Object {
  
  /**
    * Every DeleteInventory action is assigned a unique ID. This option returns a unique ID. You can use this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has completed before you begin other actions. 
    */
  var DeletionId: js.UndefOr[UUID] = js.native
  
  /**
    * A summary of the delete operation. For more information about this summary, see Deleting custom inventory in the AWS Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.native
  
  /**
    * The name of the inventory data type specified in the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}
object DeleteInventoryResult {
  
  @scala.inline
  def apply(): DeleteInventoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInventoryResult]
  }
  
  @scala.inline
  implicit class DeleteInventoryResultOps[Self <: DeleteInventoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeletionId(value: UUID): Self = this.set("DeletionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionId: Self = this.set("DeletionId", js.undefined)
    
    @scala.inline
    def setDeletionSummary(value: InventoryDeletionSummary): Self = this.set("DeletionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionSummary: Self = this.set("DeletionSummary", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
  }
}
