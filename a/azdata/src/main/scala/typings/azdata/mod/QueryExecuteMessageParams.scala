package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecuteMessageParams extends js.Object {
  var message: IResultMessage
  var ownerUri: String
}

object QueryExecuteMessageParams {
  @scala.inline
  def apply(message: IResultMessage, ownerUri: String): QueryExecuteMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteMessageParams]
  }
}

