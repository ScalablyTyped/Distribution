package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactGetItem extends js.Object {
  /**
    * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
    */
  var Get: typings.awsSdk.documentClientMod.DocumentClient.Get = js.native
}

object TransactGetItem {
  @scala.inline
  def apply(Get: Get): TransactGetItem = {
    val __obj = js.Dynamic.literal(Get = Get.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactGetItem]
  }
}

