package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICandleChartAxis extends js.Object {
  /**
    * Interpolation function that allows you to intercept the value from the axis label
    */
  var labelInterpolationFnc: js.UndefOr[js.Function] = js.undefined
  /**
    * Allows you to correct label positioning on this axis by positive or negative x and y offset.
    */
  var labelOffset: js.UndefOr[chartistLib.Anon_Y] = js.undefined
  /**
    * The offset of the chart drawing area to the border of the container
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Position where labels are placed. Can be set to `start` or `end` where `start` is equivalent to left or top on vertical axis and `end` is equivalent to right or bottom on horizontal axis.
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the axis grid should be drawn or not
    */
  var showGrid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If labels should be shown or not
    */
  var showLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the axis type to be used to project values on this axis. If not defined, Chartist.StepAxis will be used for the X-Axis, where the ticks option will be set to the labels in the data and the stretch option will be set to the global fullWidth option. This type can be changed to any axis constructor available (e.g. Chartist.FixedScaleAxis), where all axis options should be present here.
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

