package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends StObject {
  
  var backgroundColor: js.UndefOr[InputColor] = js.native
  
  var color: js.UndefOr[InputColor] = js.native
  
  var decoration: js.UndefOr[Double] = js.native
  
  var decorationColor: js.UndefOr[InputColor] = js.native
  
  var decorationThickness: js.UndefOr[Double] = js.native
  
  var decrationStyle: js.UndefOr[DecorationStyle] = js.native
  
  var fontFamilies: js.UndefOr[js.Array[String]] = js.native
  
  var fontFeatures: js.UndefOr[js.Array[TextFontFeatures]] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  var foregroundColor: js.UndefOr[InputColor] = js.native
  
  var heightMultiplier: js.UndefOr[Double] = js.native
  
  var letterSpacing: js.UndefOr[Double] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var shadows: js.UndefOr[js.Array[TextShadow]] = js.native
  
  var textBaseline: js.UndefOr[TextBaseline] = js.native
  
  var wordSpacing: js.UndefOr[Double] = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: InputColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: InputColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDecoration(value: Double): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationColor(value: InputColor): Self = StObject.set(x, "decorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationColorUndefined: Self = StObject.set(x, "decorationColor", js.undefined)
    
    @scala.inline
    def setDecorationColorVarargs(value: Double*): Self = StObject.set(x, "decorationColor", js.Array(value :_*))
    
    @scala.inline
    def setDecorationThickness(value: Double): Self = StObject.set(x, "decorationThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorationThicknessUndefined: Self = StObject.set(x, "decorationThickness", js.undefined)
    
    @scala.inline
    def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    @scala.inline
    def setDecrationStyle(value: DecorationStyle): Self = StObject.set(x, "decrationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecrationStyleUndefined: Self = StObject.set(x, "decrationStyle", js.undefined)
    
    @scala.inline
    def setFontFamilies(value: js.Array[String]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
    
    @scala.inline
    def setFontFamiliesVarargs(value: String*): Self = StObject.set(x, "fontFamilies", js.Array(value :_*))
    
    @scala.inline
    def setFontFeatures(value: js.Array[TextFontFeatures]): Self = StObject.set(x, "fontFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFeaturesUndefined: Self = StObject.set(x, "fontFeatures", js.undefined)
    
    @scala.inline
    def setFontFeaturesVarargs(value: TextFontFeatures*): Self = StObject.set(x, "fontFeatures", js.Array(value :_*))
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: InputColor): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    @scala.inline
    def setForegroundColorVarargs(value: Double*): Self = StObject.set(x, "foregroundColor", js.Array(value :_*))
    
    @scala.inline
    def setHeightMultiplier(value: Double): Self = StObject.set(x, "heightMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightMultiplierUndefined: Self = StObject.set(x, "heightMultiplier", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setShadows(value: js.Array[TextShadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(value: TextShadow*): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    @scala.inline
    def setTextBaseline(value: TextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
  }
}
