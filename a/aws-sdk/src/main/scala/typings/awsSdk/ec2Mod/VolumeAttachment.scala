package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeAttachment extends StObject {
  
  /**
    * The time stamp when the attachment initiated.
    */
  var AttachTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The attachment state of the volume.
    */
  var State: js.UndefOr[VolumeAttachmentState] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object VolumeAttachment {
  
  @scala.inline
  def apply(): VolumeAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeAttachment]
  }
  
  @scala.inline
  implicit class VolumeAttachmentMutableBuilder[Self <: VolumeAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachTime(value: DateTime): Self = StObject.set(x, "AttachTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachTimeUndefined: Self = StObject.set(x, "AttachTime", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setState(value: VolumeAttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
