package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.environmentAliasMod.EnvironmentAlias
import typings.contentfulManagement.environmentAliasMod.EnvironmentAliasProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofenvironmentAlias extends StObject {
  
  def wrapEnvironmentAlias(http: AxiosInstance, data: EnvironmentAliasProps): EnvironmentAlias
  
  def wrapEnvironmentAliasCollection(http: AxiosInstance, data: CollectionProp[EnvironmentAliasProps]): Collection[EnvironmentAlias, EnvironmentAliasProps]
}
object TypeofenvironmentAlias {
  
  @scala.inline
  def apply(
    wrapEnvironmentAlias: (AxiosInstance, EnvironmentAliasProps) => EnvironmentAlias,
    wrapEnvironmentAliasCollection: (AxiosInstance, CollectionProp[EnvironmentAliasProps]) => Collection[EnvironmentAlias, EnvironmentAliasProps]
  ): TypeofenvironmentAlias = {
    val __obj = js.Dynamic.literal(wrapEnvironmentAlias = js.Any.fromFunction2(wrapEnvironmentAlias), wrapEnvironmentAliasCollection = js.Any.fromFunction2(wrapEnvironmentAliasCollection))
    __obj.asInstanceOf[TypeofenvironmentAlias]
  }
  
  @scala.inline
  implicit class TypeofenvironmentAliasMutableBuilder[Self <: TypeofenvironmentAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapEnvironmentAlias(value: (AxiosInstance, EnvironmentAliasProps) => EnvironmentAlias): Self = StObject.set(x, "wrapEnvironmentAlias", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapEnvironmentAliasCollection(
      value: (AxiosInstance, CollectionProp[EnvironmentAliasProps]) => Collection[EnvironmentAlias, EnvironmentAliasProps]
    ): Self = StObject.set(x, "wrapEnvironmentAliasCollection", js.Any.fromFunction2(value))
  }
}
