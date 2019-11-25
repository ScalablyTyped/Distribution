package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesReplicaNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicaNotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ReplicaNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ReplicaNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplicaNotFoundExceptionDetails]
  }
}

