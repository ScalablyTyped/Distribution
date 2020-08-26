package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightsRequest extends js.Object {
  /**
    * The ARNs of the insights to describe. If you do not provide any insight ARNs, then GetInsights returns all of your custom insights. It does not return any managed insights.
    */
  var InsightArns: js.UndefOr[ArnList] = js.native
  /**
    * The maximum number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the GetInsights operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object GetInsightsRequest {
  @scala.inline
  def apply(): GetInsightsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightsRequest]
  }
  @scala.inline
  implicit class GetInsightsRequestOps[Self <: GetInsightsRequest] (val x: Self) extends AnyVal {
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
    def setInsightArnsVarargs(value: NonEmptyString*): Self = this.set("InsightArns", js.Array(value :_*))
    @scala.inline
    def setInsightArns(value: ArnList): Self = this.set("InsightArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsightArns: Self = this.set("InsightArns", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

