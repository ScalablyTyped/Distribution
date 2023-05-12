package typings.babylonjs.physicsV2IphysicsenginepluginMod

import typings.babylonjs.cullingBoundingBoxMod.BoundingBox
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.physicsPhysicsRaycastResultMod.PhysicsRaycastResult
import typings.babylonjs.physicsV2PhysicsBodyMod.PhysicsBody
import typings.babylonjs.physicsV2PhysicsConstraintMod.PhysicsConstraint
import typings.babylonjs.physicsV2PhysicsMaterialMod.PhysicsMaterial
import typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPhysicsEnginePluginV2 extends StObject {
  
  def addChild(shape: PhysicsShape, newChild: PhysicsShape): Unit = js.native
  def addChild(shape: PhysicsShape, newChild: PhysicsShape, translation: Unit, rotation: Unit, scale: Vector3): Unit = js.native
  def addChild(shape: PhysicsShape, newChild: PhysicsShape, translation: Unit, rotation: Quaternion): Unit = js.native
  def addChild(
    shape: PhysicsShape,
    newChild: PhysicsShape,
    translation: Unit,
    rotation: Quaternion,
    scale: Vector3
  ): Unit = js.native
  def addChild(shape: PhysicsShape, newChild: PhysicsShape, translation: Vector3): Unit = js.native
  def addChild(shape: PhysicsShape, newChild: PhysicsShape, translation: Vector3, rotation: Unit, scale: Vector3): Unit = js.native
  def addChild(shape: PhysicsShape, newChild: PhysicsShape, translation: Vector3, rotation: Quaternion): Unit = js.native
  def addChild(
    shape: PhysicsShape,
    newChild: PhysicsShape,
    translation: Vector3,
    rotation: Quaternion,
    scale: Vector3
  ): Unit = js.native
  
  def addConstraint(body: PhysicsBody, childBody: PhysicsBody, constraint: PhysicsConstraint): Unit = js.native
  def addConstraint(body: PhysicsBody, childBody: PhysicsBody, constraint: PhysicsConstraint, instanceIndex: Double): Unit = js.native
  def addConstraint(
    body: PhysicsBody,
    childBody: PhysicsBody,
    constraint: PhysicsConstraint,
    instanceIndex: Double,
    childInstanceIndex: Double
  ): Unit = js.native
  def addConstraint(
    body: PhysicsBody,
    childBody: PhysicsBody,
    constraint: PhysicsConstraint,
    instanceIndex: Unit,
    childInstanceIndex: Double
  ): Unit = js.native
  
  def applyForce(body: PhysicsBody, force: Vector3, location: Vector3): Unit = js.native
  def applyForce(body: PhysicsBody, force: Vector3, location: Vector3, instanceIndex: Double): Unit = js.native
  
  def applyImpulse(body: PhysicsBody, impulse: Vector3, location: Vector3): Unit = js.native
  def applyImpulse(body: PhysicsBody, impulse: Vector3, location: Vector3, instanceIndex: Double): Unit = js.native
  
  def computeMassProperties(body: PhysicsBody): PhysicsMassProperties = js.native
  def computeMassProperties(body: PhysicsBody, instanceIndex: Double): PhysicsMassProperties = js.native
  
  def dispose(): Unit = js.native
  
  def disposeBody(body: PhysicsBody): Unit = js.native
  
  def disposeConstraint(constraint: PhysicsConstraint): Unit = js.native
  
  def disposeShape(shape: PhysicsShape): Unit = js.native
  
  def executeStep(delta: Double, bodies: js.Array[PhysicsBody]): Unit = js.native
  
  def getAngularDamping(body: PhysicsBody): Double = js.native
  def getAngularDamping(body: PhysicsBody, instanceIndex: Double): Double = js.native
  
  def getAngularVelocityToRef(body: PhysicsBody, angVel: Vector3): Unit = js.native
  def getAngularVelocityToRef(body: PhysicsBody, angVel: Vector3, instanceIndex: Double): Unit = js.native
  
  def getAxisFriction(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis): Double = js.native
  
  def getAxisMaxLimit(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis): Double = js.native
  
  def getAxisMinLimit(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis): Double = js.native
  
  def getAxisMode(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis): PhysicsConstraintAxisLimitMode = js.native
  
  def getAxisMotorMaxForce(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis): Double = js.native
  
  def getAxisMotorTarget(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis): Double = js.native
  
  def getAxisMotorType(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis): PhysicsConstraintMotorType = js.native
  
  def getBodyGeometry(body: PhysicsBody): js.Object = js.native
  
  def getBoundingBox(shape: PhysicsShape): BoundingBox = js.native
  
  def getCollisionObservable(body: PhysicsBody): Observable[IPhysicsCollisionEvent] = js.native
  def getCollisionObservable(body: PhysicsBody, instanceIndex: Double): Observable[IPhysicsCollisionEvent] = js.native
  
  def getCollisionsEnabled(constraint: PhysicsConstraint): Boolean = js.native
  
  def getDensity(shape: PhysicsShape): Double = js.native
  
  def getEnabled(constraint: PhysicsConstraint): Boolean = js.native
  
  def getEventMask(body: PhysicsBody): Double = js.native
  def getEventMask(body: PhysicsBody, instanceIndex: Double): Double = js.native
  
  def getGravityFactor(body: PhysicsBody): Double = js.native
  def getGravityFactor(body: PhysicsBody, instanceIndex: Double): Double = js.native
  
  def getLinearDamping(body: PhysicsBody): Double = js.native
  def getLinearDamping(body: PhysicsBody, instanceIndex: Double): Double = js.native
  
  def getLinearVelocityToRef(body: PhysicsBody, linVel: Vector3): Unit = js.native
  def getLinearVelocityToRef(body: PhysicsBody, linVel: Vector3, instanceIndex: Double): Unit = js.native
  
  def getMassProperties(body: PhysicsBody): PhysicsMassProperties = js.native
  def getMassProperties(body: PhysicsBody, instanceIndex: Double): PhysicsMassProperties = js.native
  
  def getMotionType(body: PhysicsBody): PhysicsMotionType = js.native
  def getMotionType(body: PhysicsBody, instanceIndex: Double): PhysicsMotionType = js.native
  
  def getNumChildren(shape: PhysicsShape): Double = js.native
  
  def getPluginVersion(): Double = js.native
  
  def getShape(body: PhysicsBody): Nullable[PhysicsShape] = js.native
  
  def getShapeFilterCollideMask(shape: PhysicsShape): Double = js.native
  
  def getShapeFilterMembershipMask(shape: PhysicsShape): Double = js.native
  
  def getShapeType(shape: PhysicsShape): PhysicsShapeType = js.native
  
  def getTimeStep(): Double = js.native
  
  def initBody(body: PhysicsBody, motionType: PhysicsMotionType, position: Vector3, orientation: Quaternion): Unit = js.native
  
  def initBodyInstances(body: PhysicsBody, motionType: PhysicsMotionType, mesh: Mesh): Unit = js.native
  
  def initConstraint(constraint: PhysicsConstraint, body: PhysicsBody, childBody: PhysicsBody): Unit = js.native
  
  def initShape(shape: PhysicsShape, `type`: PhysicsShapeType, options: PhysicsShapeParameters): Unit = js.native
  
  /**
    * Physics plugin name
    */
  var name: String = js.native
  
  /**
    * Collision observable
    */
  var onCollisionObservable: Observable[IPhysicsCollisionEvent] = js.native
  
  def raycast(from: Vector3, to: Vector3, result: PhysicsRaycastResult): Unit = js.native
  
  def removeBody(body: PhysicsBody): Unit = js.native
  
  def removeChild(shape: PhysicsShape, childIndex: Double): Unit = js.native
  
  def setAngularDamping(body: PhysicsBody, damping: Double): Unit = js.native
  def setAngularDamping(body: PhysicsBody, damping: Double, instanceIndex: Double): Unit = js.native
  
  def setAngularVelocity(body: PhysicsBody, angVel: Vector3): Unit = js.native
  def setAngularVelocity(body: PhysicsBody, angVel: Vector3, instanceIndex: Double): Unit = js.native
  
  def setAxisFriction(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis, friction: Double): Unit = js.native
  
  def setAxisMaxLimit(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis, limit: Double): Unit = js.native
  
  def setAxisMinLimit(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis, minLimit: Double): Unit = js.native
  
  def setAxisMode(
    constraint: PhysicsConstraint,
    axis: PhysicsConstraintAxis,
    limitMode: PhysicsConstraintAxisLimitMode
  ): Unit = js.native
  
  def setAxisMotorMaxForce(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis, maxForce: Double): Unit = js.native
  
  def setAxisMotorTarget(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis, target: Double): Unit = js.native
  
  def setAxisMotorType(constraint: PhysicsConstraint, axis: PhysicsConstraintAxis, motorType: PhysicsConstraintMotorType): Unit = js.native
  
  def setCollisionCallbackEnabled(body: PhysicsBody, enabled: Boolean): Unit = js.native
  def setCollisionCallbackEnabled(body: PhysicsBody, enabled: Boolean, instanceIndex: Double): Unit = js.native
  
  def setCollisionsEnabled(constraint: PhysicsConstraint, isEnabled: Boolean): Unit = js.native
  
  def setDensity(shape: PhysicsShape, density: Double): Unit = js.native
  
  def setEnabled(constraint: PhysicsConstraint, isEnabled: Boolean): Unit = js.native
  
  def setEventMask(body: PhysicsBody, eventMask: Double): Unit = js.native
  def setEventMask(body: PhysicsBody, eventMask: Double, instanceIndex: Double): Unit = js.native
  
  def setGravity(gravity: Vector3): Unit = js.native
  
  def setGravityFactor(body: PhysicsBody, factor: Double): Unit = js.native
  def setGravityFactor(body: PhysicsBody, factor: Double, instanceIndex: Double): Unit = js.native
  
  def setLinearDamping(body: PhysicsBody, damping: Double): Unit = js.native
  def setLinearDamping(body: PhysicsBody, damping: Double, instanceIndex: Double): Unit = js.native
  
  def setLinearVelocity(body: PhysicsBody, linVel: Vector3): Unit = js.native
  def setLinearVelocity(body: PhysicsBody, linVel: Vector3, instanceIndex: Double): Unit = js.native
  
  def setMassProperties(body: PhysicsBody, massProps: PhysicsMassProperties): Unit = js.native
  def setMassProperties(body: PhysicsBody, massProps: PhysicsMassProperties, instanceIndex: Double): Unit = js.native
  
  def setMaterial(shape: PhysicsShape, material: PhysicsMaterial): Unit = js.native
  
  def setMotionType(body: PhysicsBody, motionType: PhysicsMotionType): Unit = js.native
  def setMotionType(body: PhysicsBody, motionType: PhysicsMotionType, instanceIndex: Double): Unit = js.native
  
  def setShape(body: PhysicsBody, shape: Nullable[PhysicsShape]): Unit = js.native
  
  def setShapeFilterCollideMask(shape: PhysicsShape, collideMask: Double): Unit = js.native
  
  def setShapeFilterMembershipMask(shape: PhysicsShape, membershipMask: Double): Unit = js.native
  
  def setTimeStep(timeStep: Double): Unit = js.native
  
  def sync(body: PhysicsBody): Unit = js.native
  
  def syncTransform(body: PhysicsBody, transformNode: TransformNode): Unit = js.native
  
  def updateBodyInstances(body: PhysicsBody, mesh: Mesh): Unit = js.native
  
  /**
    * Physics plugin world instance
    */
  var world: Any = js.native
}
