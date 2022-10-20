package typings.bullBoard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUiHooksUseIntervalMod {
  
  @JSImport("bull-board/dist/ui/hooks/useInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInterval(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useInterval(callback: js.Function0[Unit], delay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useInterval(callback: js.Function0[Unit], delay: Double, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useInterval(callback: js.Function0[Unit], delay: Null, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
