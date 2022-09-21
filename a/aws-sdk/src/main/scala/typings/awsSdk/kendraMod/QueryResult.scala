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
    * A list of information related to suggested spell corrections for a query.
    */
  var SpellCorrectedQueries: js.UndefOr[SpellCorrectedQueryList] = js.undefined
  
  /**
    * The total number of items found by the search; however, you can only retrieve up to 100 items. For example, if the search found 192 items, you can only retrieve the first 100 of the items.
    */
  var TotalNumberOfResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of warning codes and their messages on problems with your query. Amazon Kendra currently only supports one type of warning, which is a warning on invalid syntax used in the query. For examples of invalid query syntax, see Searching with advanced query syntax.
    */
  var Warnings: js.UndefOr[WarningList] = js.undefined
}
object QueryResult {
  
  inline def apply(): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResult]
  }
  
  extension [Self <: QueryResult](x: Self) {
    
    inline def setFacetResults(value: FacetResultList): Self = StObject.set(x, "FacetResults", value.asInstanceOf[js.Any])
    
    inline def setFacetResultsUndefined: Self = StObject.set(x, "FacetResults", js.undefined)
    
    inline def setFacetResultsVarargs(value: FacetResult*): Self = StObject.set(x, "FacetResults", js.Array(value*))
    
    inline def setQueryId(value: QueryId): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "QueryId", js.undefined)
    
    inline def setResultItems(value: QueryResultItemList): Self = StObject.set(x, "ResultItems", value.asInstanceOf[js.Any])
    
    inline def setResultItemsUndefined: Self = StObject.set(x, "ResultItems", js.undefined)
    
    inline def setResultItemsVarargs(value: QueryResultItem*): Self = StObject.set(x, "ResultItems", js.Array(value*))
    
    inline def setSpellCorrectedQueries(value: SpellCorrectedQueryList): Self = StObject.set(x, "SpellCorrectedQueries", value.asInstanceOf[js.Any])
    
    inline def setSpellCorrectedQueriesUndefined: Self = StObject.set(x, "SpellCorrectedQueries", js.undefined)
    
    inline def setSpellCorrectedQueriesVarargs(value: SpellCorrectedQuery*): Self = StObject.set(x, "SpellCorrectedQueries", js.Array(value*))
    
    inline def setTotalNumberOfResults(value: Integer): Self = StObject.set(x, "TotalNumberOfResults", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfResultsUndefined: Self = StObject.set(x, "TotalNumberOfResults", js.undefined)
    
    inline def setWarnings(value: WarningList): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value*))
  }
}
