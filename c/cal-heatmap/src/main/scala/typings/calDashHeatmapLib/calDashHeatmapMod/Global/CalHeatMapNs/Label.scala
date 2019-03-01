package typings
package calDashHeatmapLib.calDashHeatmapMod.Global.CalHeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Position and alignment of the domain label. */
trait Label extends js.Object {
  /**
  			 * Horizontal align of the domain. Default: "center"
  			 * Valid values: {"left", "center", "right"}
  			 */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Height of the domain label in pixels.
  			 * By leaving it to null, the label will be set to 2 times the height of the subDomain cell.
  			 * If you want to remove the label, set domainLabelFormat to "" (empty string), instead
  			 * of setting the label height to 0. Default: null
  			 * Valid values: any integer
  			 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * More control about label positioning, if the default value does not fit your need,
  			 * especially when label is rotated, or when using a big font-size. Default: {x:0, y:0}
  			 */
  var offset: js.UndefOr[LabelOffset] = js.undefined
  /**
  			 * Position of the label, relative to the domain. Default: "bottom"
  			 * Valid values: {"top", "right", "bottom", "left"}
  			 */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Rotation for a vertical label. Default: null
  			 * Valid values: {null, "left", "right"}
  			 */
  var rotate: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Only used when label is rotated, defines the width of the label. Default: 100
  			 * Valid values: any intger
  			 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    offset: LabelOffset = null,
    position: java.lang.String = null,
    rotate: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

