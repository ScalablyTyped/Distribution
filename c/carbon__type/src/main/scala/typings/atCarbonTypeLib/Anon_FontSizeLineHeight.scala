package typings
package atCarbonTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FontSizeLineHeight extends js.Object {
  var fontSize: java.lang.String
  var lineHeight: java.lang.String
}

object Anon_FontSizeLineHeight {
  @scala.inline
  def apply(fontSize: java.lang.String, lineHeight: java.lang.String): Anon_FontSizeLineHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("lineHeight")(lineHeight)
    __obj.asInstanceOf[Anon_FontSizeLineHeight]
  }
}

