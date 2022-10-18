package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSummary extends StObject {
  
  /**
    * A friendly name or description of the Rule. You can't change the name of a Rule after you create it.
    */
  var Name: ResourceName
  
  /**
    * A unique identifier for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId
}
object RuleSummary {
  
  inline def apply(Name: ResourceName, RuleId: ResourceId): RuleSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSummary]
  }
  
  extension [Self <: RuleSummary](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
