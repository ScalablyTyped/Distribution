package typings
package croppieLib.croppieMod.CroppieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultOptions extends js.Object {
  var circle: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[Format] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[
    croppieLib.croppieLibStrings.viewport | croppieLib.croppieLibStrings.original | croppieLib.Anon_Height
  ] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
}

object ResultOptions {
  @scala.inline
  def apply(
    circle: js.UndefOr[scala.Boolean] = js.undefined,
    format: Format = null,
    quality: scala.Int | scala.Double = null,
    size: croppieLib.croppieLibStrings.viewport | croppieLib.croppieLibStrings.original | croppieLib.Anon_Height = null,
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

