package typings.baseui.fileDashUploaderMod

import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.DataTransferItem
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderProps extends js.Object {
  var accept: js.UndefOr[String | js.Array[String]] = js.undefined
  var disableClick: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorMessage: js.UndefOr[String] = js.undefined
  var getDataTransferItems: js.UndefOr[GetDataTransferItems] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement], _]] = js.undefined
  var onCancel: js.UndefOr[js.Function0[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], _]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragEvent[HTMLElement], _]] = js.undefined
  var onDrop: js.UndefOr[DropFilesEventHandler] = js.undefined
  var onDropAccepted: js.UndefOr[DropFileEventHandler] = js.undefined
  var onDropRejected: js.UndefOr[DropFileEventHandler] = js.undefined
  var onFileDialogCancel: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLElement], _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[HTMLElement], _]] = js.undefined
  var onRetry: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[FileUploaderOverrides[StyleProps]] = js.undefined
  var preventDropOnDocument: js.UndefOr[Boolean] = js.undefined
  var progressAmount: js.UndefOr[Double] = js.undefined
  var progressMessage: js.UndefOr[String] = js.undefined
}

object FileUploaderProps {
  @scala.inline
  def apply(
    accept: String | js.Array[String] = null,
    disableClick: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    getDataTransferItems: /* event */ SyntheticEvent[js.Any, Event] => js.Promise[js.Array[File | DataTransferItem]] = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: /* event */ FocusEvent[HTMLElement] => _ = null,
    onCancel: () => _ = null,
    onClick: /* event */ MouseEvent[HTMLElement, NativeMouseEvent] => _ = null,
    onDragEnter: /* event */ DragEvent[HTMLElement] => _ = null,
    onDragLeave: /* event */ DragEvent[HTMLElement] => _ = null,
    onDragOver: /* event */ DragEvent[HTMLElement] => _ = null,
    onDragStart: /* event */ DragEvent[HTMLElement] => _ = null,
    onDrop: (/* accepted */ js.Array[File], /* rejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any = null,
    onDropAccepted: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any = null,
    onDropRejected: (/* acceptedOrRejected */ js.Array[File], /* event */ SyntheticEvent[HTMLElement, Event]) => js.Any = null,
    onFileDialogCancel: () => _ = null,
    onFocus: /* event */ FocusEvent[HTMLElement] => _ = null,
    onKeyDown: /* event */ KeyboardEvent[HTMLElement] => _ = null,
    onRetry: () => _ = null,
    overrides: FileUploaderOverrides[StyleProps] = null,
    preventDropOnDocument: js.UndefOr[Boolean] = js.undefined,
    progressAmount: Int | Double = null,
    progressMessage: String = null
  ): FileUploaderProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClick)) __obj.updateDynamic("disableClick")(disableClick.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (getDataTransferItems != null) __obj.updateDynamic("getDataTransferItems")(js.Any.fromFunction1(getDataTransferItems))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction3(onDrop))
    if (onDropAccepted != null) __obj.updateDynamic("onDropAccepted")(js.Any.fromFunction2(onDropAccepted))
    if (onDropRejected != null) __obj.updateDynamic("onDropRejected")(js.Any.fromFunction2(onDropRejected))
    if (onFileDialogCancel != null) __obj.updateDynamic("onFileDialogCancel")(js.Any.fromFunction0(onFileDialogCancel))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onRetry != null) __obj.updateDynamic("onRetry")(js.Any.fromFunction0(onRetry))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDropOnDocument)) __obj.updateDynamic("preventDropOnDocument")(preventDropOnDocument.asInstanceOf[js.Any])
    if (progressAmount != null) __obj.updateDynamic("progressAmount")(progressAmount.asInstanceOf[js.Any])
    if (progressMessage != null) __obj.updateDynamic("progressMessage")(progressMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploaderProps]
  }
}

