package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to control physics engine
     * @see http://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "PhysicsEngine")
@js.native
class PhysicsEngine protected ()
  extends babylonjsLib.BABYLONNs.PhysicsEngine {
  /**
           * Creates a new Physics Engine
           * @param gravity defines the gravity vector used by the simulation
           * @param _physicsPlugin defines the plugin to use (CannonJS by default)
           */
  def this(gravity: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Vector3]) = this()
  /**
           * Creates a new Physics Engine
           * @param gravity defines the gravity vector used by the simulation
           * @param _physicsPlugin defines the plugin to use (CannonJS by default)
           */
  def this(gravity: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Vector3], _physicsPlugin: babylonjsLib.BABYLONNs.IPhysicsEnginePlugin) = this()
}

/**
     * Class used to control physics engine
     * @see http://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "PhysicsEngine")
@js.native
object PhysicsEngine extends js.Object {
  /**
           * Global value used to control the smallest number supported by the simulation
           */
  var Epsilon: scala.Double = js.native
}

