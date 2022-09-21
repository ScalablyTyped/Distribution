package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesOutput extends StObject {
  
  /**
    * The resource type that the readiness rule applies to.
    */
  var ResourceType: stringMax64
  
  /**
    * The description of a readiness rule.
    */
  var RuleDescription: stringMax256
  
  /**
    * The ID for the readiness rule.
    */
  var RuleId: stringMax64
}
object ListRulesOutput {
  
  inline def apply(ResourceType: stringMax64, RuleDescription: stringMax256, RuleId: stringMax64): ListRulesOutput = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], RuleDescription = RuleDescription.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRulesOutput]
  }
  
  extension [Self <: ListRulesOutput](x: Self) {
    
    inline def setResourceType(value: stringMax64): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setRuleDescription(value: stringMax256): Self = StObject.set(x, "RuleDescription", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: stringMax64): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
