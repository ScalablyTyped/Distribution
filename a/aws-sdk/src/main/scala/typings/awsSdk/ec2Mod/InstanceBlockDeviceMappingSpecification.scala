package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceBlockDeviceMappingSpecification extends js.Object {
  
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * Parameters used to automatically set up EBS volumes when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.native
  
  /**
    * suppress the specified device included in the block device mapping.
    */
  var NoDevice: js.UndefOr[String] = js.native
  
  /**
    * The virtual device name.
    */
  var VirtualName: js.UndefOr[String] = js.native
}
object InstanceBlockDeviceMappingSpecification {
  
  @scala.inline
  def apply(): InstanceBlockDeviceMappingSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceBlockDeviceMappingSpecification]
  }
  
  @scala.inline
  implicit class InstanceBlockDeviceMappingSpecificationOps[Self <: InstanceBlockDeviceMappingSpecification] (val x: Self) extends AnyVal {
    
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
    def setEbs(value: EbsInstanceBlockDeviceSpecification): Self = this.set("Ebs", value.asInstanceOf[js.Any])
    
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
