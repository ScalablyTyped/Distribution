package typings.awsSdkClientDynamodbNode.typesReplicaAlreadyExistsExceptionMod

import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaAlreadyExistsException
  extends ServiceException[ReplicaAlreadyExistsExceptionDetails]
     with UpdateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_ReplicaAlreadyExistsException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException
}

object ReplicaAlreadyExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReplicaAlreadyExistsExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaAlreadyExistsException,
    stack: String = null
  ): ReplicaAlreadyExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAlreadyExistsException]
  }
}

