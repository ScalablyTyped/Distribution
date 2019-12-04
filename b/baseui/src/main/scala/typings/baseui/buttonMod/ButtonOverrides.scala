package typings.baseui.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOverrides extends js.Object {
  var BaseButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var EndEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var LoadingSpinner: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var LoadingSpinnerContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var StartEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object ButtonOverrides {
  @scala.inline
  def apply(
    BaseButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    EndEnhancer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    LoadingSpinner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    LoadingSpinnerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    StartEnhancer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): ButtonOverrides = {
    val __obj = js.Dynamic.literal()
    if (BaseButton != null) __obj.updateDynamic("BaseButton")(BaseButton.asInstanceOf[js.Any])
    if (EndEnhancer != null) __obj.updateDynamic("EndEnhancer")(EndEnhancer.asInstanceOf[js.Any])
    if (LoadingSpinner != null) __obj.updateDynamic("LoadingSpinner")(LoadingSpinner.asInstanceOf[js.Any])
    if (LoadingSpinnerContainer != null) __obj.updateDynamic("LoadingSpinnerContainer")(LoadingSpinnerContainer.asInstanceOf[js.Any])
    if (StartEnhancer != null) __obj.updateDynamic("StartEnhancer")(StartEnhancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOverrides]
  }
}

