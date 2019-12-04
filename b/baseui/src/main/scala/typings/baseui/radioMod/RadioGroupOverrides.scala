package typings.baseui.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupOverrides extends js.Object {
  var RadioGroupRoot: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object RadioGroupOverrides {
  @scala.inline
  def apply(
    RadioGroupRoot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): RadioGroupOverrides = {
    val __obj = js.Dynamic.literal()
    if (RadioGroupRoot != null) __obj.updateDynamic("RadioGroupRoot")(RadioGroupRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupOverrides]
  }
}

