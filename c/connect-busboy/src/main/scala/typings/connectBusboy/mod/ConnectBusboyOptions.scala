package typings.connectBusboy.mod

import typings.busboy.anon.FieldNameSize
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
    fileHwm: js.UndefOr[Double] = js.undefined,
    headers: js.Any = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    immediate: js.UndefOr[Boolean] = js.undefined,
    limits: FieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): ConnectBusboyOptions = {
    val __obj = js.Dynamic.literal()
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (!js.isUndefined(fileHwm)) __obj.updateDynamic("fileHwm")(fileHwm.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectBusboyOptions]
  }
}

