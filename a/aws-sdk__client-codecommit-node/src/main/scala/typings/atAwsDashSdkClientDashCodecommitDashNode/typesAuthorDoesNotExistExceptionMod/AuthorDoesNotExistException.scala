package typings.atAwsDashSdkClientDashCodecommitDashNode.typesAuthorDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorDoesNotExistException
  extends ServiceException[_AuthorDoesNotExistExceptionDetails]
     with ListPullRequestsExceptionsUnion {
  @JSName("name")
  var name_AuthorDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.AuthorDoesNotExistException
}

object AuthorDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _AuthorDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.AuthorDoesNotExistException,
    stack: String = null
  ): AuthorDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorDoesNotExistException]
  }
}

