package typings
package baseuiLib.fileDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderProps extends js.Object {
  var accept: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disableClick: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var getDataTransferItems: js.UndefOr[GetDataTransferItems] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onCancel: js.UndefOr[js.Function0[_]] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onDragEnter: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onDragLeave: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onDragOver: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onDrop: js.UndefOr[DropFilesEventHandler] = js.undefined
  var onDropAccepted: js.UndefOr[DropFileEventHandler] = js.undefined
  var onDropRejected: js.UndefOr[DropFileEventHandler] = js.undefined
  var onFileDialogCancel: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement], _]
  ] = js.undefined
  var onRetry: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[FileUploaderOverrides[StyleProps]] = js.undefined
  var preventDropOnDocument: js.UndefOr[scala.Boolean] = js.undefined
  var progressAmount: js.UndefOr[scala.Double] = js.undefined
  var progressMessage: js.UndefOr[java.lang.String] = js.undefined
}

object FileUploaderProps {
  @scala.inline
  def apply(
    accept: java.lang.String | js.Array[java.lang.String] = null,
    disableClick: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorMessage: java.lang.String = null,
    getDataTransferItems: GetDataTransferItems = null,
    maxSize: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onBlur: /* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] => _ = null,
    onCancel: () => _ = null,
    onClick: /* event */ reactLib.reactMod.MouseEventHandler[stdLib.HTMLElement] => _ = null,
    onDragEnter: /* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] => _ = null,
    onDragLeave: /* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] => _ = null,
    onDragOver: /* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] => _ = null,
    onDragStart: /* event */ reactLib.reactMod.DragEventHandler[stdLib.HTMLElement] => _ = null,
    onDrop: DropFilesEventHandler = null,
    onDropAccepted: DropFileEventHandler = null,
    onDropRejected: DropFileEventHandler = null,
    onFileDialogCancel: () => _ = null,
    onFocus: /* event */ reactLib.reactMod.FocusEventHandler[stdLib.HTMLElement] => _ = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLElement] => _ = null,
    onRetry: () => _ = null,
    overrides: FileUploaderOverrides[StyleProps] = null,
    preventDropOnDocument: js.UndefOr[scala.Boolean] = js.undefined,
    progressAmount: scala.Int | scala.Double = null,
    progressMessage: java.lang.String = null
  ): FileUploaderProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClick)) __obj.updateDynamic("disableClick")(disableClick)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (getDataTransferItems != null) __obj.updateDynamic("getDataTransferItems")(getDataTransferItems)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDropAccepted != null) __obj.updateDynamic("onDropAccepted")(onDropAccepted)
    if (onDropRejected != null) __obj.updateDynamic("onDropRejected")(onDropRejected)
    if (onFileDialogCancel != null) __obj.updateDynamic("onFileDialogCancel")(js.Any.fromFunction0(onFileDialogCancel))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onRetry != null) __obj.updateDynamic("onRetry")(js.Any.fromFunction0(onRetry))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (!js.isUndefined(preventDropOnDocument)) __obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument)
    if (progressAmount != null) __obj.updateDynamic("progressAmount")(progressAmount.asInstanceOf[js.Any])
    if (progressMessage != null) __obj.updateDynamic("progressMessage")(progressMessage)
    __obj.asInstanceOf[FileUploaderProps]
  }
}

