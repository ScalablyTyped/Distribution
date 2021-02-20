package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var enableGeolocation: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var showZoomInfo: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[NavigationControlType] = js.native
}
object NavigationControlOptions {
  
  @scala.inline
  def apply(): NavigationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlOptions]
  }
  
  @scala.inline
  implicit class NavigationControlOptionsMutableBuilder[Self <: NavigationControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setEnableGeolocation(value: Boolean): Self = StObject.set(x, "enableGeolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableGeolocationUndefined: Self = StObject.set(x, "enableGeolocation", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setShowZoomInfo(value: Boolean): Self = StObject.set(x, "showZoomInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowZoomInfoUndefined: Self = StObject.set(x, "showZoomInfo", js.undefined)
    
    @scala.inline
    def setType(value: NavigationControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
