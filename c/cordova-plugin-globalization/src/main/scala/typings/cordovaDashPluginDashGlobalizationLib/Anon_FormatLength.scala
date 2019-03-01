package typings
package cordovaDashPluginDashGlobalizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatLength extends js.Object {
  var formatLength: js.UndefOr[java.lang.String] = js.undefined
   // "short" | "medium" | "long" | "full"
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FormatLength {
  @scala.inline
  def apply(formatLength: java.lang.String = null, selector: java.lang.String = null): Anon_FormatLength = {
    val __obj = js.Dynamic.literal()
    if (formatLength != null) __obj.updateDynamic("formatLength")(formatLength)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_FormatLength]
  }
}

