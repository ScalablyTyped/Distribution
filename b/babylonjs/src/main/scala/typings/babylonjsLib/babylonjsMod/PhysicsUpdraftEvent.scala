package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a physics updraft event
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "PhysicsUpdraftEvent")
@js.native
class PhysicsUpdraftEvent protected ()
  extends babylonjsLib.BABYLONNs.PhysicsUpdraftEvent {
  /**
           * Initializes the physics updraft event
           * @param _scene BabylonJS scene
           * @param _origin The origin position of the updraft
           * @param _radius The radius of the updraft
           * @param _strength The strength of the updraft
           * @param _height The height of the updraft
           * @param _updraftMode The mode of the updraft
           */
  def this(_scene: babylonjsLib.BABYLONNs.Scene, _origin: babylonjsLib.BABYLONNs.Vector3, _radius: scala.Double, _strength: scala.Double, _height: scala.Double, _updraftMode: babylonjsLib.BABYLONNs.PhysicsUpdraftMode) = this()
}

