package typings.canvaskitDashWasm.canvaskitDashWasmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontStyle extends js.Object {
  var slant: SkFontSlant
  var weight: SkFontWeight
  var width: SkFontWidth
}

object FontStyle {
  @scala.inline
  def apply(slant: SkFontSlant, weight: SkFontWeight, width: SkFontWidth): FontStyle = {
    val __obj = js.Dynamic.literal(slant = slant.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontStyle]
  }
}

