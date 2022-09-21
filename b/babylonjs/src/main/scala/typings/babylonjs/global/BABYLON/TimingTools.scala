package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TimingTools")
@js.native
open class TimingTools ()
  extends StObject
     with typings.babylonjs.BABYLON.TimingTools
/* static members */
object TimingTools {
  
  @JSGlobal("BABYLON.TimingTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Polyfill for setImmediate
    * @param action defines the action to execute after the current execution block
    */
  inline def SetImmediate(action: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetImmediate")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
