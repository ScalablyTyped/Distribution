package typings
package atBlueprintjsTableLib.libEsmCellEditableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableCellProps
  extends atBlueprintjsTableLib.libEsmCellCellMod.ICellProps {
  /**
    * Whether the given cell is the current active/focused cell.
    */
  var isFocused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onCancel: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* rowIndex */ js.UndefOr[scala.Double], 
      /* columnIndex */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A listener that is triggered as soon as the editable name is modified.
    * This can be due, for example, to keyboard input or the clipboard. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* rowIndex */ js.UndefOr[scala.Double], 
      /* columnIndex */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A listener that is triggered once the editing is confirmed. This is
    * usually due to the <code>return</code> (or <code>enter</code>) key press.
    * The callback will also receive the row index and column index if they
    * were originally provided via props.
    */
  var onConfirm: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* rowIndex */ js.UndefOr[scala.Double], 
      /* columnIndex */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The value displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object IEditableCellProps {
  @scala.inline
  def apply(
    cellRef: /* ref */ stdLib.HTMLElement | scala.Null => scala.Unit = null,
    className: java.lang.String = null,
    columnIndex: scala.Int | scala.Double = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    isFocused: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onCancel: (/* value */ java.lang.String, /* rowIndex */ js.UndefOr[scala.Double], /* columnIndex */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onChange: (/* value */ java.lang.String, /* rowIndex */ js.UndefOr[scala.Double], /* columnIndex */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onConfirm: (/* value */ java.lang.String, /* rowIndex */ js.UndefOr[scala.Double], /* columnIndex */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] = null,
    rowIndex: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    tooltip: java.lang.String = null,
    truncated: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null,
    wrapText: js.UndefOr[scala.Boolean] = js.undefined
  ): IEditableCellProps = {
    val __obj = js.Dynamic.literal()
    if (cellRef != null) __obj.updateDynamic("cellRef")(js.Any.fromFunction1(cellRef))
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction3(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction3(onConfirm))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[IEditableCellProps]
  }
}

