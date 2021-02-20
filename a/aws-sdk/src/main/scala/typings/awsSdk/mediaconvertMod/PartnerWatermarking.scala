package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerWatermarking extends StObject {
  
  /**
    * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
    */
  var NexguardFileMarkerSettings: js.UndefOr[NexGuardFileMarkerSettings] = js.native
}
object PartnerWatermarking {
  
  @scala.inline
  def apply(): PartnerWatermarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerWatermarking]
  }
  
  @scala.inline
  implicit class PartnerWatermarkingMutableBuilder[Self <: PartnerWatermarking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNexguardFileMarkerSettings(value: NexGuardFileMarkerSettings): Self = StObject.set(x, "NexguardFileMarkerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNexguardFileMarkerSettingsUndefined: Self = StObject.set(x, "NexguardFileMarkerSettings", js.undefined)
  }
}
