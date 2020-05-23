package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsJoint extends js.Object {
  var _physicsJoint: js.Any = js.native
  var _physicsPlugin: IPhysicsEnginePlugin = js.native
  /**
    * The data for the physics joint
    */
  var jointData: PhysicsJointData = js.native
  /**
    * The type of the physics joint
    */
  var `type`: Double = js.native
  /**
    * Execute a function that is physics-plugin specific.
    * @param {Function} func the function that will be executed.
    *                        It accepts two parameters: the physics world and the physics joint
    */
  def executeNativeFunction(func: js.Function2[/* world */ js.Any, /* physicsJoint */ js.Any, Unit]): Unit = js.native
  /**
    * Gets the physics joint
    */
  def physicsJoint: js.Any = js.native
  /**
    * Sets the physics joint
    */
  def physicsJoint(newJoint: js.Any): js.Any = js.native
  /**
    * Sets the physics plugin
    */
  def physicsPlugin(physicsPlugin: IPhysicsEnginePlugin): js.Any = js.native
}

