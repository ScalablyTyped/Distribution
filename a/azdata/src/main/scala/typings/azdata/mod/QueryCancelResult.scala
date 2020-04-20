package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCancelResult extends js.Object {
  var messages: String
}

object QueryCancelResult {
  @scala.inline
  def apply(messages: String): QueryCancelResult = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCancelResult]
  }
}

