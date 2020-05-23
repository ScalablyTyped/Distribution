package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRequest extends js.Object {
  /**
    * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the AndAllFilters, NotFilter, and OrAllFilters parameters contain a list of other filters. The AttributeFilter parameter enables you to create a set of filtering rules that a document must satisfy to be included in the query results.
    */
  var AttributeFilter: js.UndefOr[typings.awsSdk.kendraMod.AttributeFilter] = js.native
  /**
    * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use this information to help narrow the search for your user.
    */
  var Facets: js.UndefOr[FacetList] = js.native
  /**
    * The unique identifier of the index to search. The identifier is returned in the response from the operation.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
  /**
    * Query results are returned in pages the size of the PageSize parameter. By default, Amazon Kendra returns the first page of results. Use this parameter to get result pages after the first one.
    */
  var PageNumber: js.UndefOr[Integer] = js.native
  /**
    * Sets the number of results that are returned in each page of results. The default page size is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100 are returned.
    */
  var PageSize: js.UndefOr[Integer] = js.native
  /**
    * Sets the type of query. Only results for the specified query type are returned.
    */
  var QueryResultTypeFilter: js.UndefOr[QueryResultType] = js.native
  /**
    * The text to search for.
    */
  var QueryText: typings.awsSdk.kendraMod.QueryText = js.native
  /**
    * An array of document attributes to include in the response. No other document attributes are included in the response. By default all document attributes are included in the response. 
    */
  var RequestedDocumentAttributes: js.UndefOr[DocumentAttributeKeyList] = js.native
}

object QueryRequest {
  @scala.inline
  def apply(
    IndexId: IndexId,
    QueryText: QueryText,
    AttributeFilter: AttributeFilter = null,
    Facets: FacetList = null,
    PageNumber: js.UndefOr[Integer] = js.undefined,
    PageSize: js.UndefOr[Integer] = js.undefined,
    QueryResultTypeFilter: QueryResultType = null,
    RequestedDocumentAttributes: DocumentAttributeKeyList = null
  ): QueryRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryText = QueryText.asInstanceOf[js.Any])
    if (AttributeFilter != null) __obj.updateDynamic("AttributeFilter")(AttributeFilter.asInstanceOf[js.Any])
    if (Facets != null) __obj.updateDynamic("Facets")(Facets.asInstanceOf[js.Any])
    if (!js.isUndefined(PageNumber)) __obj.updateDynamic("PageNumber")(PageNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize.get.asInstanceOf[js.Any])
    if (QueryResultTypeFilter != null) __obj.updateDynamic("QueryResultTypeFilter")(QueryResultTypeFilter.asInstanceOf[js.Any])
    if (RequestedDocumentAttributes != null) __obj.updateDynamic("RequestedDocumentAttributes")(RequestedDocumentAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequest]
  }
}

