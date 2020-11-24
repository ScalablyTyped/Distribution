package typings.contentfulManagement.webhookMod

import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebHooks
  extends WebhookProps
     with DefaultElements[WebhookProps] {
  
  /**
    * Deletes this object on the server.
    * @return Promise for the deletion. It contains no data, but the Promise error case should be handled.
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getWebhook('<webhook_id>'))
    * .then((webhook) => webhook.delete())
    * .then((webhook) => console.log(`webhook ${webhook.sys.id} updated.`))
    * .catch(console.error)
    * ```
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * Webhook call with specific id. See https://www.contentful.com/developers/docs/references/content-management-api/#/reference/webhook-calls/webhook-call-overviews for more details
    * @return Promise for call details
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getWebhook('<webhook_id>'))
    * .then((webhook) => webhook.getCall('<call-id>'))
    * .then((webhookCall) => console.log(webhookCall))
    * .catch(console.error)
    * ```
    */
  def getCall(id: String): js.Promise[Record[String, _]] = js.native
  
  /**
    * List of the most recent webhook calls. See https://www.contentful.com/developers/docs/references/content-management-api/#/reference/webhook-calls/webhook-call-overviews for more details.
    * @return Promise for list of calls
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getWebhook('<webhook_id>'))
    * .then((webhook) => webhook.getCalls())
    * .then((response) => console.log(response.items)) // webhook calls
    * .catch(console.error)
    * ```
    */
  def getCalls(): js.Promise[Record[String, _]] = js.native
  
  /**
    * Overview of the health of webhook calls. See https://www.contentful.com/developers/docs/references/content-management-api/#/reference/webhook-calls/webhook-call-overviews for more details.
    * @return Promise for health info
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getWebhook('<webhook_id>'))
    * .then((webhook) => webhook.getHealth())
    * .then((webhookHealth) => console.log(webhookHealth))
    * .catch(console.error)
    * ```
    */
  def getHealth(): js.Promise[Record[String, _]] = js.native
  
  /**
    * Sends an update to the server with any changes made to the object's properties
    * @return Object returned from the server with updated changes.
    * ```javascript
    * const contentful = require('contentful-management')
    *
    * const client = contentful.createClient({
    *   accessToken: '<content_management_api_key>'
    * })
    *
    * client.getSpace('<space_id>')
    * .then((space) => space.getWebhook('<webhook_id>'))
    * .then((webhook) => {
    *  webhook.name = 'new webhook name'
    *  return webhook.update()
    * })
    * .then((webhook) => console.log(`webhook ${webhook.sys.id} updated.`))
    * .catch(console.error)
    * ```
    */
  def update(): js.Promise[WebHooks] = js.native
}
object WebHooks {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    getCall: String => js.Promise[Record[String, _]],
    getCalls: () => js.Promise[Record[String, _]],
    getHealth: () => js.Promise[Record[String, _]],
    headers: js.Array[WebhookHeader],
    name: String,
    sys: MetaSysProps,
    toPlainObject: () => WebhookProps,
    topics: js.Array[String],
    update: () => js.Promise[WebHooks],
    url: String
  ): WebHooks = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), getCall = js.Any.fromFunction1(getCall), getCalls = js.Any.fromFunction0(getCalls), getHealth = js.Any.fromFunction0(getHealth), headers = headers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), topics = topics.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHooks]
  }
  
  @scala.inline
  implicit class WebHooksOps[Self <: WebHooks] (val x: Self) extends AnyVal {
    
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
    def setGetCall(value: String => js.Promise[Record[String, _]]): Self = this.set("getCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCalls(value: () => js.Promise[Record[String, _]]): Self = this.set("getCalls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHealth(value: () => js.Promise[Record[String, _]]): Self = this.set("getHealth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => js.Promise[WebHooks]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
