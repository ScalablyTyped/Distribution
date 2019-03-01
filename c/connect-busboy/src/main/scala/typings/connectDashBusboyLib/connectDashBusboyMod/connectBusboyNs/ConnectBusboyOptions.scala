package typings
package connectDashBusboyLib.connectDashBusboyMod.connectBusboyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectBusboyOptions
  extends busboyLib.busboyNs.BusboyConfig {
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
}

object ConnectBusboyOptions {
  @scala.inline
  def apply(
    defCharset: java.lang.String = null,
    fileHwm: scala.Int | scala.Double = null,
    headers: js.Any = null,
    highWaterMark: scala.Int | scala.Double = null,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    limits: busboyLib.Anon_FieldNameSize = null,
    preservePath: js.UndefOr[scala.Boolean] = js.undefined
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

