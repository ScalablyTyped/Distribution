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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhookMod {
  
  @JSImport("contentful-management/dist/typings/entities/webhook", "wrapWebhook")
  @js.native
  def wrapWebhook(http: AxiosInstance, data: WebhookProps): WebHooks = js.native
  
  @JSImport("contentful-management/dist/typings/entities/webhook", "wrapWebhookCollection")
  @js.native
  def wrapWebhookCollection(http: AxiosInstance, data: CollectionProp[WebhookProps]): Collection[WebHooks, WebhookProps] = js.native
  
  @js.native
  trait Doc extends StObject {
    
    var doc: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid = js.native
  }
  object Doc {
    
    @scala.inline
    def apply(doc: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid): Doc = {
      val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
      __obj.asInstanceOf[Doc]
    }
    
    @scala.inline
    implicit class DocMutableBuilder[Self <: Doc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoc(value: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EqualityConstraint extends WebhookFilter {
    
    @JSName("equals")
    var equals_FEqualityConstraint: js.Tuple2[Doc, String] = js.native
  }
  object EqualityConstraint {
    
    @scala.inline
    def apply(equals_ : js.Tuple2[Doc, String]): EqualityConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[EqualityConstraint]
    }
    
    @scala.inline
    implicit class EqualityConstraintMutableBuilder[Self <: EqualityConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: js.Tuple2[Doc, String]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InConstraint extends WebhookFilter {
    
    var in: js.Tuple2[Doc, Array[String]] = js.native
  }
  object InConstraint {
    
    @scala.inline
    def apply(in: js.Tuple2[Doc, Array[String]]): InConstraint = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[InConstraint]
    }
    
    @scala.inline
    implicit class InConstraintMutableBuilder[Self <: InConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Tuple2[Doc, Array[String]]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotConstraint extends WebhookFilter {
    
    var not: EqualityConstraint | InConstraint | RegexpConstraint = js.native
  }
  object NotConstraint {
    
    @scala.inline
    def apply(not: EqualityConstraint | InConstraint | RegexpConstraint): NotConstraint = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotConstraint]
    }
    
    @scala.inline
    implicit class NotConstraintMutableBuilder[Self <: NotConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNot(value: EqualityConstraint | InConstraint | RegexpConstraint): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pattern extends StObject {
    
    var pattern: String = js.native
  }
  object Pattern {
    
    @scala.inline
    def apply(pattern: String): Pattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegexpConstraint extends WebhookFilter {
    
    var regexp: js.Tuple2[Doc, Pattern] = js.native
  }
  object RegexpConstraint {
    
    @scala.inline
    def apply(regexp: js.Tuple2[Doc, Pattern]): RegexpConstraint = {
      val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexpConstraint]
    }
    
    @scala.inline
    implicit class RegexpConstraintMutableBuilder[Self <: RegexpConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegexp(value: js.Tuple2[Doc, Pattern]): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class WebHooksMutableBuilder[Self <: WebHooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCall(value: String => js.Promise[Record[String, _]]): Self = StObject.set(x, "getCall", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCalls(value: () => js.Promise[Record[String, _]]): Self = StObject.set(x, "getCalls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHealth(value: () => js.Promise[Record[String, _]]): Self = StObject.set(x, "getHealth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[WebHooks]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
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
    
    @scala.inline
    def EqualityConstraint(equals_ : js.Tuple2[Doc, String]): typings.contentfulManagement.webhookMod.EqualityConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.EqualityConstraint]
    }
    
    @scala.inline
    def InConstraint(in: js.Tuple2[Doc, Array[String]]): typings.contentfulManagement.webhookMod.InConstraint = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.InConstraint]
    }
    
    @scala.inline
    def NotConstraint(not: EqualityConstraint | InConstraint | RegexpConstraint): typings.contentfulManagement.webhookMod.NotConstraint = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.NotConstraint]
    }
    
    @scala.inline
    def RegexpConstraint(regexp: js.Tuple2[Doc, Pattern]): typings.contentfulManagement.webhookMod.RegexpConstraint = {
      val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contentfulManagement.webhookMod.RegexpConstraint]
    }
  }
  
  @js.native
  trait WebhookHeader extends StObject {
    
    var key: String = js.native
    
    var secret: js.UndefOr[Boolean] = js.native
    
    var value: String = js.native
  }
  object WebhookHeader {
    
    @scala.inline
    def apply(key: String, value: String): WebhookHeader = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookHeader]
    }
    
    @scala.inline
    implicit class WebhookHeaderMutableBuilder[Self <: WebhookHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebhookProps extends StObject {
    
    /**
      * Webhook filters
      */
    var filters: js.UndefOr[js.Array[WebhookFilter]] = js.native
    
    /**
      * Headers that should be appended to the webhook request
      */
    var headers: js.Array[WebhookHeader] = js.native
    
    /**
      * Password for basic http auth
      */
    var httpBasicPassword: js.UndefOr[String] = js.native
    
    /**
      * Username for basic http auth
      */
    var httpBasicUsername: js.UndefOr[String] = js.native
    
    /**
      * Webhook name
      */
    var name: String = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysProps = js.native
    
    /**
      * Topics the webhook wants to subscribe to
      */
    var topics: js.Array[String] = js.native
    
    /**
      * Transformation to apply
      */
    var transformation: js.UndefOr[WebhookTransformation] = js.native
    
    /**
      * Webhook url
      */
    var url: String = js.native
  }
  object WebhookProps {
    
    @scala.inline
    def apply(
      headers: js.Array[WebhookHeader],
      name: String,
      sys: MetaSysProps,
      topics: js.Array[String],
      url: String
    ): WebhookProps = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookProps]
    }
    
    @scala.inline
    implicit class WebhookPropsMutableBuilder[Self <: WebhookProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[WebhookFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: WebhookFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: js.Array[WebhookHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: WebhookHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setHttpBasicPassword(value: String): Self = StObject.set(x, "httpBasicPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpBasicPasswordUndefined: Self = StObject.set(x, "httpBasicPassword", js.undefined)
      
      @scala.inline
      def setHttpBasicUsername(value: String): Self = StObject.set(x, "httpBasicUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpBasicUsernameUndefined: Self = StObject.set(x, "httpBasicUsername", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
      
      @scala.inline
      def setTransformation(value: WebhookTransformation): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebhookTransformation extends StObject {
    
    var body: js.UndefOr[JsonValue] = js.native
    
    var contentType: js.UndefOr[
        Null | applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson | (`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`) | applicationSlashjson | (`applicationSlashjsonSemicolon charsetEqualssignutf-8`) | `applicationSlashx-www-form-urlencoded` | (`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`)
      ] = js.native
    
    var includeContentLength: js.UndefOr[Boolean | Null] = js.native
    
    var method: js.UndefOr[Null | POST | GET | PUT | PATCH | DELETE] = js.native
  }
  object WebhookTransformation {
    
    @scala.inline
    def apply(): WebhookTransformation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookTransformation]
    }
    
    @scala.inline
    implicit class WebhookTransformationMutableBuilder[Self <: WebhookTransformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: JsonValue): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setContentType(
        value: applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson | (`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`) | applicationSlashjson | (`applicationSlashjsonSemicolon charsetEqualssignutf-8`) | `applicationSlashx-www-form-urlencoded` | (`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`)
      ): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setIncludeContentLength(value: Boolean): Self = StObject.set(x, "includeContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContentLengthNull: Self = StObject.set(x, "includeContentLength", null)
      
      @scala.inline
      def setIncludeContentLengthUndefined: Self = StObject.set(x, "includeContentLength", js.undefined)
      
      @scala.inline
      def setMethod(value: POST | GET | PUT | PATCH | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodNull: Self = StObject.set(x, "method", null)
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
}
