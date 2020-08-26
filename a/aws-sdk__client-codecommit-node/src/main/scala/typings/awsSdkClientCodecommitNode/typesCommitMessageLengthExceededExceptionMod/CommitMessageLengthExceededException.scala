package typings.awsSdkClientCodecommitNode.typesCommitMessageLengthExceededExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitMessageLengthExceededException
  extends ServiceException[CommitMessageLengthExceededExceptionDetails]
     with DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_CommitMessageLengthExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException = js.native
}

object CommitMessageLengthExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CommitMessageLengthExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException
  ): CommitMessageLengthExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitMessageLengthExceededException]
  }
  @scala.inline
  implicit class CommitMessageLengthExceededExceptionOps[Self <: CommitMessageLengthExceededException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitMessageLengthExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

