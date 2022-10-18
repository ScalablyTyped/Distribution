package typings.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.typesNetStubbingMod.CyHttpMessages.IncomingHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var command: Any
  
  var handler: RouteHandler
  
  var hitCount: Double
  
  var log: Any
  
  var options: RouteMatcherOptions
  
  var requests: StringDictionary[Interception]
}
object Route {
  
  inline def apply(
    command: Any,
    handler: RouteHandler,
    hitCount: Double,
    log: Any,
    options: RouteMatcherOptions,
    requests: StringDictionary[Interception]
  ): Route = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], hitCount = hitCount.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCommand(value: Any): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: RouteHandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerFunction1(value: /* req */ IncomingHttpRequest => Unit | js.Promise[Unit]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    
    inline def setHitCount(value: Double): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    
    inline def setLog(value: Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RouteMatcherOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: StringDictionary[Interception]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
  }
}
