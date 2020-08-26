package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationsRequest extends js.Object {
  /**
    * A valid configuration identified by Application Discovery Service. 
    */
  var configurationType: ConfigurationItemType = js.native
  /**
    * You can filter the request using various logical operators and a key-value format. For example:   {"key": "serverType", "value": "webServer"}  For a complete list of filter options and guidance about using them with this action, see Using the ListConfigurations Action in the AWS Application Discovery Service User Guide.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * The total number of items to return. The maximum value is 100.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100 items, but you set ListConfigurationsRequest$maxResults to 10, you received a set of 10 results along with a token. Use that token in this query to get the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output characteristics for each filter, see Using the ListConfigurations Action in the AWS Application Discovery Service User Guide.
    */
  var orderBy: js.UndefOr[OrderByList] = js.native
}

object ListConfigurationsRequest {
  @scala.inline
  def apply(configurationType: ConfigurationItemType): ListConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationsRequest]
  }
  @scala.inline
  implicit class ListConfigurationsRequestOps[Self <: ListConfigurationsRequest] (val x: Self) extends AnyVal {
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
    def setConfigurationType(value: ConfigurationItemType): Self = this.set("configurationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setOrderByVarargs(value: OrderByElement*): Self = this.set("orderBy", js.Array(value :_*))
    @scala.inline
    def setOrderBy(value: OrderByList): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
  }
  
}

