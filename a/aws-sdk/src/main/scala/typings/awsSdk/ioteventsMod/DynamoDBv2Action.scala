package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBv2Action extends js.Object {
  var payload: js.UndefOr[Payload] = js.native
  /**
    * The name of the DynamoDB table.
    */
  var tableName: DynamoTableName = js.native
}

object DynamoDBv2Action {
  @scala.inline
  def apply(tableName: DynamoTableName, payload: Payload = null): DynamoDBv2Action = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBv2Action]
  }
}

