package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a gravitational field event
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSImport("babylonjs", "PhysicsGravitationalFieldEvent")
@js.native
class PhysicsGravitationalFieldEvent protected ()
  extends babylonjsLib.BABYLONNs.PhysicsGravitationalFieldEvent {
  /**
    * Initializes the physics gravitational field event
    * @param physicsHelper A physics helper
    * @param scene BabylonJS scene
    * @param origin The origin position of the gravitational field event
    * @param radius The radius of the gravitational field event
    * @param strength The strength of the gravitational field event
    * @param falloff The falloff for the gravitational field event
    */
  def this(physicsHelper: babylonjsLib.BABYLONNs.PhysicsHelper, scene: babylonjsLib.BABYLONNs.Scene, origin: babylonjsLib.BABYLONNs.Vector3, radius: scala.Double, strength: scala.Double) = this()
  def this(physicsHelper: babylonjsLib.BABYLONNs.PhysicsHelper, scene: babylonjsLib.BABYLONNs.Scene, origin: babylonjsLib.BABYLONNs.Vector3, radius: scala.Double, strength: scala.Double, falloff: babylonjsLib.BABYLONNs.PhysicsRadialImpulseFalloff) = this()
}

