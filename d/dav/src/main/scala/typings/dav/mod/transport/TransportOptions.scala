package typings.dav.mod.transport

import typings.dav.mod.Sandbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportOptions extends js.Object {
  var retry: js.UndefOr[Boolean] = js.undefined
  /**
    *  request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
}

object TransportOptions {
  @scala.inline
  def apply(retry: js.UndefOr[Boolean] = js.undefined, sandbox: Sandbox = null): TransportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
}

