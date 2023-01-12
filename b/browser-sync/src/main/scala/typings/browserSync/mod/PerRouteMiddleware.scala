package typings.browserSync.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerRouteMiddleware extends StObject {
  
  def handle(req: IncomingMessage, res: ServerResponse[IncomingMessage], next: js.Function0[Unit]): Any
  @JSName("handle")
  var handle_Original: MiddlewareHandler
  
  var id: js.UndefOr[String] = js.undefined
  
  var route: String
}
object PerRouteMiddleware {
  
  inline def apply(
    handle: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* next */ js.Function0[Unit]) => Any,
    route: String
  ): PerRouteMiddleware = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction3(handle), route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerRouteMiddleware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerRouteMiddleware] (val x: Self) extends AnyVal {
    
    inline def setHandle(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* next */ js.Function0[Unit]) => Any
    ): Self = StObject.set(x, "handle", js.Any.fromFunction3(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
