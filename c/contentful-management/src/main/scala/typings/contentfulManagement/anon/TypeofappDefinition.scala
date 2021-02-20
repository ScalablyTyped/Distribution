package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.appDefinitionMod.AppDefinition
import typings.contentfulManagement.appDefinitionMod.AppDefinitionProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappDefinition extends StObject {
  
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
  implicit class TypeofappDefinitionMutableBuilder[Self <: TypeofappDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapAppDefinition(value: (AxiosInstance, AppDefinitionProps) => AppDefinition): Self = StObject.set(x, "wrapAppDefinition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapAppDefinitionCollection(
      value: (AxiosInstance, CollectionProp[AppDefinitionProps]) => Collection[AppDefinition, AppDefinitionProps]
    ): Self = StObject.set(x, "wrapAppDefinitionCollection", js.Any.fromFunction2(value))
  }
}
