package typings.awsSdkClientDynamodbNode.typesReplicaNotFoundExceptionMod

import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaNotFoundException
  extends ServiceException[ReplicaNotFoundExceptionDetails]
     with UpdateGlobalTableExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion {
  @JSName("name")
  var name_ReplicaNotFoundException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaNotFoundException
}

object ReplicaNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReplicaNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ReplicaNotFoundException,
    stack: String = null
  ): ReplicaNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaNotFoundException]
  }
}

