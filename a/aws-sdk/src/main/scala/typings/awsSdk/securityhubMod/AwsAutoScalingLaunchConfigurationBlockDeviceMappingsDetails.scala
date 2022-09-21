package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails extends StObject {
  
  /**
    * The device name that is exposed to the EC2 instance. For example, /dev/sdh or xvdh.
    */
  var DeviceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Parameters that are used to automatically set up Amazon EBS volumes when an instance is launched.
    */
  var Ebs: js.UndefOr[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails] = js.undefined
  
  /**
    * Whether to suppress the device that is included in the block device mapping of the Amazon Machine Image (AMI). If NoDevice is true, then you cannot specify Ebs.&gt;
    */
  var NoDevice: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the virtual device (for example, ephemeral0). You can provide either VirtualName or Ebs, but not both.
    */
  var VirtualName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails {
  
  inline def apply(): AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails]
  }
  
  extension [Self <: AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails](x: Self) {
    
    inline def setDeviceName(value: NonEmptyString): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setEbs(value: AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
    
    inline def setNoDevice(value: Boolean): Self = StObject.set(x, "NoDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "NoDevice", js.undefined)
    
    inline def setVirtualName(value: NonEmptyString): Self = StObject.set(x, "VirtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "VirtualName", js.undefined)
  }
}
