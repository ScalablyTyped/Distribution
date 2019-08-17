package typings.atAwsDashSdkClientDashDynamodbDashNode.typesReplicaAlreadyExistsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicaAlreadyExistsExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _ReplicaAlreadyExistsExceptionDetails {
  @scala.inline
  def apply(message: String = null): _ReplicaAlreadyExistsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_ReplicaAlreadyExistsExceptionDetails]
  }
}

