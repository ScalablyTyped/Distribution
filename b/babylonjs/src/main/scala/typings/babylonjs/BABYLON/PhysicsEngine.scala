package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsEngine extends IPhysicsEngine {
  var _impostors: js.Any = js.native
  var _joints: js.Any = js.native
  var _physicsPlugin: js.Any = js.native
  var _subTimeStep: js.Any = js.native
  /**
    * Set the sub time step of the physics engine.
    * Default is 0 meaning there is no sub steps
    * To increase physics resolution precision, set a small value (like 1 ms)
    * @param subTimeStep defines the new sub timestep used for physics resolution.
    */
  def setSubTimeStep(): Unit = js.native
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep defines the new timestep to apply to this world.
    */
  def setTimeStep(): Unit = js.native
}

