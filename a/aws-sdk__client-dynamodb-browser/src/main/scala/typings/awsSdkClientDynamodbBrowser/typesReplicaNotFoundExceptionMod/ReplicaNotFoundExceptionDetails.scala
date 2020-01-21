package typings.awsSdkClientDynamodbBrowser.typesReplicaNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaNotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object ReplicaNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): ReplicaNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaNotFoundExceptionDetails]
  }
}

