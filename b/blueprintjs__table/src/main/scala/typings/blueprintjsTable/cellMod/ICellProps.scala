package typings.blueprintjsTable.cellMod

import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellProps
  extends IIntentProps
     with IProps {
  /**
    * A ref handle to capture the outer div of this cell. Used internally.
    */
  var cellRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.undefined
  /**
    * The column index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, the cell will be rendered above overlay layers to enable mouse
    * interactions within the cell.
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  /**
    * An optional native tooltip that is displayed on hover.
    * If `true`, content will be replaced with a fixed-height skeleton.
    * @default false
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback invoked when the cell is focused and a key is pressed down.
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  /**
    * Callback invoked when a character-key is pressed.
    */
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  /**
    * Callback invoked when the cell is focused and a key is released.
    */
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  /**
    * The row index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Allows for setting a tab index on the cell, so the cell can be browser-focusable.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
    * An optional native tooltip that is displayed on hover.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will prevent the content from overflowing the cell.
    * @default true
    */
  var truncated: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will cause text to wrap, rather than displaying it on a single line.
    * @default false
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object ICellProps {
  @scala.inline
  def apply(
    cellRef: /* ref */ HTMLElement | Null => Unit = null,
    className: String = null,
    columnIndex: Int | Double = null,
    intent: Intent = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onKeyDown: KeyboardEvent[HTMLElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement] => Unit = null,
    rowIndex: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    tooltip: String = null,
    truncated: js.UndefOr[Boolean] = js.undefined,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): ICellProps = {
    val __obj = js.Dynamic.literal()
    if (cellRef != null) __obj.updateDynamic("cellRef")(js.Any.fromFunction1(cellRef))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellProps]
  }
}

