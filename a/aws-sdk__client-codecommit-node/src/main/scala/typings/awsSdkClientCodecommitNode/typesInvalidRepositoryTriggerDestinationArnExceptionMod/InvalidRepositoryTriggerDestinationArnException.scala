package typings.awsSdkClientCodecommitNode.typesInvalidRepositoryTriggerDestinationArnExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerDestinationArnException
  extends ServiceException[InvalidRepositoryTriggerDestinationArnExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerDestinationArnException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerDestinationArnException
}

object InvalidRepositoryTriggerDestinationArnException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRepositoryTriggerDestinationArnExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerDestinationArnException,
    stack: String = null
  ): InvalidRepositoryTriggerDestinationArnException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerDestinationArnException]
  }
}

