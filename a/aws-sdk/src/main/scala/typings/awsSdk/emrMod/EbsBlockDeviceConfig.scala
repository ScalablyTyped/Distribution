package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsBlockDeviceConfig extends StObject {
  
  /**
    * EBS volume specifications such as volume type, IOPS, size (GiB) and throughput (MiB/s) that are requested for the EBS volume attached to an EC2 instance in the cluster.
    */
  var VolumeSpecification: typings.awsSdk.emrMod.VolumeSpecification
  
  /**
    * Number of EBS volumes with a specific volume configuration that are associated with every instance in the instance group
    */
  var VolumesPerInstance: js.UndefOr[Integer] = js.undefined
}
object EbsBlockDeviceConfig {
  
  inline def apply(VolumeSpecification: VolumeSpecification): EbsBlockDeviceConfig = {
    val __obj = js.Dynamic.literal(VolumeSpecification = VolumeSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsBlockDeviceConfig]
  }
  
  extension [Self <: EbsBlockDeviceConfig](x: Self) {
    
    inline def setVolumeSpecification(value: VolumeSpecification): Self = StObject.set(x, "VolumeSpecification", value.asInstanceOf[js.Any])
    
    inline def setVolumesPerInstance(value: Integer): Self = StObject.set(x, "VolumesPerInstance", value.asInstanceOf[js.Any])
    
    inline def setVolumesPerInstanceUndefined: Self = StObject.set(x, "VolumesPerInstance", js.undefined)
  }
}
