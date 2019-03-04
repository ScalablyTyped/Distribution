package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResult extends js.Object {
  var TableName: java.lang.String
}

object TableResult {
  @scala.inline
  def apply(TableName: java.lang.String): TableResult = {
    val __obj = js.Dynamic.literal(TableName = TableName)
  
    __obj.asInstanceOf[TableResult]
  }
}

