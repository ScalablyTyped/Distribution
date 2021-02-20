package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundOverlayOptions extends StObject {
  
  var displayOnMaxLevel: js.UndefOr[Double] = js.native
  
  var displayOnMinLevel: js.UndefOr[Double] = js.native
  
  var imageURL: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object GroundOverlayOptions {
  
  @scala.inline
  def apply(): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundOverlayOptions]
  }
  
  @scala.inline
  implicit class GroundOverlayOptionsMutableBuilder[Self <: GroundOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayOnMaxLevel(value: Double): Self = StObject.set(x, "displayOnMaxLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOnMaxLevelUndefined: Self = StObject.set(x, "displayOnMaxLevel", js.undefined)
    
    @scala.inline
    def setDisplayOnMinLevel(value: Double): Self = StObject.set(x, "displayOnMinLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOnMinLevelUndefined: Self = StObject.set(x, "displayOnMinLevel", js.undefined)
    
    @scala.inline
    def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageURLUndefined: Self = StObject.set(x, "imageURL", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
