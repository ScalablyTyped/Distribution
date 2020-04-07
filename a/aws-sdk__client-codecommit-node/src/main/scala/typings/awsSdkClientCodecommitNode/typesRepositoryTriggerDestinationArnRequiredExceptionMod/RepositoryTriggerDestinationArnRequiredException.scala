package typings.awsSdkClientCodecommitNode.typesRepositoryTriggerDestinationArnRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryTriggerDestinationArnRequiredException
  extends ServiceException[RepositoryTriggerDestinationArnRequiredExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_RepositoryTriggerDestinationArnRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerDestinationArnRequiredException
}

object RepositoryTriggerDestinationArnRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryTriggerDestinationArnRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryTriggerDestinationArnRequiredException,
    stack: String = null
  ): RepositoryTriggerDestinationArnRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTriggerDestinationArnRequiredException]
  }
}

