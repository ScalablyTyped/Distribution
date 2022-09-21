package typings.uvu1yNNGH0U

import typings.uvu.parseMod.Suite
import typings.uvu1yNNGH0U.anon.Bail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDotdDottsMod {
  
  @JSImport(".uvu-1yNNGH0U/run/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def run(suites: js.Array[Suite]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(suites.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def run(suites: js.Array[Suite], options: Bail): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(suites.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
