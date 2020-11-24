package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.environmentMod.Environment
import typings.contentfulManagement.environmentMod.EnvironmentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofenvironment extends js.Object {
  
  def wrapEnvironment(http: AxiosInstance, data: EnvironmentProps): Environment = js.native
  
  def wrapEnvironmentCollection(http: AxiosInstance, data: CollectionProp[EnvironmentProps]): Collection[Environment, EnvironmentProps] = js.native
}
object Typeofenvironment {
  
  @scala.inline
  def apply(
    wrapEnvironment: (AxiosInstance, EnvironmentProps) => Environment,
    wrapEnvironmentCollection: (AxiosInstance, CollectionProp[EnvironmentProps]) => Collection[Environment, EnvironmentProps]
  ): Typeofenvironment = {
    val __obj = js.Dynamic.literal(wrapEnvironment = js.Any.fromFunction2(wrapEnvironment), wrapEnvironmentCollection = js.Any.fromFunction2(wrapEnvironmentCollection))
    __obj.asInstanceOf[Typeofenvironment]
  }
  
  @scala.inline
  implicit class TypeofenvironmentOps[Self <: Typeofenvironment] (val x: Self) extends AnyVal {
    
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
    def setWrapEnvironment(value: (AxiosInstance, EnvironmentProps) => Environment): Self = this.set("wrapEnvironment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapEnvironmentCollection(
      value: (AxiosInstance, CollectionProp[EnvironmentProps]) => Collection[Environment, EnvironmentProps]
    ): Self = this.set("wrapEnvironmentCollection", js.Any.fromFunction2(value))
  }
}
