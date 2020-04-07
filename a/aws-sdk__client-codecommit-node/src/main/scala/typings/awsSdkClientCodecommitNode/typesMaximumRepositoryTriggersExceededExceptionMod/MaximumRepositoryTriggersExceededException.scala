package typings.awsSdkClientCodecommitNode.typesMaximumRepositoryTriggersExceededExceptionMod

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumRepositoryTriggersExceededException
  extends ServiceException[MaximumRepositoryTriggersExceededExceptionDetails]
     with PutRepositoryTriggersExceptionsUnion
     with TestRepositoryTriggersExceptionsUnion {
  @JSName("name")
  var name_MaximumRepositoryTriggersExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException
}

object MaximumRepositoryTriggersExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumRepositoryTriggersExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException,
    stack: String = null
  ): MaximumRepositoryTriggersExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumRepositoryTriggersExceededException]
  }
}

