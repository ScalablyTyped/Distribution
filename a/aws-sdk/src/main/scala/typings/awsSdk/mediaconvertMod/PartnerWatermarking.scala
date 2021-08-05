package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerWatermarking extends StObject {
  
  /**
    * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert supports both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
    */
  var NexguardFileMarkerSettings: js.UndefOr[NexGuardFileMarkerSettings] = js.undefined
}
object PartnerWatermarking {
  
  inline def apply(): PartnerWatermarking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerWatermarking]
  }
  
  extension [Self <: PartnerWatermarking](x: Self) {
    
    inline def setNexguardFileMarkerSettings(value: NexGuardFileMarkerSettings): Self = StObject.set(x, "NexguardFileMarkerSettings", value.asInstanceOf[js.Any])
    
    inline def setNexguardFileMarkerSettingsUndefined: Self = StObject.set(x, "NexguardFileMarkerSettings", js.undefined)
  }
}
