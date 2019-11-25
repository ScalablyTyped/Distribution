package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDefaultBranchCannotBeDeletedExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultBranchCannotBeDeletedException
  extends ServiceException[_DefaultBranchCannotBeDeletedExceptionDetails]
     with DeleteBranchExceptionsUnion {
  @JSName("name")
  var name_DefaultBranchCannotBeDeletedException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.DefaultBranchCannotBeDeletedException
}

object DefaultBranchCannotBeDeletedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _DefaultBranchCannotBeDeletedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.DefaultBranchCannotBeDeletedException,
    stack: String = null
  ): DefaultBranchCannotBeDeletedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultBranchCannotBeDeletedException]
  }
}

