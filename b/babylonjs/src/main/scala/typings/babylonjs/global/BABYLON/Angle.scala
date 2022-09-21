package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Angle")
@js.native
open class Angle protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Angle {
  /**
    * Creates an Angle object of "radians" radians (float).
    * @param radians the angle in radians
    */
  def this(radians: Double) = this()
  
  /* private */ /* CompleteClass */
  var _radians: Any = js.native
  
  /**
    * Get value in degrees
    * @returns the Angle value in degrees (float)
    */
  /* CompleteClass */
  override def degrees(): Double = js.native
  
  /**
    * Get value in radians
    * @returns the Angle value in radians (float)
    */
  /* CompleteClass */
  override def radians(): Double = js.native
}
/* static members */
object Angle {
  
  @JSGlobal("BABYLON.Angle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a new Angle object valued with the gradient angle, in radians, of the line joining two points
    * @param a defines first point as the origin
    * @param b defines point
    * @returns a new Angle
    */
  inline def BetweenTwoPoints(
    a: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    b: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): typings.babylonjs.BABYLON.Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("BetweenTwoPoints")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Angle]
  
  /**
    * Gets a new Angle object from the given float in degrees
    * @param degrees defines the angle value in degrees
    * @returns a new Angle
    */
  inline def FromDegrees(degrees: Double): typings.babylonjs.BABYLON.Angle = ^.asInstanceOf[js.Dynamic].applyDynamic("FromDegrees")(degrees.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Angle]
  
  /**
    * Gets a new Angle object from the given float in radians
    * @param radians defines the angle value in radians
    * @returns a new Angle
    */
  inline def FromRadians(radians: Double): typings.babylonjs.BABYLON.Angle = ^.asInstanceOf[js.Dynamic].applyDynamic("FromRadians")(radians.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Angle]
}
