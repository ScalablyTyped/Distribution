package typings.connectFlash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectFlashOptions extends js.Object {
  var unsafe: js.UndefOr[Boolean] = js.undefined
}

object IConnectFlashOptions {
  @scala.inline
  def apply(unsafe: js.UndefOr[Boolean] = js.undefined): IConnectFlashOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectFlashOptions]
  }
}

