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

@js.native
trait BranchNameRequiredException
  extends ServiceException[BranchNameRequiredExceptionDetails]
     with CreateBranchExceptionsUnion
     with DeleteBranchExceptionsUnion
     with DeleteFileExceptionsUnion
     with GetBranchExceptionsUnion
     with PutFileExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException = js.native
}

object BranchNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BranchNameRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
  ): BranchNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameRequiredException]
  }
  @scala.inline
  implicit class BranchNameRequiredExceptionOps[Self <: BranchNameRequiredException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameRequiredException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

