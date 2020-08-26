package typings.awsSdkClientCodecommitNode.typesBranchNameExistsExceptionMod

import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchNameExistsException
  extends ServiceException[BranchNameExistsExceptionDetails]
     with CreateBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameExistsException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException = js.native
}

object BranchNameExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BranchNameExistsExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
  ): BranchNameExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameExistsException]
  }
  @scala.inline
  implicit class BranchNameExistsExceptionOps[Self <: BranchNameExistsException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

