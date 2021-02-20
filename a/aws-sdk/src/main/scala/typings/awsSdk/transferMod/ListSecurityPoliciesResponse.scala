package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityPoliciesResponse extends StObject {
  
  /**
    * When you can get additional results from the ListSecurityPolicies operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing security policies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.native
  
  /**
    * An array of security policies that were listed.
    */
  var SecurityPolicyNames: typings.awsSdk.transferMod.SecurityPolicyNames = js.native
}
object ListSecurityPoliciesResponse {
  
  @scala.inline
  def apply(SecurityPolicyNames: SecurityPolicyNames): ListSecurityPoliciesResponse = {
    val __obj = js.Dynamic.literal(SecurityPolicyNames = SecurityPolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSecurityPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListSecurityPoliciesResponseMutableBuilder[Self <: ListSecurityPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSecurityPolicyNames(value: SecurityPolicyNames): Self = StObject.set(x, "SecurityPolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyNamesVarargs(value: SecurityPolicyName*): Self = StObject.set(x, "SecurityPolicyNames", js.Array(value :_*))
  }
}
