package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionEntities extends js.Object {
  /**
    * An array of field patterns in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[EncryptionEntityList] = js.native
  /**
    * Number of field pattern items in a field-level encryption content type-profile mapping. 
    */
  var Quantity: integer = js.native
}

object EncryptionEntities {
  @scala.inline
  def apply(Quantity: integer): EncryptionEntities = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionEntities]
  }
  @scala.inline
  implicit class EncryptionEntitiesOps[Self <: EncryptionEntities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: EncryptionEntity*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: EncryptionEntityList): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
  }
  
}

