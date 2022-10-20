package typings.bullBoard

import typings.expressServeStaticCore.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRoutesMiddlewaresWrapAsyncMod {
  
  @JSImport("bull-board/dist/routes/middlewares/wrapAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapAsync[Params /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParamsDictionary */ Any */](fn: RequestHandler): RequestHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
}
