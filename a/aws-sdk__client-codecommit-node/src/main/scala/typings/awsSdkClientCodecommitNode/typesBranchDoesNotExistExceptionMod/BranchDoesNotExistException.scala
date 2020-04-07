package typings.awsSdkClientCodecommitNode.typesBranchDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getBranchExceptionsUnionMod.GetBranchExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateDefaultBranchExceptionsUnionMod.UpdateDefaultBranchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchDoesNotExistException
  extends ServiceException[BranchDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetBranchExceptionsUnion
     with PutFileExceptionsUnion
     with UpdateDefaultBranchExceptionsUnion {
  @JSName("name")
  var name_BranchDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchDoesNotExistException
}

object BranchDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BranchDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchDoesNotExistException,
    stack: String = null
  ): BranchDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchDoesNotExistException]
  }
}

