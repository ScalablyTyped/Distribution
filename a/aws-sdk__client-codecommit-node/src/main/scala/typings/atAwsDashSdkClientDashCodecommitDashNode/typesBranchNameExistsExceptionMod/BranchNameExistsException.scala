package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBranchNameExistsExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchNameExistsException
  extends ServiceException[_BranchNameExistsExceptionDetails]
     with CreateBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameExistsException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BranchNameExistsException
}

object BranchNameExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BranchNameExistsExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BranchNameExistsException,
    stack: String = null
  ): BranchNameExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameExistsException]
  }
}

