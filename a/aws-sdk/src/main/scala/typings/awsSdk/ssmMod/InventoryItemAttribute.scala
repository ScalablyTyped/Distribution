package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemAttribute extends js.Object {
  /**
    * The data type of the inventory item attribute. 
    */
  var DataType: InventoryAttributeDataType = js.native
  /**
    * Name of the inventory item attribute.
    */
  var Name: InventoryItemAttributeName = js.native
}

object InventoryItemAttribute {
  @scala.inline
  def apply(DataType: InventoryAttributeDataType, Name: InventoryItemAttributeName): InventoryItemAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InventoryItemAttribute]
  }
}

