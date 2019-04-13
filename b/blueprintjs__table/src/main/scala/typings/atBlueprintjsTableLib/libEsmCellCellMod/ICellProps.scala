package typings
package atBlueprintjsTableLib.libEsmCellCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * A ref handle to capture the outer div of this cell. Used internally.
    */
  var cellRef: js.UndefOr[js.Function1[/* ref */ stdLib.HTMLElement | scala.Null, scala.Unit]] = js.undefined
  /**
    * The column index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, the cell will be rendered above overlay layers to enable mouse
    * interactions within the cell.
    * @default false
    */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional native tooltip that is displayed on hover.
    * If `true`, content will be replaced with a fixed-height skeleton.
    * @default false
    */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback invoked when the cell is focused and a key is pressed down.
    */
  var onKeyDown: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  /**
    * Callback invoked when a character-key is pressed.
    */
  var onKeyPress: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  /**
    * Callback invoked when the cell is focused and a key is released.
    */
  var onKeyUp: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  /**
    * The row index of the cell. If provided, this will be passed as an argument to any callbacks
    * when they are invoked.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /**
    * Allows for setting a tab index on the cell, so the cell can be browser-focusable.
    */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional native tooltip that is displayed on hover.
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will prevent the content from overflowing the cell.
    * @default true
    */
  var truncated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, the cell contents will be wrapped in a `div` with
    * styling that will cause text to wrap, rather than displaying it on a single line.
    * @default false
    */
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

object ICellProps {
  @scala.inline
  def apply(
    cellRef: /* ref */ stdLib.HTMLElement | scala.Null => scala.Unit = null,
    className: java.lang.String = null,
    columnIndex: scala.Int | scala.Double = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    rowIndex: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    tooltip: java.lang.String = null,
    truncated: js.UndefOr[scala.Boolean] = js.undefined,
    wrapText: js.UndefOr[scala.Boolean] = js.undefined
  ): ICellProps = {
    val __obj = js.Dynamic.literal()
    if (cellRef != null) __obj.updateDynamic("cellRef")(js.Any.fromFunction1(cellRef))
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated)
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[ICellProps]
  }
}

