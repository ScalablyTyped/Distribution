package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeOptions extends StObject {
  
  var errorImageUrl: js.UndefOr[String] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var textColor: js.UndefOr[Double] = js.native
  
  var tips: js.UndefOr[String] = js.native
}
object MapTypeOptions {
  
  @scala.inline
  def apply(): MapTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeOptions]
  }
  
  @scala.inline
  implicit class MapTypeOptionsMutableBuilder[Self <: MapTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorImageUrl(value: String): Self = StObject.set(x, "errorImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorImageUrlUndefined: Self = StObject.set(x, "errorImageUrl", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setTextColor(value: Double): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTips(value: String): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
  }
}
