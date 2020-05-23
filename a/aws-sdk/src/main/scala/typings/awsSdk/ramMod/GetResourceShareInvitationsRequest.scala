package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareInvitationsRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.native
  /**
    * The Amazon Resource Names (ARN) of the invitations.
    */
  var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.native
}

object GetResourceShareInvitationsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: String = null,
    resourceShareArns: ResourceShareArnList = null,
    resourceShareInvitationArns: ResourceShareInvitationArnList = null
  ): GetResourceShareInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns.asInstanceOf[js.Any])
    if (resourceShareInvitationArns != null) __obj.updateDynamic("resourceShareInvitationArns")(resourceShareInvitationArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareInvitationsRequest]
  }
}

