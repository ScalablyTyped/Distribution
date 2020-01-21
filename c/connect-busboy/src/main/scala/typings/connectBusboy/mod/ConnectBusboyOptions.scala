package typings.connectBusboy.mod

import typings.busboy.AnonFieldNameSize
import typings.busboy.busboy.BusboyConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectBusboyOptions extends BusboyConfig {
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object ConnectBusboyOptions {
  @scala.inline
  def apply(
    defCharset: String = null,
    fileHwm: Int | Double = null,
    headers: js.Any = null,
    highWaterMark: Int | Double = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    limits: AnonFieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): ConnectBusboyOptions = {
    val __obj = js.Dynamic.literal()
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectBusboyOptions]
  }
}

