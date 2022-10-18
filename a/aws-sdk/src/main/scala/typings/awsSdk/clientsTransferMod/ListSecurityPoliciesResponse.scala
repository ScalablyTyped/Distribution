package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityPoliciesResponse extends StObject {
  
  /**
    * When you can get additional results from the ListSecurityPolicies operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing security policies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
  
  /**
    * An array of security policies that were listed.
    */
  var SecurityPolicyNames: typings.awsSdk.clientsTransferMod.SecurityPolicyNames
}
object ListSecurityPoliciesResponse {
  
  inline def apply(SecurityPolicyNames: SecurityPolicyNames): ListSecurityPoliciesResponse = {
    val __obj = js.Dynamic.literal(SecurityPolicyNames = SecurityPolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityPoliciesResponse]
  }
  
  extension [Self <: ListSecurityPoliciesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityPolicyNames(value: SecurityPolicyNames): Self = StObject.set(x, "SecurityPolicyNames", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyNamesVarargs(value: SecurityPolicyName*): Self = StObject.set(x, "SecurityPolicyNames", js.Array(value*))
  }
}
