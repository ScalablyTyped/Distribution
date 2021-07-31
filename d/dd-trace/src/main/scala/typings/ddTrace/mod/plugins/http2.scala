package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [http2](https://nodejs.org/api/http2.html) module.
  *
  * By default any option set at the root will apply to both clients and
  * servers. To configure only one or the other, use the `client` and `server`
  * options.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ddTrace.mod.Analyzable because Already inherited
- typings.ddTrace.mod.plugins.Integration because Already inherited
- typings.ddTrace.mod.plugins.Instrumentation because Already inherited
- typings.ddTrace.mod.plugins.Http_ because Already inherited
- typings.ddTrace.mod.plugins.Http2Server because var conflicts: analytics, blacklist, enabled, headers, service, validateStatus, whitelist. Inlined  */ trait http2
  extends StObject
     with Http2Client {
  
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[Http2Client] = js.undefined
  
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[Http2Server] = js.undefined
}
object http2 {
  
  @scala.inline
  def apply(): http2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[http2]
  }
  
  @scala.inline
  implicit class http2MutableBuilder[Self <: http2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: Http2Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setServer(value: Http2Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
