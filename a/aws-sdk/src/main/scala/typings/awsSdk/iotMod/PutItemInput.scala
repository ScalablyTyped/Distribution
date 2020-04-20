package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutItemInput extends js.Object {
  /**
    * The table where the message data will be written.
    */
  var tableName: TableName = js.native
}

object PutItemInput {
  @scala.inline
  def apply(tableName: TableName): PutItemInput = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutItemInput]
  }
}

