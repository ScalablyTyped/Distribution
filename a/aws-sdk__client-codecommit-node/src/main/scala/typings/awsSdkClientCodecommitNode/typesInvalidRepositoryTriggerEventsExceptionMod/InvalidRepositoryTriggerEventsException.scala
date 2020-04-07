package typings.awsSdkClientCodecommitNode.typesInvalidRepositoryTriggerEventsExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerEventsException
  extends ServiceException[InvalidRepositoryTriggerEventsExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerEventsException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerEventsException
}

object InvalidRepositoryTriggerEventsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRepositoryTriggerEventsExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerEventsException,
    stack: String = null
  ): InvalidRepositoryTriggerEventsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerEventsException]
  }
}

