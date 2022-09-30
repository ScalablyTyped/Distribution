package typings.catalog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlSpecimenProps extends StObject {
  
  var children: String
  
  var dark: js.UndefOr[Boolean] = js.undefined
  
  var frame: js.UndefOr[Boolean] = js.undefined
  
  var light: js.UndefOr[Boolean] = js.undefined
  
  var noSource: js.UndefOr[Boolean] = js.undefined
  
  var plain: js.UndefOr[Boolean] = js.undefined
  
  var responsive: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  
  var showSource: js.UndefOr[Boolean] = js.undefined
}
object HtmlSpecimenProps {
  
  inline def apply(children: String): HtmlSpecimenProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlSpecimenProps]
  }
  
  extension [Self <: HtmlSpecimenProps](x: Self) {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setNoSource(value: Boolean): Self = StObject.set(x, "noSource", value.asInstanceOf[js.Any])
    
    inline def setNoSourceUndefined: Self = StObject.set(x, "noSource", js.undefined)
    
    inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    inline def setResponsive(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setResponsiveVarargs(value: String*): Self = StObject.set(x, "responsive", js.Array(value*))
    
    inline def setShowSource(value: Boolean): Self = StObject.set(x, "showSource", value.asInstanceOf[js.Any])
    
    inline def setShowSourceUndefined: Self = StObject.set(x, "showSource", js.undefined)
  }
}
