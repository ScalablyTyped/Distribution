package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [http](https://nodejs.org/api/http.html) module.
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
- typings.ddTrace.mod.plugins.HttpServer because var conflicts: allowlist, blacklist, blocklist, enabled, headers, hooks, measured, service, validateStatus, whitelist. Inlined middleware */ trait http
  extends StObject
     with HttpClient {
  
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[HttpClient | Boolean] = js.undefined
  
  /**
    * Hooks to run before spans are finished.
    */
  @JSName("hooks")
  var hooks_http: js.UndefOr[`2`] = js.undefined
  
  /**
    * Whether to enable instrumentation of <plugin>.middleware spans
    *
    * @default true
    */
  var middleware: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[HttpServer | Boolean] = js.undefined
}
object http {
  
  inline def apply(): http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[http]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: http] (val x: Self) extends AnyVal {
    
    inline def setClient(value: HttpClient | Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setHooks(value: `2`): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setMiddleware(value: Boolean): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setServer(value: HttpServer | Boolean): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
