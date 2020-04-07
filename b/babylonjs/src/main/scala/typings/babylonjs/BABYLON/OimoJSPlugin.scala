package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.OimoJSPlugin")
@js.native
class OimoJSPlugin () extends IPhysicsEnginePlugin {
  def this(iterations: Double) = this()
  def this(iterations: Double, oimoInjection: js.Any) = this()
  var BJSOIMO: js.Any = js.native
  var _raycastResult: js.Any = js.native
  var _tmpImpostorsArray: js.Any = js.native
  var _tmpPositionVector: js.Any = js.native
  def setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
  def setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
}

