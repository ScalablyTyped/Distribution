package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Spherical")
@js.native
open class Spherical protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Spherical {
  /**
    * @param radius spherical radius
    * @param theta angle from positive y axis to radial line from 0 to PI (vertical)
    * @param phi angle from positive x axis measured anticlockwise from -PI to PI (horizontal)
    */
  def this(radius: Double, theta: Double, phi: Double) = this()
  
  /* CompleteClass */
  var phi: Double = js.native
  
  /* CompleteClass */
  var radius: Double = js.native
  
  /* CompleteClass */
  var theta: Double = js.native
  
  /**
    * Gets a Vector3 from the current spherical coordinates
    * @returns the Vector3
    */
  /* CompleteClass */
  override def toVector3(): typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Assigns the rectangular coordinates of the current Spherical to a Vector3
    * @param ref the Vector3 to update
    * @returns the updated Vector3
    */
  /* CompleteClass */
  override def toVector3ToRef(ref: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): typings.babylonjs.BABYLON.Vector3 = js.native
}
/* static members */
object Spherical {
  
  @JSGlobal("BABYLON.Spherical")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a Spherical from a Vector3
    * @param vector defines the vector in (x, y, z) coordinate space
    * @returns a new Spherical
    */
  inline def FromVector3(vector: DeepImmutable[typings.babylonjs.BABYLON.Vector3]): typings.babylonjs.BABYLON.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Spherical]
  
  /**
    * Assigns the spherical coordinates from a Vector3
    * @param vector the vector to convert
    * @param ref the Spherical to update
    * @returns the updated ref
    */
  inline def FromVector3ToRef(vector: DeepImmutable[typings.babylonjs.BABYLON.Vector3], ref: typings.babylonjs.BABYLON.Spherical): typings.babylonjs.BABYLON.Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector3ToRef")(vector.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Spherical]
}
