package typings
package commonDashTagsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conjunction extends js.Object {
  var conjunction: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var serial: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Conjunction {
  @scala.inline
  def apply(
    conjunction: java.lang.String = null,
    separator: java.lang.String = null,
    serial: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Conjunction = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(serial)) __obj.updateDynamic("serial")(serial)
    __obj.asInstanceOf[Anon_Conjunction]
  }
}

