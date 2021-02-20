package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbsBlockDeviceConfig extends StObject {
  
  /**
    * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: typings.awsSdk.emrMod.VolumeSpecification = js.native
  
  /**
    * Number of EBS volumes with a specific volume configuration that will be associated with every instance in the instance group
    */
  var VolumesPerInstance: js.UndefOr[Integer] = js.native
}
object EbsBlockDeviceConfig {
  
  @scala.inline
  def apply(VolumeSpecification: VolumeSpecification): EbsBlockDeviceConfig = {
    val __obj = js.Dynamic.literal(VolumeSpecification = VolumeSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsBlockDeviceConfig]
  }
  
  @scala.inline
  implicit class EbsBlockDeviceConfigMutableBuilder[Self <: EbsBlockDeviceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeSpecification(value: VolumeSpecification): Self = StObject.set(x, "VolumeSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesPerInstance(value: Integer): Self = StObject.set(x, "VolumesPerInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesPerInstanceUndefined: Self = StObject.set(x, "VolumesPerInstance", js.undefined)
  }
}
