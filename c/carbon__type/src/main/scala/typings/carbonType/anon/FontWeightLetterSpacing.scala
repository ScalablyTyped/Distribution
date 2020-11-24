package typings.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontWeightLetterSpacing extends js.Object {
  
  @JSName("@media (min-width: 42rem)")
  var `@media Leftparenthesismin-widthColon 42remRightparenthesis`: FontWeight = js.native
  
  @JSName("@media (min-width: 66rem)")
  var `@media Leftparenthesismin-widthColon 66remRightparenthesis`: FontFamily = js.native
  
  @JSName("@media (min-width: 82rem)")
  var `@media Leftparenthesismin-widthColon 82remRightparenthesis`: FontFamily = js.native
  
  @JSName("@media (min-width: 99rem)")
  var `@media Leftparenthesismin-widthColon 99remRightparenthesis`: FontFamily = js.native
  
  var fontFamily: String = js.native
  
  var fontSize: String = js.native
  
  var fontWeight: Double = js.native
  
  var letterSpacing: Double = js.native
  
  var lineHeight: String = js.native
}
object FontWeightLetterSpacing {
  
  @scala.inline
  def apply(
    `@media Leftparenthesismin-widthColon 42remRightparenthesis`: FontWeight,
    `@media Leftparenthesismin-widthColon 66remRightparenthesis`: FontFamily,
    `@media Leftparenthesismin-widthColon 82remRightparenthesis`: FontFamily,
    `@media Leftparenthesismin-widthColon 99remRightparenthesis`: FontFamily,
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lineHeight: String
  ): FontWeightLetterSpacing = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 42rem)")((`@media Leftparenthesismin-widthColon 42remRightparenthesis`).asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 66rem)")((`@media Leftparenthesismin-widthColon 66remRightparenthesis`).asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 82rem)")((`@media Leftparenthesismin-widthColon 82remRightparenthesis`).asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 99rem)")((`@media Leftparenthesismin-widthColon 99remRightparenthesis`).asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightLetterSpacing]
  }
  
  @scala.inline
  implicit class FontWeightLetterSpacingOps[Self <: FontWeightLetterSpacing] (val x: Self) extends AnyVal {
    
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
    def `set@media Leftparenthesismin-widthColon 42remRightparenthesis`(value: FontWeight): Self = this.set("@media (min-width: 42rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@media Leftparenthesismin-widthColon 66remRightparenthesis`(value: FontFamily): Self = this.set("@media (min-width: 66rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@media Leftparenthesismin-widthColon 82remRightparenthesis`(value: FontFamily): Self = this.set("@media (min-width: 82rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@media Leftparenthesismin-widthColon 99remRightparenthesis`(value: FontFamily): Self = this.set("@media (min-width: 99rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
  }
}
