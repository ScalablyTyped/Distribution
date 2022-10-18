package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driversRenderTargetMod {
  
  @JSImport("black-engine/drivers/RenderTarget", "RenderTarget")
  @js.native
  open class RenderTarget protected () extends StObject {
    def this(width: Double, height: Double) = this()
    
    def clear(): Unit = js.native
    
    def height: Double = js.native
    def height_=(arg: Double): Unit = js.native
    
    /* private */ var mHeight: Any = js.native
    
    /* private */ var mWidth: Any = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def width: Double = js.native
    def width_=(arg: Double): Unit = js.native
  }
}
