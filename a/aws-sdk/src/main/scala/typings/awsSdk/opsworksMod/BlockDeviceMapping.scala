package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockDeviceMapping extends js.Object {
  
  /**
    * The device name that is exposed to the instance, such as /dev/sdh. For the root device, you can use the explicit device name or you can set this parameter to ROOT_DEVICE and AWS OpsWorks Stacks will provide the correct device name.
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * An EBSBlockDevice that defines how to configure an Amazon EBS volume when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsBlockDevice] = js.native
  
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var NoDevice: js.UndefOr[String] = js.native
  
  /**
    * The virtual device name. For more information, see BlockDeviceMapping.
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
