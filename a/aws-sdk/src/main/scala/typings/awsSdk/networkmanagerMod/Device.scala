package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * The date and time that the site was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the device.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var DeviceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The site location.
    */
  var Location: js.UndefOr[typings.awsSdk.networkmanagerMod.Location] = js.undefined
  
  /**
    * The device model.
    */
  var Model: js.UndefOr[String] = js.undefined
  
  /**
    * The device serial number.
    */
  var SerialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The site ID.
    */
  var SiteId: js.UndefOr[String] = js.undefined
  
  /**
    * The device state.
    */
  var State: js.UndefOr[DeviceState] = js.undefined
  
  /**
    * The tags for the device.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The device type.
    */
  var Type: js.UndefOr[String] = js.undefined
  
  /**
    * The device vendor.
    */
  var Vendor: js.UndefOr[String] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceArn(value: String): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setSiteId(value: String): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setState(value: DeviceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "Vendor", js.undefined)
  }
}
