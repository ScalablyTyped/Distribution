package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSecurityPoliciesResponse extends js.Object {
  
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
  implicit class ListSecurityPoliciesResponseOps[Self <: ListSecurityPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSecurityPolicyNamesVarargs(value: SecurityPolicyName*): Self = this.set("SecurityPolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setSecurityPolicyNames(value: SecurityPolicyNames): Self = this.set("SecurityPolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
