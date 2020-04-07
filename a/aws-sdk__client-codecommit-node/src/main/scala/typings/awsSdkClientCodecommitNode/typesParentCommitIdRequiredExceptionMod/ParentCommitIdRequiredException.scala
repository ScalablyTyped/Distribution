package typings.awsSdkClientCodecommitNode.typesParentCommitIdRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentCommitIdRequiredException
  extends ServiceException[ParentCommitIdRequiredExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_ParentCommitIdRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdRequiredException
}

object ParentCommitIdRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ParentCommitIdRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ParentCommitIdRequiredException,
    stack: String = null
  ): ParentCommitIdRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentCommitIdRequiredException]
  }
}

