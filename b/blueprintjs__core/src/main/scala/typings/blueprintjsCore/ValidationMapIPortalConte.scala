package typings.blueprintjsCore

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined prop-types.prop-types.ValidationMap<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.IPortalContext> */
trait ValidationMapIPortalConte extends js.Object {
  var blueprintPortalClassName: js.UndefOr[Validator[js.UndefOr[String]]] = js.undefined
}

object ValidationMapIPortalConte {
  @scala.inline
  def apply(blueprintPortalClassName: Validator[js.UndefOr[String]] = null): ValidationMapIPortalConte = {
    val __obj = js.Dynamic.literal()
    if (blueprintPortalClassName != null) __obj.updateDynamic("blueprintPortalClassName")(blueprintPortalClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMapIPortalConte]
  }
}

