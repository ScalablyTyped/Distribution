package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRateBasedRuleResponse extends StObject {
  
  /**
    * Information about the RateBasedRule that you specified in the GetRateBasedRule request.
    */
  var Rule: js.UndefOr[RateBasedRule] = js.native
}
object GetRateBasedRuleResponse {
  
  @scala.inline
  def apply(): GetRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleResponse]
  }
  
  @scala.inline
  implicit class GetRateBasedRuleResponseMutableBuilder[Self <: GetRateBasedRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: RateBasedRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
