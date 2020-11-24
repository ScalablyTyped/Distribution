package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockDeviceMapping extends js.Object {
  
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * Parameters used to automatically set up EBS volumes when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsBlockDevice] = js.native
  
  /**
    * Suppresses the specified device included in the block device mapping of the AMI.
    */
  var NoDevice: js.UndefOr[String] = js.native
  
  /**
    * The virtual device name (ephemeralN). Instance store volumes are numbered starting from 0. An instance type with 2 available instance store volumes can specify mappings for ephemeral0 and ephemeral1. The number of available instance store volumes depends on the instance type. After you connect to the instance, you must mount the volume. NVMe instance store volumes are automatically enumerated and assigned a device name. Including them in your block device mapping has no effect. Constraints: For M3 instances, you must specify instance store volumes in the block device mapping for the instance. When you launch an M3 instance, we ignore any instance store volumes specified in the block device mapping for the AMI.
    */
  var VirtualName: js.UndefOr[String] = js.native
}
object BlockDeviceMapping {
  
  @scala.inline
  def apply(): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockDeviceMapping]
  }
  
  @scala.inline
  implicit class BlockDeviceMappingOps[Self <: BlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: EbsBlockDevice): Self = this.set("Ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbs: Self = this.set("Ebs", js.undefined)
    
    @scala.inline
    def setNoDevice(value: String): Self = this.set("NoDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDevice: Self = this.set("NoDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: String): Self = this.set("VirtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualName: Self = this.set("VirtualName", js.undefined)
  }
}
