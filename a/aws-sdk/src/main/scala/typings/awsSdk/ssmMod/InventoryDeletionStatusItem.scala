package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryDeletionStatusItem extends js.Object {
  
  /**
    * The deletion ID returned by the DeleteInventory action.
    */
  var DeletionId: js.UndefOr[UUID] = js.native
  
  /**
    * The UTC timestamp when the delete operation started.
    */
  var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime] = js.native
  
  /**
    * Information about the delete operation. For more information about this summary, see Understanding the delete inventory summary in the AWS Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.native
  
  /**
    * The status of the operation. Possible values are InProgress and Complete.
    */
  var LastStatus: js.UndefOr[InventoryDeletionStatus] = js.native
  
  /**
    * Information about the status.
    */
  var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.native
  
  /**
    * The UTC timestamp of when the last status report.
    */
  var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime] = js.native
  
  /**
    * The name of the inventory data type.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}
object InventoryDeletionStatusItem {
  
  @scala.inline
  def apply(): InventoryDeletionStatusItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionStatusItem]
  }
  
  @scala.inline
  implicit class InventoryDeletionStatusItemOps[Self <: InventoryDeletionStatusItem] (val x: Self) extends AnyVal {
    
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
    def setDeletionStartTime(value: InventoryDeletionStartTime): Self = this.set("DeletionStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionStartTime: Self = this.set("DeletionStartTime", js.undefined)
    
    @scala.inline
    def setDeletionSummary(value: InventoryDeletionSummary): Self = this.set("DeletionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionSummary: Self = this.set("DeletionSummary", js.undefined)
    
    @scala.inline
    def setLastStatus(value: InventoryDeletionStatus): Self = this.set("LastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatus: Self = this.set("LastStatus", js.undefined)
    
    @scala.inline
    def setLastStatusMessage(value: InventoryDeletionLastStatusMessage): Self = this.set("LastStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatusMessage: Self = this.set("LastStatusMessage", js.undefined)
    
    @scala.inline
    def setLastStatusUpdateTime(value: InventoryDeletionLastStatusUpdateTime): Self = this.set("LastStatusUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatusUpdateTime: Self = this.set("LastStatusUpdateTime", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
  }
}
