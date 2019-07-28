package typings.croppie.croppieMod

import typings.croppie.Anon_Height
import typings.croppie.croppieStrings.original
import typings.croppie.croppieStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultOptions extends js.Object {
  var circle: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Format] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[viewport | original | Anon_Height] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
}

object ResultOptions {
  @scala.inline
  def apply(
    circle: js.UndefOr[Boolean] = js.undefined,
    format: Format = null,
    quality: Int | Double = null,
    size: viewport | original | Anon_Height = null,
    `type`: Type = null
  ): ResultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle)
    if (format != null) __obj.updateDynamic("format")(format)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResultOptions]
  }
}

