package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult extends StObject {
  
  /**
    * Contains the facet results. A FacetResult contains the counts for each attribute key that was specified in the Facets input parameter.
    */
  var FacetResults: js.UndefOr[FacetResultList] = js.undefined
  
  /**
    * The unique identifier for the search. You use QueryId to identify the search when using the feedback API.
    */
  var QueryId: js.UndefOr[typings.awsSdk.kendraMod.QueryId] = js.undefined
  
  /**
    * The results of the search.
    */
  var ResultItems: js.UndefOr[QueryResultItemList] = js.undefined
  
  /**
    * The total number of items found by the search; however, you can only retrieve up to 100 items. For example, if the search found 192 items, you can only retrieve the first 100 of the items.
    */
  var TotalNumberOfResults: js.UndefOr[Integer] = js.undefined
}
object QueryResult {
  
  @scala.inline
  def apply(): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit class QueryResultMutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetResults(value: FacetResultList): Self = StObject.set(x, "FacetResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetResultsUndefined: Self = StObject.set(x, "FacetResults", js.undefined)
    
    @scala.inline
    def setFacetResultsVarargs(value: FacetResult*): Self = StObject.set(x, "FacetResults", js.Array(value :_*))
    
    @scala.inline
    def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryIdUndefined: Self = StObject.set(x, "QueryId", js.undefined)
    
    @scala.inline
    def setResultItems(value: QueryResultItemList): Self = StObject.set(x, "ResultItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultItemsUndefined: Self = StObject.set(x, "ResultItems", js.undefined)
    
    @scala.inline
    def setResultItemsVarargs(value: QueryResultItem*): Self = StObject.set(x, "ResultItems", js.Array(value :_*))
    
    @scala.inline
    def setTotalNumberOfResults(value: Integer): Self = StObject.set(x, "TotalNumberOfResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNumberOfResultsUndefined: Self = StObject.set(x, "TotalNumberOfResults", js.undefined)
  }
}
