package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "MathEx")
@js.native
open class MathEx ()
  extends typings.blackEngine.mathExMod.MathEx
/* static members */
object MathEx {
  
  @JSImport("black-engine", "MathEx")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "MathEx.DEG2RAD")
  @js.native
  val DEG2RAD: Double = js.native
  
  @JSImport("black-engine", "MathEx.PI2")
  @js.native
  val PI2: Double = js.native
  
  @JSImport("black-engine", "MathEx.PI_Q")
  @js.native
  val PI_Q: Double = js.native
  
  @JSImport("black-engine", "MathEx.RAD2DEG")
  @js.native
  val RAD2DEG: Double = js.native
  
  inline def angleBetween(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distanceSqr(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSqr")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equals(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Double, b: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lerp(a: Double, b: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mapRange(value: Double, fromA: Double, fromB: Double, toA: Double, toB: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapRange")(value.asInstanceOf[js.Any], fromA.asInstanceOf[js.Any], fromB.asInstanceOf[js.Any], toA.asInstanceOf[js.Any], toB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def randomBetween(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBetween")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
