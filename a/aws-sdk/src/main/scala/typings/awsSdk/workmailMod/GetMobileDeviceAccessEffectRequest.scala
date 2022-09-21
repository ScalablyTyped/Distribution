package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMobileDeviceAccessEffectRequest extends StObject {
  
  /**
    * Device model the simulated user will report.
    */
  var DeviceModel: js.UndefOr[typings.awsSdk.workmailMod.DeviceModel] = js.undefined
  
  /**
    * Device operating system the simulated user will report.
    */
  var DeviceOperatingSystem: js.UndefOr[typings.awsSdk.workmailMod.DeviceOperatingSystem] = js.undefined
  
  /**
    * Device type the simulated user will report.
    */
  var DeviceType: js.UndefOr[typings.awsSdk.workmailMod.DeviceType] = js.undefined
  
  /**
    * Device user agent the simulated user will report.
    */
  var DeviceUserAgent: js.UndefOr[typings.awsSdk.workmailMod.DeviceUserAgent] = js.undefined
  
  /**
    * The Amazon WorkMail organization to simulate the access effect for.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object GetMobileDeviceAccessEffectRequest {
  
  inline def apply(OrganizationId: OrganizationId): GetMobileDeviceAccessEffectRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMobileDeviceAccessEffectRequest]
  }
  
  extension [Self <: GetMobileDeviceAccessEffectRequest](x: Self) {
    
    inline def setDeviceModel(value: DeviceModel): Self = StObject.set(x, "DeviceModel", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelUndefined: Self = StObject.set(x, "DeviceModel", js.undefined)
    
    inline def setDeviceOperatingSystem(value: DeviceOperatingSystem): Self = StObject.set(x, "DeviceOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setDeviceOperatingSystemUndefined: Self = StObject.set(x, "DeviceOperatingSystem", js.undefined)
    
    inline def setDeviceType(value: DeviceType): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    inline def setDeviceUserAgent(value: DeviceUserAgent): Self = StObject.set(x, "DeviceUserAgent", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserAgentUndefined: Self = StObject.set(x, "DeviceUserAgent", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
