package typings.cypress.typesNetStubbingMod

import typings.cypress.anon.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteMatcherOptionsGeneric[S] extends StObject {
  
  /**
    * Match against the username and password used in HTTP Basic authentication.
    */
  var auth: js.UndefOr[Username[S]] = js.undefined
  
  /**
    * Match against HTTP headers on the request.
    */
  var headers: js.UndefOr[DictMatcher[S]] = js.undefined
  
  /**
    * Match against the requested HTTP hostname.
    */
  var hostname: js.UndefOr[S] = js.undefined
  
  /**
    * If 'true', only HTTPS requests will be matched.
    * If 'false', only HTTP requests will be matched.
    */
  var https: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Match against the request's HTTP method.
    * @default '*'
    */
  var method: js.UndefOr[S] = js.undefined
  
  /**
    * If `true`, this handler will be called before any non-`middleware` handlers, in the order it was defined.
    * Can only be used with a dynamic request handler.
    * @default false
    */
  var middleware: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Match on request path after the hostname, including query params.
    */
  var path: js.UndefOr[S] = js.undefined
  
  /**
    * Matches like `path`, but without query params.
    */
  var pathname: js.UndefOr[S] = js.undefined
  
  /**
    * Match based on requested port, or pass an array of ports
    * to match against any in that array.
    */
  var port: js.UndefOr[NumberMatcher] = js.undefined
  
  /**
    * Match on parsed querystring parameters.
    */
  var query: js.UndefOr[DictMatcher[S]] = js.undefined
  
  /**
    * If set, this `RouteMatcher` will only match the first `times` requests.
    */
  var times: js.UndefOr[Double] = js.undefined
  
  /**
    * Match against the full request URL.
    * If a string is passed, it will be used as a substring match,
    * not an equality match.
    */
  var url: js.UndefOr[S] = js.undefined
}
object RouteMatcherOptionsGeneric {
  
  inline def apply[S](): RouteMatcherOptionsGeneric[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteMatcherOptionsGeneric[S]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteMatcherOptionsGeneric[?], S] (val x: Self & RouteMatcherOptionsGeneric[S]) extends AnyVal {
    
    inline def setAuth(value: Username[S]): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHeaders(value: DictMatcher[S]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHostname(value: S): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setMethod(value: S): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMiddleware(value: Boolean): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setPath(value: S): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathname(value: S): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setPort(value: NumberMatcher): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPortVarargs(value: Double*): Self = StObject.set(x, "port", js.Array(value*))
    
    inline def setQuery(value: DictMatcher[S]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    
    inline def setUrl(value: S): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
