package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamilyFontWeight extends js.Object {
  var `-moz-osx-font-smoothing`: java.lang.String
  var `-webkit-font-smoothing`: java.lang.String
  var fontFamily: java.lang.String
  var fontWeight: scala.Double
  var textRendering: java.lang.String
}

object Anon_FontFamilyFontWeight {
  @scala.inline
  def apply(
    `-moz-osx-font-smoothing`: java.lang.String,
    `-webkit-font-smoothing`: java.lang.String,
    fontFamily: java.lang.String,
    fontWeight: scala.Double,
    textRendering: java.lang.String
  ): Anon_FontFamilyFontWeight = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily, fontWeight = fontWeight, textRendering = textRendering)
    __obj.updateDynamic("-moz-osx-font-smoothing")(`-moz-osx-font-smoothing`)
    __obj.updateDynamic("-webkit-font-smoothing")(`-webkit-font-smoothing`)
    __obj.asInstanceOf[Anon_FontFamilyFontWeight]
  }
}

