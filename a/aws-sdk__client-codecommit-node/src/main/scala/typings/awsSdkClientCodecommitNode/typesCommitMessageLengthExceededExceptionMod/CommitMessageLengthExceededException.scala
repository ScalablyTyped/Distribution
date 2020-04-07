package typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitMessageLengthExceededException
  extends ServiceException[CommitMessageLengthExceededExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_CommitMessageLengthExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException
}

object CommitMessageLengthExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommitMessageLengthExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException,
    stack: String = null
  ): CommitMessageLengthExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitMessageLengthExceededException]
  }
}

