package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.DELETE
import typings.contentfulManagement.contentfulManagementStrings.GET
import typings.contentfulManagement.contentfulManagementStrings.PATCH
import typings.contentfulManagement.contentfulManagementStrings.POST
import typings.contentfulManagement.contentfulManagementStrings.PUT
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashjsonSemicolon charsetEqualssignutf-8`
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`
import typings.contentfulManagement.contentfulManagementStrings.`applicationSlashx-www-form-urlencoded`
import typings.contentfulManagement.contentfulManagementStrings.applicationSlashjson
import typings.contentfulManagement.contentfulManagementStrings.applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson
import typings.contentfulManagement.contentfulManagementStrings.sysDotcontentTypeDotsysDotid
import typings.contentfulManagement.contentfulManagementStrings.sysDotenvironmentDotsysDotid
import typings.contentfulManagement.contentfulManagementStrings.sysDotid
import typings.std.Record
import typings.typeFest.basicMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhookMod {
  
  @JSImport("contentful-management/dist/typings/entities/webhook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapWebhook(http: AxiosInstance, data: WebhookProps): WebHooks = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapWebhook")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[WebHooks]
  
  inline def wrapWebhookCollection(http: AxiosInstance, data: CollectionProp[WebhookProps]): Collection[WebHooks, WebhookProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapWebhookCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[WebHooks, WebhookProps]]
  
  trait Doc extends StObject {
    
    var doc: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid
  }
  object Doc {
    
    inline def apply(doc: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid): Doc = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Doc]
    }
    
    extension [Self <: Doc](x: Self) {
      
      inline def setDoc(value: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    }
  }
  
  trait EqualityConstraint
    extends StObject
       with WebhookFilter {
    
    @JSName("equals")
    var equals_FEqualityConstraint: js.Tuple2[Doc, String]
  }
  object EqualityConstraint {
    
    inline def apply(equals_ : js.Tuple2[Doc, String]): EqualityConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[EqualityConstraint]
    }
    
    extension [Self <: EqualityConstraint](x: Self) {
      
      inline def setEquals_(value: js.Tuple2[Doc, String]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    }
  }
  
  trait InConstraint
    extends StObject
       with WebhookFilter {
    
    var in: js.Tuple2[Doc, Array[String]]
  }
  object InConstraint {
    
    inline def apply(in: js.Tuple2[Doc, Array[String]]): InConstraint = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[InConstraint]
    }
    
    extension [Self <: InConstraint](x: Self) {
      
      inline def setIn(value: js.Tuple2[Doc, Array[String]]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotConstraint
    extends StObject
       with WebhookFilter {
    
    var not: EqualityConstraint | InConstraint | RegexpConstraint
  }
  object NotConstraint {
    
    inline def apply(not: EqualityConstraint | InConstraint | RegexpConstraint): NotConstraint = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotConstraint]
    }
    
    extension [Self <: NotConstraint](x: Self) {
      
      inline def setNot(value: EqualityConstraint | InConstraint | RegexpConstraint): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pattern extends StObject {
    
    var pattern: String
  }
  object Pattern {
    
    inline def apply(pattern: String): Pattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegexpConstraint
    extends StObject
       with WebhookFilter {
    
    var regexp: js.Tuple2[Doc, Pattern]
  }
  object RegexpConstraint {
    
    inline def apply(regexp: js.Tuple2[Doc, Pattern]): RegexpConstraint = {
      val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexpConstraint]
    }
    
    extension [Self <: RegexpConstraint](x: Self) {
      
      inline def setRegexp(value: js.Tuple2[Doc, Pattern]): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebHooks
    extends StObject
       with WebhookProps
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
    def delete(): js.Promise[Unit]
    
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
    def getCall(id: String): js.Promise[Record[String, js.Any]]
    
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
    def getCalls(): js.Promise[Record[String, js.Any]]
    
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
    def getHealth(): js.Promise[Record[String, js.Any]]
    
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
    def update(): js.Promise[WebHooks]
  }
  object WebHooks {
    
    inline def apply(
      delete: () => js.Promise[Unit],
      getCall: String => js.Promise[Record[String, js.Any]],
      getCalls: () => js.Promise[Record[String, js.Any]],
      getHealth: () => js.Promise[Record[String, js.Any]],
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
    
    extension [Self <: WebHooks](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      inline def setGetCall(value: String => js.Promise[Record[String, js.Any]]): Self = StObject.set(x, "getCall", js.Any.fromFunction1(value))
      
      inline def setGetCalls(value: () => js.Promise[Record[String, js.Any]]): Self = StObject.set(x, "getCalls", js.Any.fromFunction0(value))
      
      inline def setGetHealth(value: () => js.Promise[Record[String, js.Any]]): Self = StObject.set(x, "getHealth", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[WebHooks]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.webhookMod.EqualityConstraint
    - typings.contentfulManagement.webhookMod.InConstraint
    - typings.contentfulManagement.webhookMod.RegexpConstraint
    - typings.contentfulManagement.webhookMod.NotConstraint
  */
  trait WebhookFilter extends StObject
  object WebhookFilter {
    
    inline def EqualityConstraint(equals_ : js.Tuple2[Doc, String]): typings.contentfulManagement.webhookMod.EqualityConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.EqualityConstraint]
    }
    
    inline def InConstraint(in: js.Tuple2[Doc, Array[String]]): typings.contentfulManagement.webhookMod.InConstraint = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.InConstraint]
    }
    
    inline def NotConstraint(not: EqualityConstraint | InConstraint | RegexpConstraint): typings.contentfulManagement.webhookMod.NotConstraint = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.NotConstraint]
    }
    
    inline def RegexpConstraint(regexp: js.Tuple2[Doc, Pattern]): typings.contentfulManagement.webhookMod.RegexpConstraint = {
      val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.RegexpConstraint]
    }
  }
  
  trait WebhookHeader extends StObject {
    
    var key: String
    
    var secret: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object WebhookHeader {
    
    inline def apply(key: String, value: String): WebhookHeader = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookHeader]
    }
    
    extension [Self <: WebhookHeader](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookProps extends StObject {
    
    /**
      * Webhook filters
      */
    var filters: js.UndefOr[js.Array[WebhookFilter]] = js.undefined
    
    /**
      * Headers that should be appended to the webhook request
      */
    var headers: js.Array[WebhookHeader]
    
    /**
      * Password for basic http auth
      */
    var httpBasicPassword: js.UndefOr[String] = js.undefined
    
    /**
      * Username for basic http auth
      */
    var httpBasicUsername: js.UndefOr[String] = js.undefined
    
    /**
      * Webhook name
      */
    var name: String
    
    /**
      * System metadata
      */
    var sys: MetaSysProps
    
    /**
      * Topics the webhook wants to subscribe to
      */
    var topics: js.Array[String]
    
    /**
      * Transformation to apply
      */
    var transformation: js.UndefOr[WebhookTransformation] = js.undefined
    
    /**
      * Webhook url
      */
    var url: String
  }
  object WebhookProps {
    
    inline def apply(
      headers: js.Array[WebhookHeader],
      name: String,
      sys: MetaSysProps,
      topics: js.Array[String],
      url: String
    ): WebhookProps = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookProps]
    }
    
    extension [Self <: WebhookProps](x: Self) {
      
      inline def setFilters(value: js.Array[WebhookFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: WebhookFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setHeaders(value: js.Array[WebhookHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: WebhookHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setHttpBasicPassword(value: String): Self = StObject.set(x, "httpBasicPassword", value.asInstanceOf[js.Any])
      
      inline def setHttpBasicPasswordUndefined: Self = StObject.set(x, "httpBasicPassword", js.undefined)
      
      inline def setHttpBasicUsername(value: String): Self = StObject.set(x, "httpBasicUsername", value.asInstanceOf[js.Any])
      
      inline def setHttpBasicUsernameUndefined: Self = StObject.set(x, "httpBasicUsername", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
      
      inline def setTransformation(value: WebhookTransformation): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
      
      inline def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebhookTransformation extends StObject {
    
    var body: js.UndefOr[JsonValue] = js.undefined
    
    var contentType: js.UndefOr[
        Null | applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson | (`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`) | applicationSlashjson | (`applicationSlashjsonSemicolon charsetEqualssignutf-8`) | `applicationSlashx-www-form-urlencoded` | (`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`)
      ] = js.undefined
    
    var includeContentLength: js.UndefOr[Boolean | Null] = js.undefined
    
    var method: js.UndefOr[Null | POST | GET | PUT | PATCH | DELETE] = js.undefined
  }
  object WebhookTransformation {
    
    inline def apply(): WebhookTransformation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookTransformation]
    }
    
    extension [Self <: WebhookTransformation](x: Self) {
      
      inline def setBody(value: JsonValue): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setContentType(
        value: applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson | (`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`) | applicationSlashjson | (`applicationSlashjsonSemicolon charsetEqualssignutf-8`) | `applicationSlashx-www-form-urlencoded` | (`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`)
      ): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setIncludeContentLength(value: Boolean): Self = StObject.set(x, "includeContentLength", value.asInstanceOf[js.Any])
      
      inline def setIncludeContentLengthNull: Self = StObject.set(x, "includeContentLength", null)
      
      inline def setIncludeContentLengthUndefined: Self = StObject.set(x, "includeContentLength", js.undefined)
      
      inline def setMethod(value: POST | GET | PUT | PATCH | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodNull: Self = StObject.set(x, "method", null)
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
