package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontSizeLetterSpacing extends js.Object {
  var fontSize: java.lang.String
  var letterSpacing: java.lang.String
  var lineHeight: java.lang.String
}

object Anon_FontSizeLetterSpacing {
  @scala.inline
  def apply(fontSize: java.lang.String, letterSpacing: java.lang.String, lineHeight: java.lang.String): Anon_FontSizeLetterSpacing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("letterSpacing")(letterSpacing)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.asInstanceOf[Anon_FontSizeLetterSpacing]
  }
}

