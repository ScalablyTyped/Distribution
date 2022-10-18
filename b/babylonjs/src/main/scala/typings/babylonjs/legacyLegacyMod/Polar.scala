package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Polar")
@js.native
open class Polar protected ()
  extends typings.babylonjs.indexMod.Polar {
  /**
    * Creates a new Polar object
    * @param radius the radius of the vector
    * @param theta the angle of the vector
    */
  def this(radius: Double, theta: Double) = this()
}
/* static members */
object Polar {
  
  @JSImport("babylonjs/Legacy/legacy", "Polar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts an array of floats to a polar
    * @param array the array to convert
    * @returns the converted polar
    */
  inline def FromArray(array: js.Array[Double]): typings.babylonjs.mathsMathDotpolarMod.Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotpolarMod.Polar]
  
  /**
    * Converts a given Vector2 to its polar coordinates
    * @param v the Vector2 to convert
    * @returns a Polar
    */
  inline def FromVector2(v: typings.babylonjs.mathsMathDotvectorMod.Vector2): typings.babylonjs.mathsMathDotpolarMod.Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2")(v.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotpolarMod.Polar]
  
  /**
    * Converts a given Vector2 to its polar coordinates
    * @param v the Vector2 to convert
    * @param ref the reference to assign the result
    * @returns the updated reference
    */
  inline def FromVector2ToRef(
    v: typings.babylonjs.mathsMathDotvectorMod.Vector2,
    ref: typings.babylonjs.mathsMathDotpolarMod.Polar
  ): typings.babylonjs.mathsMathDotpolarMod.Polar = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2ToRef")(v.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotpolarMod.Polar]
}
