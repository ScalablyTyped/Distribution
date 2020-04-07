package typings.awsSdkClientCodecommitNode.typesRepositoryNamesRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.batchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNamesRequiredException
  extends ServiceException[RepositoryNamesRequiredExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_RepositoryNamesRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNamesRequiredException
}

object RepositoryNamesRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryNamesRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNamesRequiredException,
    stack: String = null
  ): RepositoryNamesRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNamesRequiredException]
  }
}

