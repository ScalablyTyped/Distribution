package typings.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchNameIsTagNameException
  extends ServiceException[BranchNameIsTagNameExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_BranchNameIsTagNameException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException
}

object BranchNameIsTagNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BranchNameIsTagNameExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException,
    stack: String = null
  ): BranchNameIsTagNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameIsTagNameException]
  }
}

