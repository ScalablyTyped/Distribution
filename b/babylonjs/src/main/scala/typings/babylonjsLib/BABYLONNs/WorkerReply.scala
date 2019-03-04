package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait WorkerReply extends js.Object {
  var error: WorkerReplyType
  var payload: js.UndefOr[js.Any] = js.undefined
  var taskType: WorkerTaskType
}

object WorkerReply {
  @scala.inline
  def apply(error: WorkerReplyType, taskType: WorkerTaskType, payload: js.Any = null): WorkerReply = {
    val __obj = js.Dynamic.literal(error = error, taskType = taskType)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[WorkerReply]
  }
}

