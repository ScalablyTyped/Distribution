package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationSummariesRequest extends js.Object {
  /**
    * The IDs of the AWS accounts for which to return recommendation summaries. If your account is the master account of an organization, use this parameter to specify the member accounts for which you want to return recommendation summaries. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.native
  /**
    * The maximum number of recommendation summaries to return with a single request. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to advance to the next page of recommendation summaries.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetRecommendationSummariesRequest {
  @scala.inline
  def apply(): GetRecommendationSummariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecommendationSummariesRequest]
  }
  @scala.inline
  implicit class GetRecommendationSummariesRequestOps[Self <: GetRecommendationSummariesRequest] (val x: Self) extends AnyVal {
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
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("accountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIds): Self = this.set("accountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIds: Self = this.set("accountIds", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

