package typings.baseui.fileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderOverrides[T] extends js.Object {
  var ButtonComponent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  var ContentMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  var ContentSeparator: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  var ErrorMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  var FileDragAndDrop: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  var HiddenInput: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  var ProgressMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.undefined
}

object FileUploaderOverrides {
  @scala.inline
  def apply[T](
    ButtonComponent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null,
    ContentMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null,
    ContentSeparator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null,
    ErrorMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null,
    FileDragAndDrop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null,
    HiddenInput: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null,
    ProgressMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null,
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any = null
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

