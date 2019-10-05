package typings.atBlueprintjsTable.libEsmCellEditableCellMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmComponentsEditableDashTextEditableTextMod.IEditableTextProps
import typings.atBlueprintjsTable.libEsmCellCellMod.ICellProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableCellProps extends ICellProps {
  /**
    * Props that should be passed to the EditableText when it is used to edit
    */
  var editableTextProps: js.UndefOr[IEditableTextProps] = js.undefined
  /**
    * Whether the given cell is the current active/focused cell.
    */
  var isFocused: js.UndefOr[Boolean] = js.undefined
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onCancel: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
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
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
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
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * The value displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var value: js.UndefOr[String] = js.undefined
}

object IEditableCellProps {
  @scala.inline
  def apply(
    cellRef: /* ref */ HTMLElement | Null => Unit = null,
    className: String = null,
    columnIndex: Int | Double = null,
    editableTextProps: IEditableTextProps = null,
    intent: Intent = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onCancel: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onChange: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onConfirm: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit = null,
    onKeyDown: KeyboardEvent[HTMLElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLElement] => Unit = null,
    rowIndex: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    tooltip: String = null,
    truncated: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): IEditableCellProps = {
    val __obj = js.Dynamic.literal()
    if (cellRef != null) __obj.updateDynamic("cellRef")(js.Any.fromFunction1(cellRef))
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (editableTextProps != null) __obj.updateDynamic("editableTextProps")(editableTextProps)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction3(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction3(onConfirm))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
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

