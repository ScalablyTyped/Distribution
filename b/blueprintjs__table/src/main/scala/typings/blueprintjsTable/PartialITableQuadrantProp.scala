package typings.blueprintjsTable

import typings.blueprintjsTable.gridMod.Grid
import typings.blueprintjsTable.tableQuadrantMod.QuadrantType
import typings.react.mod.CSSProperties
import typings.react.mod.EventHandler
import typings.react.mod.NativeUIEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/table.@blueprintjs/table/lib/esm/quadrants/tableQuadrant.ITableQuadrantProps> */
trait PartialITableQuadrantProp extends js.Object {
  var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var bodyRenderer: js.UndefOr[
    js.Function3[
      /* quadrantType */ js.UndefOr[QuadrantType], 
      /* showFrozenRowsOnly */ js.UndefOr[Boolean], 
      /* showFrozenColumnsOnly */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ js.UndefOr[Boolean], Element]] = js.undefined
  var enableRowHeader: js.UndefOr[Boolean] = js.undefined
  var grid: js.UndefOr[Grid] = js.undefined
  var menuRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
  var onScroll: js.UndefOr[EventHandler[UIEvent[HTMLDivElement, NativeUIEvent]]] = js.undefined
  var onWheel: js.UndefOr[EventHandler[WheelEvent[HTMLDivElement]]] = js.undefined
  var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var quadrantType: js.UndefOr[QuadrantType] = js.undefined
  var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ js.UndefOr[Boolean], Element]] = js.undefined
  var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialITableQuadrantProp {
  @scala.inline
  def apply(
    bodyRef: /* ref */ HTMLElement | Null => _ = null,
    bodyRenderer: (/* quadrantType */ js.UndefOr[QuadrantType], /* showFrozenRowsOnly */ js.UndefOr[Boolean], /* showFrozenColumnsOnly */ js.UndefOr[Boolean]) => Element = null,
    className: String = null,
    columnHeaderCellRenderer: /* showFrozenColumnsOnly */ js.UndefOr[Boolean] => Element = null,
    enableRowHeader: js.UndefOr[Boolean] = js.undefined,
    grid: Grid = null,
    menuRenderer: () => Element = null,
    onScroll: UIEvent[HTMLDivElement, NativeUIEvent] => Unit = null,
    onWheel: WheelEvent[HTMLDivElement] => Unit = null,
    quadrantRef: /* ref */ HTMLElement | Null => _ = null,
    quadrantType: QuadrantType = null,
    rowHeaderCellRenderer: /* showFrozenRowsOnly */ js.UndefOr[Boolean] => Element = null,
    scrollContainerRef: /* ref */ HTMLElement | Null => _ = null,
    style: CSSProperties = null
  ): PartialITableQuadrantProp = {
    val __obj = js.Dynamic.literal()
    if (bodyRef != null) __obj.updateDynamic("bodyRef")(js.Any.fromFunction1(bodyRef))
    if (bodyRenderer != null) __obj.updateDynamic("bodyRenderer")(js.Any.fromFunction3(bodyRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1(columnHeaderCellRenderer))
    if (!js.isUndefined(enableRowHeader)) __obj.updateDynamic("enableRowHeader")(enableRowHeader.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction0(menuRenderer))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (quadrantRef != null) __obj.updateDynamic("quadrantRef")(js.Any.fromFunction1(quadrantRef))
    if (quadrantType != null) __obj.updateDynamic("quadrantType")(quadrantType.asInstanceOf[js.Any])
    if (rowHeaderCellRenderer != null) __obj.updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1(rowHeaderCellRenderer))
    if (scrollContainerRef != null) __obj.updateDynamic("scrollContainerRef")(js.Any.fromFunction1(scrollContainerRef))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITableQuadrantProp]
  }
}

