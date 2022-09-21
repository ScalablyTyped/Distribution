package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait HttpServer
  extends StObject
     with Http_ {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Request] = js.undefined
  
  /**
    * Whether to enable instrumentation of <plugin>.middleware spans
    *
    * @default true
    */
  var middleware: js.UndefOr[Boolean] = js.undefined
}
object HttpServer {
  
  inline def apply(): HttpServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpServer]
  }
  
  extension [Self <: HttpServer](x: Self) {
    
    inline def setHooks(value: Request): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setMiddleware(value: Boolean): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
  }
}
