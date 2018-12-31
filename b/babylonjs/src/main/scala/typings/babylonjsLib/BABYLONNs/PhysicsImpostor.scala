package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a physics imposter
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsImpostor")
@js.native
class PhysicsImpostor protected () extends js.Object {
  /**
    * Initializes the physics imposter
    * @param object The physics-enabled object used as the physics imposter
    * @param type The type of the physics imposter
    * @param _options The options for the physics imposter
    * @param _scene The Babylon scene
    */
  def this(/**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject, /**
    * The type of the physics imposter
    */
  `type`: scala.Double) = this()
  def this(/**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject, /**
    * The type of the physics imposter
    */
  `type`: scala.Double, _options: PhysicsImpostorParameters) = this()
  def this(/**
    * The physics-enabled object used as the physics imposter
    */
  `object`: IPhysicsEnabledObject, /**
    * The type of the physics imposter
    */
  `type`: scala.Double, _options: PhysicsImpostorParameters, _scene: Scene) = this()
  var _bodyUpdateRequired: js.Any = js.native
  var _deltaPosition: js.Any = js.native
  var _deltaRotation: js.Any = js.native
  var _deltaRotationConjugated: js.Any = js.native
  var _getPhysicsParent: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _joints: js.Any = js.native
  var _onAfterPhysicsStepCallbacks: js.Any = js.native
  var _onBeforePhysicsStepCallbacks: js.Any = js.native
  var _onPhysicsCollideCallbacks: js.Any = js.native
  var _options: js.Any = js.native
  var _parent: js.Any = js.native
  var _physicsBody: js.Any = js.native
  var _physicsEngine: js.Any = js.native
  var _scene: js.UndefOr[js.Any] = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpQuat2: js.Any = js.native
  /**
    * Gets the coefficient of friction
    */
  /**
    * Sets the coefficient of friction
    */
  var friction: scala.Double = js.native
  /**
    * Specifies if the physics imposter is disposed
    */
  val isDisposed: scala.Boolean = js.native
  /**
    * Gets the mass of the physics imposter
    */
  var mass: scala.Double = js.native
  /**
    * The physics-enabled object used as the physics imposter
    */
  var `object`: IPhysicsEnabledObject = js.native
  /**
    * Legacy collision detection event support
    */
  var onCollideEvent: Nullable[js.Function2[/* collider */ this.type, /* collidedWith */ this.type, scala.Unit]] = js.native
  /**
    * Get the parent of the physics imposter
    * @returns Physics imposter or null
    */
  /**
    * Sets the parent of the physics imposter
    */
  var parent: Nullable[PhysicsImpostor] = js.native
  /**
    * Gets the body that holds this impostor. Either its own, or its parent.
    */
  /**
    * Set the physics body. Used mainly by the physics engine/plugin
    */
  var physicsBody: js.Any = js.native
  /**
    * Gets the coefficient of restitution
    */
  /**
    * Sets the coefficient of restitution
    */
  var restitution: scala.Double = js.native
  /**
    * The type of the physics imposter
    */
  var `type`: scala.Double = js.native
  /**
    * The unique id of the physics imposter
    * set by the physics engine when adding this impostor to the array
    */
  var uniqueId: scala.Double = js.native
  /**
    * This function will completly initialize this impostor.
    * It will create a new body - but only if this mesh has no parent.
    * If it has, this impostor will not be used other than to define the impostor
    * of the child mesh.
    * @hidden
    */
  def _init(): scala.Unit = js.native
  /**
    * Add a joint to this impostor with a different impostor
    * @param otherImpostor A physics imposter used to add a joint
    * @param joint The joint to add
    * @returns The physics imposter
    */
  def addJoint(otherImpostor: PhysicsImpostor, joint: PhysicsJoint): PhysicsImpostor = js.native
  /**
    * this function is executed by the physics engine
    */
  def afterStep(): scala.Unit = js.native
  /**
    * Apply a force
    * @param force The force to apply
    * @param contactPoint The contact point for the force
    * @returns The physics imposter
    */
  def applyForce(force: Vector3, contactPoint: Vector3): PhysicsImpostor = js.native
  /**
    * Apply an impulse
    * @param force The impulse force
    * @param contactPoint The contact point for the impulse force
    * @returns The physics imposter
    */
  def applyImpulse(force: Vector3, contactPoint: Vector3): PhysicsImpostor = js.native
  /**
    * this function is executed by the physics engine.
    */
  def beforeStep(): scala.Unit = js.native
  /**
    * Clones the physics imposter
    * @param newObject The physics imposter clones to this physics-enabled object
    * @returns A nullable physics imposter
    */
  def clone(newObject: IPhysicsEnabledObject): Nullable[PhysicsImpostor] = js.native
  /**
    * A help function to create a joint
    * @param otherImpostor A physics imposter used to create a joint
    * @param jointType The type of joint
    * @param jointData The data for the joint
    * @returns The physics imposter
    */
  def createJoint(otherImpostor: PhysicsImpostor, jointType: scala.Double, jointData: PhysicsJointData): PhysicsImpostor = js.native
  /**
    * Disposes the physics imposter
    */
  def dispose(): scala.Unit = js.native
  /**
    * Execute a function with the physics plugin native code
    * Provide a function the will have two variables - the world object and the physics body object
    * @param func The function to execute with the physics plugin native code
    */
  def executeNativeFunction(func: js.Function2[/* world */ js.Any, /* physicsBody */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Force a regeneration of this or the parent's impostor's body.
    * Use under cautious - This will remove all joints already implemented.
    */
  def forceUpdate(): scala.Unit = js.native
  /**
    * Gets the angular velocity
    * @returns angular velocity or null
    */
  def getAngularVelocity(): Nullable[Vector3] = js.native
  /**
    * Gets the box size of the physics imposter and stores the result in the input parameter
    * @param result Stores the box size
    * @returns The physics imposter
    */
  def getBoxSizeToRef(result: Vector3): PhysicsImpostor = js.native
  /**
    * Gets the linear velocity
    * @returns  linear velocity or null
    */
  def getLinearVelocity(): Nullable[Vector3] = js.native
  /**
    * Gets the object center
    * @returns The object center
    */
  def getObjectCenter(): Vector3 = js.native
  /**
    * Gets the object extend size
    * @returns the object extend size
    */
  def getObjectExtendSize(): Vector3 = js.native
  /**
    * Get a specific parametes from the options parameter
    * @param paramName The object parameter name
    * @returns The object parameter
    */
  def getParam(paramName: java.lang.String): js.Any = js.native
  /**
    * Get the parent rotation
    * @returns The parent rotation
    */
  def getParentsRotation(): Quaternion = js.native
  /**
    * Gets the radius of the physics imposter
    * @returns Radius of the physics imposter
    */
  def getRadius(): scala.Double = js.native
  /**
    * Should a new body be generated.
    * @returns boolean specifying if body initialization is required
    */
  def isBodyInitRequired(): scala.Boolean = js.native
  /**
    * event and body object due to cannon's event-based architecture.
    */
  def onCollide(e: babylonjsLib.Anon_Body): scala.Unit = js.native
  /**
    * Register a function that will be executed after the physics step
    * @param func The function to execute after physics step
    */
  def registerAfterPhysicsStep(func: js.Function1[/* impostor */ this.type, scala.Unit]): scala.Unit = js.native
  /**
    * Register a function that will be executed before the physics world is stepping forward
    * @param func The function to execute before the physics world is stepped forward
    */
  def registerBeforePhysicsStep(func: js.Function1[/* impostor */ this.type, scala.Unit]): scala.Unit = js.native
  /**
    * register a function that will be executed when this impostor collides against a different body
    * @param collideAgainst Physics imposter, or array of physics imposters to collide against
    * @param func Callback that is executed on collision
    */
  def registerOnPhysicsCollide(
    collideAgainst: PhysicsImpostor,
    func: js.Function2[/* collider */ this.type, /* collidedAgainst */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def registerOnPhysicsCollide(
    collideAgainst: js.Array[PhysicsImpostor],
    func: js.Function2[/* collider */ this.type, /* collidedAgainst */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Resets the update flags
    */
  def resetUpdateFlags(): scala.Unit = js.native
  /**
    * Sets the angular velocity
    * @param velocity The velocity or null
    */
  def setAngularVelocity(velocity: Nullable[Vector3]): scala.Unit = js.native
  /**
    * Sets the delta position
    * @param position The delta position amount
    */
  def setDeltaPosition(position: Vector3): scala.Unit = js.native
  /**
    * Sets the delta rotation
    * @param rotation The delta rotation amount
    */
  def setDeltaRotation(rotation: Quaternion): scala.Unit = js.native
  /**
    * Sets the linear velocity
    * @param velocity  linear velocity or null
    */
  def setLinearVelocity(velocity: Nullable[Vector3]): scala.Unit = js.native
  /**
    * Specifically change the body's mass option. Won't recreate the physics body object
    * @param mass The mass of the physics imposter
    */
  def setMass(mass: scala.Double): scala.Unit = js.native
  /**
    * Sets a specific parameter in the options given to the physics plugin
    * @param paramName The parameter name
    * @param value The value of the parameter
    */
  def setParam(paramName: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
    * Sets the updated scaling
    * @param updated Specifies if the scaling is updated
    */
  def setScalingUpdated(updated: scala.Boolean): scala.Unit = js.native
  /**
    * Will keep this body still, in a sleep mode.
    * @returns the physics imposter
    */
  def sleep(): PhysicsImpostor = js.native
  /**
    * Sync a bone with this impostor
    * @param bone The bone to sync to the impostor.
    * @param boneMesh The mesh that the bone is influencing.
    * @param jointPivot The pivot of the joint / bone in local space.
    * @param distToJoint Optional distance from the impostor to the joint.
    * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
    */
  def syncBoneWithImpostor(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3): scala.Unit = js.native
  def syncBoneWithImpostor(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: scala.Double): scala.Unit = js.native
  def syncBoneWithImpostor(
    bone: Bone,
    boneMesh: AbstractMesh,
    jointPivot: Vector3,
    distToJoint: scala.Double,
    adjustRotation: Quaternion
  ): scala.Unit = js.native
  /**
    * Sync impostor to a bone
    * @param bone The bone that the impostor will be synced to.
    * @param boneMesh The mesh that the bone is influencing.
    * @param jointPivot The pivot of the joint / bone in local space.
    * @param distToJoint Optional distance from the impostor to the joint.
    * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
    * @param boneAxis Optional vector3 axis the bone is aligned with
    */
  def syncImpostorWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3): scala.Unit = js.native
  def syncImpostorWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: scala.Double): scala.Unit = js.native
  def syncImpostorWithBone(
    bone: Bone,
    boneMesh: AbstractMesh,
    jointPivot: Vector3,
    distToJoint: scala.Double,
    adjustRotation: Quaternion
  ): scala.Unit = js.native
  def syncImpostorWithBone(
    bone: Bone,
    boneMesh: AbstractMesh,
    jointPivot: Vector3,
    distToJoint: scala.Double,
    adjustRotation: Quaternion,
    boneAxis: Vector3
  ): scala.Unit = js.native
  /**
    * Unregisters a function that will be executed after the physics step
    * @param func The function to execute after physics step
    */
  def unregisterAfterPhysicsStep(func: js.Function1[/* impostor */ this.type, scala.Unit]): scala.Unit = js.native
  /**
    * Unregister a function that will be executed before the physics world is stepping forward
    * @param func The function to execute before the physics world is stepped forward
    */
  def unregisterBeforePhysicsStep(func: js.Function1[/* impostor */ this.type, scala.Unit]): scala.Unit = js.native
  /**
    * Unregisters the physics imposter on contact
    * @param collideAgainst The physics object to collide against
    * @param func Callback to execute on collision
    */
  def unregisterOnPhysicsCollide(
    collideAgainst: PhysicsImpostor,
    func: js.Function2[
      /* collider */ this.type, 
      /* collidedAgainst */ this.type | js.Array[this.type], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def unregisterOnPhysicsCollide(
    collideAgainst: js.Array[PhysicsImpostor],
    func: js.Function2[
      /* collider */ this.type, 
      /* collidedAgainst */ this.type | js.Array[this.type], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Wake the body up.
    * @returns The physics imposter
    */
  def wakeUp(): PhysicsImpostor = js.native
}

/**
  * Represents a physics imposter
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsImpostor")
@js.native
object PhysicsImpostor extends js.Object {
  /**
    * Box-Imposter type
    */
  var BoxImpostor: scala.Double = js.native
  /**
    * Cylinder-Imposter type
    */
  var CylinderImpostor: scala.Double = js.native
  /**
    * The default object size of the imposter
    */
  var DEFAULT_OBJECT_SIZE: babylonjsLib.BABYLONNs.Vector3 = js.native
  /**
    * Heightmap-Imposter type
    */
  var HeightmapImpostor: scala.Double = js.native
  /**
    * The identity quaternion of the imposter
    */
  var IDENTITY_QUATERNION: babylonjsLib.BABYLONNs.Quaternion = js.native
  /**
    * Mesh-imposter type
    */
  var MeshImpostor: scala.Double = js.native
  /**
    * No-Imposter type
    */
  var NoImpostor: scala.Double = js.native
  /**
    * Particle-Imposter type
    */
  var ParticleImpostor: scala.Double = js.native
  /**
    * Plane-Imposter type
    */
  var PlaneImpostor: scala.Double = js.native
  /**
    * Sphere-Imposter type
    */
  var SphereImpostor: scala.Double = js.native
  var _tmpQuat: js.Any = js.native
  var _tmpVecs: js.Any = js.native
}

