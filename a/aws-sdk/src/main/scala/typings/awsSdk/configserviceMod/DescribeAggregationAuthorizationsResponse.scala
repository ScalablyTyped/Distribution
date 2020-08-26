package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAggregationAuthorizationsResponse extends js.Object {
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  var AggregationAuthorizations: js.UndefOr[AggregationAuthorizationList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeAggregationAuthorizationsResponse {
  @scala.inline
  def apply(): DescribeAggregationAuthorizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregationAuthorizationsResponse]
  }
  @scala.inline
  implicit class DescribeAggregationAuthorizationsResponseOps[Self <: DescribeAggregationAuthorizationsResponse] (val x: Self) extends AnyVal {
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
    def setAggregationAuthorizationsVarargs(value: AggregationAuthorization*): Self = this.set("AggregationAuthorizations", js.Array(value :_*))
    @scala.inline
    def setAggregationAuthorizations(value: AggregationAuthorizationList): Self = this.set("AggregationAuthorizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationAuthorizations: Self = this.set("AggregationAuthorizations", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

