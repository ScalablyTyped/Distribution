package typings.blackEngine

import typings.blackEngine.modifierMod.Modifier
import typings.blackEngine.vectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorFieldMod {
  
  @JSImport("black-engine/particles/mods/VectorField", "VectorField")
  @js.native
  open class VectorField protected () extends Modifier {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, resolution: Double) = this()
    
    var field: js.Array[Any] = js.native
    
    def getVectorAt(x: Double, y: Double): Vector | Null = js.native
    
    var height: Double = js.native
    
    var heightScaled: Double = js.native
    
    def reset(): Unit = js.native
    
    var resolution: Double = js.native
    
    def setData(fn: js.Function0[Unit]): Unit = js.native
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
    
    var width: Double = js.native
    
    var widthScaled: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
