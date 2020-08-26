package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeParametersRequest extends js.Object {
  /**
    * This data type is deprecated. Instead, use ParameterFilters.
    */
  var Filters: js.UndefOr[ParametersFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Filters to limit the request results.
    */
  var ParameterFilters: js.UndefOr[ParameterStringFilterList] = js.native
}

object DescribeParametersRequest {
  @scala.inline
  def apply(): DescribeParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParametersRequest]
  }
  @scala.inline
  implicit class DescribeParametersRequestOps[Self <: DescribeParametersRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: ParametersFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: ParametersFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setParameterFiltersVarargs(value: ParameterStringFilter*): Self = this.set("ParameterFilters", js.Array(value :_*))
    @scala.inline
    def setParameterFilters(value: ParameterStringFilterList): Self = this.set("ParameterFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterFilters: Self = this.set("ParameterFilters", js.undefined)
  }
  
}

