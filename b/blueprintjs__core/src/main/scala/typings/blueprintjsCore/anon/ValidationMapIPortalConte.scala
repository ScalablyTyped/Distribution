package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsCore.contextMod.Validator
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.ValidationMap<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.IPortalContext> */
@js.native
trait ValidationMapIPortalConte extends js.Object {
  var blueprintPortalClassName: js.UndefOr[Validator] = js.native
}

object ValidationMapIPortalConte {
  @scala.inline
  def apply(): ValidationMapIPortalConte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIPortalConte]
  }
  @scala.inline
  implicit class ValidationMapIPortalConteOps[Self <: ValidationMapIPortalConte] (val x: Self) extends AnyVal {
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
    def setBlueprintPortalClassName(
      value: (/* props */ StringDictionary[js.Any], /* propName */ String, /* componentName */ String, /* location */ String, /* propFullName */ String) => Error | Null
    ): Self = this.set("blueprintPortalClassName", js.Any.fromFunction5(value))
    @scala.inline
    def deleteBlueprintPortalClassName: Self = this.set("blueprintPortalClassName", js.undefined)
  }
  
}

