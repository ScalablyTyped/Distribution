package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.environmentMod.Environment
import typings.contentfulManagement.environmentMod.EnvironmentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofenvironment extends StObject {
  
  def wrapEnvironment(http: AxiosInstance, data: EnvironmentProps): Environment
  
  def wrapEnvironmentCollection(http: AxiosInstance, data: CollectionProp[EnvironmentProps]): Collection[Environment, EnvironmentProps]
}
object Typeofenvironment {
  
  inline def apply(
    wrapEnvironment: (AxiosInstance, EnvironmentProps) => Environment,
    wrapEnvironmentCollection: (AxiosInstance, CollectionProp[EnvironmentProps]) => Collection[Environment, EnvironmentProps]
  ): Typeofenvironment = {
    val __obj = js.Dynamic.literal(wrapEnvironment = js.Any.fromFunction2(wrapEnvironment), wrapEnvironmentCollection = js.Any.fromFunction2(wrapEnvironmentCollection))
    __obj.asInstanceOf[Typeofenvironment]
  }
  
  extension [Self <: Typeofenvironment](x: Self) {
    
    inline def setWrapEnvironment(value: (AxiosInstance, EnvironmentProps) => Environment): Self = StObject.set(x, "wrapEnvironment", js.Any.fromFunction2(value))
    
    inline def setWrapEnvironmentCollection(
      value: (AxiosInstance, CollectionProp[EnvironmentProps]) => Collection[Environment, EnvironmentProps]
    ): Self = StObject.set(x, "wrapEnvironmentCollection", js.Any.fromFunction2(value))
  }
}
