package typings.blackEngine

import typings.std.CanvasPattern
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayGraphicsPatternMod {
  
  @JSImport("black-engine/display/GraphicsPattern", "GraphicsPattern")
  @js.native
  open class GraphicsPattern protected () extends StObject {
    def this(image: Any, repetition: Any) = this()
    
    var image: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
    
    var native: CanvasPattern | Null = js.native
    
    var repetition: String = js.native
  }
}
