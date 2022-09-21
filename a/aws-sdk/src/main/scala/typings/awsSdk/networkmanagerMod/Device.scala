package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * The Amazon Web Services location of the device.
    */
  var AWSLocation: js.UndefOr[typings.awsSdk.networkmanagerMod.AWSLocation] = js.undefined
  
  /**
    * The date and time that the site was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the device.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var DeviceArn: js.UndefOr[typings.awsSdk.networkmanagerMod.DeviceArn] = js.undefined
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.networkmanagerMod.DeviceId] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.networkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The site location.
    */
  var Location: js.UndefOr[typings.awsSdk.networkmanagerMod.Location] = js.undefined
  
  /**
    * The device model.
    */
  var Model: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The device serial number.
    */
  var SerialNumber: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The site ID.
    */
  var SiteId: js.UndefOr[typings.awsSdk.networkmanagerMod.SiteId] = js.undefined
  
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
  var Type: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The device vendor.
    */
  var Vendor: js.UndefOr[ConstrainedString] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setAWSLocation(value: AWSLocation): Self = StObject.set(x, "AWSLocation", value.asInstanceOf[js.Any])
    
    inline def setAWSLocationUndefined: Self = StObject.set(x, "AWSLocation", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setModel(value: ConstrainedString): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setSerialNumber(value: ConstrainedString): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setState(value: DeviceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: ConstrainedString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVendor(value: ConstrainedString): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "Vendor", js.undefined)
  }
}
