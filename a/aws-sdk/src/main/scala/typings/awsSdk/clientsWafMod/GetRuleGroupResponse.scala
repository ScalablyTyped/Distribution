package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleGroupResponse extends StObject {
  
  /**
    * Information about the RuleGroup that you specified in the GetRuleGroup request. 
    */
  var RuleGroup: js.UndefOr[typings.awsSdk.clientsWafMod.RuleGroup] = js.undefined
}
object GetRuleGroupResponse {
  
  inline def apply(): GetRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuleGroupResponse]
  }
  
  extension [Self <: GetRuleGroupResponse](x: Self) {
    
    inline def setRuleGroup(value: RuleGroup): Self = StObject.set(x, "RuleGroup", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupUndefined: Self = StObject.set(x, "RuleGroup", js.undefined)
  }
}
