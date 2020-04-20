package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelTaskParams extends js.Object {
  var taskId: String
}

object CancelTaskParams {
  @scala.inline
  def apply(taskId: String): CancelTaskParams = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTaskParams]
  }
}

