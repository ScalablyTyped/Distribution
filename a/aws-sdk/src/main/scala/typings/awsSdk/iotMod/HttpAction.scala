package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAction extends StObject {
  
  /**
    * The authentication method to use when sending data to an HTTPS endpoint.
    */
  var auth: js.UndefOr[HttpAuthorization] = js.native
  
  /**
    * The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix of the endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use substitution templates in the confirmationUrl, you must create and enable topic rule destinations that match each possible value of the substitution template before traffic is allowed to your endpoint URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.native
  
  /**
    * The HTTP headers to send with the message data.
    */
  var headers: js.UndefOr[HeaderList] = js.native
  
  /**
    * The endpoint URL. If substitution templates are used in the URL, you must also specify a confirmationUrl. If this is a new destination, a new TopicRuleDestination is created if possible.
    */
  var url: Url = js.native
}
object HttpAction {
  
  @scala.inline
  def apply(url: Url): HttpAction = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAction]
  }
  
  @scala.inline
  implicit class HttpActionMutableBuilder[Self <: HttpAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: HttpAuthorization): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setConfirmationUrl(value: Url): Self = StObject.set(x, "confirmationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUrlUndefined: Self = StObject.set(x, "confirmationUrl", js.undefined)
    
    @scala.inline
    def setHeaders(value: HeaderList): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: HttpActionHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
