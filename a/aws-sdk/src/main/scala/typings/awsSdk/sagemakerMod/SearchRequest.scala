package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * If more than MaxResults resources match the specified SearchExpression, the response includes a NextToken. The NextToken can be passed to the next SearchRequest to continue retrieving results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * The name of the Amazon SageMaker resource to search for.
    */
  var Resource: ResourceType
  
  /**
    * A Boolean conditional statement. Resources must satisfy this condition to be included in search results. You must provide at least one subexpression, filter, or nested filter. The maximum number of recursive SubExpressions, NestedFilters, and Filters that can be included in a SearchExpression object is 50.
    */
  var SearchExpression: js.UndefOr[typings.awsSdk.sagemakerMod.SearchExpression] = js.undefined
  
  /**
    * The name of the resource property used to sort the SearchResults. The default is LastModifiedTime.
    */
  var SortBy: js.UndefOr[ResourcePropertyName] = js.undefined
  
  /**
    * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
    */
  var SortOrder: js.UndefOr[SearchSortOrder] = js.undefined
}
object SearchRequest {
  
  inline def apply(Resource: ResourceType): SearchRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRequest]
  }
  
  extension [Self <: SearchRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResource(value: ResourceType): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setSearchExpression(value: SearchExpression): Self = StObject.set(x, "SearchExpression", value.asInstanceOf[js.Any])
    
    inline def setSearchExpressionUndefined: Self = StObject.set(x, "SearchExpression", js.undefined)
    
    inline def setSortBy(value: ResourcePropertyName): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SearchSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
