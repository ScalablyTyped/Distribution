package typings
package atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrucatedFormateMeasureByApproximateOptions extends js.Object {
  /**
    * Approximate character width (in pixels), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 8
    */
  var approximateCharWidth: scala.Double
  /**
    * Approximate line height (in pixels), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles, but should be changed if the fonts or styles are changed significantly.
    * @default 18
    */
  var approximateLineHeight: scala.Double
  /**
    * Total horizonal cell padding (both sides), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 20
    */
  var cellHorizontalPadding: scala.Double
  /**
    * Number of buffer lines desired, used to determine whether to display the popover in approx truncation mode.
    * Buffer lines are extra lines at the bottom of the cell that space is made for, to make sure that the cell text will fit
    * after the math calculates how many lines the text is expected to take.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 0
    */
  var numBufferLines: scala.Double
}

object ITrucatedFormateMeasureByApproximateOptions {
  @scala.inline
  def apply(
    approximateCharWidth: scala.Double,
    approximateLineHeight: scala.Double,
    cellHorizontalPadding: scala.Double,
    numBufferLines: scala.Double
  ): ITrucatedFormateMeasureByApproximateOptions = {
    val __obj = js.Dynamic.literal(approximateCharWidth = approximateCharWidth, approximateLineHeight = approximateLineHeight, cellHorizontalPadding = cellHorizontalPadding, numBufferLines = numBufferLines)
  
    __obj.asInstanceOf[ITrucatedFormateMeasureByApproximateOptions]
  }
}

