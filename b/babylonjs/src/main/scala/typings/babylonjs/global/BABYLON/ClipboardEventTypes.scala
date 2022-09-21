package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ClipboardEventTypes")
@js.native
open class ClipboardEventTypes ()
  extends StObject
     with typings.babylonjs.BABYLON.ClipboardEventTypes
/* static members */
object ClipboardEventTypes {
  
  /**
    * The clipboard event is fired when a copy command is active (pressed).
    */
  @JSGlobal("BABYLON.ClipboardEventTypes.COPY")
  @js.native
  val COPY: /* 1 */ Double = js.native
  
  /**
    *  The clipboard event is fired when a cut command is active (pressed).
    */
  @JSGlobal("BABYLON.ClipboardEventTypes.CUT")
  @js.native
  val CUT: /* 2 */ Double = js.native
  
  /**
    * The clipboard event is fired when a paste command is active (pressed).
    */
  @JSGlobal("BABYLON.ClipboardEventTypes.PASTE")
  @js.native
  val PASTE: /* 3 */ Double = js.native
}
