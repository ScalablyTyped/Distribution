package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResult extends js.Object {
  var TableName: String
}

object TableResult {
  @scala.inline
  def apply(TableName: String): TableResult = {
    val __obj = js.Dynamic.literal(TableName = TableName)
  
    __obj.asInstanceOf[TableResult]
  }
}

