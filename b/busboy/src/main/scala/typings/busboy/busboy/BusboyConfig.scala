package typings.busboy.busboy

import typings.busboy.AnonFieldNameSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusboyConfig extends js.Object {
  var defCharset: js.UndefOr[String] = js.undefined
  var fileHwm: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var limits: js.UndefOr[AnonFieldNameSize] = js.undefined
  var preservePath: js.UndefOr[Boolean] = js.undefined
}

object BusboyConfig {
  @scala.inline
  def apply(
    defCharset: String = null,
    fileHwm: Int | Double = null,
    headers: js.Any = null,
    highWaterMark: Int | Double = null,
    limits: AnonFieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): BusboyConfig = {
    val __obj = js.Dynamic.literal()
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (fileHwm != null) __obj.updateDynamic("fileHwm")(fileHwm.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusboyConfig]
  }
}

