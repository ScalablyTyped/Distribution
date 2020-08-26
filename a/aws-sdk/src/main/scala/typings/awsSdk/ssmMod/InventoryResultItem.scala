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
    TypeName: InventoryItemTypeName
  ): InventoryResultItem = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryResultItem]
  }
  @scala.inline
  implicit class InventoryResultItemOps[Self <: InventoryResultItem] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: InventoryItemEntry*): Self = this.set("Content", js.Array(value :_*))
    @scala.inline
    def setContent(value: InventoryItemEntryList): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaVersion(value: InventoryItemSchemaVersion): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptureTime(value: InventoryItemCaptureTime): Self = this.set("CaptureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureTime: Self = this.set("CaptureTime", js.undefined)
    @scala.inline
    def setContentHash(value: InventoryItemContentHash): Self = this.set("ContentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHash: Self = this.set("ContentHash", js.undefined)
  }
  
}

