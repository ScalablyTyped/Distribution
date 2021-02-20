package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityPoliciesRequest extends StObject {
  
  /**
    * Specifies the number of security policies to return as a response to the ListSecurityPolicies query.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transferMod.MaxResults] = js.native
  
  /**
    * When additional results are obtained from the ListSecurityPolicies command, a NextToken parameter is returned in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional security policies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.native
}
object ListSecurityPoliciesRequest {
  
  @scala.inline
  def apply(): ListSecurityPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityPoliciesRequest]
  }
  
  @scala.inline
  implicit class ListSecurityPoliciesRequestMutableBuilder[Self <: ListSecurityPoliciesRequest] (val x: Self) extends AnyVal {
    
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
