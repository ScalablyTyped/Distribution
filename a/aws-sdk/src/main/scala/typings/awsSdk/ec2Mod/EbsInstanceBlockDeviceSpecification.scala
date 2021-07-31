package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsInstanceBlockDeviceSpecification extends StObject {
  
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.ec2Mod.VolumeId] = js.undefined
}
object EbsInstanceBlockDeviceSpecification {
  
  @scala.inline
  def apply(): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
  
  @scala.inline
  implicit class EbsInstanceBlockDeviceSpecificationMutableBuilder[Self <: EbsInstanceBlockDeviceSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
