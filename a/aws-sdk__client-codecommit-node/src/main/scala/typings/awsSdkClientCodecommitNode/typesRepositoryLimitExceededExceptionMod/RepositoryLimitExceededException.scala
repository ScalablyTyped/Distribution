package typings.awsSdkClientCodecommitNode.typesRepositoryLimitExceededExceptionMod

import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryLimitExceededException
  extends ServiceException[RepositoryLimitExceededExceptionDetails]
     with CreateRepositoryExceptionsUnion {
  @JSName("name")
  var name_RepositoryLimitExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException
}

object RepositoryLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryLimitExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException,
    stack: String = null
  ): RepositoryLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryLimitExceededException]
  }
}

