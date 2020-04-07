package typings.awsSdkClientCodecommitNode.typesInvalidRepositoryTriggerBranchNameExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRepositoryTriggerBranchNameException
  extends ServiceException[InvalidRepositoryTriggerBranchNameExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_InvalidRepositoryTriggerBranchNameException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerBranchNameException
}

object InvalidRepositoryTriggerBranchNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRepositoryTriggerBranchNameExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRepositoryTriggerBranchNameException,
    stack: String = null
  ): InvalidRepositoryTriggerBranchNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRepositoryTriggerBranchNameException]
  }
}

