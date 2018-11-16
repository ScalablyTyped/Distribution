package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSGlobal("BABYLON.CannonJSPlugin")
@js.native
class CannonJSPlugin () extends IPhysicsEnginePlugin {
  def this(_useDeltaForWorldStep: scala.Boolean) = this()
  def this(_useDeltaForWorldStep: scala.Boolean, iterations: scala.Double) = this()
  var BJSCANNON: js.Any = js.native
  var _addMaterial: js.Any = js.native
  var _checkWithEpsilon: js.Any = js.native
  var _createHeightmap: js.Any = js.native
  var _createShape: js.Any = js.native
  var _extendNamespace: js.Any = js.native
  var _fixedTimeStep: js.Any = js.native
  var _minus90X: js.Any = js.native
  var _physicsMaterials: js.Any = js.native
  var _plus90X: js.Any = js.native
  var _processChildMeshes: js.Any = js.native
  var _tmpDeltaPosition: js.Any = js.native
  var _tmpPosition: js.Any = js.native
  var _tmpUnityRotation: js.Any = js.native
  var _updatePhysicsBodyTransformation: js.Any = js.native
  var _useDeltaForWorldStep: js.Any = js.native
  def setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): scala.Unit = js.native
  def setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): scala.Unit = js.native
  def setMotor(joint: IMotorEnabledJoint): scala.Unit = js.native
}

