package typings.blueprintjsCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionModeMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/interactionMode", "InteractionModeEngine")
  @js.native
  open class InteractionModeEngine protected () extends StObject {
    def this(container: HTMLElement, className: String) = this()
    
    /* private */ var className: Any = js.native
    
    /* private */ var container: Any = js.native
    
    /* private */ var handleKeyDown: Any = js.native
    
    /* private */ var handleMouseDown: Any = js.native
    
    /** Returns whether the engine is currently running. */
    def isActive(): Boolean = js.native
    
    /* private */ var isRunning: Any = js.native
    
    /* private */ var reset: Any = js.native
    
    /** Enable behavior which applies the given className when in mouse mode. */
    def start(): Unit = js.native
    
    /** Disable interaction mode behavior and remove className from container. */
    def stop(): Unit = js.native
  }
}
