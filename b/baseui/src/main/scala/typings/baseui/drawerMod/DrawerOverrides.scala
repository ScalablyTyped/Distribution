package typings.baseui.drawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerOverrides extends js.Object {
  var Backdrop: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.undefined
  var Close: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.undefined
  var DrawerBody: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.undefined
  var DrawerContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.undefined
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
  ] = js.undefined
}

object DrawerOverrides {
  @scala.inline
  def apply(
    Backdrop: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any = null,
    Close: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any = null,
    DrawerBody: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any = null,
    DrawerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any = null,
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any = null
  ): DrawerOverrides = {
    val __obj = js.Dynamic.literal()
    if (Backdrop != null) __obj.updateDynamic("Backdrop")(Backdrop.asInstanceOf[js.Any])
    if (Close != null) __obj.updateDynamic("Close")(Close.asInstanceOf[js.Any])
    if (DrawerBody != null) __obj.updateDynamic("DrawerBody")(DrawerBody.asInstanceOf[js.Any])
    if (DrawerContainer != null) __obj.updateDynamic("DrawerContainer")(DrawerContainer.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerOverrides]
  }
}

