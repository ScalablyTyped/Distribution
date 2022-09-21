package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsInstanceBlockDevice extends StObject {
  
  /**
    * When the attachment was initiated.
    */
  var attachTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A value that indicates whether the volume is deleted on instance termination.
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The attachment state.
    */
  var status: js.UndefOr[AttachmentStatus] = js.undefined
  
  /**
    * The ID of the Amazon EBS volume.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object EbsInstanceBlockDevice {
  
  inline def apply(): EbsInstanceBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDevice]
  }
  
  extension [Self <: EbsInstanceBlockDevice](x: Self) {
    
    inline def setAttachTime(value: js.Date): Self = StObject.set(x, "attachTime", value.asInstanceOf[js.Any])
    
    inline def setAttachTimeUndefined: Self = StObject.set(x, "attachTime", js.undefined)
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setStatus(value: AttachmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
