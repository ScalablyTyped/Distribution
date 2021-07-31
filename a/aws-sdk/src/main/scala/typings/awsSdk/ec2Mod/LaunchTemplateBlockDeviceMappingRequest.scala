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
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.undefined
  
  /**
    * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with 2 available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume.
    */
  var VirtualName: js.UndefOr[String] = js.undefined
}
object LaunchTemplateBlockDeviceMappingRequest {
  
  @scala.inline
  def apply(): LaunchTemplateBlockDeviceMappingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMappingRequest]
  }
  
  @scala.inline
  implicit class LaunchTemplateBlockDeviceMappingRequestMutableBuilder[Self <: LaunchTemplateBlockDeviceMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: LaunchTemplateEbsBlockDeviceRequest): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
    
    @scala.inline
    def setNoDevice(value: String): Self = StObject.set(x, "NoDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDeviceUndefined: Self = StObject.set(x, "NoDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "VirtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNameUndefined: Self = StObject.set(x, "VirtualName", js.undefined)
  }
}
