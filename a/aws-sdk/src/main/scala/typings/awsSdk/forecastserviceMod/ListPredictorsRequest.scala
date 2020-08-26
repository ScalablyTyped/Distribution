package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPredictorsRequest extends js.Object {
  /**
    * An array of filters. For each filter, you provide a condition and a match statement. The condition is either IS or IS_NOT, which specifies whether to include or exclude the predictors that match the statement from the list, respectively. The match statement consists of a key and a value.  Filter properties     Condition - The condition to apply. Valid values are IS and IS_NOT. To include the predictors that match the statement, specify IS. To exclude matching predictors, specify IS_NOT.    Key - The name of the parameter to filter on. Valid values are DatasetGroupArn and Status.    Value - The value to match.   For example, to list all predictors whose status is ACTIVE, you would specify:  "Filters": [ { "Condition": "IS", "Key": "Status", "Value": "ACTIVE" } ] 
    */
  var Filters: js.UndefOr[typings.awsSdk.forecastserviceMod.Filters] = js.native
  /**
    * The number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.forecastserviceMod.MaxResults] = js.native
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListPredictorsRequest {
  @scala.inline
  def apply(): ListPredictorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPredictorsRequest]
  }
  @scala.inline
  implicit class ListPredictorsRequestOps[Self <: ListPredictorsRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
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

