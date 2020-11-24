package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlElmsVariant extends js.Object {
  
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
  implicit class HtmlElmsVariantOps[Self <: HtmlElmsVariant] (val x: Self) extends AnyVal {
    
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
    def setAllowedRolesVarargs(value: String*): Self = this.set("allowedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAllowedRoles(value: Boolean | js.Array[String]): Self = this.set("allowedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypesVarargs(value: HtmlContentTypes*): Self = this.set("contentTypes", js.Array(value :_*))
    
    @scala.inline
    def setContentTypes(value: js.Array[HtmlContentTypes]): Self = this.set("contentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTypes: Self = this.set("contentTypes", js.undefined)
    
    @scala.inline
    def setImplicitAttrs(value: StringDictionary[String]): Self = this.set("implicitAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitAttrs: Self = this.set("implicitAttrs", js.undefined)
    
    @scala.inline
    def setNamingMethodsVarargs(value: String*): Self = this.set("namingMethods", js.Array(value :_*))
    
    @scala.inline
    def setNamingMethods(value: js.Array[String]): Self = this.set("namingMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamingMethods: Self = this.set("namingMethods", js.undefined)
    
    @scala.inline
    def setNoAriaAttrs(value: Boolean): Self = this.set("noAriaAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAriaAttrs: Self = this.set("noAriaAttrs", js.undefined)
    
    @scala.inline
    def setShadowRoot(value: Boolean): Self = this.set("shadowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowRoot: Self = this.set("shadowRoot", js.undefined)
  }
}
