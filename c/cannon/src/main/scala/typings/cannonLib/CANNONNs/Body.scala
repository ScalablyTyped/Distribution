package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Body")
@js.native
class Body () extends EventTarget {
  def this(options: IBodyOptions) = this()
  var aabb: AABB = js.native
  var aabbNeedsUpdate: scala.Boolean = js.native
  var allowSleep: scala.Boolean = js.native
  var angularDamping: scala.Double = js.native
  var angularVelocity: Vec3 = js.native
  var collisionFilterGroup: scala.Double = js.native
  var collisionFilterMask: scala.Double = js.native
  var collisionResponse: scala.Boolean = js.native
  var fixedRotation: scala.Boolean = js.native
  var force: Vec3 = js.native
  var id: scala.Double = js.native
  var inertia: Vec3 = js.native
  var initAngularVelocity: Vec3 = js.native
  var initPosition: Vec3 = js.native
  var initQuaternion: Quaternion = js.native
  var initVelocity: Vec3 = js.native
  var interpolatedPosition: Vec3 = js.native
  var interpolatedQuaternion: Quaternion = js.native
  var invInertia: Vec3 = js.native
  var invInertiaSolve: Vec3 = js.native
  var invInertiaWorld: Mat3 = js.native
  var invInteriaWorldSolve: Mat3 = js.native
  var invMass: scala.Double = js.native
  var invMassSolve: scala.Double = js.native
  var linearDamping: scala.Double = js.native
  var mass: scala.Double = js.native
  var material: Material = js.native
  var position: Vec3 = js.native
  var postStep: js.Function = js.native
  var preStep: js.Function = js.native
  var previousPosition: Vec3 = js.native
  var quaternion: Quaternion = js.native
  var shapeOffsets: js.Array[_] = js.native
  var shapeOrientations: js.Array[_] = js.native
  var shapes: js.Array[Shape] = js.native
  var sleepSpeedLimit: scala.Double = js.native
  var sleepState: scala.Double = js.native
  var sleepTimeLimit: scala.Double = js.native
  var timeLastSleepy: scala.Double = js.native
  var torque: Vec3 = js.native
  var `type`: scala.Double = js.native
  var velocity: Vec3 = js.native
  var vlambda: Vec3 = js.native
  var wlambda: Vec3 = js.native
  var world: World = js.native
  def addShape(shape: Shape): scala.Unit = js.native
  def addShape(shape: Shape, offset: Vec3): scala.Unit = js.native
  def addShape(shape: Shape, offset: Vec3, orientation: Quaternion): scala.Unit = js.native
  def applyForce(force: Vec3, worldPoint: Vec3): scala.Unit = js.native
  def applyImpulse(impulse: Vec3, worldPoint: Vec3): scala.Unit = js.native
  def applyLocalForce(force: Vec3, localPoint: Vec3): scala.Unit = js.native
  def applyLocalImpulse(impulse: Vec3, localPoint: Vec3): scala.Unit = js.native
  def computeAABB(): scala.Unit = js.native
  def getVelocityAtWorldPoint(worldPoint: Vec3, result: Vec3): Vec3 = js.native
  def pointToLocalFrame(worldPoint: Vec3): Vec3 = js.native
  def pointToLocalFrame(worldPoint: Vec3, result: Vec3): Vec3 = js.native
  def pointToWorldFrame(localPoint: Vec3): Vec3 = js.native
  def pointToWorldFrame(localPoint: Vec3, result: Vec3): Vec3 = js.native
  def sleep(): scala.Unit = js.native
  def sleepTick(time: scala.Double): scala.Unit = js.native
  def updateBoundingRadius(): scala.Unit = js.native
  def updateInertiaWorld(force: Vec3): scala.Unit = js.native
  def updateMassProperties(): scala.Unit = js.native
  def updateSolveMassProperties(): scala.Unit = js.native
  def vectorToWorldFrame(localVector: Vec3): Vec3 = js.native
  def vectorToWorldFrame(localVector: Vec3, result: Vec3): Vec3 = js.native
  def wakeUp(): scala.Unit = js.native
}

/* static members */
@JSGlobal("CANNON.Body")
@js.native
object Body extends js.Object {
  var AWAKE: scala.Double = js.native
  var DYNAMIC: scala.Double = js.native
  var KINEMATIC: scala.Double = js.native
  var SLEEPING: scala.Double = js.native
  var SLEEPY: scala.Double = js.native
  var STATIC: scala.Double = js.native
  var sleepEvent: cannonLib.CANNONNs.IEvent = js.native
  var sleepyEvent: cannonLib.CANNONNs.IEvent = js.native
}

