package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Polar")
@js.native
open class Polar protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Polar {
  /**
    * Creates a new Polar object
    * @param radius the radius of the vector
    * @param theta the angle of the vector
    */
  def this(radius: Double, theta: Double) = this()
  
  /* CompleteClass */
  var radius: Double = js.native
  
  /* CompleteClass */
  var theta: Double = js.native
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @returns the rectangular coordinates
    */
  /* CompleteClass */
  override def toVector2(): typings.babylonjs.BABYLON.Vector2 = js.native
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @param ref the reference to assign the result
    * @returns the updated reference
    */
  /* CompleteClass */
  override def toVector2ToRef(ref: typings.babylonjs.BABYLON.Vector2): typings.babylonjs.BABYLON.Vector2 = js.native
}
/* static members */
object Polar {
  
  @JSGlobal("BABYLON.Polar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a given Vector2 to its polar coordinates
    * @param v the Vector2 to convert
    * @returns a Polar
    */
  inline def FromVector2(v: typings.babylonjs.BABYLON.Vector2): typings.babylonjs.BABYLON.Polar = ^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2")(v.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Polar]
  
  /**
    * Converts a given Vector2 to its polar coordinates
    * @param v the Vector2 to convert
    * @param ref the reference to assign the result
    * @returns the updated reference
    */
  inline def FromVector2ToRef(v: typings.babylonjs.BABYLON.Vector2, ref: typings.babylonjs.BABYLON.Polar): typings.babylonjs.BABYLON.Polar = (^.asInstanceOf[js.Dynamic].applyDynamic("FromVector2ToRef")(v.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Polar]
}
