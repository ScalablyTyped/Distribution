package typings.awsSdkClientCodecommitNode.typesBranchNameRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchNameRequiredException
  extends ServiceException[BranchNameRequiredExceptionDetails]
     with CreateBranchExceptionsUnion
     with DeleteBranchExceptionsUnion
     with DeleteFileExceptionsUnion
     with GetBranchExceptionsUnion
     with PutFileExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
}

object BranchNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BranchNameRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException,
    stack: String = null
  ): BranchNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameRequiredException]
  }
}

