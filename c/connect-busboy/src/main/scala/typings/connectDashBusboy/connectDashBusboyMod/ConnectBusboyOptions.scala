package typings.connectDashBusboy.connectDashBusboyMod

import typings.busboy.Anon_FieldNameSize
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
    limits: Anon_FieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): ConnectBusboyOptions = {
    val __obj = js.Dynamic.literal()
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset)
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath)
    __obj.asInstanceOf[ConnectBusboyOptions]
  }
}

