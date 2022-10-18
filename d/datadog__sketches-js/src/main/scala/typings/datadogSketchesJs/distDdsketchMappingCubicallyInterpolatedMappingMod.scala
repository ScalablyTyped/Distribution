package typings.datadogSketchesJs

import typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchMappingCubicallyInterpolatedMappingMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping/CubicallyInterpolatedMapping", "CubicallyInterpolatedMapping")
  @js.native
  open class CubicallyInterpolatedMapping protected () extends KeyMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
    
    var A: Double = js.native
    
    var B: Double = js.native
    
    var C: Double = js.native
    
    /** Derived from Cardano's formula */
    def _cubicExp2Approx(value: Double): Double = js.native
    
    /** Approximates log2 using a cubic polynomial */
    def _cubicLog2Approx(value: Double): Double = js.native
  }
}
