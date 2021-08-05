package typings.bitTwiddle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bit-twiddle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bit-twiddle", "INT_BITS")
  @js.native
  val INT_BITS: Double = js.native
  
  @JSImport("bit-twiddle", "INT_MAX")
  @js.native
  val INT_MAX: Double = js.native
  
  @JSImport("bit-twiddle", "INT_MIN")
  @js.native
  val INT_MIN: Double = js.native
  
  inline def abs(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def countTrailingZeros(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countTrailingZeros")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def deinterleave2(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deinterleave2")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def deinterleave3(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deinterleave3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def interleave2(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interleave2")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def interleave3(x: Double, y: Double, z: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interleave3")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isPow2(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPow2")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def log10(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def log2(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def max(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def min(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nextCombination(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextCombination")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nextPow2(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPow2")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parity(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parity")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def popCount(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("popCount")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def prevPow2(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prevPow2")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def reverse(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sign(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
