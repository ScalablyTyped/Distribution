package typings.bullDashArena.bullDashArenaMod.BullArenaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareListenOptions extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var disableListen: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var useCdn: js.UndefOr[Boolean] = js.undefined
}

object MiddlewareListenOptions {
  @scala.inline
  def apply(
    basePath: String = null,
    disableListen: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    port: Int | Double = null,
    useCdn: js.UndefOr[Boolean] = js.undefined
  ): MiddlewareListenOptions = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (!js.isUndefined(disableListen)) __obj.updateDynamic("disableListen")(disableListen)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(useCdn)) __obj.updateDynamic("useCdn")(useCdn)
    __obj.asInstanceOf[MiddlewareListenOptions]
  }
}

