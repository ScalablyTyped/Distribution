package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityPoliciesRequest extends StObject {
  
  /**
    * Specifies the number of security policies to return as a response to the ListSecurityPolicies query.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsTransferMod.MaxResults] = js.undefined
  
  /**
    * When additional results are obtained from the ListSecurityPolicies command, a NextToken parameter is returned in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional security policies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
}
object ListSecurityPoliciesRequest {
  
  inline def apply(): ListSecurityPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityPoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSecurityPoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
