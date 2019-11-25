package typings.csv2json.csv2jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dynamicTyping: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(dynamicTyping: js.UndefOr[Boolean] = js.undefined, separator: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicTyping)) __obj.updateDynamic("dynamicTyping")(dynamicTyping.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

