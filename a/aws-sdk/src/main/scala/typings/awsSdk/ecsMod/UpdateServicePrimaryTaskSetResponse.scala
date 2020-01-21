package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServicePrimaryTaskSetResponse extends js.Object {
  var taskSet: js.UndefOr[TaskSet] = js.native
}

object UpdateServicePrimaryTaskSetResponse {
  @scala.inline
  def apply(taskSet: TaskSet = null): UpdateServicePrimaryTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    if (taskSet != null) __obj.updateDynamic("taskSet")(taskSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetResponse]
  }
}

