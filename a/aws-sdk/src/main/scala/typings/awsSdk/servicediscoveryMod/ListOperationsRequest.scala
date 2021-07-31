package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsRequest extends StObject {
  
  /**
    * A complex type that contains specifications for the operations that you want to list, for example, operations that you started between a specified start date and end date. If you specify more than one filter, an operation must match all filters to be returned by ListOperations.
    */
  var Filters: js.UndefOr[OperationFilters] = js.undefined
  
  /**
    * The maximum number of items that you want AWS Cloud Map to return in the response to a ListOperations request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 operations.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.servicediscoveryMod.MaxResults] = js.undefined
  
  /**
    * For the first ListOperations request, omit this value. If the response contains NextToken, submit another ListOperations request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults operations and then filters them based on the specified criteria. It's possible that no operations in the first MaxResults operations matched the specified criteria but that subsequent groups of MaxResults operations do contain operations that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicediscoveryMod.NextToken] = js.undefined
}
object ListOperationsRequest {
  
  @scala.inline
  def apply(): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsRequest]
  }
  
  @scala.inline
  implicit class ListOperationsRequestMutableBuilder[Self <: ListOperationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: OperationFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: OperationFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
