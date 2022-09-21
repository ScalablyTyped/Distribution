package typings.body

import typings.body.anon.Encoding
import typings.body.callbackMod.Callback
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMod {
  
  inline def apply(req: IncomingMessage, cb: Callback[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], cb: Callback[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], opts: Encoding, cb: Callback[Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("body/any", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
