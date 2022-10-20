package typings.bullBoard

import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRoutesMiddlewaresJobProviderMod {
  
  @JSImport("bull-board/dist/routes/middlewares/jobProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jobProvider(): js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Promise[Unit | Response]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("jobProvider")().asInstanceOf[js.Function3[
    /* req */ Request, 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Promise[Unit | Response]
  ]]
}
