package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Angle")
@js.native
class Angle protected ()
  extends typings.babylonjs.BABYLON.Angle {
  /**
    * Creates an Angle object of "radians" radians (float).
    * @param radians the angle in radians
    */
  def this(radians: Double) = this()
  /* CompleteClass */
  override var _radians: js.Any = js.native
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
@JSGlobal("BABYLON.Angle")
@js.native
object Angle extends js.Object {
  /**
    * Gets a new Angle object valued with the angle value in radians between the two given vectors
    * @param a defines first vector
    * @param b defines second vector
    * @returns a new Angle
    */
  def BetweenTwoPoints(
    a: DeepImmutable[typings.babylonjs.BABYLON.Vector2],
    b: DeepImmutable[typings.babylonjs.BABYLON.Vector2]
  ): typings.babylonjs.BABYLON.Angle = js.native
  /**
    * Gets a new Angle object from the given float in degrees
    * @param degrees defines the angle value in degrees
    * @returns a new Angle
    */
  def FromDegrees(degrees: Double): typings.babylonjs.BABYLON.Angle = js.native
  /**
    * Gets a new Angle object from the given float in radians
    * @param radians defines the angle value in radians
    * @returns a new Angle
    */
  def FromRadians(radians: Double): typings.babylonjs.BABYLON.Angle = js.native
}

