package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.createSpaceApiMod.ContentfulSpaceAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceMod {
  
  @JSImport("contentful-management/dist/typings/entities/space", "wrapSpace")
  @js.native
  def wrapSpace(http: AxiosInstance, data: SpaceProps): Space = js.native
  
  @JSImport("contentful-management/dist/typings/entities/space", "wrapSpaceCollection")
  @js.native
  def wrapSpaceCollection(http: AxiosInstance, data: CollectionProp[SpaceProps]): Collection[Space, SpaceProps] = js.native
  
  type Space = SpaceProps with DefaultElements[SpaceProps] with ContentfulSpaceAPI
  
  @js.native
  trait SpaceProps extends StObject {
    
    var name: String = js.native
    
    var sys: MetaSysProps = js.native
  }
  object SpaceProps {
    
    @scala.inline
    def apply(name: String, sys: MetaSysProps): SpaceProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceProps]
    }
    
    @scala.inline
    implicit class SpacePropsMutableBuilder[Self <: SpaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
