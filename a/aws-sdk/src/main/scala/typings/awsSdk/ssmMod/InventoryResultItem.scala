package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryResultItem extends js.Object {
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
    TypeName: InventoryItemTypeName,
    CaptureTime: InventoryItemCaptureTime = null,
    ContentHash: InventoryItemContentHash = null
  ): InventoryResultItem = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    if (CaptureTime != null) __obj.updateDynamic("CaptureTime")(CaptureTime.asInstanceOf[js.Any])
    if (ContentHash != null) __obj.updateDynamic("ContentHash")(ContentHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryResultItem]
  }
}

