package typings.croppie.anon

import typings.croppie.croppieStrings.base64
import typings.croppie.croppieStrings.canvas
import typings.croppie.croppieStrings.original
import typings.croppie.croppieStrings.viewport
import typings.croppie.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined croppie.croppie.ResultOptions & {  type  :'base64' | 'canvas'} */
trait ResultOptionstypebase64ca extends js.Object {
  var circle: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Format] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[viewport | original | Height] = js.undefined
  var `type`: js.UndefOr[typings.croppie.mod.Type with (base64 | canvas)] = js.undefined
}

object ResultOptionstypebase64ca {
  @scala.inline
  def apply(
    circle: js.UndefOr[Boolean] = js.undefined,
    format: Format = null,
    quality: js.UndefOr[Double] = js.undefined,
    size: viewport | original | Height = null,
    `type`: typings.croppie.mod.Type with (base64 | canvas) = null
  ): ResultOptionstypebase64ca = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultOptionstypebase64ca]
  }
}

