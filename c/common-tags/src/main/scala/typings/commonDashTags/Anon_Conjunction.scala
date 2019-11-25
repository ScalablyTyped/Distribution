package typings.commonDashTags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conjunction extends js.Object {
  var conjunction: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var serial: js.UndefOr[Boolean] = js.undefined
}

object Anon_Conjunction {
  @scala.inline
  def apply(conjunction: String = null, separator: String = null, serial: js.UndefOr[Boolean] = js.undefined): Anon_Conjunction = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(serial)) __obj.updateDynamic("serial")(serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Conjunction]
  }
}

