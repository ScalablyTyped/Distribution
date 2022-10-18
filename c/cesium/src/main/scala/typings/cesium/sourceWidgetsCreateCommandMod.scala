package typings.cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsCreateCommandMod {
  
  @JSImport("cesium/Source/Widgets/createCommand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(func: js.Function1[/* repeated */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(func: js.Function1[/* repeated */ Any, Any], canExecute: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], canExecute.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
