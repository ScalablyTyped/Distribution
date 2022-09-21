package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Spherical")
@js.native
open class Spherical protected ()
  extends typings.babylonjs.mathsIndexMod.Spherical {
  /**
    * @param radius spherical radius
    * @param theta angle from positive y axis to radial line from 0 to PI (vertical)
    * @param phi angle from positive x axis measured anticlockwise from -PI to PI (horizontal)
    */
  def this(radius: Double, theta: Double, phi: Double) = this()
}
/* static members */
object Spherical {
  
  @JSImport("babylonjs/index", "Spherical")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a Spherical from a Vector3
    * @param vector defines the vector in (x, y, z) coordinate space
    * @returns a new Spherical
    */
  inline def FromVector3(vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]): typings.babylonjs.mathPolarMod.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathPolarMod.Spherical]
  
  /**
    * Assigns the spherical coordinates from a Vector3
    * @param vector the vector to convert
    * @param ref the Spherical to update
    * @returns the updated ref
    */
  inline def FromVector3ToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    ref: typings.babylonjs.mathPolarMod.Spherical
  ): typings.babylonjs.mathPolarMod.Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3ToRef")(vector.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathPolarMod.Spherical]
}
