package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timingToolsMod {
  
  @JSImport("babylonjs/Misc/timingTools", "TimingTools")
  @js.native
  class TimingTools () extends StObject
  /* static members */
  object TimingTools {
    
    /**
      * Polyfill for setImmediate
      * @param action defines the action to execute after the current execution block
      */
    @JSImport("babylonjs/Misc/timingTools", "TimingTools.SetImmediate")
    @js.native
    def SetImmediate(action: js.Function0[Unit]): Unit = js.native
  }
}
