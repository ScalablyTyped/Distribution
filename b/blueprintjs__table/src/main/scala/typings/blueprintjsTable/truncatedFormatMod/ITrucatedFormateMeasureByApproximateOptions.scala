package typings.blueprintjsTable.truncatedFormatMod

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
  var approximateCharWidth: Double
  /**
    * Approximate line height (in pixels), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles, but should be changed if the fonts or styles are changed significantly.
    * @default 18
    */
  var approximateLineHeight: Double
  /**
    * Total horizonal cell padding (both sides), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 20
    */
  var cellHorizontalPadding: Double
  /**
    * Number of buffer lines desired, used to determine whether to display the popover in approx truncation mode.
    * Buffer lines are extra lines at the bottom of the cell that space is made for, to make sure that the cell text will fit
    * after the math calculates how many lines the text is expected to take.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 0
    */
  var numBufferLines: Double
}

object ITrucatedFormateMeasureByApproximateOptions {
  @scala.inline
  def apply(
    approximateCharWidth: Double,
    approximateLineHeight: Double,
    cellHorizontalPadding: Double,
    numBufferLines: Double
  ): ITrucatedFormateMeasureByApproximateOptions = {
    val __obj = js.Dynamic.literal(approximateCharWidth = approximateCharWidth.asInstanceOf[js.Any], approximateLineHeight = approximateLineHeight.asInstanceOf[js.Any], cellHorizontalPadding = cellHorizontalPadding.asInstanceOf[js.Any], numBufferLines = numBufferLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrucatedFormateMeasureByApproximateOptions]
  }
}

