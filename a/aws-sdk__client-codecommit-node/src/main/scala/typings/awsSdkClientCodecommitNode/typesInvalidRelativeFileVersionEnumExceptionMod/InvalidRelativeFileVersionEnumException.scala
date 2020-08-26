package typings.awsSdkClientCodecommitNode.typesInvalidRelativeFileVersionEnumExceptionMod

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRelativeFileVersionEnumException
  extends ServiceException[InvalidRelativeFileVersionEnumExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidRelativeFileVersionEnumException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRelativeFileVersionEnumException = js.native
}

object InvalidRelativeFileVersionEnumException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRelativeFileVersionEnumExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRelativeFileVersionEnumException
  ): InvalidRelativeFileVersionEnumException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRelativeFileVersionEnumException]
  }
  @scala.inline
  implicit class InvalidRelativeFileVersionEnumExceptionOps[Self <: InvalidRelativeFileVersionEnumException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidRelativeFileVersionEnumException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

