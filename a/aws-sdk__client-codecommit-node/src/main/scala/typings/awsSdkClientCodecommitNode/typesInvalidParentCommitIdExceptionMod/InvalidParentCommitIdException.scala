package typings.awsSdkClientCodecommitNode.typesInvalidParentCommitIdExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidParentCommitIdException
  extends ServiceException[InvalidParentCommitIdExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidParentCommitIdException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidParentCommitIdException
}

object InvalidParentCommitIdException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidParentCommitIdExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidParentCommitIdException,
    stack: String = null
  ): InvalidParentCommitIdException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidParentCommitIdException]
  }
}

