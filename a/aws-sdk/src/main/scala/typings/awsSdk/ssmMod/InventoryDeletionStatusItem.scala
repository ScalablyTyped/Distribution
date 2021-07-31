package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDeletionStatusItem extends StObject {
  
  /**
    * The deletion ID returned by the DeleteInventory action.
    */
  var DeletionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The UTC timestamp when the delete operation started.
    */
  var DeletionStartTime: js.UndefOr[InventoryDeletionStartTime] = js.undefined
  
  /**
    * Information about the delete operation. For more information about this summary, see Understanding the delete inventory summary in the AWS Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.undefined
  
  /**
    * The status of the operation. Possible values are InProgress and Complete.
    */
  var LastStatus: js.UndefOr[InventoryDeletionStatus] = js.undefined
  
  /**
    * Information about the status.
    */
  var LastStatusMessage: js.UndefOr[InventoryDeletionLastStatusMessage] = js.undefined
  
  /**
    * The UTC timestamp of when the last status report.
    */
  var LastStatusUpdateTime: js.UndefOr[InventoryDeletionLastStatusUpdateTime] = js.undefined
  
  /**
    * The name of the inventory data type.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
}
object InventoryDeletionStatusItem {
  
  @scala.inline
  def apply(): InventoryDeletionStatusItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionStatusItem]
  }
  
  @scala.inline
  implicit class InventoryDeletionStatusItemMutableBuilder[Self <: InventoryDeletionStatusItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionId(value: UUID): Self = StObject.set(x, "DeletionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionIdUndefined: Self = StObject.set(x, "DeletionId", js.undefined)
    
    @scala.inline
    def setDeletionStartTime(value: InventoryDeletionStartTime): Self = StObject.set(x, "DeletionStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionStartTimeUndefined: Self = StObject.set(x, "DeletionStartTime", js.undefined)
    
    @scala.inline
    def setDeletionSummary(value: InventoryDeletionSummary): Self = StObject.set(x, "DeletionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionSummaryUndefined: Self = StObject.set(x, "DeletionSummary", js.undefined)
    
    @scala.inline
    def setLastStatus(value: InventoryDeletionStatus): Self = StObject.set(x, "LastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusMessage(value: InventoryDeletionLastStatusMessage): Self = StObject.set(x, "LastStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusMessageUndefined: Self = StObject.set(x, "LastStatusMessage", js.undefined)
    
    @scala.inline
    def setLastStatusUndefined: Self = StObject.set(x, "LastStatus", js.undefined)
    
    @scala.inline
    def setLastStatusUpdateTime(value: InventoryDeletionLastStatusUpdateTime): Self = StObject.set(x, "LastStatusUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusUpdateTimeUndefined: Self = StObject.set(x, "LastStatusUpdateTime", js.undefined)
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
