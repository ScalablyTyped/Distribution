package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.previewApiKeyMod.PreviewApiKey
import typings.contentfulManagement.previewApiKeyMod.PreviewApiKeyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpreviewApiKey extends js.Object {
  
  def wrapPreviewApiKey(_http: AxiosInstance, data: PreviewApiKeyProps): PreviewApiKey = js.native
  
  def wrapPreviewApiKeyCollection(http: AxiosInstance, data: CollectionProp[PreviewApiKeyProps]): Collection[PreviewApiKey, PreviewApiKeyProps] = js.native
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
  implicit class TypeofpreviewApiKeyOps[Self <: TypeofpreviewApiKey] (val x: Self) extends AnyVal {
    
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
    def setWrapPreviewApiKey(value: (AxiosInstance, PreviewApiKeyProps) => PreviewApiKey): Self = this.set("wrapPreviewApiKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapPreviewApiKeyCollection(
      value: (AxiosInstance, CollectionProp[PreviewApiKeyProps]) => Collection[PreviewApiKey, PreviewApiKeyProps]
    ): Self = this.set("wrapPreviewApiKeyCollection", js.Any.fromFunction2(value))
  }
}
