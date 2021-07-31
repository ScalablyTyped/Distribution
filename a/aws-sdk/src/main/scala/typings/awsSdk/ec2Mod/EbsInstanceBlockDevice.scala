package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsInstanceBlockDevice extends StObject {
  
  /**
    * The time stamp when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The attachment state.
    */
  var Status: js.UndefOr[AttachmentStatus] = js.undefined
  
  /**
    * The ID of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object EbsInstanceBlockDevice {
  
  @scala.inline
  def apply(): EbsInstanceBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDevice]
  }
  
  @scala.inline
  implicit class EbsInstanceBlockDeviceMutableBuilder[Self <: EbsInstanceBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachTime(value: DateTime): Self = StObject.set(x, "AttachTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachTimeUndefined: Self = StObject.set(x, "AttachTime", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setStatus(value: AttachmentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
