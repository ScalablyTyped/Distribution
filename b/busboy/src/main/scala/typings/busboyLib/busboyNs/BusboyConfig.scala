package typings
package busboyLib.busboyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusboyConfig extends js.Object {
  var defCharset: js.UndefOr[java.lang.String] = js.undefined
  var fileHwm: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var limits: js.UndefOr[busboyLib.Anon_FieldNameSize] = js.undefined
  var preservePath: js.UndefOr[scala.Boolean] = js.undefined
}

object BusboyConfig {
  @scala.inline
  def apply(
    defCharset: java.lang.String = null,
    fileHwm: scala.Int | scala.Double = null,
    headers: js.Any = null,
    highWaterMark: scala.Int | scala.Double = null,
    limits: busboyLib.Anon_FieldNameSize = null,
    preservePath: js.UndefOr[scala.Boolean] = js.undefined
  ): BusboyConfig = {
    val __obj = js.Dynamic.literal()
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset)
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits)
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath)
    __obj.asInstanceOf[BusboyConfig]
  }
}

