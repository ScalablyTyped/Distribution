package typings.awsSdkClientCodecommitNode.typesMaximumRepositoryNamesExceededExceptionMod

import typings.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumRepositoryNamesExceededException
  extends ServiceException[MaximumRepositoryNamesExceededExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_MaximumRepositoryNamesExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException
}

object MaximumRepositoryNamesExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumRepositoryNamesExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryNamesExceededException,
    stack: String = null
  ): MaximumRepositoryNamesExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumRepositoryNamesExceededException]
  }
}

