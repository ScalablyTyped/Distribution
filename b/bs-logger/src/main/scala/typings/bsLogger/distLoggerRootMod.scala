package typings.bsLogger

import typings.bsLogger.distLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoggerRootMod {
  
  @JSImport("bs-logger/dist/logger/root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger/dist/logger/root", "rootLogger")
  @js.native
  val rootLogger: Logger = js.native
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  inline def setup(factory: js.Function0[Logger]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(factory.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
