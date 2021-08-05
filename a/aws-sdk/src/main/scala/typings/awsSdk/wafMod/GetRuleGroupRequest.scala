package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleGroupRequest extends StObject {
  
  /**
    * The RuleGroupId of the RuleGroup that you want to get. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId
}
object GetRuleGroupRequest {
  
  inline def apply(RuleGroupId: ResourceId): GetRuleGroupRequest = {
    val __obj = js.Dynamic.literal(RuleGroupId = RuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleGroupRequest]
  }
  
  extension [Self <: GetRuleGroupRequest](x: Self) {
    
    inline def setRuleGroupId(value: ResourceId): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
  }
}
