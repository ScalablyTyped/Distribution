package typings.awsSdkClientCodecommitNode.typesRepositoryTriggerEventsListRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTriggerEventsListRequiredException
  extends ServiceException[RepositoryTriggerEventsListRequiredExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_RepositoryTriggerEventsListRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerEventsListRequiredException
}

object RepositoryTriggerEventsListRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryTriggerEventsListRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerEventsListRequiredException,
    stack: String = null
  ): RepositoryTriggerEventsListRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggerEventsListRequiredException]
  }
}

