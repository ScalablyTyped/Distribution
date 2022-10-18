package typings.blackEngine

import typings.blackEngine.displayGraphicsGradientMod.GraphicsGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayGraphicsLinearGradientMod {
  
  @JSImport("black-engine/display/GraphicsLinearGradient", "GraphicsLinearGradient")
  @js.native
  open class GraphicsLinearGradient protected () extends GraphicsGradient {
    def this(x0: Double, y0: Double, x1: Double, y1: Double) = this()
    
    def addColorStop(percent: Any, color: Any): Unit = js.native
    
    var isAbsolute: Boolean = js.native
    
    var x0: Double = js.native
    
    var x1: Double = js.native
    
    var y0: Double = js.native
    
    var y1: Double = js.native
  }
}
