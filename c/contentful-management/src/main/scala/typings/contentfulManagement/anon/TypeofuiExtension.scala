package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.uiExtensionMod.UIExtension
import typings.contentfulManagement.uiExtensionMod.UIExtensionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofuiExtension extends js.Object {
  
  def wrapUiExtension(http: AxiosInstance, data: UIExtensionProps): UIExtension = js.native
  
  def wrapUiExtensionCollection(http: AxiosInstance, data: CollectionProp[UIExtensionProps]): Collection[UIExtension, UIExtensionProps] = js.native
}
object TypeofuiExtension {
  
  @scala.inline
  def apply(
    wrapUiExtension: (AxiosInstance, UIExtensionProps) => UIExtension,
    wrapUiExtensionCollection: (AxiosInstance, CollectionProp[UIExtensionProps]) => Collection[UIExtension, UIExtensionProps]
  ): TypeofuiExtension = {
    val __obj = js.Dynamic.literal(wrapUiExtension = js.Any.fromFunction2(wrapUiExtension), wrapUiExtensionCollection = js.Any.fromFunction2(wrapUiExtensionCollection))
    __obj.asInstanceOf[TypeofuiExtension]
  }
  
  @scala.inline
  implicit class TypeofuiExtensionOps[Self <: TypeofuiExtension] (val x: Self) extends AnyVal {
    
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
    def setWrapUiExtension(value: (AxiosInstance, UIExtensionProps) => UIExtension): Self = this.set("wrapUiExtension", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapUiExtensionCollection(
      value: (AxiosInstance, CollectionProp[UIExtensionProps]) => Collection[UIExtension, UIExtensionProps]
    ): Self = this.set("wrapUiExtensionCollection", js.Any.fromFunction2(value))
  }
}
