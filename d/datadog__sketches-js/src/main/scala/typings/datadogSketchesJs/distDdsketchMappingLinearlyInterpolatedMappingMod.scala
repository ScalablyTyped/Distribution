package typings.datadogSketchesJs

import typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchMappingLinearlyInterpolatedMappingMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping/LinearlyInterpolatedMapping", "LinearlyInterpolatedMapping")
  @js.native
  open class LinearlyInterpolatedMapping protected () extends KeyMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
    
    /** Inverse of _log2Approx */
    def _exp2Approx(value: Double): Double = js.native
    
    /**
      * Approximates log2 by s + f
      * where v = (s+1) * 2 ** f  for s in [0, 1)
      *
      * frexp(v) returns m and e s.t.
      * v = m * 2 ** e ; (m in [0.5, 1) or 0.0)
      * so we adjust m and e accordingly
      */
    def _log2Approx(value: Double): Double = js.native
  }
}
