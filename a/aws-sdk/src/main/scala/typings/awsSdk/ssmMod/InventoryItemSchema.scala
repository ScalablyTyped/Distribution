package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemSchema extends js.Object {
  /**
    * The schema attributes for inventory. This contains data type and attribute name.
    */
  var Attributes: InventoryItemAttributeList = js.native
  /**
    * The alias name of the inventory type. The alias name is used for display purposes.
    */
  var DisplayName: js.UndefOr[InventoryTypeDisplayName] = js.native
  /**
    * The name of the inventory type. Default inventory item type names start with AWS. Custom inventory type names will start with Custom. Default inventory item types include the following: AWS:AWSComponent, AWS:Application, AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
    */
  var TypeName: InventoryItemTypeName = js.native
  /**
    * The schema version for the inventory item.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.native
}

object InventoryItemSchema {
  @scala.inline
  def apply(Attributes: InventoryItemAttributeList, TypeName: InventoryItemTypeName): InventoryItemSchema = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemSchema]
  }
  @scala.inline
  implicit class InventoryItemSchemaOps[Self <: InventoryItemSchema] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: InventoryItemAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: InventoryItemAttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: InventoryItemTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: InventoryTypeDisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setVersion(value: InventoryItemSchemaVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

