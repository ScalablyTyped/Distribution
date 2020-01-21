package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkFontSlant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItalic extends js.Object {
  var Italic: SkFontSlant
  var Oblique: SkFontSlant
  var Upright: SkFontSlant
}

object AnonItalic {
  @scala.inline
  def apply(Italic: SkFontSlant, Oblique: SkFontSlant, Upright: SkFontSlant): AnonItalic = {
    val __obj = js.Dynamic.literal(Italic = Italic.asInstanceOf[js.Any], Oblique = Oblique.asInstanceOf[js.Any], Upright = Upright.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItalic]
  }
}

