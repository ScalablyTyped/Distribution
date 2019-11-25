package typings.atAwsDashSdkClientDashCodecommitDashNode.typesTipOfSourceReferenceIsDifferentExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipOfSourceReferenceIsDifferentException
  extends ServiceException[_TipOfSourceReferenceIsDifferentExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_TipOfSourceReferenceIsDifferentException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.TipOfSourceReferenceIsDifferentException
}

object TipOfSourceReferenceIsDifferentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _TipOfSourceReferenceIsDifferentExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.TipOfSourceReferenceIsDifferentException,
    stack: String = null
  ): TipOfSourceReferenceIsDifferentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
  }
}

