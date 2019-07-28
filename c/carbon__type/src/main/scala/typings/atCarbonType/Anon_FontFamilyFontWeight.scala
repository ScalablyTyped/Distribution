package typings.atCarbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontWeight extends js.Object {
  var `-moz-osx-font-smoothing`: String
  var `-webkit-font-smoothing`: String
  var fontFamily: String
  var fontWeight: Double
  var textRendering: String
}

object Anon_FontFamilyFontWeight {
  @scala.inline
  def apply(
    `-moz-osx-font-smoothing`: String,
    `-webkit-font-smoothing`: String,
    fontFamily: String,
    fontWeight: Double,
    textRendering: String
  ): Anon_FontFamilyFontWeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontWeight = fontWeight, textRendering = textRendering)
    __obj.updateDynamic("-moz-osx-font-smoothing")(`-moz-osx-font-smoothing`)
    __obj.updateDynamic("-webkit-font-smoothing")(`-webkit-font-smoothing`)
    __obj.asInstanceOf[Anon_FontFamilyFontWeight]
  }
}

