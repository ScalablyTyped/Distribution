package typings.atBlueprintjsTable.libEsmTableMod

import typings.atBlueprintjsTable.libEsmCommonGridMod.ICellMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeRowsByApproximateHeightOptions extends js.Object {
  /**
    * Approximate width (in pixels) of an average character of text.
    */
  var getApproximateCharWidth: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
  /**
    * Approximate height (in pixels) of an average line of text.
    */
  var getApproximateLineHeight: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
  /**
    * Sum of horizontal paddings (in pixels) from the left __and__ right sides
    * of the cell.
    */
  var getCellHorizontalPadding: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
  /**
    * Number of extra lines to add in case the calculation is imperfect.
    */
  var getNumBufferLines: js.UndefOr[Double | ICellMapper[Double]] = js.undefined
}

object IResizeRowsByApproximateHeightOptions {
  @scala.inline
  def apply(
    getApproximateCharWidth: Double | ICellMapper[Double] = null,
    getApproximateLineHeight: Double | ICellMapper[Double] = null,
    getCellHorizontalPadding: Double | ICellMapper[Double] = null,
    getNumBufferLines: Double | ICellMapper[Double] = null
  ): IResizeRowsByApproximateHeightOptions = {
    val __obj = js.Dynamic.literal()
    if (getApproximateCharWidth != null) __obj.updateDynamic("getApproximateCharWidth")(getApproximateCharWidth.asInstanceOf[js.Any])
    if (getApproximateLineHeight != null) __obj.updateDynamic("getApproximateLineHeight")(getApproximateLineHeight.asInstanceOf[js.Any])
    if (getCellHorizontalPadding != null) __obj.updateDynamic("getCellHorizontalPadding")(getCellHorizontalPadding.asInstanceOf[js.Any])
    if (getNumBufferLines != null) __obj.updateDynamic("getNumBufferLines")(getNumBufferLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeRowsByApproximateHeightOptions]
  }
}

