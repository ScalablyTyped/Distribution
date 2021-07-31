package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrutStyle extends StObject {
  
  var fontFamilies: js.UndefOr[js.Array[String]] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  var forceStrutHeight: js.UndefOr[Boolean] = js.undefined
  
  var heightMultiplier: js.UndefOr[Double] = js.undefined
  
  var leading: js.UndefOr[Double] = js.undefined
  
  var strutEnabled: js.UndefOr[Boolean] = js.undefined
}
object StrutStyle {
  
  @scala.inline
  def apply(): StrutStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrutStyle]
  }
  
  @scala.inline
  implicit class StrutStyleMutableBuilder[Self <: StrutStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontFamilies(value: js.Array[String]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
    
    @scala.inline
    def setFontFamiliesVarargs(value: String*): Self = StObject.set(x, "fontFamilies", js.Array(value :_*))
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setForceStrutHeight(value: Boolean): Self = StObject.set(x, "forceStrutHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceStrutHeightUndefined: Self = StObject.set(x, "forceStrutHeight", js.undefined)
    
    @scala.inline
    def setHeightMultiplier(value: Double): Self = StObject.set(x, "heightMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightMultiplierUndefined: Self = StObject.set(x, "heightMultiplier", js.undefined)
    
    @scala.inline
    def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    @scala.inline
    def setStrutEnabled(value: Boolean): Self = StObject.set(x, "strutEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrutEnabledUndefined: Self = StObject.set(x, "strutEnabled", js.undefined)
  }
}
