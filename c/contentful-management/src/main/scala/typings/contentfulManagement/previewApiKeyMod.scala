package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewApiKeyMod {
  
  @JSImport("contentful-management/dist/typings/entities/preview-api-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapPreviewApiKey(_http: AxiosInstance, data: PreviewApiKeyProps): PreviewApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapPreviewApiKey")(_http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[PreviewApiKey]
  
  @scala.inline
  def wrapPreviewApiKeyCollection(http: AxiosInstance, data: CollectionProp[PreviewApiKeyProps]): Collection[PreviewApiKey, PreviewApiKeyProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapPreviewApiKeyCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[PreviewApiKey, PreviewApiKeyProps]]
  
  trait PreviewApiKey
    extends StObject
       with PreviewApiKeyProps
       with DefaultElements[PreviewApiKeyProps]
  object PreviewApiKey {
    
    @scala.inline
    def apply(description: String, name: String, sys: MetaSysProps, toPlainObject: () => PreviewApiKeyProps): PreviewApiKey = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[PreviewApiKey]
    }
  }
  
  trait PreviewApiKeyProps extends StObject {
    
    var description: String
    
    var name: String
    
    var sys: MetaSysProps
  }
  object PreviewApiKeyProps {
    
    @scala.inline
    def apply(description: String, name: String, sys: MetaSysProps): PreviewApiKeyProps = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewApiKeyProps]
    }
    
    @scala.inline
    implicit class PreviewApiKeyPropsMutableBuilder[Self <: PreviewApiKeyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
