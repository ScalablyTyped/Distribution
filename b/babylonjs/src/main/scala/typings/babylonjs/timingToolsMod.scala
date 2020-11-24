package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/timingTools", JSImport.Namespace)
@js.native
object timingToolsMod extends js.Object {
  
  @js.native
  class TimingTools () extends js.Object
  /* static members */
  @js.native
  object TimingTools extends js.Object {
    
    /**
      * Polyfill for setImmediate
      * @param action defines the action to execute after the current execution block
      */
    def SetImmediate(action: js.Function0[Unit]): Unit = js.native
  }
}
