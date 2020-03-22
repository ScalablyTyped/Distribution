package typings.croppie

import typings.croppie.croppieStrings.original
import typings.croppie.croppieStrings.rawcanvas
import typings.croppie.croppieStrings.viewport
import typings.croppie.mod.Format
import typings.croppie.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined croppie.croppie.ResultOptions & {  type  :'rawcanvas'} */
trait ResultOptionstyperawcanva extends js.Object {
  var circle: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[Format] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[viewport | original | AnonHeight] = js.undefined
  var `type`: js.UndefOr[Type with rawcanvas] = js.undefined
}

object ResultOptionstyperawcanva {
  @scala.inline
  def apply(
    circle: js.UndefOr[Boolean] = js.undefined,
    format: Format = null,
    quality: Int | Double = null,
    size: viewport | original | AnonHeight = null,
    `type`: Type with rawcanvas = null
  ): ResultOptionstyperawcanva = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultOptionstyperawcanva]
  }
}

