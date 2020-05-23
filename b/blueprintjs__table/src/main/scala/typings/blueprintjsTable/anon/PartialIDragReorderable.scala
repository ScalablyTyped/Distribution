package typings.blueprintjsTable.anon

import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/interactions/reorderable.IDragReorderable> */
trait PartialIDragReorderable extends js.Object {
  var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.undefined
  var locateClick: js.UndefOr[js.Function1[/* event */ MouseEvent, IRegion]] = js.undefined
  var locateDrag: js.UndefOr[js.Function2[/* event */ MouseEvent, /* coords */ ICoordinateData, Double]] = js.undefined
  var onFocusedCell: js.UndefOr[js.Function1[/* focusedCell */ IFocusedCellCoordinates, Unit]] = js.undefined
  var onReordered: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  var onReordering: js.UndefOr[
    js.Function3[/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double, Unit]
  ] = js.undefined
  var onSelection: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
  var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  var toRegion: js.UndefOr[js.Function2[/* index1 */ Double, /* index2 */ js.UndefOr[Double], IRegion]] = js.undefined
}

object PartialIDragReorderable {
  @scala.inline
  def apply(
    disabled: Boolean | (js.Function1[/* event */ MouseEvent, Boolean]) = null,
    locateClick: /* event */ MouseEvent => IRegion = null,
    locateDrag: (/* event */ MouseEvent, /* coords */ ICoordinateData) => Double = null,
    onFocusedCell: /* focusedCell */ IFocusedCellCoordinates => Unit = null,
    onReordered: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit = null,
    onReordering: (/* oldIndex */ Double, /* newIndex */ Double, /* length */ Double) => Unit = null,
    onSelection: /* regions */ js.Array[IRegion] => Unit = null,
    selectedRegions: js.Array[IRegion] = null,
    toRegion: (/* index1 */ Double, /* index2 */ js.UndefOr[Double]) => IRegion = null
  ): PartialIDragReorderable = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (locateClick != null) __obj.updateDynamic("locateClick")(js.Any.fromFunction1(locateClick))
    if (locateDrag != null) __obj.updateDynamic("locateDrag")(js.Any.fromFunction2(locateDrag))
    if (onFocusedCell != null) __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1(onFocusedCell))
    if (onReordered != null) __obj.updateDynamic("onReordered")(js.Any.fromFunction3(onReordered))
    if (onReordering != null) __obj.updateDynamic("onReordering")(js.Any.fromFunction3(onReordering))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction1(onSelection))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (toRegion != null) __obj.updateDynamic("toRegion")(js.Any.fromFunction2(toRegion))
    __obj.asInstanceOf[PartialIDragReorderable]
  }
}

