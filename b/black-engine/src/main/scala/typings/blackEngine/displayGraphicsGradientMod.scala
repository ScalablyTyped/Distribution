package typings.blackEngine

import typings.std.CanvasGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayGraphicsGradientMod {
  
  @JSImport("black-engine/display/GraphicsGradient", "GraphicsGradient")
  @js.native
  open class GraphicsGradient () extends StObject {
    
    def addColorStop(offset: Double, color: String): Unit = js.native
    
    var native: CanvasGradient | Null = js.native
    
    var stops: Any = js.native
  }
}
