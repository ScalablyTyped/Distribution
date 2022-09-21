package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileDeviceAccessRule extends StObject {
  
  /**
    * The date and time at which an access rule was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time at which an access rule was modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of a mobile access rule.
    */
  var Description: js.UndefOr[MobileDeviceAccessRuleDescription] = js.undefined
  
  /**
    * Device models that a rule will match.
    */
  var DeviceModels: js.UndefOr[DeviceModelList] = js.undefined
  
  /**
    * Device operating systems that a rule will match.
    */
  var DeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined
  
  /**
    * Device types that a rule will match. 
    */
  var DeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined
  
  /**
    * Device user agents that a rule will match.
    */
  var DeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined
  
  /**
    * The effect of the rule when it matches. Allowed values are ALLOW or DENY.
    */
  var Effect: js.UndefOr[MobileDeviceAccessRuleEffect] = js.undefined
  
  /**
    * The ID assigned to a mobile access rule. 
    */
  var MobileDeviceAccessRuleId: js.UndefOr[typings.awsSdk.workmailMod.MobileDeviceAccessRuleId] = js.undefined
  
  /**
    * The name of a mobile access rule.
    */
  var Name: js.UndefOr[MobileDeviceAccessRuleName] = js.undefined
  
  /**
    * Device models that a rule will not match. All other device models will match.
    */
  var NotDeviceModels: js.UndefOr[DeviceModelList] = js.undefined
  
  /**
    * Device operating systems that a rule will not match. All other device types will match.
    */
  var NotDeviceOperatingSystems: js.UndefOr[DeviceOperatingSystemList] = js.undefined
  
  /**
    * Device types that a rule will not match. All other device types will match.
    */
  var NotDeviceTypes: js.UndefOr[DeviceTypeList] = js.undefined
  
  /**
    * Device user agents that a rule will not match. All other device user agents will match.
    */
  var NotDeviceUserAgents: js.UndefOr[DeviceUserAgentList] = js.undefined
}
object MobileDeviceAccessRule {
  
  inline def apply(): MobileDeviceAccessRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileDeviceAccessRule]
  }
  
  extension [Self <: MobileDeviceAccessRule](x: Self) {
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateModified(value: js.Date): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedUndefined: Self = StObject.set(x, "DateModified", js.undefined)
    
    inline def setDescription(value: MobileDeviceAccessRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceModels(value: DeviceModelList): Self = StObject.set(x, "DeviceModels", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelsUndefined: Self = StObject.set(x, "DeviceModels", js.undefined)
    
    inline def setDeviceModelsVarargs(value: DeviceModel*): Self = StObject.set(x, "DeviceModels", js.Array(value*))
    
    inline def setDeviceOperatingSystems(value: DeviceOperatingSystemList): Self = StObject.set(x, "DeviceOperatingSystems", value.asInstanceOf[js.Any])
    
    inline def setDeviceOperatingSystemsUndefined: Self = StObject.set(x, "DeviceOperatingSystems", js.undefined)
    
    inline def setDeviceOperatingSystemsVarargs(value: DeviceOperatingSystem*): Self = StObject.set(x, "DeviceOperatingSystems", js.Array(value*))
    
    inline def setDeviceTypes(value: DeviceTypeList): Self = StObject.set(x, "DeviceTypes", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypesUndefined: Self = StObject.set(x, "DeviceTypes", js.undefined)
    
    inline def setDeviceTypesVarargs(value: DeviceType*): Self = StObject.set(x, "DeviceTypes", js.Array(value*))
    
    inline def setDeviceUserAgents(value: DeviceUserAgentList): Self = StObject.set(x, "DeviceUserAgents", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserAgentsUndefined: Self = StObject.set(x, "DeviceUserAgents", js.undefined)
    
    inline def setDeviceUserAgentsVarargs(value: DeviceUserAgent*): Self = StObject.set(x, "DeviceUserAgents", js.Array(value*))
    
    inline def setEffect(value: MobileDeviceAccessRuleEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "Effect", js.undefined)
    
    inline def setMobileDeviceAccessRuleId(value: MobileDeviceAccessRuleId): Self = StObject.set(x, "MobileDeviceAccessRuleId", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceAccessRuleIdUndefined: Self = StObject.set(x, "MobileDeviceAccessRuleId", js.undefined)
    
    inline def setName(value: MobileDeviceAccessRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotDeviceModels(value: DeviceModelList): Self = StObject.set(x, "NotDeviceModels", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceModelsUndefined: Self = StObject.set(x, "NotDeviceModels", js.undefined)
    
    inline def setNotDeviceModelsVarargs(value: DeviceModel*): Self = StObject.set(x, "NotDeviceModels", js.Array(value*))
    
    inline def setNotDeviceOperatingSystems(value: DeviceOperatingSystemList): Self = StObject.set(x, "NotDeviceOperatingSystems", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceOperatingSystemsUndefined: Self = StObject.set(x, "NotDeviceOperatingSystems", js.undefined)
    
    inline def setNotDeviceOperatingSystemsVarargs(value: DeviceOperatingSystem*): Self = StObject.set(x, "NotDeviceOperatingSystems", js.Array(value*))
    
    inline def setNotDeviceTypes(value: DeviceTypeList): Self = StObject.set(x, "NotDeviceTypes", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceTypesUndefined: Self = StObject.set(x, "NotDeviceTypes", js.undefined)
    
    inline def setNotDeviceTypesVarargs(value: DeviceType*): Self = StObject.set(x, "NotDeviceTypes", js.Array(value*))
    
    inline def setNotDeviceUserAgents(value: DeviceUserAgentList): Self = StObject.set(x, "NotDeviceUserAgents", value.asInstanceOf[js.Any])
    
    inline def setNotDeviceUserAgentsUndefined: Self = StObject.set(x, "NotDeviceUserAgents", js.undefined)
    
    inline def setNotDeviceUserAgentsVarargs(value: DeviceUserAgent*): Self = StObject.set(x, "NotDeviceUserAgents", js.Array(value*))
  }
}
