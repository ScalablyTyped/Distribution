package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.environmentAliasMod.EnvironmentAlias
import typings.contentfulManagement.environmentAliasMod.EnvironmentAliasProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofenvironmentAlias extends js.Object {
  
  def wrapEnvironmentAlias(http: AxiosInstance, data: EnvironmentAliasProps): EnvironmentAlias = js.native
  
  def wrapEnvironmentAliasCollection(http: AxiosInstance, data: CollectionProp[EnvironmentAliasProps]): Collection[EnvironmentAlias, EnvironmentAliasProps] = js.native
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
  implicit class TypeofenvironmentAliasOps[Self <: TypeofenvironmentAlias] (val x: Self) extends AnyVal {
    
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
    def setWrapEnvironmentAlias(value: (AxiosInstance, EnvironmentAliasProps) => EnvironmentAlias): Self = this.set("wrapEnvironmentAlias", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapEnvironmentAliasCollection(
      value: (AxiosInstance, CollectionProp[EnvironmentAliasProps]) => Collection[EnvironmentAlias, EnvironmentAliasProps]
    ): Self = this.set("wrapEnvironmentAliasCollection", js.Any.fromFunction2(value))
  }
}
