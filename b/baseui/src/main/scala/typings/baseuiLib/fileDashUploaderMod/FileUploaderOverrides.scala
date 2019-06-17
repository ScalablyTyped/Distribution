package typings
package baseuiLib.fileDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderOverrides[T] extends js.Object {
  var ButtonComponent: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var ContentMessage: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var ContentSeparator: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var ErrorMessage: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var FileDragAndDrop: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var HiddenInput: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var ProgressMessage: js.UndefOr[baseuiLib.Override[T]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[T]] = js.undefined
}

object FileUploaderOverrides {
  @scala.inline
  def apply[T](
    ButtonComponent: baseuiLib.Override[T] = null,
    ContentMessage: baseuiLib.Override[T] = null,
    ContentSeparator: baseuiLib.Override[T] = null,
    ErrorMessage: baseuiLib.Override[T] = null,
    FileDragAndDrop: baseuiLib.Override[T] = null,
    HiddenInput: baseuiLib.Override[T] = null,
    ProgressMessage: baseuiLib.Override[T] = null,
    Root: baseuiLib.Override[T] = null
  ): FileUploaderOverrides[T] = {
    val __obj = js.Dynamic.literal()
    if (ButtonComponent != null) __obj.updateDynamic("ButtonComponent")(ButtonComponent.asInstanceOf[js.Any])
    if (ContentMessage != null) __obj.updateDynamic("ContentMessage")(ContentMessage.asInstanceOf[js.Any])
    if (ContentSeparator != null) __obj.updateDynamic("ContentSeparator")(ContentSeparator.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (FileDragAndDrop != null) __obj.updateDynamic("FileDragAndDrop")(FileDragAndDrop.asInstanceOf[js.Any])
    if (HiddenInput != null) __obj.updateDynamic("HiddenInput")(HiddenInput.asInstanceOf[js.Any])
    if (ProgressMessage != null) __obj.updateDynamic("ProgressMessage")(ProgressMessage.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploaderOverrides[T]]
  }
}

