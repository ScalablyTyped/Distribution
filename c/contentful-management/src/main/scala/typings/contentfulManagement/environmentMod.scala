package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropsspacesysMetaLArchivedVersion
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.createEnvironmentApiMod.ContentfulEnvironmentAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod {
  
  @JSImport("contentful-management/dist/typings/entities/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapEnvironment(http: AxiosInstance, data: EnvironmentProps): Environment = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEnvironment")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Environment]
  
  @scala.inline
  def wrapEnvironmentCollection(http: AxiosInstance, data: CollectionProp[EnvironmentProps]): Collection[Environment, EnvironmentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapEnvironmentCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Environment, EnvironmentProps]]
  
  type Environment = ContentfulEnvironmentAPI & EnvironmentProps & DefaultElements[EnvironmentProps]
  
  trait EnvironmentProps extends StObject {
    
    /**
      * Name of the environmant
      */
    var name: String
    
    /**
      * System metadata
      */
    var sys: MetaSysPropsspacesysMetaLArchivedVersion
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
