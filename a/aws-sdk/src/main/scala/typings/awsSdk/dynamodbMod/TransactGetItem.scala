package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactGetItem extends js.Object {
  /**
    * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
    */
  var Get: typings.awsSdk.dynamodbMod.Get = js.native
}

object TransactGetItem {
  @scala.inline
  def apply(Get: Get): TransactGetItem = {
    val __obj = js.Dynamic.literal(Get = Get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactGetItem]
  }
  @scala.inline
  implicit class TransactGetItemOps[Self <: TransactGetItem] (val x: Self) extends AnyVal {
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
    def setGet(value: Get): Self = this.set("Get", value.asInstanceOf[js.Any])
  }
  
}

