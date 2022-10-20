package typings.bullBoard

import typings.bullBoard.anon.SkipReadOnlyModeCheck
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRoutesMiddlewaresQueueProviderMod {
  
  @JSImport("bull-board/dist/routes/middlewares/queueProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def queueProvider(): js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Promise[Unit | Response]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("queueProvider")().asInstanceOf[js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Promise[Unit | Response]
  ]]
  inline def queueProvider(hasSkipReadOnlyModeCheck: SkipReadOnlyModeCheck): js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Promise[Unit | Response]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("queueProvider")(hasSkipReadOnlyModeCheck.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Promise[Unit | Response]
  ]]
}
