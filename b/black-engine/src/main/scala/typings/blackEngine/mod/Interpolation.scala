package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Interpolation")
@js.native
open class Interpolation ()
  extends typings.blackEngine.animationInterpolationMod.Interpolation
/* static members */
object Interpolation {
  
  @JSImport("black-engine", "Interpolation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bezier(v: js.Array[Any], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bezier")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def catmullRom(v: js.Array[Any], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRom")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def factorial(n: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__factorial")(n.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def linear(v: js.Array[Any], k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linear")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def linear(
    v: js.Array[Any],
    k: Double,
    lerpFunction: js.Function3[/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double, Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("linear")(v.asInstanceOf[js.Any], k.asInstanceOf[js.Any], lerpFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
}
