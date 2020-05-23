package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * If more than MaxResults resources match the specified SearchExpression, the response includes a NextToken. The NextToken can be passed to the next SearchRequest to continue retrieving results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The name of the Amazon SageMaker resource to search for.
    */
  var Resource: ResourceType = js.native
  /**
    * A Boolean conditional statement. Resources must satisfy this condition to be included in search results. You must provide at least one subexpression, filter, or nested filter. The maximum number of recursive SubExpressions, NestedFilters, and Filters that can be included in a SearchExpression object is 50.
    */
  var SearchExpression: js.UndefOr[typings.awsSdk.sagemakerMod.SearchExpression] = js.native
  /**
    * The name of the resource property used to sort the SearchResults. The default is LastModifiedTime.
    */
  var SortBy: js.UndefOr[ResourcePropertyName] = js.native
  /**
    * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
    */
  var SortOrder: js.UndefOr[SearchSortOrder] = js.native
}

object SearchRequest {
  @scala.inline
  def apply(
    Resource: ResourceType,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    SearchExpression: SearchExpression = null,
    SortBy: ResourcePropertyName = null,
    SortOrder: SearchSortOrder = null
  ): SearchRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SearchExpression != null) __obj.updateDynamic("SearchExpression")(SearchExpression.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRequest]
  }
}

