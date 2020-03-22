package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<canvaskit-wasm.canvaskit-wasm.FontStyle> */
trait FontStyleConfig extends js.Object {
  var slant: js.UndefOr[SkFontSlant] = js.undefined
  var weight: js.UndefOr[SkFontWeight] = js.undefined
  var width: js.UndefOr[SkFontWidth] = js.undefined
}

object FontStyleConfig {
  @scala.inline
  def apply(slant: SkFontSlant = null, weight: SkFontWeight = null, width: SkFontWidth = null): FontStyleConfig = {
    val __obj = js.Dynamic.literal()
    if (slant != null) __obj.updateDynamic("slant")(slant.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyleConfig]
  }
}

