package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult extends js.Object {
  /**
    * Contains the facet results. A FacetResult contains the counts for each attribute key that was specified in the Facets input parameter.
    */
  var FacetResults: js.UndefOr[FacetResultList] = js.native
  /**
    * The unique identifier for the search. You use QueryId to identify the search when using the feedback API.
    */
  var QueryId: js.UndefOr[typings.awsSdk.kendraMod.QueryId] = js.native
  /**
    * The results of the search.
    */
  var ResultItems: js.UndefOr[QueryResultItemList] = js.native
  /**
    * The number of items returned by the search. Use this to determine when you have requested the last set of results.
    */
  var TotalNumberOfResults: js.UndefOr[Integer] = js.native
}

object QueryResult {
  @scala.inline
  def apply(
    FacetResults: FacetResultList = null,
    QueryId: QueryId = null,
    ResultItems: QueryResultItemList = null,
    TotalNumberOfResults: js.UndefOr[Integer] = js.undefined
  ): QueryResult = {
    val __obj = js.Dynamic.literal()
    if (FacetResults != null) __obj.updateDynamic("FacetResults")(FacetResults.asInstanceOf[js.Any])
    if (QueryId != null) __obj.updateDynamic("QueryId")(QueryId.asInstanceOf[js.Any])
    if (ResultItems != null) __obj.updateDynamic("ResultItems")(ResultItems.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalNumberOfResults)) __obj.updateDynamic("TotalNumberOfResults")(TotalNumberOfResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

