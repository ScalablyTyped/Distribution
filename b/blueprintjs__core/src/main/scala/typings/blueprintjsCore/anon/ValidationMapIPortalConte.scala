package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsCore.contextMod.Validator
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.ValidationMap<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.IPortalContext> */
trait ValidationMapIPortalConte extends js.Object {
  var blueprintPortalClassName: js.UndefOr[Validator] = js.undefined
}

object ValidationMapIPortalConte {
  @scala.inline
  def apply(
    blueprintPortalClassName: (/* props */ StringDictionary[js.Any], /* propName */ String, /* componentName */ String, /* location */ String, /* propFullName */ String) => Error | Null = null
  ): ValidationMapIPortalConte = {
    val __obj = js.Dynamic.literal()
    if (blueprintPortalClassName != null) __obj.updateDynamic("blueprintPortalClassName")(js.Any.fromFunction5(blueprintPortalClassName))
    __obj.asInstanceOf[ValidationMapIPortalConte]
  }
}

