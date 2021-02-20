package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectActionConfig extends StObject {
  
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
    */
  var Host: js.UndefOr[RedirectActionHost] = js.native
  
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
    */
  var Path: js.UndefOr[RedirectActionPath] = js.native
  
  /**
    * The port. You can specify a value from 1 to 65535 or #{port}.
    */
  var Port: js.UndefOr[RedirectActionPort] = js.native
  
  /**
    * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
    */
  var Protocol: js.UndefOr[RedirectActionProtocol] = js.native
  
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it is automatically added. You can specify any of the reserved keywords.
    */
  var Query: js.UndefOr[RedirectActionQuery] = js.native
  
  /**
    * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
    */
  var StatusCode: RedirectActionStatusCodeEnum = js.native
}
object RedirectActionConfig {
  
  @scala.inline
  def apply(StatusCode: RedirectActionStatusCodeEnum): RedirectActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectActionConfig]
  }
  
  @scala.inline
  implicit class RedirectActionConfigMutableBuilder[Self <: RedirectActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: RedirectActionHost): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    @scala.inline
    def setPath(value: RedirectActionPath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setPort(value: RedirectActionPort): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setProtocol(value: RedirectActionProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: RedirectActionQuery): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
    
    @scala.inline
    def setStatusCode(value: RedirectActionStatusCodeEnum): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
  }
}
