package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequest extends StObject {
  
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
  
  /**
    * Provides information that determines how the results of the query are sorted. You can set the field that Amazon Kendra should sort the results on, and specify whether the results should be sorted in ascending or descending order. In the case of ties in sorting the results, the results are sorted by relevance. If you don't provide sorting configuration, the results are sorted by the relevance that Amazon Kendra determines for the result.
    */
  var SortingConfiguration: js.UndefOr[typings.awsSdk.kendraMod.SortingConfiguration] = js.native
  
  /**
    * The user context token.
    */
  var UserContext: js.UndefOr[typings.awsSdk.kendraMod.UserContext] = js.native
}
object QueryRequest {
  
  @scala.inline
  def apply(IndexId: IndexId, QueryText: QueryText): QueryRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryText = QueryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit class QueryRequestMutableBuilder[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeFilter(value: AttributeFilter): Self = StObject.set(x, "AttributeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeFilterUndefined: Self = StObject.set(x, "AttributeFilter", js.undefined)
    
    @scala.inline
    def setFacets(value: FacetList): Self = StObject.set(x, "Facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsUndefined: Self = StObject.set(x, "Facets", js.undefined)
    
    @scala.inline
    def setFacetsVarargs(value: Facet*): Self = StObject.set(x, "Facets", js.Array(value :_*))
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumber(value: Integer): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
    
    @scala.inline
    def setPageSize(value: Integer): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setQueryResultTypeFilter(value: QueryResultType): Self = StObject.set(x, "QueryResultTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultTypeFilterUndefined: Self = StObject.set(x, "QueryResultTypeFilter", js.undefined)
    
    @scala.inline
    def setQueryText(value: QueryText): Self = StObject.set(x, "QueryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedDocumentAttributes(value: DocumentAttributeKeyList): Self = StObject.set(x, "RequestedDocumentAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedDocumentAttributesUndefined: Self = StObject.set(x, "RequestedDocumentAttributes", js.undefined)
    
    @scala.inline
    def setRequestedDocumentAttributesVarargs(value: DocumentAttributeKey*): Self = StObject.set(x, "RequestedDocumentAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSortingConfiguration(value: SortingConfiguration): Self = StObject.set(x, "SortingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingConfigurationUndefined: Self = StObject.set(x, "SortingConfiguration", js.undefined)
    
    @scala.inline
    def setUserContext(value: UserContext): Self = StObject.set(x, "UserContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserContextUndefined: Self = StObject.set(x, "UserContext", js.undefined)
  }
}
