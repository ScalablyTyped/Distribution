package typings.cypress.anon

import typings.cypress.typesNetStubbingMod.DictMatcher
import typings.cypress.typesNetStubbingMod.NumberMatcher
import typings.cypress.typesNetStubbingMod.StringMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.Omit<cypress.cypress/types/net-stubbing.RouteMatcherOptions, 'url'> */
trait OmitRouteMatcherOptionsur extends StObject {
  
  var auth: js.UndefOr[Password] = js.undefined
  
  var headers: js.UndefOr[DictMatcher[StringMatcher]] = js.undefined
  
  var hostname: js.UndefOr[StringMatcher] = js.undefined
  
  var https: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[StringMatcher] = js.undefined
  
  var middleware: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[StringMatcher] = js.undefined
  
  var pathname: js.UndefOr[StringMatcher] = js.undefined
  
  var port: js.UndefOr[NumberMatcher] = js.undefined
  
  var query: js.UndefOr[DictMatcher[StringMatcher]] = js.undefined
  
  var times: js.UndefOr[Double] = js.undefined
}
object OmitRouteMatcherOptionsur {
  
  inline def apply(): OmitRouteMatcherOptionsur = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitRouteMatcherOptionsur]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitRouteMatcherOptionsur] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHeaders(value: DictMatcher[StringMatcher]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHostname(value: StringMatcher): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setMethod(value: StringMatcher): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMiddleware(value: Boolean): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
    
    inline def setPath(value: StringMatcher): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathname(value: StringMatcher): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setPort(value: NumberMatcher): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPortVarargs(value: Double*): Self = StObject.set(x, "port", js.Array(value*))
    
    inline def setQuery(value: DictMatcher[StringMatcher]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
