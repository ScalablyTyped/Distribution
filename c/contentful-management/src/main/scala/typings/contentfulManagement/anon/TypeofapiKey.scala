package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.apiKeyMod.ApiKey
import typings.contentfulManagement.apiKeyMod.ApiKeyProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofapiKey extends js.Object {
  
  def wrapApiKey(http: AxiosInstance, data: ApiKeyProps): ApiKey = js.native
  
  def wrapApiKeyCollection(http: AxiosInstance, data: CollectionProp[ApiKeyProps]): Collection[ApiKey, ApiKeyProps] = js.native
}
object TypeofapiKey {
  
  @scala.inline
  def apply(
    wrapApiKey: (AxiosInstance, ApiKeyProps) => ApiKey,
    wrapApiKeyCollection: (AxiosInstance, CollectionProp[ApiKeyProps]) => Collection[ApiKey, ApiKeyProps]
  ): TypeofapiKey = {
    val __obj = js.Dynamic.literal(wrapApiKey = js.Any.fromFunction2(wrapApiKey), wrapApiKeyCollection = js.Any.fromFunction2(wrapApiKeyCollection))
    __obj.asInstanceOf[TypeofapiKey]
  }
  
  @scala.inline
  implicit class TypeofapiKeyOps[Self <: TypeofapiKey] (val x: Self) extends AnyVal {
    
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
    def setWrapApiKey(value: (AxiosInstance, ApiKeyProps) => ApiKey): Self = this.set("wrapApiKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapApiKeyCollection(value: (AxiosInstance, CollectionProp[ApiKeyProps]) => Collection[ApiKey, ApiKeyProps]): Self = this.set("wrapApiKeyCollection", js.Any.fromFunction2(value))
  }
}
