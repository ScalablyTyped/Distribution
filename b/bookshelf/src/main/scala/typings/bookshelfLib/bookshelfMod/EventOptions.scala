package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(silent: js.UndefOr[scala.Boolean] = js.undefined): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[EventOptions]
  }
}

