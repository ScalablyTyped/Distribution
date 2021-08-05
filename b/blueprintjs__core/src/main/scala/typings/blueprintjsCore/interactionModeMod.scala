package typings.blueprintjsCore

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionModeMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/interactionMode", "InteractionModeEngine")
  @js.native
  class InteractionModeEngine protected () extends StObject {
    def this(container: Element, className: String) = this()
    
    /* private */ var className: js.Any = js.native
    
    /* private */ var container: js.Any = js.native
    
    /* private */ var handleKeyDown: js.Any = js.native
    
    /* private */ var handleMouseDown: js.Any = js.native
    
    /** Returns whether the engine is currently running. */
    def isActive(): Boolean = js.native
    
    /* private */ var isRunning: js.Any = js.native
    
    /* private */ var reset: js.Any = js.native
    
    /** Enable behavior which applies the given className when in mouse mode. */
    def start(): Unit = js.native
    
    /** Disable interaction mode behavior and remove className from container. */
    def stop(): Unit = js.native
  }
}
