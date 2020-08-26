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
  def apply(): ListCampaignsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsRequest]
  }
  @scala.inline
  implicit class ListCampaignsRequestOps[Self <: ListCampaignsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSolutionArn(value: Arn): Self = this.set("solutionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolutionArn: Self = this.set("solutionArn", js.undefined)
  }
  
}

