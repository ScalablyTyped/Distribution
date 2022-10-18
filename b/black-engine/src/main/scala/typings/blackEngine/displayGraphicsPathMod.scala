package typings.blackEngine

import typings.blackEngine.geomRectangleMod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayGraphicsPathMod {
  
  @JSImport("black-engine/display/GraphicsPath", "GraphicsPath")
  @js.native
  open class GraphicsPath () extends StObject {
    
    var bounds: Rectangle | Null = js.native
    
    var lastLineWidth: Double = js.native
    
    var lineMul: Double = js.native
    
    var maxLineWidth: Double = js.native
    
    var points: js.Array[Double] = js.native
  }
}
