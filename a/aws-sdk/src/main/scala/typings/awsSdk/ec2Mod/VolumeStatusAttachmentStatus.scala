package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeStatusAttachmentStatus extends StObject {
  
  /**
    * The ID of the attached instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum IOPS supported by the attached instance.
    */
  var IoPerformance: js.UndefOr[String] = js.undefined
}
object VolumeStatusAttachmentStatus {
  
  inline def apply(): VolumeStatusAttachmentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusAttachmentStatus]
  }
  
  extension [Self <: VolumeStatusAttachmentStatus](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setIoPerformance(value: String): Self = StObject.set(x, "IoPerformance", value.asInstanceOf[js.Any])
    
    inline def setIoPerformanceUndefined: Self = StObject.set(x, "IoPerformance", js.undefined)
  }
}
