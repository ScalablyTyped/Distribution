package typings.baseui.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterOverrides extends js.Object {
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any
  ] = js.undefined
  var ToastBody: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.undefined
  var ToastCloseIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.undefined
}

object ToasterOverrides {
  @scala.inline
  def apply(
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any = null,
    ToastBody: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any = null,
    ToastCloseIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any = null
  ): ToasterOverrides = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (ToastBody != null) __obj.updateDynamic("ToastBody")(ToastBody.asInstanceOf[js.Any])
    if (ToastCloseIcon != null) __obj.updateDynamic("ToastCloseIcon")(ToastCloseIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterOverrides]
  }
}

