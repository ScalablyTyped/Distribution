package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.apiKeyMod.ApiKey
import typings.contentfulManagement.apiKeyMod.ApiKeyProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofapiKey extends StObject {
  
  def wrapApiKey(http: AxiosInstance, data: ApiKeyProps): ApiKey
  
  def wrapApiKeyCollection(http: AxiosInstance, data: CollectionProp[ApiKeyProps]): Collection[ApiKey, ApiKeyProps]
}
object TypeofapiKey {
  
  inline def apply(
    wrapApiKey: (AxiosInstance, ApiKeyProps) => ApiKey,
    wrapApiKeyCollection: (AxiosInstance, CollectionProp[ApiKeyProps]) => Collection[ApiKey, ApiKeyProps]
  ): TypeofapiKey = {
    val __obj = js.Dynamic.literal(wrapApiKey = js.Any.fromFunction2(wrapApiKey), wrapApiKeyCollection = js.Any.fromFunction2(wrapApiKeyCollection))
    __obj.asInstanceOf[TypeofapiKey]
  }
  
  extension [Self <: TypeofapiKey](x: Self) {
    
    inline def setWrapApiKey(value: (AxiosInstance, ApiKeyProps) => ApiKey): Self = StObject.set(x, "wrapApiKey", js.Any.fromFunction2(value))
    
    inline def setWrapApiKeyCollection(value: (AxiosInstance, CollectionProp[ApiKeyProps]) => Collection[ApiKey, ApiKeyProps]): Self = StObject.set(x, "wrapApiKeyCollection", js.Any.fromFunction2(value))
  }
}
