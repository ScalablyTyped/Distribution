package typings.blueprintjsTable.anon

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/reorderable.IDragReorderable> */
@js.native
trait PartialIDragReorderable extends js.Object {
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.native
  var locateDrag: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Double]] = js.native
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.native
  var onReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  var onReordering: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.native
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.native
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.native
  var toRegion: js.UndefOr[js.Function2[/* index1 */ Double, /* index2 */ js.UndefOr[Double], IRegion]] = js.native
}

object PartialIDragReorderable {
  @scala.inline
  def apply(): PartialIDragReorderable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIDragReorderable]
  }
  @scala.inline
  implicit class PartialIDragReorderableOps[Self <: PartialIDragReorderable] (val x: Self) extends AnyVal {
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
    def setDisabledFunction1(value: /* event */ MouseEvent => Boolean): Self = this.set("disabled", js.Any.fromFunction1(value))
    @scala.inline
    def setDisabled(value: Boolean | (js.Function1[/* event */ MouseEvent, Boolean])): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLocateClick(value: /* event */ MouseEvent => IRegion): Self = this.set("locateClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLocateClick: Self = this.set("locateClick", js.undefined)
    @scala.inline
    def setLocateDrag(value: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Double): Self = this.set("locateDrag", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLocateDrag: Self = this.set("locateDrag", js.undefined)
    @scala.inline
    def setOnFocusedCell(value: /* focusedCell */ IFocusedCellCoordinates => Unit): Self = this.set("onFocusedCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusedCell: Self = this.set("onFocusedCell", js.undefined)
    @scala.inline
    def setOnReordered(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = this.set("onReordered", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnReordered: Self = this.set("onReordered", js.undefined)
    @scala.inline
    def setOnReordering(value: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit): Self = this.set("onReordering", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnReordering: Self = this.set("onReordering", js.undefined)
    @scala.inline
    def setOnSelection(value: /* regions */ js.Array[IRegion] => Unit): Self = this.set("onSelection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelection: Self = this.set("onSelection", js.undefined)
    @scala.inline
    def setSelectedRegionsVarargs(value: IRegion*): Self = this.set("selectedRegions", js.Array(value :_*))
    @scala.inline
    def setSelectedRegions(value: js.Array[IRegion]): Self = this.set("selectedRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRegions: Self = this.set("selectedRegions", js.undefined)
    @scala.inline
    def setToRegion(value: (/* index1 */ Double, /* index2 */ js.UndefOr[Double]) => IRegion): Self = this.set("toRegion", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToRegion: Self = this.set("toRegion", js.undefined)
  }
  
}

