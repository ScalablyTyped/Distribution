package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTableName extends js.Object {
  var TableName: String
}

object AnonTableName {
  @scala.inline
  def apply(TableName: String): AnonTableName = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTableName]
  }
}

