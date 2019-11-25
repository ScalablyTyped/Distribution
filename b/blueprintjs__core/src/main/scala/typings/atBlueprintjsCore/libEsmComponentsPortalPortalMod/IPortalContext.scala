package typings.atBlueprintjsCore.libEsmComponentsPortalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPortalContext extends js.Object {
  /** Additional CSS classes to add to all `Portal` elements in this React context. */
  var blueprintPortalClassName: js.UndefOr[String] = js.undefined
}

object IPortalContext {
  @scala.inline
  def apply(blueprintPortalClassName: String = null): IPortalContext = {
    val __obj = js.Dynamic.literal()
    if (blueprintPortalClassName != null) __obj.updateDynamic("blueprintPortalClassName")(blueprintPortalClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPortalContext]
  }
}

