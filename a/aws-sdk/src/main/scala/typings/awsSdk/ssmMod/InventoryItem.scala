package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItem extends StObject {
  
  /**
    * The time the inventory information was collected.
    */
  var CaptureTime: InventoryItemCaptureTime = js.native
  
  /**
    * The inventory data of the inventory type.
    */
  var Content: js.UndefOr[InventoryItemEntryList] = js.native
  
  /**
    * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not changed since last update. 
    */
  var ContentHash: js.UndefOr[InventoryItemContentHash] = js.native
  
  /**
    * A map of associated properties for a specified inventory type. For example, with this attribute, you can specify the ExecutionId, ExecutionType, ComplianceType properties of the AWS:ComplianceItem type.
    */
  var Context: js.UndefOr[InventoryItemContentContext] = js.native
  
  /**
    * The schema version for the inventory item.
    */
  var SchemaVersion: InventoryItemSchemaVersion = js.native
  
  /**
    * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
    */
  var TypeName: InventoryItemTypeName = js.native
}
object InventoryItem {
  
  @scala.inline
  def apply(
    CaptureTime: InventoryItemCaptureTime,
    SchemaVersion: InventoryItemSchemaVersion,
    TypeName: InventoryItemTypeName
  ): InventoryItem = {
    val __obj = js.Dynamic.literal(CaptureTime = CaptureTime.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItem]
  }
  
  @scala.inline
  implicit class InventoryItemMutableBuilder[Self <: InventoryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureTime(value: InventoryItemCaptureTime): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: InventoryItemEntryList): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHash(value: InventoryItemContentHash): Self = StObject.set(x, "ContentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHashUndefined: Self = StObject.set(x, "ContentHash", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: InventoryItemEntry*): Self = StObject.set(x, "Content", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: InventoryItemContentContext): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
