package typings.cssMediaquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'orientation' | 'scan' | 'width' | 'height' | 'device-width' | 'device-height' | 'resolution' | 'aspect-ratio' | 'device-aspect-ratio' | 'grid' | 'color' | 'color-index' | 'monochrome', unknown> */
trait MediaValues extends js.Object {
  var `aspect-ratio`: js.Any
  var color: js.Any
  var `color-index`: js.Any
  var `device-aspect-ratio`: js.Any
  var `device-height`: js.Any
  var `device-width`: js.Any
  var grid: js.Any
  var height: js.Any
  var monochrome: js.Any
  var orientation: js.Any
  var resolution: js.Any
  var scan: js.Any
  var width: js.Any
}

object MediaValues {
  @scala.inline
  def apply(
    `aspect-ratio`: js.Any,
    color: js.Any,
    `color-index`: js.Any,
    `device-aspect-ratio`: js.Any,
    `device-height`: js.Any,
    `device-width`: js.Any,
    grid: js.Any,
    height: js.Any,
    monochrome: js.Any,
    orientation: js.Any,
    resolution: js.Any,
    scan: js.Any,
    width: js.Any
  ): MediaValues = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], scan = scan.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aspect-ratio")(`aspect-ratio`.asInstanceOf[js.Any])
    __obj.updateDynamic("color-index")(`color-index`.asInstanceOf[js.Any])
    __obj.updateDynamic("device-aspect-ratio")(`device-aspect-ratio`.asInstanceOf[js.Any])
    __obj.updateDynamic("device-height")(`device-height`.asInstanceOf[js.Any])
    __obj.updateDynamic("device-width")(`device-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaValues]
  }
}

