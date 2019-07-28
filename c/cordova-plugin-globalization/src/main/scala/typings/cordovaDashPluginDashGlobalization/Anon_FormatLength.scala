package typings.cordovaDashPluginDashGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatLength extends js.Object {
  var formatLength: js.UndefOr[String] = js.undefined
   // "short" | "medium" | "long" | "full"
  var selector: js.UndefOr[String] = js.undefined
}

object Anon_FormatLength {
  @scala.inline
  def apply(formatLength: String = null, selector: String = null): Anon_FormatLength = {
    val __obj = js.Dynamic.literal()
    if (formatLength != null) __obj.updateDynamic("formatLength")(formatLength)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_FormatLength]
  }
}

