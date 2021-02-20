package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientVpnAuthorizationRulesResult extends StObject {
  
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
  implicit class DescribeClientVpnAuthorizationRulesResultMutableBuilder[Self <: DescribeClientVpnAuthorizationRulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationRules(value: AuthorizationRuleSet): Self = StObject.set(x, "AuthorizationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationRulesUndefined: Self = StObject.set(x, "AuthorizationRules", js.undefined)
    
    @scala.inline
    def setAuthorizationRulesVarargs(value: AuthorizationRule*): Self = StObject.set(x, "AuthorizationRules", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
