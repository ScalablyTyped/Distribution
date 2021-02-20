package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropsspacesysMetaLArchivedVersion
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.createEnvironmentApiMod.ContentfulEnvironmentAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("contentful-management/dist/typings/entities/environment", "wrapEnvironment")
  @js.native
  def wrapEnvironment(http: AxiosInstance, data: EnvironmentProps): Environment = js.native
  
  @JSImport("contentful-management/dist/typings/entities/environment", "wrapEnvironmentCollection")
  @js.native
  def wrapEnvironmentCollection(http: AxiosInstance, data: CollectionProp[EnvironmentProps]): Collection[Environment, EnvironmentProps] = js.native
  
  type Environment = ContentfulEnvironmentAPI with EnvironmentProps with DefaultElements[EnvironmentProps]
  
  @js.native
  trait EnvironmentProps extends StObject {
    
    /**
      * Name of the environmant
      */
    var name: String = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysPropsspacesysMetaLArchivedVersion = js.native
  }
  object EnvironmentProps {
    
    @scala.inline
    def apply(name: String, sys: MetaSysPropsspacesysMetaLArchivedVersion): EnvironmentProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentProps]
    }
    
    @scala.inline
    implicit class EnvironmentPropsMutableBuilder[Self <: EnvironmentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysPropsspacesysMetaLArchivedVersion): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
