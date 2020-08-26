package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnabledStandardsResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * The list of StandardsSubscriptions objects that include information about the enabled standards.
    */
  var StandardsSubscriptions: js.UndefOr[typings.awsSdk.securityhubMod.StandardsSubscriptions] = js.native
}

object GetEnabledStandardsResponse {
  @scala.inline
  def apply(): GetEnabledStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnabledStandardsResponse]
  }
  @scala.inline
  implicit class GetEnabledStandardsResponseOps[Self <: GetEnabledStandardsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStandardsSubscriptionsVarargs(value: StandardsSubscription*): Self = this.set("StandardsSubscriptions", js.Array(value :_*))
    @scala.inline
    def setStandardsSubscriptions(value: StandardsSubscriptions): Self = this.set("StandardsSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardsSubscriptions: Self = this.set("StandardsSubscriptions", js.undefined)
  }
  
}

