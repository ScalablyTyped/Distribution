package typings.awsSdkClientCodecommitNode.typesBeforeCommitIdAndAfterCommitIdAreSameExceptionMod

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeCommitIdAndAfterCommitIdAreSameException
  extends ServiceException[BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_BeforeCommitIdAndAfterCommitIdAreSameException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException = js.native
}

object BeforeCommitIdAndAfterCommitIdAreSameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
  ): BeforeCommitIdAndAfterCommitIdAreSameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCommitIdAndAfterCommitIdAreSameException]
  }
  @scala.inline
  implicit class BeforeCommitIdAndAfterCommitIdAreSameExceptionOps[Self <: BeforeCommitIdAndAfterCommitIdAreSameException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

