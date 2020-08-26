package typings.awsSdkClientCodecommitNode.typesPullRequestStatusRequiredExceptionMod

import typings.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestStatusRequiredException
  extends ServiceException[PullRequestStatusRequiredExceptionDetails]
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_PullRequestStatusRequiredException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestStatusRequiredException = js.native
}

object PullRequestStatusRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PullRequestStatusRequiredExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestStatusRequiredException
  ): PullRequestStatusRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestStatusRequiredException]
  }
  @scala.inline
  implicit class PullRequestStatusRequiredExceptionOps[Self <: PullRequestStatusRequiredException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestStatusRequiredException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

