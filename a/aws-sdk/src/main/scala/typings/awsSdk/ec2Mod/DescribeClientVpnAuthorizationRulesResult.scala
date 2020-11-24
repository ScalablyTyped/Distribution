package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientVpnAuthorizationRulesResult extends js.Object {
  
  /**
    * Information about the authorization rules.
    */
  var AuthorizationRules: js.UndefOr[AuthorizationRuleSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeClientVpnAuthorizationRulesResult {
  
  @scala.inline
  def apply(): DescribeClientVpnAuthorizationRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnAuthorizationRulesResult]
  }
  
  @scala.inline
  implicit class DescribeClientVpnAuthorizationRulesResultOps[Self <: DescribeClientVpnAuthorizationRulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizationRulesVarargs(value: AuthorizationRule*): Self = this.set("AuthorizationRules", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizationRules(value: AuthorizationRuleSet): Self = this.set("AuthorizationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationRules: Self = this.set("AuthorizationRules", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
