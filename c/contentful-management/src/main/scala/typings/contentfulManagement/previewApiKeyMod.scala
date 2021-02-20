package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewApiKeyMod {
  
  @JSImport("contentful-management/dist/typings/entities/preview-api-key", "wrapPreviewApiKey")
  @js.native
  def wrapPreviewApiKey(_http: AxiosInstance, data: PreviewApiKeyProps): PreviewApiKey = js.native
  
  @JSImport("contentful-management/dist/typings/entities/preview-api-key", "wrapPreviewApiKeyCollection")
  @js.native
  def wrapPreviewApiKeyCollection(http: AxiosInstance, data: CollectionProp[PreviewApiKeyProps]): Collection[PreviewApiKey, PreviewApiKeyProps] = js.native
  
  @js.native
  trait PreviewApiKey
    extends PreviewApiKeyProps
       with DefaultElements[PreviewApiKeyProps]
  object PreviewApiKey {
    
    @scala.inline
    def apply(description: String, name: String, sys: MetaSysProps, toPlainObject: () => PreviewApiKeyProps): PreviewApiKey = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[PreviewApiKey]
    }
  }
  
  @js.native
  trait PreviewApiKeyProps extends StObject {
    
    var description: String = js.native
    
    var name: String = js.native
    
    var sys: MetaSysProps = js.native
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
