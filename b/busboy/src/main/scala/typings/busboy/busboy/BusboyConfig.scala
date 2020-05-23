package typings.busboy.busboy

import typings.busboy.anon.FieldNameSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusboyConfig extends js.Object {
  var defCharset: js.UndefOr[String] = js.undefined
  var fileHwm: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var limits: js.UndefOr[FieldNameSize] = js.undefined
  var preservePath: js.UndefOr[Boolean] = js.undefined
}

object BusboyConfig {
  @scala.inline
  def apply(
    defCharset: String = null,
    fileHwm: js.UndefOr[Double] = js.undefined,
    headers: js.Any = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    limits: FieldNameSize = null,
    preservePath: js.UndefOr[Boolean] = js.undefined
  ): BusboyConfig = {
    val __obj = js.Dynamic.literal()
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (!js.isUndefined(fileHwm)) __obj.updateDynamic("fileHwm")(fileHwm.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(preservePath)) __obj.updateDynamic("preservePath")(preservePath.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusboyConfig]
  }
}

