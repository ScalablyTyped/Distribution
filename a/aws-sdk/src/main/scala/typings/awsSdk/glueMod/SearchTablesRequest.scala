package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTablesRequest extends js.Object {
  /**
    * A unique identifier, consisting of  account_id/datalake.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the predicate.
    */
  var Filters: js.UndefOr[SearchPropertyPredicates] = js.native
  /**
    * The maximum number of tables to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, included if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A string used for a text search. Specifying a value in quotes filters based on an exact match to the value.
    */
  var SearchText: js.UndefOr[ValueString] = js.native
  /**
    * A list of criteria for sorting the results by a field name, in an ascending or descending order.
    */
  var SortCriteria: js.UndefOr[typings.awsSdk.glueMod.SortCriteria] = js.native
}

object SearchTablesRequest {
  @scala.inline
  def apply(
    CatalogId: CatalogIdString = null,
    Filters: SearchPropertyPredicates = null,
    MaxResults: Int | Double = null,
    NextToken: Token = null,
    SearchText: ValueString = null,
    SortCriteria: SortCriteria = null
  ): SearchTablesRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SearchText != null) __obj.updateDynamic("SearchText")(SearchText.asInstanceOf[js.Any])
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTablesRequest]
  }
}

