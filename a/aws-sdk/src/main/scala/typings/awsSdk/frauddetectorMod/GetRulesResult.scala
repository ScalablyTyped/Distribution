package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRulesResult extends StObject {
  
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The details of the requested rule.
    */
  var ruleDetails: js.UndefOr[RuleDetailList] = js.native
}
object GetRulesResult {
  
  @scala.inline
  def apply(): GetRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRulesResult]
  }
  
  @scala.inline
  implicit class GetRulesResultMutableBuilder[Self <: GetRulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRuleDetails(value: RuleDetailList): Self = StObject.set(x, "ruleDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDetailsUndefined: Self = StObject.set(x, "ruleDetails", js.undefined)
    
    @scala.inline
    def setRuleDetailsVarargs(value: RuleDetail*): Self = StObject.set(x, "ruleDetails", js.Array(value :_*))
  }
}
