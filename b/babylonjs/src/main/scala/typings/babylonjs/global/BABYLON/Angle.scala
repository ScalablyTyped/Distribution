package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Angle")
@js.native
class Angle protected ()
  extends typings.babylonjs.BABYLON.Angle {
  /**
    * Creates an Angle object of "radians" radians (float).
    * @param radians the angle in radians
    */
  def this(radians: Double) = this()
}
/* static members */
object Angle {
  
  /**
    * Gets a new Angle object valued with the gradient angle, in radians, of the line joining two points
    * @param a defines first point as the origin
    * @param b defines point
    * @returns a new Angle
    */
  @JSGlobal("BABYLON.Angle.BetweenTwoPoints")
  @js.native
  def BetweenTwoPoints(
    a: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    b: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): typings.babylonjs.BABYLON.Angle = js.native
  
  /**
    * Gets a new Angle object from the given float in degrees
    * @param degrees defines the angle value in degrees
    * @returns a new Angle
    */
  @JSGlobal("BABYLON.Angle.FromDegrees")
  @js.native
  def FromDegrees(degrees: Double): typings.babylonjs.BABYLON.Angle = js.native
  
  /**
    * Gets a new Angle object from the given float in radians
    * @param radians defines the angle value in radians
    * @returns a new Angle
    */
  @JSGlobal("BABYLON.Angle.FromRadians")
  @js.native
  def FromRadians(radians: Double): typings.babylonjs.BABYLON.Angle = js.native
}
