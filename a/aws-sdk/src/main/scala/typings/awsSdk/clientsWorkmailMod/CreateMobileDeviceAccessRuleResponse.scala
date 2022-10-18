package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMobileDeviceAccessRuleResponse extends StObject {
  
  /**
    * The identifier for the newly created mobile device access rule.
    */
  var MobileDeviceAccessRuleId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.MobileDeviceAccessRuleId] = js.undefined
}
object CreateMobileDeviceAccessRuleResponse {
  
  inline def apply(): CreateMobileDeviceAccessRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMobileDeviceAccessRuleResponse]
  }
  
  extension [Self <: CreateMobileDeviceAccessRuleResponse](x: Self) {
    
    inline def setMobileDeviceAccessRuleId(value: MobileDeviceAccessRuleId): Self = StObject.set(x, "MobileDeviceAccessRuleId", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceAccessRuleIdUndefined: Self = StObject.set(x, "MobileDeviceAccessRuleId", js.undefined)
  }
}
