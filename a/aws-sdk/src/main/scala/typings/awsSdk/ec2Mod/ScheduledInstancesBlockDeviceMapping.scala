package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstancesBlockDeviceMapping extends StObject {
  
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * Parameters used to set up EBS volumes automatically when the instance is launched.
    */
  var Ebs: js.UndefOr[ScheduledInstancesEbs] = js.native
  
  /**
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.native
  
  /**
    * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with two available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume. Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block device mapping for the AMI.
    */
  var VirtualName: js.UndefOr[String] = js.native
}
object ScheduledInstancesBlockDeviceMapping {
  
  @scala.inline
  def apply(): ScheduledInstancesBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesBlockDeviceMapping]
  }
  
  @scala.inline
  implicit class ScheduledInstancesBlockDeviceMappingMutableBuilder[Self <: ScheduledInstancesBlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: ScheduledInstancesEbs): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
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
