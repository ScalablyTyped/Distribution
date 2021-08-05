package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LateDataRule extends StObject {
  
  /**
    * The information needed to configure the late data rule.
    */
  var ruleConfiguration: LateDataRuleConfiguration
  
  /**
    * The name of the late data rule.
    */
  var ruleName: js.UndefOr[LateDataRuleName] = js.undefined
}
object LateDataRule {
  
  inline def apply(ruleConfiguration: LateDataRuleConfiguration): LateDataRule = {
    val __obj = js.Dynamic.literal(ruleConfiguration = ruleConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LateDataRule]
  }
  
  extension [Self <: LateDataRule](x: Self) {
    
    inline def setRuleConfiguration(value: LateDataRuleConfiguration): Self = StObject.set(x, "ruleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: LateDataRuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
  }
}
