package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait IPhysicsEnginePlugin extends js.Object {
  var name: java.lang.String = js.native
  var world: js.Any = js.native
  def applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): scala.Unit = js.native
  def applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def executeStep(delta: scala.Double, impostors: js.Array[PhysicsImpostor]): scala.Unit = js.native
  def generateJoint(joint: PhysicsImpostorJoint): scala.Unit = js.native
  def generatePhysicsBody(impostor: PhysicsImpostor): scala.Unit = js.native
  def getAngularVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
  def getBodyFriction(impostor: PhysicsImpostor): scala.Double = js.native
  def getBodyMass(impostor: PhysicsImpostor): scala.Double = js.native
  def getBodyRestitution(impostor: PhysicsImpostor): scala.Double = js.native
  def getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): scala.Unit = js.native
  def getLinearVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
  def getRadius(impostor: PhysicsImpostor): scala.Double = js.native
  def getTimeStep(): scala.Double = js.native
  def isSupported(): scala.Boolean = js.native
  def removeJoint(joint: PhysicsImpostorJoint): scala.Unit = js.native
  def removePhysicsBody(impostor: PhysicsImpostor): scala.Unit = js.native
  def setAngularVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): scala.Unit = js.native
  def setBodyFriction(impostor: PhysicsImpostor, friction: scala.Double): scala.Unit = js.native
  def setBodyMass(impostor: PhysicsImpostor, mass: scala.Double): scala.Unit = js.native
  def setBodyRestitution(impostor: PhysicsImpostor, restitution: scala.Double): scala.Unit = js.native
  def setGravity(gravity: Vector3): scala.Unit = js.native
  def setLimit(joint: IMotorEnabledJoint, upperLimit: scala.Double): scala.Unit = js.native
  def setLimit(joint: IMotorEnabledJoint, upperLimit: scala.Double, lowerLimit: scala.Double): scala.Unit = js.native
  def setLimit(
    joint: IMotorEnabledJoint,
    upperLimit: scala.Double,
    lowerLimit: scala.Double,
    motorIndex: scala.Double
  ): scala.Unit = js.native
  def setLinearVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): scala.Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: scala.Double): scala.Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: scala.Double, maxForce: scala.Double): scala.Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: scala.Double, maxForce: scala.Double, motorIndex: scala.Double): scala.Unit = js.native
  def setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): scala.Unit = js.native
  def setTimeStep(timeStep: scala.Double): scala.Unit = js.native
  def setTransformationFromPhysicsBody(impostor: PhysicsImpostor): scala.Unit = js.native
  def sleepBody(impostor: PhysicsImpostor): scala.Unit = js.native
  def syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): scala.Unit = js.native
  def updateDistanceJoint(joint: PhysicsJoint, maxDistance: scala.Double): scala.Unit = js.native
  def updateDistanceJoint(joint: PhysicsJoint, maxDistance: scala.Double, minDistance: scala.Double): scala.Unit = js.native
  def wakeUpBody(impostor: PhysicsImpostor): scala.Unit = js.native
}

