package typings.bullArena.mod.BullArena

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
    port: js.UndefOr[Double] = js.undefined,
    useCdn: js.UndefOr[Boolean] = js.undefined
  ): MiddlewareListenOptions = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(disableListen)) __obj.updateDynamic("disableListen")(disableListen.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCdn)) __obj.updateDynamic("useCdn")(useCdn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareListenOptions]
  }
}

