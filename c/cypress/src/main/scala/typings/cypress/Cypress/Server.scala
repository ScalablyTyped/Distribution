package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Server
  extends StObject
     with RouteOptions {
  
  var enable: Boolean
  
  def ignore(xhr: Any): Boolean
}
object Server {
  
  inline def apply(
    delay: Double,
    enable: Boolean,
    force404: Boolean,
    ignore: Any => Boolean,
    method: HttpMethod,
    onAbort: /* repeated */ Any => Unit,
    onRequest: /* repeated */ Any => Unit,
    onResponse: /* repeated */ Any => Unit,
    response: Any,
    status: Double,
    url: String | js.RegExp
  ): Server = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], force404 = force404.asInstanceOf[js.Any], ignore = js.Any.fromFunction1(ignore), method = method.asInstanceOf[js.Any], onAbort = js.Any.fromFunction1(onAbort), onRequest = js.Any.fromFunction1(onRequest), onResponse = js.Any.fromFunction1(onResponse), response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], headers = null)
    __obj.asInstanceOf[Server]
  }
  
  extension [Self <: Server](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: Any => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
  }
}
