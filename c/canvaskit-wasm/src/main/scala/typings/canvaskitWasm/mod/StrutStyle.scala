package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrutStyle extends StObject {
  
  var fontFamilies: js.UndefOr[js.Array[String]] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  var forceStrutHeight: js.UndefOr[Boolean] = js.undefined
  
  var halfLeading: js.UndefOr[Boolean] = js.undefined
  
  var heightMultiplier: js.UndefOr[Double] = js.undefined
  
  var leading: js.UndefOr[Double] = js.undefined
  
  var strutEnabled: js.UndefOr[Boolean] = js.undefined
}
object StrutStyle {
  
  inline def apply(): StrutStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrutStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrutStyle] (val x: Self) extends AnyVal {
    
    inline def setFontFamilies(value: js.Array[String]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    inline def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
    
    inline def setFontFamiliesVarargs(value: String*): Self = StObject.set(x, "fontFamilies", js.Array(value*))
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setForceStrutHeight(value: Boolean): Self = StObject.set(x, "forceStrutHeight", value.asInstanceOf[js.Any])
    
    inline def setForceStrutHeightUndefined: Self = StObject.set(x, "forceStrutHeight", js.undefined)
    
    inline def setHalfLeading(value: Boolean): Self = StObject.set(x, "halfLeading", value.asInstanceOf[js.Any])
    
    inline def setHalfLeadingUndefined: Self = StObject.set(x, "halfLeading", js.undefined)
    
    inline def setHeightMultiplier(value: Double): Self = StObject.set(x, "heightMultiplier", value.asInstanceOf[js.Any])
    
    inline def setHeightMultiplierUndefined: Self = StObject.set(x, "heightMultiplier", js.undefined)
    
    inline def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    inline def setStrutEnabled(value: Boolean): Self = StObject.set(x, "strutEnabled", value.asInstanceOf[js.Any])
    
    inline def setStrutEnabledUndefined: Self = StObject.set(x, "strutEnabled", js.undefined)
  }
}
