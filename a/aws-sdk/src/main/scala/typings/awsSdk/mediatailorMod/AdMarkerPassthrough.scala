package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdMarkerPassthrough extends StObject {
  
  /**
    * For HLS, when set to true, MediaTailor passes through EXT-X-CUE-IN, EXT-X-CUE-OUT, and EXT-X-SPLICEPOINT-SCTE35 ad markers from the origin manifest to the MediaTailor personalized manifest.No logic is applied to these ad markers. For example, if EXT-X-CUE-OUT has a value of 60, but no ads are filled for that ad break, MediaTailor will not set the value to 0.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}
object AdMarkerPassthrough {
  
  @scala.inline
  def apply(): AdMarkerPassthrough = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdMarkerPassthrough]
  }
  
  @scala.inline
  implicit class AdMarkerPassthroughMutableBuilder[Self <: AdMarkerPassthrough] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
