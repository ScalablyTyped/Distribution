package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileDeviceAccessMatchedRule extends StObject {
  
  /**
    * Identifier of the rule that a simulated user matches.
    */
  var MobileDeviceAccessRuleId: js.UndefOr[typings.awsSdk.workmailMod.MobileDeviceAccessRuleId] = js.undefined
  
  /**
    * Name of a rule that a simulated user matches.
    */
  var Name: js.UndefOr[MobileDeviceAccessRuleName] = js.undefined
}
object MobileDeviceAccessMatchedRule {
  
  inline def apply(): MobileDeviceAccessMatchedRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileDeviceAccessMatchedRule]
  }
  
  extension [Self <: MobileDeviceAccessMatchedRule](x: Self) {
    
    inline def setMobileDeviceAccessRuleId(value: MobileDeviceAccessRuleId): Self = StObject.set(x, "MobileDeviceAccessRuleId", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceAccessRuleIdUndefined: Self = StObject.set(x, "MobileDeviceAccessRuleId", js.undefined)
    
    inline def setName(value: MobileDeviceAccessRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
