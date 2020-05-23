package typings.commonTags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conjunction extends js.Object {
  var conjunction: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var serial: js.UndefOr[Boolean] = js.undefined
}

object Conjunction {
  @scala.inline
  def apply(conjunction: String = null, separator: String = null, serial: js.UndefOr[Boolean] = js.undefined): Conjunction = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(serial)) __obj.updateDynamic("serial")(serial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conjunction]
  }
}

