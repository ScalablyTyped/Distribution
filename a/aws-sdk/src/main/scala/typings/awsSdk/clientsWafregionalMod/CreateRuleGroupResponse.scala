package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleGroupResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ChangeToken] = js.undefined
  
  /**
    * An empty RuleGroup.
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.clientsWafregionalMod.RuleGroup] = js.undefined
}
object CreateRuleGroupResponse {
  
  inline def apply(): CreateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleGroupResponse]
  }
  
  extension [Self <: CreateRuleGroupResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    inline def setRuleGroup(value: RuleGroup): Self = StObject.set(x, "RuleGroup", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupUndefined: Self = StObject.set(x, "RuleGroup", js.undefined)
  }
}
