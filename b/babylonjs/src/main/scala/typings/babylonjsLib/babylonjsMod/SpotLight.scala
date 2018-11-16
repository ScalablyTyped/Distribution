package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A spot light is defined by a position, a direction, an angle, and an exponent.
     * These values define a cone of light starting from the position, emitting toward the direction.
     * The angle, in radians, defines the size (field of illumination) of the spotlight's conical beam,
     * and the exponent defines the speed of the decay of the light with distance (reach).
     * Documentation: https://doc.babylonjs.com/babylon101/lights
     */
@JSImport("babylonjs", "SpotLight")
@js.native
class SpotLight protected ()
  extends babylonjsLib.BABYLONNs.SpotLight {
  /**
           * Creates a SpotLight object in the scene. A spot light is a simply light oriented cone.
           * It can cast shadows.
           * Documentation : http://doc.babylonjs.com/tutorials/lights
           * @param name The light friendly name
           * @param position The position of the spot light in the scene
           * @param direction The direction of the light in the scene
           * @param angle The cone angle of the light in Radians
           * @param exponent The light decay speed with the distance from the emission spot
           * @param scene The scene the lights belongs to
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, direction: babylonjsLib.BABYLONNs.Vector3, angle: scala.Double, exponent: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

