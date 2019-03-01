package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait BabylonMessage extends js.Object {
  var payload: InitPayload | CollidePayload | UpdatePayload
  var taskType: WorkerTaskType
}

object BabylonMessage {
  @scala.inline
  def apply(payload: InitPayload | CollidePayload | UpdatePayload, taskType: WorkerTaskType): BabylonMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.updateDynamic("taskType")(taskType)
    __obj.asInstanceOf[BabylonMessage]
  }
}

