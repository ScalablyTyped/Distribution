package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSummary extends StObject {
  
  /**
    * A friendly name or description of the RuleGroup. You can't change the name of a RuleGroup after you create it.
    */
  var Name: ResourceName
  
  /**
    * A unique identifier for a RuleGroup. You use RuleGroupId to get more information about a RuleGroup (see GetRuleGroup), update a RuleGroup (see UpdateRuleGroup), insert a RuleGroup into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a RuleGroup from AWS WAF (see DeleteRuleGroup).  RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId
}
object RuleGroupSummary {
  
  inline def apply(Name: ResourceName, RuleGroupId: ResourceId): RuleGroupSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupSummary]
  }
  
  extension [Self <: RuleGroupSummary](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupId(value: ResourceId): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
  }
}
