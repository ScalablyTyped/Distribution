package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateBlockDeviceMappingRequest extends StObject {
  
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Parameters used to automatically set up EBS volumes when the instance is launched.
    */
  var Ebs: js.UndefOr[LaunchTemplateEbsBlockDeviceRequest] = js.undefined
  
  /**
    * To omit the device from the block device mapping, specify an empty string.
    */
  var NoDevice: js.UndefOr[String] = js.undefined
  
  /**
    * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with 2 available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume.
    */
  var VirtualName: js.UndefOr[String] = js.undefined
}
object LaunchTemplateBlockDeviceMappingRequest {
  
  inline def apply(): LaunchTemplateBlockDeviceMappingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMappingRequest]
  }
  
  extension [Self <: LaunchTemplateBlockDeviceMappingRequest](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setEbs(value: LaunchTemplateEbsBlockDeviceRequest): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
    
    inline def setNoDevice(value: String): Self = StObject.set(x, "NoDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "NoDevice", js.undefined)
    
    inline def setVirtualName(value: String): Self = StObject.set(x, "VirtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "VirtualName", js.undefined)
  }
}
