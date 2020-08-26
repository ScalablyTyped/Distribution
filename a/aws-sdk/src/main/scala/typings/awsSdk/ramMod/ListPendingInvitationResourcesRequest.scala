package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPendingInvitationResourcesRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the invitation.
    */
  var resourceShareInvitationArn: String = js.native
}

object ListPendingInvitationResourcesRequest {
  @scala.inline
  def apply(resourceShareInvitationArn: String): ListPendingInvitationResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceShareInvitationArn = resourceShareInvitationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPendingInvitationResourcesRequest]
  }
  @scala.inline
  implicit class ListPendingInvitationResourcesRequestOps[Self <: ListPendingInvitationResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceShareInvitationArn(value: String): Self = this.set("resourceShareInvitationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

