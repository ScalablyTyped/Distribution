package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignsResponse extends js.Object {
  /**
    * An array of responses, one for each campaign that's associated with the application.
    */
  var Item: ListOfCampaignResponse = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object CampaignsResponse {
  @scala.inline
  def apply(Item: ListOfCampaignResponse, NextToken: string = null): CampaignsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignsResponse]
  }
}

