package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlElmsVariant extends StObject {
  
  var allowedRoles: Boolean | js.Array[String]
  
  var contentTypes: js.UndefOr[js.Array[HtmlContentTypes]] = js.undefined
  
  var implicitAttrs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var namingMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  var noAriaAttrs: js.UndefOr[Boolean] = js.undefined
  
  var shadowRoot: js.UndefOr[Boolean] = js.undefined
}
object HtmlElmsVariant {
  
  inline def apply(allowedRoles: Boolean | js.Array[String]): HtmlElmsVariant = {
    val __obj = js.Dynamic.literal(allowedRoles = allowedRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlElmsVariant]
  }
  
  extension [Self <: HtmlElmsVariant](x: Self) {
    
    inline def setAllowedRoles(value: Boolean | js.Array[String]): Self = StObject.set(x, "allowedRoles", value.asInstanceOf[js.Any])
    
    inline def setAllowedRolesVarargs(value: String*): Self = StObject.set(x, "allowedRoles", js.Array(value :_*))
    
    inline def setContentTypes(value: js.Array[HtmlContentTypes]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    inline def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    inline def setContentTypesVarargs(value: HtmlContentTypes*): Self = StObject.set(x, "contentTypes", js.Array(value :_*))
    
    inline def setImplicitAttrs(value: StringDictionary[String]): Self = StObject.set(x, "implicitAttrs", value.asInstanceOf[js.Any])
    
    inline def setImplicitAttrsUndefined: Self = StObject.set(x, "implicitAttrs", js.undefined)
    
    inline def setNamingMethods(value: js.Array[String]): Self = StObject.set(x, "namingMethods", value.asInstanceOf[js.Any])
    
    inline def setNamingMethodsUndefined: Self = StObject.set(x, "namingMethods", js.undefined)
    
    inline def setNamingMethodsVarargs(value: String*): Self = StObject.set(x, "namingMethods", js.Array(value :_*))
    
    inline def setNoAriaAttrs(value: Boolean): Self = StObject.set(x, "noAriaAttrs", value.asInstanceOf[js.Any])
    
    inline def setNoAriaAttrsUndefined: Self = StObject.set(x, "noAriaAttrs", js.undefined)
    
    inline def setShadowRoot(value: Boolean): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
    
    inline def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
  }
}
