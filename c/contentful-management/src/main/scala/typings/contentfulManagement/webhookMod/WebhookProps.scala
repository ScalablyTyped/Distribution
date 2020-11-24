package typings.contentfulManagement.webhookMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookProps extends js.Object {
  
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
  implicit class WebhookPropsOps[Self <: WebhookProps] (val x: Self) extends AnyVal {
    
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
    def setHeadersVarargs(value: WebhookHeader*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[WebhookHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsVarargs(value: String*): Self = this.set("topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: js.Array[String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: WebhookFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[WebhookFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setHttpBasicPassword(value: String): Self = this.set("httpBasicPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpBasicPassword: Self = this.set("httpBasicPassword", js.undefined)
    
    @scala.inline
    def setHttpBasicUsername(value: String): Self = this.set("httpBasicUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpBasicUsername: Self = this.set("httpBasicUsername", js.undefined)
    
    @scala.inline
    def setTransformation(value: WebhookTransformation): Self = this.set("transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformation: Self = this.set("transformation", js.undefined)
  }
}
