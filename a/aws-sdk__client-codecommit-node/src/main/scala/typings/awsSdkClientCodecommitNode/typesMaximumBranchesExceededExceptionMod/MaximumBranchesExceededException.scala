package typings.awsSdkClientCodecommitNode.typesMaximumBranchesExceededExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumBranchesExceededException
  extends ServiceException[MaximumBranchesExceededExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_MaximumBranchesExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException
}

object MaximumBranchesExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumBranchesExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException,
    stack: String = null
  ): MaximumBranchesExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumBranchesExceededException]
  }
}

