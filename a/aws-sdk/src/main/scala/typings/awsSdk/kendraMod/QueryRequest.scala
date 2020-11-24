package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class QueryRequestOps[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
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
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryText(value: QueryText): Self = this.set("QueryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeFilter(value: AttributeFilter): Self = this.set("AttributeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeFilter: Self = this.set("AttributeFilter", js.undefined)
    
    @scala.inline
    def setFacetsVarargs(value: Facet*): Self = this.set("Facets", js.Array(value :_*))
    
    @scala.inline
    def setFacets(value: FacetList): Self = this.set("Facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacets: Self = this.set("Facets", js.undefined)
    
    @scala.inline
    def setPageNumber(value: Integer): Self = this.set("PageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("PageNumber", js.undefined)
    
    @scala.inline
    def setPageSize(value: Integer): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    
    @scala.inline
    def setQueryResultTypeFilter(value: QueryResultType): Self = this.set("QueryResultTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryResultTypeFilter: Self = this.set("QueryResultTypeFilter", js.undefined)
    
    @scala.inline
    def setRequestedDocumentAttributesVarargs(value: DocumentAttributeKey*): Self = this.set("RequestedDocumentAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRequestedDocumentAttributes(value: DocumentAttributeKeyList): Self = this.set("RequestedDocumentAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedDocumentAttributes: Self = this.set("RequestedDocumentAttributes", js.undefined)
    
    @scala.inline
    def setSortingConfiguration(value: SortingConfiguration): Self = this.set("SortingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortingConfiguration: Self = this.set("SortingConfiguration", js.undefined)
    
    @scala.inline
    def setUserContext(value: UserContext): Self = this.set("UserContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserContext: Self = this.set("UserContext", js.undefined)
  }
}
