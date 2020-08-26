package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItem extends js.Object {
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
  implicit class InventoryItemOps[Self <: InventoryItem] (val x: Self) extends AnyVal {
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
    def setCaptureTime(value: InventoryItemCaptureTime): Self = this.set("CaptureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaVersion(value: InventoryItemSchemaVersion): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentVarargs(value: InventoryItemEntry*): Self = this.set("Content", js.Array(value :_*))
    @scala.inline
    def setContent(value: InventoryItemEntryList): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setContentHash(value: InventoryItemContentHash): Self = this.set("ContentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentHash: Self = this.set("ContentHash", js.undefined)
    @scala.inline
    def setContext(value: InventoryItemContentContext): Self = this.set("Context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
  }
  
}

