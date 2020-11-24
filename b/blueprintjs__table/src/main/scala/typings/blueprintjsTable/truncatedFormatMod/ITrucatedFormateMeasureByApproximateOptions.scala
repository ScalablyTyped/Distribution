package typings.blueprintjsTable.truncatedFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITrucatedFormateMeasureByApproximateOptions extends js.Object {
  
  /**
    * Approximate character width (in pixels), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 8
    */
  var approximateCharWidth: Double = js.native
  
  /**
    * Approximate line height (in pixels), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles, but should be changed if the fonts or styles are changed significantly.
    * @default 18
    */
  var approximateLineHeight: Double = js.native
  
  /**
    * Total horizonal cell padding (both sides), used to determine whether to display the popover in approx truncation mode.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 20
    */
  var cellHorizontalPadding: Double = js.native
  
  /**
    * Number of buffer lines desired, used to determine whether to display the popover in approx truncation mode.
    * Buffer lines are extra lines at the bottom of the cell that space is made for, to make sure that the cell text will fit
    * after the math calculates how many lines the text is expected to take.
    * The default value should work for normal table styles,
    * but should be changed as necessary if the fonts or styles are changed significantly.
    * @default 0
    */
  var numBufferLines: Double = js.native
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
  
  @scala.inline
  implicit class ITrucatedFormateMeasureByApproximateOptionsOps[Self <: ITrucatedFormateMeasureByApproximateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApproximateCharWidth(value: Double): Self = this.set("approximateCharWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateLineHeight(value: Double): Self = this.set("approximateLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHorizontalPadding(value: Double): Self = this.set("cellHorizontalPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumBufferLines(value: Double): Self = this.set("numBufferLines", value.asInstanceOf[js.Any])
  }
}
