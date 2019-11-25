package typings.atAwsDashSdkClientDashDynamodbDashNode.typesReplicaAlreadyExistsExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaAlreadyExistsException
  extends ServiceException[_ReplicaAlreadyExistsExceptionDetails]
     with UpdateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_ReplicaAlreadyExistsException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ReplicaAlreadyExistsException
}

object ReplicaAlreadyExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ReplicaAlreadyExistsExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ReplicaAlreadyExistsException,
    stack: String = null
  ): ReplicaAlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAlreadyExistsException]
  }
}

