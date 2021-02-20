package typings.contentfulManagement.anon

import typings.contentfulManagement.webhookMod.WebhookFilter
import typings.contentfulManagement.webhookMod.WebhookHeader
import typings.contentfulManagement.webhookMod.WebhookTransformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/webhook.WebhookProps, 'sys'> */
@js.native
trait OmitWebhookPropssys extends StObject {
  
  var filters: js.UndefOr[js.Array[WebhookFilter]] = js.native
  
  var headers: js.Array[WebhookHeader] = js.native
  
  var httpBasicPassword: js.UndefOr[String] = js.native
  
  var httpBasicUsername: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var topics: js.Array[String] = js.native
  
  var transformation: js.UndefOr[WebhookTransformation] = js.native
  
  var url: String = js.native
}
object OmitWebhookPropssys {
  
  @scala.inline
  def apply(headers: js.Array[WebhookHeader], name: String, topics: js.Array[String], url: String): OmitWebhookPropssys = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitWebhookPropssys]
  }
  
  @scala.inline
  implicit class OmitWebhookPropssysMutableBuilder[Self <: OmitWebhookPropssys] (val x: Self) extends AnyVal {
    
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
