package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.openUrl()
trait OpenUrlConfig extends StObject {
  
  var darkenBackground: js.UndefOr[Boolean] = js.undefined
  
  var exclusiveView: js.UndefOr[Boolean] = js.undefined
  
  var fullSize: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: String
  
  var width: js.UndefOr[Double] = js.undefined
}
object OpenUrlConfig {
  
  inline def apply(url: String): OpenUrlConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenUrlConfig] (val x: Self) extends AnyVal {
    
    inline def setDarkenBackground(value: Boolean): Self = StObject.set(x, "darkenBackground", value.asInstanceOf[js.Any])
    
    inline def setDarkenBackgroundUndefined: Self = StObject.set(x, "darkenBackground", js.undefined)
    
    inline def setExclusiveView(value: Boolean): Self = StObject.set(x, "exclusiveView", value.asInstanceOf[js.Any])
    
    inline def setExclusiveViewUndefined: Self = StObject.set(x, "exclusiveView", js.undefined)
    
    inline def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
    
    inline def setFullSizeUndefined: Self = StObject.set(x, "fullSize", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
