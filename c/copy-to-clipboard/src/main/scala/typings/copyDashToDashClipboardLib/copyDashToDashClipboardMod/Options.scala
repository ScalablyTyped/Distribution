package typings
package copyDashToDashClipboardLib.copyDashToDashClipboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(debug: js.UndefOr[scala.Boolean] = js.undefined, message: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Options]
  }
}

