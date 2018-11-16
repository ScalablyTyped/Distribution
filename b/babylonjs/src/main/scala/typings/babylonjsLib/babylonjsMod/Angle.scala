package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines angle representation
     */
@JSImport("babylonjs", "Angle")
@js.native
class Angle protected ()
  extends babylonjsLib.BABYLONNs.Angle {
  /**
           * Creates an Angle object of "radians" radians (float).
           */
  def this(radians: scala.Double) = this()
}

/**
     * Defines angle representation
     */
@JSImport("babylonjs", "Angle")
@js.native
object Angle extends js.Object {
  /**
           * Gets a new Angle object valued with the angle value in radians between the two given vectors
           * @param a defines first vector
           * @param b defines second vector
           * @returns a new Angle
           */
  def BetweenTwoPoints(a: babylonjsLib.BABYLONNs.Vector2, b: babylonjsLib.BABYLONNs.Vector2): babylonjsLib.BABYLONNs.Angle = js.native
  /**
           * Gets a new Angle object from the given float in degrees
           * @param degrees defines the angle value in degrees
           * @returns a new Angle
           */
  def FromDegrees(degrees: scala.Double): babylonjsLib.BABYLONNs.Angle = js.native
  /**
           * Gets a new Angle object from the given float in radians
           * @param radians defines the angle value in radians
           * @returns a new Angle
           */
  def FromRadians(radians: scala.Double): babylonjsLib.BABYLONNs.Angle = js.native
}

