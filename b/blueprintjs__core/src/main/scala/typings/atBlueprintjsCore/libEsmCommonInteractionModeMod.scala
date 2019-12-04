package typings.atBlueprintjsCore

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/interactionMode", JSImport.Namespace)
@js.native
object libEsmCommonInteractionModeMod extends js.Object {
  @js.native
  class InteractionModeEngine protected () extends js.Object {
    def this(container: Element, className: String) = this()
    var className: js.Any = js.native
    var container: js.Any = js.native
    var handleKeyDown: js.Any = js.native
    var handleMouseDown: js.Any = js.native
    var isRunning: js.Any = js.native
    var reset: js.Any = js.native
    /** Returns whether the engine is currently running. */
    def isActive(): Boolean = js.native
    /** Enable behavior which applies the given className when in mouse mode. */
    def start(): Unit = js.native
    /** Disable interaction mode behavior and remove className from container. */
    def stop(): Unit = js.native
  }
  
}

