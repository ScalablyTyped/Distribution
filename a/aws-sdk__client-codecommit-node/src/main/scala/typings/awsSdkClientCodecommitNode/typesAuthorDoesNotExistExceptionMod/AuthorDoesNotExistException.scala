package typings.awsSdkClientCodecommitNode.typesAuthorDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorDoesNotExistException
  extends ServiceException[AuthorDoesNotExistExceptionDetails]
     with ListPullRequestsExceptionsUnion {
  @JSName("name")
  var name_AuthorDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException
}

object AuthorDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: AuthorDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException,
    stack: String = null
  ): AuthorDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorDoesNotExistException]
  }
}

