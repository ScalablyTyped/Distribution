package typings.browserSync.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerRouteMiddleware extends StObject {
  
  def handle(req: IncomingMessage, res: ServerResponse, next: js.Function0[Unit]): js.Any = js.native
  @JSName("handle")
  var handle_Original: MiddlewareHandler = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var route: String = js.native
}
