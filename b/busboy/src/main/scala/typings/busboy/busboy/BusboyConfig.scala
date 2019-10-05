package typings.busboy.busboy

import typings.busboy.Anon_FieldNameSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusboyConfig extends js.Object {
  var defCharset: js.UndefOr[String] = js.undefined
  var fileHwm: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var limits: js.UndefOr[Anon_FieldNameSize] = js.undefined
  var preservePath: js.UndefOr[Boolean] = js.undefined
}

object BusboyConfig {
  @scala.inline
  def apply(
    defCharset: String = null,
    fileHwm: Int | Double = null,
    headers: js.Any = null,
    highWaterMark: Int | Double = null,
    limits: Anon_FieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
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

