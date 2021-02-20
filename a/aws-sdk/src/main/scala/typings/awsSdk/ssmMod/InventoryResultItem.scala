package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryResultItem extends StObject {
  
  /**
    * The time inventory item data was captured.
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.native
  
  /**
    * Contains all the inventory data of the item type. Results include attribute names and values. 
    */
  var Content: InventoryItemEntryList = js.native
  
  /**
    * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not changed since last update. 
    */
  var ContentHash: js.UndefOr[InventoryItemContentHash] = js.native
  
  /**
    * The schema version for the inventory result item/
    */
  var SchemaVersion: InventoryItemSchemaVersion = js.native
  
  /**
    * The name of the inventory result item type.
    */
  var TypeName: InventoryItemTypeName = js.native
}
object InventoryResultItem {
  
  @scala.inline
  def apply(
    Content: InventoryItemEntryList,
    SchemaVersion: InventoryItemSchemaVersion,
    TypeName: InventoryItemTypeName
  ): InventoryResultItem = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryResultItem]
  }
  
  @scala.inline
  implicit class InventoryResultItemMutableBuilder[Self <: InventoryResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureTime(value: InventoryItemCaptureTime): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureTimeUndefined: Self = StObject.set(x, "CaptureTime", js.undefined)
    
    @scala.inline
    def setContent(value: InventoryItemEntryList): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHash(value: InventoryItemContentHash): Self = StObject.set(x, "ContentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHashUndefined: Self = StObject.set(x, "ContentHash", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: InventoryItemEntry*): Self = StObject.set(x, "Content", js.Array(value :_*))
    
    @scala.inline
    def setSchemaVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
