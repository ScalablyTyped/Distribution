package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointConfigsInput extends StObject {
  
  /**
    * A filter that returns only endpoint configurations with a creation time greater than or equal to the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A filter that returns only endpoint configurations created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of training jobs to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the endpoint configuration name. This filter returns only endpoint configurations whose name contains the specified string. 
    */
  var NameContains: js.UndefOr[EndpointConfigNameContains] = js.undefined
  
  /**
    * If the result of the previous ListEndpointConfig request was truncated, the response includes a NextToken. To retrieve the next set of endpoint configurations, use the token in the next request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The field to sort results by. The default is CreationTime.
    */
  var SortBy: js.UndefOr[EndpointConfigSortKey] = js.undefined
  
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[OrderKey] = js.undefined
}
object ListEndpointConfigsInput {
  
  @scala.inline
  def apply(): ListEndpointConfigsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointConfigsInput]
  }
  
  @scala.inline
  implicit class ListEndpointConfigsInputMutableBuilder[Self <: ListEndpointConfigsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: Timestamp): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: Timestamp): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: EndpointConfigNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: EndpointConfigSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: OrderKey): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
