package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends js.Object {
  
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
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundColorVarargs(value: Double*): Self = this.set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundColor(value: InputColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: InputColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDecoration(value: Double): Self = this.set("decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    
    @scala.inline
    def setDecorationColorVarargs(value: Double*): Self = this.set("decorationColor", js.Array(value :_*))
    
    @scala.inline
    def setDecorationColor(value: InputColor): Self = this.set("decorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationColor: Self = this.set("decorationColor", js.undefined)
    
    @scala.inline
    def setDecorationThickness(value: Double): Self = this.set("decorationThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorationThickness: Self = this.set("decorationThickness", js.undefined)
    
    @scala.inline
    def setDecrationStyle(value: DecorationStyle): Self = this.set("decrationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecrationStyle: Self = this.set("decrationStyle", js.undefined)
    
    @scala.inline
    def setFontFamiliesVarargs(value: String*): Self = this.set("fontFamilies", js.Array(value :_*))
    
    @scala.inline
    def setFontFamilies(value: js.Array[String]): Self = this.set("fontFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamilies: Self = this.set("fontFamilies", js.undefined)
    
    @scala.inline
    def setFontFeaturesVarargs(value: TextFontFeatures*): Self = this.set("fontFeatures", js.Array(value :_*))
    
    @scala.inline
    def setFontFeatures(value: js.Array[TextFontFeatures]): Self = this.set("fontFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatures: Self = this.set("fontFeatures", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setForegroundColorVarargs(value: Double*): Self = this.set("foregroundColor", js.Array(value :_*))
    
    @scala.inline
    def setForegroundColor(value: InputColor): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    
    @scala.inline
    def setHeightMultiplier(value: Double): Self = this.set("heightMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightMultiplier: Self = this.set("heightMultiplier", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(value: TextShadow*): Self = this.set("shadows", js.Array(value :_*))
    
    @scala.inline
    def setShadows(value: js.Array[TextShadow]): Self = this.set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    
    @scala.inline
    def setTextBaseline(value: TextBaseline): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBaseline: Self = this.set("textBaseline", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
  }
}
