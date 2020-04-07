package typings.awsSdkClientCodecommitNode.typesBranchNameExistsExceptionMod

import typings.awsSdkClientCodecommitNode.createBranchExceptionsUnionMod.CreateBranchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchNameExistsException
  extends ServiceException[BranchNameExistsExceptionDetails]
     with CreateBranchExceptionsUnion {
  @JSName("name")
  var name_BranchNameExistsException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException
}

object BranchNameExistsException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BranchNameExistsExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameExistsException,
    stack: String = null
  ): BranchNameExistsException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameExistsException]
  }
}

