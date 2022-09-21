package typings.blueprintjsCore

import typings.juggleResizeObserver.anon.ReadonlyDOMRectReadOnly
import typings.juggleResizeObserver.domrectreadonlyMod.Rectangle
import typings.juggleResizeObserver.mod.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverTypesMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeObserverTypes", "DOMRectReadOnly")
  @js.native
  open class DOMRectReadOnly protected ()
    extends typings.juggleResizeObserver.domrectreadonlyMod.DOMRectReadOnly {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  object DOMRectReadOnly {
    
    @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeObserverTypes", "DOMRectReadOnly")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromRect(rectangle: Rectangle): ReadonlyDOMRectReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rectangle.asInstanceOf[js.Any]).asInstanceOf[ReadonlyDOMRectReadOnly]
  }
  
  type IDOMRectReadOnly = typings.juggleResizeObserver.domrectreadonlyMod.DOMRectReadOnly
  
  type IResizeEntry = ResizeObserverEntry
  
  type ResizeEntry = IResizeEntry
}
