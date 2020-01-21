package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCampaignsRequest extends js.Object {
  /**
    * The maximum number of campaigns to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token returned from the previous call to ListCampaigns for getting the next set of campaigns (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the solution to list the campaigns for. When a solution is not specified, all the campaigns associated with the account are listed.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
}

object ListCampaignsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: NextToken = null, solutionArn: Arn = null): ListCampaignsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCampaignsRequest]
  }
}

