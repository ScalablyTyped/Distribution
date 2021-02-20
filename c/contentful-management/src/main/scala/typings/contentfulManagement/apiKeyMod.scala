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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiKeyMod {
  
  @JSImport("contentful-management/dist/typings/entities/api-key", "wrapApiKey")
  @js.native
  def wrapApiKey(http: AxiosInstance, data: ApiKeyProps): ApiKey = js.native
  
  @JSImport("contentful-management/dist/typings/entities/api-key", "wrapApiKeyCollection")
  @js.native
  def wrapApiKeyCollection(http: AxiosInstance, data: CollectionProp[ApiKeyProps]): Collection[ApiKey, ApiKeyProps] = js.native
  
  @js.native
  trait ApiKey
    extends ApiKeyProps
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
    def delete(): js.Promise[Unit] = js.native
    
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
    def update(): js.Promise[ApiKey] = js.native
  }
  object ApiKey {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ApiKeyMutableBuilder[Self <: ApiKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[ApiKey]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ApiKeyProps extends StObject {
    
    var accessToken: String = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var environments: js.Array[Sys] = js.native
    
    var name: String = js.native
    
    var policies: js.UndefOr[js.Array[Action]] = js.native
    
    var preview_api_key: Sys = js.native
    
    var sys: MetaSysProps = js.native
  }
  object ApiKeyProps {
    
    @scala.inline
    def apply(
      accessToken: String,
      environments: js.Array[Sys],
      name: String,
      preview_api_key: Sys,
      sys: MetaSysProps
    ): ApiKeyProps = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preview_api_key = preview_api_key.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKeyProps]
    }
    
    @scala.inline
    implicit class ApiKeyPropsMutableBuilder[Self <: ApiKeyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnvironments(value: js.Array[Sys]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentsVarargs(value: Sys*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicies(value: js.Array[Action]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
      
      @scala.inline
      def setPoliciesVarargs(value: Action*): Self = StObject.set(x, "policies", js.Array(value :_*))
      
      @scala.inline
      def setPreview_api_key(value: Sys): Self = StObject.set(x, "preview_api_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<contentful-management.contentful-management/dist/typings/entities/api-key.ApiKeyProps, 'name' | 'environments' | 'description'> */
  @js.native
  trait CreateApiKeyProps extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var environments: js.Array[Sys] = js.native
    
    var name: String = js.native
  }
  object CreateApiKeyProps {
    
    @scala.inline
    def apply(environments: js.Array[Sys], name: String): CreateApiKeyProps = {
      val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateApiKeyProps]
    }
    
    @scala.inline
    implicit class CreateApiKeyPropsMutableBuilder[Self <: CreateApiKeyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEnvironments(value: js.Array[Sys]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentsVarargs(value: Sys*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
