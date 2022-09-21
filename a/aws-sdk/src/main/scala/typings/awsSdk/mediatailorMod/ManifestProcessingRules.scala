package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestProcessingRules extends StObject {
  
  /**
    * For HLS, when set to true, MediaTailor passes through EXT-X-CUE-IN, EXT-X-CUE-OUT, and EXT-X-SPLICEPOINT-SCTE35 ad markers from the origin manifest to the MediaTailor personalized manifest. No logic is applied to these ad markers. For example, if EXT-X-CUE-OUT has a value of 60, but no ads are filled for that ad break, MediaTailor will not set the value to 0.
    */
  var AdMarkerPassthrough: js.UndefOr[typings.awsSdk.mediatailorMod.AdMarkerPassthrough] = js.undefined
}
object ManifestProcessingRules {
  
  inline def apply(): ManifestProcessingRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestProcessingRules]
  }
  
  extension [Self <: ManifestProcessingRules](x: Self) {
    
    inline def setAdMarkerPassthrough(value: AdMarkerPassthrough): Self = StObject.set(x, "AdMarkerPassthrough", value.asInstanceOf[js.Any])
    
    inline def setAdMarkerPassthroughUndefined: Self = StObject.set(x, "AdMarkerPassthrough", js.undefined)
  }
}
