package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreResponse extends js.Object {
  var errorMessage: String
  var result: Boolean
  var taskId: String
}

object RestoreResponse {
  @scala.inline
  def apply(errorMessage: String, result: Boolean, taskId: String): RestoreResponse = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreResponse]
  }
}

