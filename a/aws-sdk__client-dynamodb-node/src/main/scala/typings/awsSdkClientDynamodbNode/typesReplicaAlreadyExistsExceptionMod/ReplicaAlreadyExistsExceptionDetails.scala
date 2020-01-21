package typings.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaAlreadyExistsExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object ReplicaAlreadyExistsExceptionDetails {
  @scala.inline
  def apply(message: String = null): ReplicaAlreadyExistsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAlreadyExistsExceptionDetails]
  }
}

