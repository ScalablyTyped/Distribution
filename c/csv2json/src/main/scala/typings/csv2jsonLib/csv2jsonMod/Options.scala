package typings
package csv2jsonLib.csv2jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dynamicTyping: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(dynamicTyping: js.UndefOr[scala.Boolean] = js.undefined, separator: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicTyping)) __obj.updateDynamic("dynamicTyping")(dynamicTyping)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Options]
  }
}

