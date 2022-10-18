package typings.babylonjs.mathsIndexMod

import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Spherical")
@js.native
open class Spherical protected ()
  extends typings.babylonjs.mathsMathDotpolarMod.Spherical {
  /**
    * @param radius spherical radius
    * @param theta angle from positive y axis to radial line from 0 to PI (vertical)
    * @param phi angle from positive x axis measured anticlockwise from -PI to PI (horizontal)
    */
  def this(radius: Double, theta: Double, phi: Double) = this()
}
/* static members */
object Spherical {
  
  @JSImport("babylonjs/Maths/index", "Spherical")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts an array of floats to a spherical
    * @param array the array to convert
    * @returns the converted spherical
    */
  inline def FromArray(array: js.Array[Double]): typings.babylonjs.mathsMathDotpolarMod.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotpolarMod.Spherical]
  
  /**
    * Gets a Spherical from a Vector3
    * @param vector defines the vector in (x, y, z) coordinate space
    * @returns a new Spherical
    */
  inline def FromVector3(vector: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3]): typings.babylonjs.mathsMathDotpolarMod.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathsMathDotpolarMod.Spherical]
  
  /**
    * Assigns the spherical coordinates from a Vector3
    * @param vector the vector to convert
    * @param ref the Spherical to update
    * @returns the updated ref
    */
  inline def FromVector3ToRef(
    vector: DeepImmutable[typings.babylonjs.mathsMathDotvectorMod.Vector3],
    ref: typings.babylonjs.mathsMathDotpolarMod.Spherical
  ): typings.babylonjs.mathsMathDotpolarMod.Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3ToRef")(vector.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathsMathDotpolarMod.Spherical]
}
