package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTableInput extends js.Object {
  /**
    * The name of the table to delete.
    */
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}

object DeleteTableInput {
  @scala.inline
  def apply(TableName: TableName): DeleteTableInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableInput]
  }
}

