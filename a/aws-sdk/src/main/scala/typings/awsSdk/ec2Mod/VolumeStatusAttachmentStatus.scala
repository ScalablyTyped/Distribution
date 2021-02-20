package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusAttachmentStatus extends StObject {
  
  /**
    * The ID of the attached instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The maximum IOPS supported by the attached instance.
    */
  var IoPerformance: js.UndefOr[String] = js.native
}
object VolumeStatusAttachmentStatus {
  
  @scala.inline
  def apply(): VolumeStatusAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusAttachmentStatus]
  }
  
  @scala.inline
  implicit class VolumeStatusAttachmentStatusMutableBuilder[Self <: VolumeStatusAttachmentStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setIoPerformance(value: String): Self = StObject.set(x, "IoPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIoPerformanceUndefined: Self = StObject.set(x, "IoPerformance", js.undefined)
  }
}
