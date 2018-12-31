package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a physics vortex event
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSImport("babylonjs", "PhysicsVortexEvent")
@js.native
class PhysicsVortexEvent protected ()
  extends babylonjsLib.BABYLONNs.PhysicsVortexEvent {
  /**
    * Initializes the physics vortex event
    * @param _scene The BabylonJS scene
    * @param _origin The origin position of the vortex
    * @param _radius The radius of the vortex
    * @param _strength The strength of the vortex
    * @param _height The height of the vortex
    */
  def this(_scene: babylonjsLib.BABYLONNs.Scene, _origin: babylonjsLib.BABYLONNs.Vector3, _radius: scala.Double, _strength: scala.Double, _height: scala.Double) = this()
}

