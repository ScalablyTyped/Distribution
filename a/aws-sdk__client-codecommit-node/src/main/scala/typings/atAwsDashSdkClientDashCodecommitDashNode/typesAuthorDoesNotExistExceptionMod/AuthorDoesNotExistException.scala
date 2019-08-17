package typings.atAwsDashSdkClientDashCodecommitDashNode.typesAuthorDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _AuthorDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.AuthorDoesNotExistException,
    stack: String = null
  ): AuthorDoesNotExistException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AuthorDoesNotExistException]
  }
}

