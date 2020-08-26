package typings.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestAlreadyClosedException
  extends ServiceException[PullRequestAlreadyClosedExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_PullRequestAlreadyClosedException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException = js.native
}

object PullRequestAlreadyClosedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PullRequestAlreadyClosedExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException
  ): PullRequestAlreadyClosedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestAlreadyClosedException]
  }
  @scala.inline
  implicit class PullRequestAlreadyClosedExceptionOps[Self <: PullRequestAlreadyClosedException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

