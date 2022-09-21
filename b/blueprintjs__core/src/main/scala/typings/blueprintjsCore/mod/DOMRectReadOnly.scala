package typings.blueprintjsCore.mod

import typings.juggleResizeObserver.anon.ReadonlyDOMRectReadOnly
import typings.juggleResizeObserver.domrectreadonlyMod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "DOMRectReadOnly")
@js.native
open class DOMRectReadOnly protected ()
  extends typings.blueprintjsCore.componentsMod.DOMRectReadOnly {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}
object DOMRectReadOnly {
  
  @JSImport("@blueprintjs/core", "DOMRectReadOnly")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromRect(rectangle: Rectangle): ReadonlyDOMRectReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rectangle.asInstanceOf[js.Any]).asInstanceOf[ReadonlyDOMRectReadOnly]
}
