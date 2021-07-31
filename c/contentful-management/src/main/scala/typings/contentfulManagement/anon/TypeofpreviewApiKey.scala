package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.previewApiKeyMod.PreviewApiKey
import typings.contentfulManagement.previewApiKeyMod.PreviewApiKeyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpreviewApiKey extends StObject {
  
  def wrapPreviewApiKey(_http: AxiosInstance, data: PreviewApiKeyProps): PreviewApiKey
  
  def wrapPreviewApiKeyCollection(http: AxiosInstance, data: CollectionProp[PreviewApiKeyProps]): Collection[PreviewApiKey, PreviewApiKeyProps]
}
object TypeofpreviewApiKey {
  
  @scala.inline
  def apply(
    wrapPreviewApiKey: (AxiosInstance, PreviewApiKeyProps) => PreviewApiKey,
    wrapPreviewApiKeyCollection: (AxiosInstance, CollectionProp[PreviewApiKeyProps]) => Collection[PreviewApiKey, PreviewApiKeyProps]
  ): TypeofpreviewApiKey = {
    val __obj = js.Dynamic.literal(wrapPreviewApiKey = js.Any.fromFunction2(wrapPreviewApiKey), wrapPreviewApiKeyCollection = js.Any.fromFunction2(wrapPreviewApiKeyCollection))
    __obj.asInstanceOf[TypeofpreviewApiKey]
  }
  
  @scala.inline
  implicit class TypeofpreviewApiKeyMutableBuilder[Self <: TypeofpreviewApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapPreviewApiKey(value: (AxiosInstance, PreviewApiKeyProps) => PreviewApiKey): Self = StObject.set(x, "wrapPreviewApiKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapPreviewApiKeyCollection(
      value: (AxiosInstance, CollectionProp[PreviewApiKeyProps]) => Collection[PreviewApiKey, PreviewApiKeyProps]
    ): Self = StObject.set(x, "wrapPreviewApiKeyCollection", js.Any.fromFunction2(value))
  }
}
