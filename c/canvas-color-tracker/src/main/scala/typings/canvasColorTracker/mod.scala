package typings.canvasColorTracker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("canvas-color-tracker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ColorTracker {
    def this(bits: Double) = this()
  }
  
  @js.native
  trait ColorTracker extends StObject {
    
    def lookup(color: String): Obj | Null = js.native
    def lookup(color: js.Tuple3[Double, Double, Double]): Obj | Null = js.native
    
    def register(obj: Obj): String | Null = js.native
  }
  
  type Obj = Any
}
