package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlElmsVariant extends StObject {
  
  var allowedRoles: Boolean | js.Array[String] = js.native
  
  var contentTypes: js.UndefOr[js.Array[HtmlContentTypes]] = js.native
  
  var implicitAttrs: js.UndefOr[StringDictionary[String]] = js.native
  
  var namingMethods: js.UndefOr[js.Array[String]] = js.native
  
  var noAriaAttrs: js.UndefOr[Boolean] = js.native
  
  var shadowRoot: js.UndefOr[Boolean] = js.native
}
object HtmlElmsVariant {
  
  @scala.inline
  def apply(allowedRoles: Boolean | js.Array[String]): HtmlElmsVariant = {
    val __obj = js.Dynamic.literal(allowedRoles = allowedRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlElmsVariant]
  }
  
  @scala.inline
  implicit class HtmlElmsVariantMutableBuilder[Self <: HtmlElmsVariant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedRoles(value: Boolean | js.Array[String]): Self = StObject.set(x, "allowedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedRolesVarargs(value: String*): Self = StObject.set(x, "allowedRoles", js.Array(value :_*))
    
    @scala.inline
    def setContentTypes(value: js.Array[HtmlContentTypes]): Self = StObject.set(x, "contentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypesUndefined: Self = StObject.set(x, "contentTypes", js.undefined)
    
    @scala.inline
    def setContentTypesVarargs(value: HtmlContentTypes*): Self = StObject.set(x, "contentTypes", js.Array(value :_*))
    
    @scala.inline
    def setImplicitAttrs(value: StringDictionary[String]): Self = StObject.set(x, "implicitAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitAttrsUndefined: Self = StObject.set(x, "implicitAttrs", js.undefined)
    
    @scala.inline
    def setNamingMethods(value: js.Array[String]): Self = StObject.set(x, "namingMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamingMethodsUndefined: Self = StObject.set(x, "namingMethods", js.undefined)
    
    @scala.inline
    def setNamingMethodsVarargs(value: String*): Self = StObject.set(x, "namingMethods", js.Array(value :_*))
    
    @scala.inline
    def setNoAriaAttrs(value: Boolean): Self = StObject.set(x, "noAriaAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAriaAttrsUndefined: Self = StObject.set(x, "noAriaAttrs", js.undefined)
    
    @scala.inline
    def setShadowRoot(value: Boolean): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
  }
}
