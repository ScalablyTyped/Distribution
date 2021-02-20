package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait HttpServer extends Http_ {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Request] = js.native
  
  /**
    * Whether to enable instrumention of <plugin>.middleware spans
    *
    * @default true
    */
  var middleware: js.UndefOr[Boolean] = js.native
}
object HttpServer {
  
  @scala.inline
  def apply(): HttpServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpServer]
  }
  
  @scala.inline
  implicit class HttpServerMutableBuilder[Self <: HttpServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: Request): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setMiddleware(value: Boolean): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
  }
}
