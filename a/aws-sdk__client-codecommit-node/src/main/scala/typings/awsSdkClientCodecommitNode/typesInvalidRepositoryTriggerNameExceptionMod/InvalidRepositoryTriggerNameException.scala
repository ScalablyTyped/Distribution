package typings.awsSdkClientCodecommitNode.typesInvalidRepositoryTriggerNameExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerNameException
  extends ServiceException[InvalidRepositoryTriggerNameExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerNameException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerNameException
}

object InvalidRepositoryTriggerNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRepositoryTriggerNameExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerNameException,
    stack: String = null
  ): InvalidRepositoryTriggerNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerNameException]
  }
}

