package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRequest extends js.Object {
  /**
    * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema.
    */
  var Key: typings.awsSdk.documentClientMod.DocumentClient.Key = js.native
}

object DeleteRequest {
  @scala.inline
  def apply(Key: Key): DeleteRequest = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRequest]
  }
}

