package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRateBasedRuleResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.undefined
  
  /**
    * The RateBasedRule that is returned in the CreateRateBasedRule response.
    */
  var Rule: js.UndefOr[RateBasedRule] = js.undefined
}
object CreateRateBasedRuleResponse {
  
  @scala.inline
  def apply(): CreateRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRateBasedRuleResponse]
  }
  
  @scala.inline
  implicit class CreateRateBasedRuleResponseMutableBuilder[Self <: CreateRateBasedRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setRule(value: RateBasedRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
