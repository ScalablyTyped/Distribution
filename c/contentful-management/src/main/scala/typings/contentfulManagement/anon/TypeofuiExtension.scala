package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.uiExtensionMod.UIExtension
import typings.contentfulManagement.uiExtensionMod.UIExtensionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofuiExtension extends StObject {
  
  def wrapUiExtension(http: AxiosInstance, data: UIExtensionProps): UIExtension
  
  def wrapUiExtensionCollection(http: AxiosInstance, data: CollectionProp[UIExtensionProps]): Collection[UIExtension, UIExtensionProps]
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
  implicit class TypeofuiExtensionMutableBuilder[Self <: TypeofuiExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapUiExtension(value: (AxiosInstance, UIExtensionProps) => UIExtension): Self = StObject.set(x, "wrapUiExtension", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapUiExtensionCollection(
      value: (AxiosInstance, CollectionProp[UIExtensionProps]) => Collection[UIExtension, UIExtensionProps]
    ): Self = StObject.set(x, "wrapUiExtensionCollection", js.Any.fromFunction2(value))
  }
}
