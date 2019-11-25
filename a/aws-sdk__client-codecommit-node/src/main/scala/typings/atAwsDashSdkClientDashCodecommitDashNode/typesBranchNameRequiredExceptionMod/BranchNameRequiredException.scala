package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBranchNameRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchNameRequiredException
  extends ServiceException[_BranchNameRequiredExceptionDetails]
     with CreateBranchExceptionsUnion
     with DeleteBranchExceptionsUnion
     with DeleteFileExceptionsUnion
     with GetBranchExceptionsUnion
     with PutFileExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BranchNameRequiredException
}

object BranchNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BranchNameRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BranchNameRequiredException,
    stack: String = null
  ): BranchNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameRequiredException]
  }
}

