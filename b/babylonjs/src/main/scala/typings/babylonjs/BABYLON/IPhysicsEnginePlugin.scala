package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPhysicsEnginePlugin extends js.Object {
  var appendAnchor: js.UndefOr[
    js.Function6[
      /* impostor */ PhysicsImpostor, 
      /* otherImpostor */ PhysicsImpostor, 
      /* width */ Double, 
      /* height */ Double, 
      /* influence */ Double, 
      /* noCollisionBetweenLinkedBodies */ Boolean, 
      Unit
    ]
  ] = js.native
  var appendHook: js.UndefOr[
    js.Function5[
      /* impostor */ PhysicsImpostor, 
      /* otherImpostor */ PhysicsImpostor, 
      /* length */ Double, 
      /* influence */ Double, 
      /* noCollisionBetweenLinkedBodies */ Boolean, 
      Unit
    ]
  ] = js.native
  var getBodyPositionIterations: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
  var getBodyPressure: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
  var getBodyStiffness: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
  var getBodyVelocityIterations: js.UndefOr[js.Function1[/* impostor */ PhysicsImpostor, Double]] = js.native
  var name: String = js.native
  var setBodyPositionIterations: js.UndefOr[
    js.Function2[/* impostor */ PhysicsImpostor, /* positionIterations */ Double, Unit]
  ] = js.native
  var setBodyPressure: js.UndefOr[js.Function2[/* impostor */ PhysicsImpostor, /* pressure */ Double, Unit]] = js.native
  var setBodyStiffness: js.UndefOr[js.Function2[/* impostor */ PhysicsImpostor, /* stiffness */ Double, Unit]] = js.native
  var setBodyVelocityIterations: js.UndefOr[
    js.Function2[/* impostor */ PhysicsImpostor, /* velocityIterations */ Double, Unit]
  ] = js.native
  var world: js.Any = js.native
  def applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = js.native
  def applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): Unit = js.native
  def dispose(): Unit = js.native
  def executeStep(delta: Double, impostors: js.Array[PhysicsImpostor]): Unit = js.native
  def generateJoint(joint: PhysicsImpostorJoint): Unit = js.native
  def generatePhysicsBody(impostor: PhysicsImpostor): Unit = js.native
  def getAngularVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
  def getBodyFriction(impostor: PhysicsImpostor): Double = js.native
  def getBodyMass(impostor: PhysicsImpostor): Double = js.native
  def getBodyRestitution(impostor: PhysicsImpostor): Double = js.native
  def getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): Unit = js.native
  def getLinearVelocity(impostor: PhysicsImpostor): Nullable[Vector3] = js.native
  def getRadius(impostor: PhysicsImpostor): Double = js.native
  def getTimeStep(): Double = js.native
  def isSupported(): Boolean = js.native
  def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult = js.native
  def removeJoint(joint: PhysicsImpostorJoint): Unit = js.native
  def removePhysicsBody(impostor: PhysicsImpostor): Unit = js.native
  def setAngularVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): Unit = js.native
  def setBodyFriction(impostor: PhysicsImpostor, friction: Double): Unit = js.native
  def setBodyMass(impostor: PhysicsImpostor, mass: Double): Unit = js.native
  def setBodyRestitution(impostor: PhysicsImpostor, restitution: Double): Unit = js.native
  def setGravity(gravity: Vector3): Unit = js.native
  def setLimit(joint: IMotorEnabledJoint, upperLimit: Double): Unit = js.native
  def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double): Unit = js.native
  def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
  def setLinearVelocity(impostor: PhysicsImpostor, velocity: Nullable[Vector3]): Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: Double): Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double): Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double, motorIndex: Double): Unit = js.native
  def setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): Unit = js.native
  def setTimeStep(timeStep: Double): Unit = js.native
  def setTransformationFromPhysicsBody(impostor: PhysicsImpostor): Unit = js.native
  def sleepBody(impostor: PhysicsImpostor): Unit = js.native
  def syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): Unit = js.native
  def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double): Unit = js.native
  def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double, minDistance: Double): Unit = js.native
  def wakeUpBody(impostor: PhysicsImpostor): Unit = js.native
}

