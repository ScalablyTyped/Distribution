package typings.contentfulManagement.apiKeyMod

import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ApiKeyOps[Self <: ApiKey] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: () => js.Promise[Unit]): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[ApiKey]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
