package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbsBlockDevice extends js.Object {
  
  /**
    * The device name that is exposed to the instance, such as /dev/sdh.
    */
  var Device: js.UndefOr[String] = js.native
  
  /**
    * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: js.UndefOr[typings.awsSdk.emrMod.VolumeSpecification] = js.native
}
object EbsBlockDevice {
  
  @scala.inline
  def apply(): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsBlockDevice]
  }
  
  @scala.inline
  implicit class EbsBlockDeviceOps[Self <: EbsBlockDevice] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: String): Self = this.set("Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("Device", js.undefined)
    
    @scala.inline
    def setVolumeSpecification(value: VolumeSpecification): Self = this.set("VolumeSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSpecification: Self = this.set("VolumeSpecification", js.undefined)
  }
}
