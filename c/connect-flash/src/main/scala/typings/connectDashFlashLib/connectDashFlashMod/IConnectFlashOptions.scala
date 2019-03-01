package typings
package connectDashFlashLib.connectDashFlashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectFlashOptions extends js.Object {
  var unsafe: js.UndefOr[scala.Boolean] = js.undefined
}

object IConnectFlashOptions {
  @scala.inline
  def apply(unsafe: js.UndefOr[scala.Boolean] = js.undefined): IConnectFlashOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe)
    __obj.asInstanceOf[IConnectFlashOptions]
  }
}

