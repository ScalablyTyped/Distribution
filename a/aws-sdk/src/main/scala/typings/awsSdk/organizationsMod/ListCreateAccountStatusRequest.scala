package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCreateAccountStatusRequest extends StObject {
  
  /**
    * The total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.organizationsMod.MaxResults] = js.undefined
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.undefined
  
  /**
    * A list of one or more states that you want included in the response. If this parameter isn't present, all requests are included in the response.
    */
  var States: js.UndefOr[CreateAccountStates] = js.undefined
}
object ListCreateAccountStatusRequest {
  
  inline def apply(): ListCreateAccountStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreateAccountStatusRequest]
  }
  
  extension [Self <: ListCreateAccountStatusRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStates(value: CreateAccountStates): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "States", js.undefined)
    
    inline def setStatesVarargs(value: CreateAccountState*): Self = StObject.set(x, "States", js.Array(value :_*))
  }
}
