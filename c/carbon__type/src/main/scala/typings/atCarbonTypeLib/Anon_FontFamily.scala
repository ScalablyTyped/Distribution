package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontFamily extends js.Object {
  var fontFamily: java.lang.String
  var fontSize: java.lang.String
  var fontWeight: scala.Double
  var letterSpacing: java.lang.String
  var lineHeight: java.lang.String
}

object Anon_FontFamily {
  @scala.inline
  def apply(
    fontFamily: java.lang.String,
    fontSize: java.lang.String,
    fontWeight: scala.Double,
    letterSpacing: java.lang.String,
    lineHeight: java.lang.String
  ): Anon_FontFamily = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontFamily")(fontFamily)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.updateDynamic("letterSpacing")(letterSpacing)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.asInstanceOf[Anon_FontFamily]
  }
}

