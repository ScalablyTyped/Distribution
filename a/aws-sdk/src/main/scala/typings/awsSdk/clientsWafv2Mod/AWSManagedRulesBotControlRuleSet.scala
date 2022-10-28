package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSManagedRulesBotControlRuleSet extends StObject {
  
  /**
    * The inspection level to use for the Bot Control rule group. The common level is the least expensive. The targeted level includes all common level rules and adds rules with more advanced inspection criteria. For details, see WAF Bot Control rule group.
    */
  var InspectionLevel: typings.awsSdk.clientsWafv2Mod.InspectionLevel
}
object AWSManagedRulesBotControlRuleSet {
  
  inline def apply(InspectionLevel: InspectionLevel): AWSManagedRulesBotControlRuleSet = {
    val __obj = js.Dynamic.literal(InspectionLevel = InspectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSManagedRulesBotControlRuleSet]
  }
  
  extension [Self <: AWSManagedRulesBotControlRuleSet](x: Self) {
    
    inline def setInspectionLevel(value: InspectionLevel): Self = StObject.set(x, "InspectionLevel", value.asInstanceOf[js.Any])
  }
}
