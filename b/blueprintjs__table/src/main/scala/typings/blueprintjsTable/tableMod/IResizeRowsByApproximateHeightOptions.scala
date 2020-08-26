package typings.blueprintjsTable.tableMod

import typings.blueprintjsTable.gridMod.ICellMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeRowsByApproximateHeightOptions extends js.Object {
  /**
    * Approximate width (in pixels) of an average character of text.
    */
  var getApproximateCharWidth: js.UndefOr[Double | ICellMapper[Double]] = js.native
  /**
    * Approximate height (in pixels) of an average line of text.
    */
  var getApproximateLineHeight: js.UndefOr[Double | ICellMapper[Double]] = js.native
  /**
    * Sum of horizontal paddings (in pixels) from the left __and__ right sides
    * of the cell.
    */
  var getCellHorizontalPadding: js.UndefOr[Double | ICellMapper[Double]] = js.native
  /**
    * Number of extra lines to add in case the calculation is imperfect.
    */
  var getNumBufferLines: js.UndefOr[Double | ICellMapper[Double]] = js.native
}

object IResizeRowsByApproximateHeightOptions {
  @scala.inline
  def apply(): IResizeRowsByApproximateHeightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizeRowsByApproximateHeightOptions]
  }
  @scala.inline
  implicit class IResizeRowsByApproximateHeightOptionsOps[Self <: IResizeRowsByApproximateHeightOptions] (val x: Self) extends AnyVal {
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
    def setGetApproximateCharWidthFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = this.set("getApproximateCharWidth", js.Any.fromFunction2(value))
    @scala.inline
    def setGetApproximateCharWidth(value: Double | ICellMapper[Double]): Self = this.set("getApproximateCharWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetApproximateCharWidth: Self = this.set("getApproximateCharWidth", js.undefined)
    @scala.inline
    def setGetApproximateLineHeightFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = this.set("getApproximateLineHeight", js.Any.fromFunction2(value))
    @scala.inline
    def setGetApproximateLineHeight(value: Double | ICellMapper[Double]): Self = this.set("getApproximateLineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetApproximateLineHeight: Self = this.set("getApproximateLineHeight", js.undefined)
    @scala.inline
    def setGetCellHorizontalPaddingFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = this.set("getCellHorizontalPadding", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCellHorizontalPadding(value: Double | ICellMapper[Double]): Self = this.set("getCellHorizontalPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetCellHorizontalPadding: Self = this.set("getCellHorizontalPadding", js.undefined)
    @scala.inline
    def setGetNumBufferLinesFunction2(value: (/* rowIndex */ Double, /* columnIndex */ Double) => Double): Self = this.set("getNumBufferLines", js.Any.fromFunction2(value))
    @scala.inline
    def setGetNumBufferLines(value: Double | ICellMapper[Double]): Self = this.set("getNumBufferLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetNumBufferLines: Self = this.set("getNumBufferLines", js.undefined)
  }
  
}

