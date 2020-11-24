package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.appDefinitionMod.AppDefinition
import typings.contentfulManagement.appDefinitionMod.AppDefinitionProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappDefinition extends js.Object {
  
  def wrapAppDefinition(http: AxiosInstance, data: AppDefinitionProps): AppDefinition = js.native
  
  def wrapAppDefinitionCollection(http: AxiosInstance, data: CollectionProp[AppDefinitionProps]): Collection[AppDefinition, AppDefinitionProps] = js.native
}
object TypeofappDefinition {
  
  @scala.inline
  def apply(
    wrapAppDefinition: (AxiosInstance, AppDefinitionProps) => AppDefinition,
    wrapAppDefinitionCollection: (AxiosInstance, CollectionProp[AppDefinitionProps]) => Collection[AppDefinition, AppDefinitionProps]
  ): TypeofappDefinition = {
    val __obj = js.Dynamic.literal(wrapAppDefinition = js.Any.fromFunction2(wrapAppDefinition), wrapAppDefinitionCollection = js.Any.fromFunction2(wrapAppDefinitionCollection))
    __obj.asInstanceOf[TypeofappDefinition]
  }
  
  @scala.inline
  implicit class TypeofappDefinitionOps[Self <: TypeofappDefinition] (val x: Self) extends AnyVal {
    
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
    def setWrapAppDefinition(value: (AxiosInstance, AppDefinitionProps) => AppDefinition): Self = this.set("wrapAppDefinition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapAppDefinitionCollection(
      value: (AxiosInstance, CollectionProp[AppDefinitionProps]) => Collection[AppDefinition, AppDefinitionProps]
    ): Self = this.set("wrapAppDefinitionCollection", js.Any.fromFunction2(value))
  }
}
