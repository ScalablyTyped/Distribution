package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbsBlockDevice extends StObject {
  
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
  implicit class EbsBlockDeviceMutableBuilder[Self <: EbsBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    @scala.inline
    def setVolumeSpecification(value: VolumeSpecification): Self = StObject.set(x, "VolumeSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSpecificationUndefined: Self = StObject.set(x, "VolumeSpecification", js.undefined)
  }
}
