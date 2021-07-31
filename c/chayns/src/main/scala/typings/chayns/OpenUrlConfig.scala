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
  
  @scala.inline
  def apply(url: String): OpenUrlConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlConfig]
  }
  
  @scala.inline
  implicit class OpenUrlConfigMutableBuilder[Self <: OpenUrlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDarkenBackground(value: Boolean): Self = StObject.set(x, "darkenBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkenBackgroundUndefined: Self = StObject.set(x, "darkenBackground", js.undefined)
    
    @scala.inline
    def setExclusiveView(value: Boolean): Self = StObject.set(x, "exclusiveView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveViewUndefined: Self = StObject.set(x, "exclusiveView", js.undefined)
    
    @scala.inline
    def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullSizeUndefined: Self = StObject.set(x, "fullSize", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
