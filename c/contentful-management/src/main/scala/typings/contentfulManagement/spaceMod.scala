package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.createSpaceApiMod.ContentfulSpaceAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceMod {
  
  @JSImport("contentful-management/dist/typings/entities/space", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapSpace(http: AxiosInstance, data: SpaceProps): Space = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSpace")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Space]
  
  inline def wrapSpaceCollection(http: AxiosInstance, data: CollectionProp[SpaceProps]): Collection[Space, SpaceProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSpaceCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Space, SpaceProps]]
  
  type Space = SpaceProps & DefaultElements[SpaceProps] & ContentfulSpaceAPI
  
  trait SpaceProps extends StObject {
    
    var name: String
    
    var sys: MetaSysProps
  }
  object SpaceProps {
    
    inline def apply(name: String, sys: MetaSysProps): SpaceProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceProps]
    }
    
    extension [Self <: SpaceProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
