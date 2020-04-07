package typings.awsSdkClientCodecommitNode.typesInvalidRepositoryTriggerCustomDataExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerCustomDataException
  extends ServiceException[InvalidRepositoryTriggerCustomDataExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerCustomDataException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerCustomDataException
}

object InvalidRepositoryTriggerCustomDataException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRepositoryTriggerCustomDataExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerCustomDataException,
    stack: String = null
  ): InvalidRepositoryTriggerCustomDataException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerCustomDataException]
  }
}

