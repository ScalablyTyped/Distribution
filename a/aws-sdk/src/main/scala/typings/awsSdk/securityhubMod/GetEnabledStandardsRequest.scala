package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnabledStandardsRequest extends js.Object {
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the GetEnabledStandards operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of the standards subscription ARNs for the standards to retrieve.
    */
  var StandardsSubscriptionArns: js.UndefOr[typings.awsSdk.securityhubMod.StandardsSubscriptionArns] = js.native
}

object GetEnabledStandardsRequest {
  @scala.inline
  def apply(): GetEnabledStandardsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnabledStandardsRequest]
  }
  @scala.inline
  implicit class GetEnabledStandardsRequestOps[Self <: GetEnabledStandardsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStandardsSubscriptionArnsVarargs(value: NonEmptyString*): Self = this.set("StandardsSubscriptionArns", js.Array(value :_*))
    @scala.inline
    def setStandardsSubscriptionArns(value: StandardsSubscriptionArns): Self = this.set("StandardsSubscriptionArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardsSubscriptionArns: Self = this.set("StandardsSubscriptionArns", js.undefined)
  }
  
}

