package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle extends StObject {
  
  var backgroundColor: js.UndefOr[InputColor] = js.undefined
  
  var color: js.UndefOr[InputColor] = js.undefined
  
  var decoration: js.UndefOr[Double] = js.undefined
  
  var decorationColor: js.UndefOr[InputColor] = js.undefined
  
  var decorationStyle: js.UndefOr[DecorationStyle] = js.undefined
  
  var decorationThickness: js.UndefOr[Double] = js.undefined
  
  var fontFamilies: js.UndefOr[js.Array[String]] = js.undefined
  
  var fontFeatures: js.UndefOr[js.Array[TextFontFeatures]] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  var fontVariations: js.UndefOr[js.Array[TextFontVariations]] = js.undefined
  
  var foregroundColor: js.UndefOr[InputColor] = js.undefined
  
  var halfLeading: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: InputColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
    
    inline def setColor(value: InputColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDecoration(value: Double): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    inline def setDecorationColor(value: InputColor): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
    
    inline def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
    
    inline def setDecorationColorVarargs(value: Double*): Self = StObject.set(x, "decorationColor", js.Array(value*))
    
    inline def setDecorationStyle(value: DecorationStyle): Self = StObject.set(x, "decorationStyle", value.asInstanceOf[js.Any])
    
    inline def setDecorationStyleUndefined: Self = StObject.set(x, "decorationStyle", js.undefined)
    
    inline def setDecorationThickness(value: Double): Self = StObject.set(x, "decorationThickness", value.asInstanceOf[js.Any])
    
    inline def setDecorationThicknessUndefined: Self = StObject.set(x, "decorationThickness", js.undefined)
    
    inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    inline def setFontFamilies(value: js.Array[String]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    inline def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
    
    inline def setFontFamiliesVarargs(value: String*): Self = StObject.set(x, "fontFamilies", js.Array(value*))
    
    inline def setFontFeatures(value: js.Array[TextFontFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
    
    inline def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
    
    inline def setFontFeaturesVarargs(value: TextFontFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value*))
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontVariations(value: js.Array[TextFontVariations]): Self = StObject.set(x, "fontVariations", value.asInstanceOf[js.Any])
    
    inline def setFontVariationsUndefined: Self = StObject.set(x, "fontVariations", js.undefined)
    
    inline def setFontVariationsVarargs(value: TextFontVariations*): Self = StObject.set(x, "fontVariations", js.Array(value*))
    
    inline def setForegroundColor(value: InputColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setForegroundColorVarargs(value: Double*): Self = StObject.set(x, "foregroundColor", js.Array(value*))
    
    inline def setHalfLeading(value: Boolean): Self = StObject.set(x, "halfLeading", value.asInstanceOf[js.Any])
    
    inline def setHalfLeadingUndefined: Self = StObject.set(x, "halfLeading", js.undefined)
    
    inline def setHeightMultiplier(value: Double): Self = StObject.set(x, "heightMultiplier", value.asInstanceOf[js.Any])
    
    inline def setHeightMultiplierUndefined: Self = StObject.set(x, "heightMultiplier", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setShadows(value: js.Array[TextShadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShadowsVarargs(value: TextShadow*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setTextBaseline(value: TextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    
    inline def setWordSpacing(value: Double): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
  }
}
