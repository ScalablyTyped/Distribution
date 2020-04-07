package typings.awsSdkClientCodecommitNode.typesDefaultBranchCannotBeDeletedExceptionMod

import typings.awsSdkClientCodecommitNode.deleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultBranchCannotBeDeletedException
  extends ServiceException[DefaultBranchCannotBeDeletedExceptionDetails]
     with DeleteBranchExceptionsUnion {
  @JSName("name")
  var name_DefaultBranchCannotBeDeletedException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException
}

object DefaultBranchCannotBeDeletedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DefaultBranchCannotBeDeletedExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DefaultBranchCannotBeDeletedException,
    stack: String = null
  ): DefaultBranchCannotBeDeletedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultBranchCannotBeDeletedException]
  }
}

