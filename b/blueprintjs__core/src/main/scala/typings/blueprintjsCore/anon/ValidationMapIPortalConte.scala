package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsCore.blueprintjsCoreStrings.blueprintPortalClassName
import typings.blueprintjsCore.contextMod.Validator
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.ValidationMap<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.IPortalContext> */
@js.native
trait ValidationMapIPortalConte extends StObject {
  
  var blueprintPortalClassName: js.UndefOr[
    Validator[typings.blueprintjsCore.blueprintjsCoreStrings.blueprintPortalClassName]
  ] = js.native
}
object ValidationMapIPortalConte {
  
  @scala.inline
  def apply(): ValidationMapIPortalConte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIPortalConte]
  }
  
  @scala.inline
  implicit class ValidationMapIPortalConteMutableBuilder[Self <: ValidationMapIPortalConte] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlueprintPortalClassName(
      value: (/* props */ StringDictionary[js.Any], blueprintPortalClassName, /* componentName */ String, /* location */ String, /* propFullName */ String) => js.UndefOr[Error]
    ): Self = StObject.set(x, "blueprintPortalClassName", js.Any.fromFunction5(value))
    
    @scala.inline
    def setBlueprintPortalClassNameUndefined: Self = StObject.set(x, "blueprintPortalClassName", js.undefined)
  }
}
