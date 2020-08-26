package typings.baseui.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToasterOverrides extends js.Object {
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any
  ] = js.native
  var ToastBody: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.native
  var ToastCloseIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.native
}

object ToasterOverrides {
  @scala.inline
  def apply(): ToasterOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToasterOverrides]
  }
  @scala.inline
  implicit class ToasterOverridesOps[Self <: ToasterOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<ToasterSharedStylePropsArg> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    @scala.inline
    def setToastBody(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
    ): Self = this.set("ToastBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastBody: Self = this.set("ToastBody", js.undefined)
    @scala.inline
    def setToastCloseIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
    ): Self = this.set("ToastCloseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastCloseIcon: Self = this.set("ToastCloseIcon", js.undefined)
  }
  
}

