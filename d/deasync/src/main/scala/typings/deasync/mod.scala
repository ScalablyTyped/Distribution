package typings.deasync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @JSImport("deasync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loopWhile(pred: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loopWhile")(pred.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runLoopOnce(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runLoopOnce")().asInstanceOf[Unit]
  
  inline def sleep(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
