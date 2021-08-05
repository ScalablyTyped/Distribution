package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle extends StObject {
  
  var backgroundColor: js.UndefOr[InputColor] = js.undefined
  
  var color: js.UndefOr[InputColor] = js.undefined
  
  var decoration: js.UndefOr[Double] = js.undefined
  
  var decorationColor: js.UndefOr[InputColor] = js.undefined
  
  var decorationThickness: js.UndefOr[Double] = js.undefined
  
  var decrationStyle: js.UndefOr[DecorationStyle] = js.undefined
  
  var fontFamilies: js.UndefOr[js.Array[String]] = js.undefined
  
  var fontFeatures: js.UndefOr[js.Array[TextFontFeatures]] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  var foregroundColor: js.UndefOr[InputColor] = js.undefined
  
  var heightMultiplier: js.UndefOr[Double] = js.undefined
  
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var shadows: js.UndefOr[js.Array[TextShadow]] = js.undefined
  
  var textBaseline: js.UndefOr[TextBaseline] = js.undefined
  
  var wordSpacing: js.UndefOr[Double] = js.undefined
}
object TextStyle {
  
  inline def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setBackgroundColor(value: InputColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setColor(value: InputColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setDecoration(value: Double): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    inline def setDecorationColor(value: InputColor): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
    
    inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
    
    inline def setDecorationColorVarargs(value: Double*): Self = StObject.set(x, "decorationColor", js.Array(value :_*))
    
    inline def setDecorationThickness(value: Double): Self = StObject.set(x, "decorationThickness", value.asInstanceOf[js.Any])
    
    inline def setDecorationThicknessUndefined: Self = StObject.set(x, "decorationThickness", js.undefined)
    
    inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    inline def setDecrationStyle(value: DecorationStyle): Self = StObject.set(x, "decrationStyle", value.asInstanceOf[js.Any])
    
    inline def setDecrationStyleUndefined: Self = StObject.set(x, "decrationStyle", js.undefined)
    
    inline def setFontFamilies(value: js.Array[String]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    inline def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
    
    inline def setFontFamiliesVarargs(value: String*): Self = StObject.set(x, "fontFamilies", js.Array(value :_*))
    
    inline def setFontFeatures(value: js.Array[TextFontFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
    
    inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
    
    inline def setFontFeaturesVarargs(value: TextFontFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setForegroundColor(value: InputColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setForegroundColorVarargs(value: Double*): Self = StObject.set(x, "foregroundColor", js.Array(value :_*))
    
    inline def setHeightMultiplier(value: Double): Self = StObject.set(x, "heightMultiplier", value.asInstanceOf[js.Any])
    
    inline def setHeightMultiplierUndefined: Self = StObject.set(x, "heightMultiplier", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setShadows(value: js.Array[TextShadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShadowsVarargs(value: TextShadow*): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    inline def setTextBaseline(value: TextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    
    inline def setWordSpacing(value: Double): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
  }
}
