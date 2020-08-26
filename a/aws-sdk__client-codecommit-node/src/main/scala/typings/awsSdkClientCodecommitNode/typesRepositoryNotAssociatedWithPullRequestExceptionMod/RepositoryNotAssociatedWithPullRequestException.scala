package typings.awsSdkClientCodecommitNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod

import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNotAssociatedWithPullRequestException
  extends ServiceException[RepositoryNotAssociatedWithPullRequestExceptionDetails]
     with GetCommentsForPullRequestExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_RepositoryNotAssociatedWithPullRequestException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException = js.native
}

object RepositoryNotAssociatedWithPullRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RepositoryNotAssociatedWithPullRequestExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException
  ): RepositoryNotAssociatedWithPullRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNotAssociatedWithPullRequestException]
  }
  @scala.inline
  implicit class RepositoryNotAssociatedWithPullRequestExceptionOps[Self <: RepositoryNotAssociatedWithPullRequestException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNotAssociatedWithPullRequestException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

