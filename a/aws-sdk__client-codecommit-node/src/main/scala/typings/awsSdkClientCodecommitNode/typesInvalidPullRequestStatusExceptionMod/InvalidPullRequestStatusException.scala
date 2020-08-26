package typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusExceptionMod

import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidPullRequestStatusException
  extends ServiceException[InvalidPullRequestStatusExceptionDetails]
     with ListPullRequestsExceptionsUnion
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestStatusException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException = js.native
}

object InvalidPullRequestStatusException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidPullRequestStatusExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException
  ): InvalidPullRequestStatusException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestStatusException]
  }
  @scala.inline
  implicit class InvalidPullRequestStatusExceptionOps[Self <: InvalidPullRequestStatusException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

