package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Action
import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiKeyMod {
  
  @JSImport("contentful-management/dist/typings/entities/api-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapApiKey(http: AxiosInstance, data: ApiKeyProps): ApiKey = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapApiKey")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ApiKey]
  
  inline def wrapApiKeyCollection(http: AxiosInstance, data: CollectionProp[ApiKeyProps]): Collection[ApiKey, ApiKeyProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapApiKeyCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[ApiKey, ApiKeyProps]]
  
  trait ApiKey
    extends StObject
       with ApiKeyProps
       with DefaultElements[ApiKeyProps] {
    
    /**
      * Deletes this object on the server.
      * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      * client.getSpace('<space_id>')
      * .then((space) => space.getApiKey(<api-key-id>))
      * .then((apiKey) => apiKey.delete())
      * .then(() => console.log('apikey deleted'))
      * .catch(console.error)
      * ```
      */
    def delete(): js.Promise[Unit]
    
    /**
      * Sends an update to the server with any changes made to the object's properties
      * @return Object returned from the server with updated changes.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      * client.getSpace('<space_id>')
      * .then((space) => space.getApiKey(<api-key-id>))
      * .then((apiKey) => {
      *  apiKey.name = 'New name'
      *  return apiKey.update()
      * })
      * .then(apiKey => console.log(apiKey.name))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[ApiKey]
  }
  object ApiKey {
    
    inline def apply(
      accessToken: String,
      delete: () => js.Promise[Unit],
      environments: js.Array[Sys],
      name: String,
      preview_api_key: Sys,
      sys: MetaSysProps,
      toPlainObject: () => ApiKeyProps,
      update: () => js.Promise[ApiKey]
    ): ApiKey = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), environments = environments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preview_api_key = preview_api_key.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[ApiKey]
    }
    
    extension [Self <: ApiKey](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[ApiKey]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait ApiKeyProps extends StObject {
    
    var accessToken: String
    
    var description: js.UndefOr[String] = js.undefined
    
    var environments: js.Array[Sys]
    
    var name: String
    
    var policies: js.UndefOr[js.Array[Action]] = js.undefined
    
    var preview_api_key: Sys
    
    var sys: MetaSysProps
  }
  object ApiKeyProps {
    
    inline def apply(
      accessToken: String,
      environments: js.Array[Sys],
      name: String,
      preview_api_key: Sys,
      sys: MetaSysProps
    ): ApiKeyProps = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preview_api_key = preview_api_key.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKeyProps]
    }
    
    extension [Self <: ApiKeyProps](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnvironments(value: js.Array[Sys]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentsVarargs(value: Sys*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPolicies(value: js.Array[Action]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
      
      inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
      
      inline def setPoliciesVarargs(value: Action*): Self = StObject.set(x, "policies", js.Array(value :_*))
      
      inline def setPreview_api_key(value: Sys): Self = StObject.set(x, "preview_api_key", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<contentful-management.contentful-management/dist/typings/entities/api-key.ApiKeyProps, 'name' | 'environments' | 'description'> */
  trait CreateApiKeyProps extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var environments: js.Array[Sys]
    
    var name: String
  }
  object CreateApiKeyProps {
    
    inline def apply(environments: js.Array[Sys], name: String): CreateApiKeyProps = {
      val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateApiKeyProps]
    }
    
    extension [Self <: CreateApiKeyProps](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnvironments(value: js.Array[Sys]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentsVarargs(value: Sys*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
