package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryResultItem extends StObject {
  
  /**
    * The time inventory item data was captured.
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined
  
  /**
    * Contains all the inventory data of the item type. Results include attribute names and values. 
    */
  var Content: InventoryItemEntryList
  
  /**
    * MD5 hash of the inventory item type contents. The content hash is used to determine whether to update inventory information. The PutInventory API does not update the inventory item type contents if the MD5 hash has not changed since last update. 
    */
  var ContentHash: js.UndefOr[InventoryItemContentHash] = js.undefined
  
  /**
    * The schema version for the inventory result item/
    */
  var SchemaVersion: InventoryItemSchemaVersion
  
  /**
    * The name of the inventory result item type.
    */
  var TypeName: InventoryItemTypeName
}
object InventoryResultItem {
  
  inline def apply(
    Content: InventoryItemEntryList,
    SchemaVersion: InventoryItemSchemaVersion,
    TypeName: InventoryItemTypeName
  ): InventoryResultItem = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryResultItem]
  }
  
  extension [Self <: InventoryResultItem](x: Self) {
    
    inline def setCaptureTime(value: InventoryItemCaptureTime): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "CaptureTime", js.undefined)
    
    inline def setContent(value: InventoryItemEntryList): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentHash(value: InventoryItemContentHash): Self = StObject.set(x, "ContentHash", value.asInstanceOf[js.Any])
    
    inline def setContentHashUndefined: Self = StObject.set(x, "ContentHash", js.undefined)
    
    inline def setContentVarargs(value: InventoryItemEntry*): Self = StObject.set(x, "Content", js.Array(value :_*))
    
    inline def setSchemaVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
