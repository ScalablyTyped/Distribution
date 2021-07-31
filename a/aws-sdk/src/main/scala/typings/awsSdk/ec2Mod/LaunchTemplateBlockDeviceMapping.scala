package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateBlockDeviceMapping extends StObject {
  
  /**
    * The device name.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the block device for an EBS volume.
    */
  var Ebs: js.UndefOr[LaunchTemplateEbsBlockDevice] = js.undefined
  
  /**
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.undefined
  
  /**
    * The virtual device name (ephemeralN).
    */
  var VirtualName: js.UndefOr[String] = js.undefined
}
object LaunchTemplateBlockDeviceMapping {
  
  @scala.inline
  def apply(): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
  
  @scala.inline
  implicit class LaunchTemplateBlockDeviceMappingMutableBuilder[Self <: LaunchTemplateBlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: LaunchTemplateEbsBlockDevice): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
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
