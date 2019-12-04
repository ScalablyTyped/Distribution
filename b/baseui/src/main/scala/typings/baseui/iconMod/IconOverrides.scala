package typings.baseui.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOverrides extends js.Object {
  var Svg: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledComponentArgsT> */ js.Any
  ] = js.undefined
}

object IconOverrides {
  @scala.inline
  def apply(
    Svg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledComponentArgsT> */ js.Any = null
  ): IconOverrides = {
    val __obj = js.Dynamic.literal()
    if (Svg != null) __obj.updateDynamic("Svg")(Svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOverrides]
  }
}

