package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perlinMod {
  
  @JSImport("black-engine/math/Perlin", "Perlin")
  @js.native
  open class Perlin () extends StObject {
    def this(repeat: Double) = this()
    
    def __perlin(x: Any, y: Any, z: Any): Double = js.native
    
    def grad(hash: Any, x: Any, y: Any, z: Any): Any = js.native
    
    def inc(num: Any): Any = js.native
    
    def lerp(a: Any, b: Any, t: Any): Any = js.native
    
    var mPerm: js.Array[Double] = js.native
    
    var mRepeat: Double = js.native
    
    def perlin(x: Any, y: Any, z: Any): Double = js.native
    def perlin(x: Any, y: Any, z: Any, octaves: Double): Double = js.native
    def perlin(x: Any, y: Any, z: Any, octaves: Double, persistence: Double): Double = js.native
    def perlin(x: Any, y: Any, z: Any, octaves: Unit, persistence: Double): Double = js.native
  }
}
