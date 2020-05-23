package typings.cssMediaquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<css-mediaquery.css-mediaquery.MediaValues> */
trait PartialMediaValues extends js.Object {
  var `aspect-ratio`: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[js.Any] = js.undefined
  var `color-index`: js.UndefOr[js.Any] = js.undefined
  var `device-aspect-ratio`: js.UndefOr[js.Any] = js.undefined
  var `device-height`: js.UndefOr[js.Any] = js.undefined
  var `device-width`: js.UndefOr[js.Any] = js.undefined
  var grid: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[js.Any] = js.undefined
  var monochrome: js.UndefOr[js.Any] = js.undefined
  var orientation: js.UndefOr[js.Any] = js.undefined
  var resolution: js.UndefOr[js.Any] = js.undefined
  var scan: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[js.Any] = js.undefined
}

object PartialMediaValues {
  @scala.inline
  def apply(
    `aspect-ratio`: js.Any = null,
    color: js.Any = null,
    `color-index`: js.Any = null,
    `device-aspect-ratio`: js.Any = null,
    `device-height`: js.Any = null,
    `device-width`: js.Any = null,
    grid: js.Any = null,
    height: js.Any = null,
    monochrome: js.Any = null,
    orientation: js.Any = null,
    resolution: js.Any = null,
    scan: js.Any = null,
    width: js.Any = null
  ): PartialMediaValues = {
    val __obj = js.Dynamic.literal()
    if (`aspect-ratio` != null) __obj.updateDynamic("aspect-ratio")(`aspect-ratio`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`color-index` != null) __obj.updateDynamic("color-index")(`color-index`.asInstanceOf[js.Any])
    if (`device-aspect-ratio` != null) __obj.updateDynamic("device-aspect-ratio")(`device-aspect-ratio`.asInstanceOf[js.Any])
    if (`device-height` != null) __obj.updateDynamic("device-height")(`device-height`.asInstanceOf[js.Any])
    if (`device-width` != null) __obj.updateDynamic("device-width")(`device-width`.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (monochrome != null) __obj.updateDynamic("monochrome")(monochrome.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scan != null) __obj.updateDynamic("scan")(scan.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMediaValues]
  }
}

