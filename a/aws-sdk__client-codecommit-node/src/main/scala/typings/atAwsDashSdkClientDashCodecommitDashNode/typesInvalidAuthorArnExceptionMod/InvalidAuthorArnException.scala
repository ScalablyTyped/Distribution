package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidAuthorArnExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAuthorArnException
  extends ServiceException[_InvalidAuthorArnExceptionDetails]
     with ListPullRequestsExceptionsUnion {
  @JSName("name")
  var name_InvalidAuthorArnException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidAuthorArnException
}

object InvalidAuthorArnException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidAuthorArnExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidAuthorArnException,
    stack: String = null
  ): InvalidAuthorArnException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAuthorArnException]
  }
}

