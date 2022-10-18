package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsCore.blueprintjsCoreStrings.blueprintPortalClassName
import typings.blueprintjsCore.libEsmCommonContextMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/common/context.ValidationMap<@blueprintjs/core.@blueprintjs/core/lib/esm/components/portal/portal.PortalLegacyContext> */
trait ValidationMapPortalLegacy extends StObject {
  
  var blueprintPortalClassName: js.UndefOr[
    Validator[typings.blueprintjsCore.blueprintjsCoreStrings.blueprintPortalClassName]
  ] = js.undefined
}
object ValidationMapPortalLegacy {
  
  inline def apply(): ValidationMapPortalLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapPortalLegacy]
  }
  
  extension [Self <: ValidationMapPortalLegacy](x: Self) {
    
    inline def setBlueprintPortalClassName(
      value: (/* props */ StringDictionary[Any], blueprintPortalClassName, /* componentName */ String, /* location */ String, /* propFullName */ String) => js.UndefOr[js.Error]
    ): Self = StObject.set(x, "blueprintPortalClassName", js.Any.fromFunction5(value))
    
    inline def setBlueprintPortalClassNameUndefined: Self = StObject.set(x, "blueprintPortalClassName", js.undefined)
  }
}
