package typings.bullBoard

import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRoutesHandlersErrorHandlerMod {
  
  @JSImport("bull-board/dist/routes/handlers/errorHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorHandler(err: js.Error, _req: Request, res: Response, _next: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(err.asInstanceOf[js.Any], _req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], _next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
