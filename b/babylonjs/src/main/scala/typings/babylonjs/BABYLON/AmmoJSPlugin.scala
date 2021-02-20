package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmmoJSPlugin extends IPhysicsEnginePlugin {
  
  var _addHullVerts: js.Any = js.native
  
  var _addMeshVerts: js.Any = js.native
  
  /**
    * Update babylon mesh to match physics world object
    * @param impostor imposter to match
    */
  var _afterSoftStep: js.Any = js.native
  
  var _collisionConfiguration: js.Any = js.native
  
  /**
    * Create cloth for an impostor
    * @param impostor to create the softbody for
    */
  var _createCloth: js.Any = js.native
  
  /**
    * Create a custom physics impostor shape using the plugin's onCreateCustomShape handler
    * @param impostor to create the custom physics shape for
    */
  var _createCustom: js.Any = js.native
  
  /**
    * Create rope for an impostor
    * @param impostor to create the softbody for
    */
  var _createRope: js.Any = js.native
  
  var _createShape: js.Any = js.native
  
  /**
    * Create an impostor's soft body
    * @param impostor to create the softbody for
    */
  var _createSoftbody: js.Any = js.native
  
  var _dispatcher: js.Any = js.native
  
  var _fixedTimeStep: js.Any = js.native
  
  var _isImpostorInContact: js.Any = js.native
  
  var _isImpostorPairInContact: js.Any = js.native
  
  var _maxSteps: js.Any = js.native
  
  var _overlappingPairCache: js.Any = js.native
  
  var _raycastResult: js.Any = js.native
  
  /**
    * Update babylon mesh vertices vertices to match physics world softbody or cloth
    * @param impostor imposter to match
    */
  var _ropeStep: js.Any = js.native
  
  var _softBodySolver: js.Any = js.native
  
  /**
    * Initialise the soft body vertices to match its object's (mesh) vertices
    * Softbody vertices (nodes) are in world space and to match this
    * The object's position and rotation is set to zero and so its vertices are also then set in world space
    * @param impostor to create the softbody for
    */
  var _softVertexData: js.Any = js.native
  
  /**
    * Update babylon mesh vertices vertices to match physics world softbody or cloth
    * @param impostor imposter to match
    */
  var _softbodyOrClothStep: js.Any = js.native
  
  var _solver: js.Any = js.native
  
  var _stepSimulation: js.Any = js.native
  
  var _timeStep: js.Any = js.native
  
  var _tmpAmmoConcreteContactResultCallback: js.Any = js.native
  
  var _tmpAmmoQuaternion: js.Any = js.native
  
  var _tmpAmmoTransform: js.Any = js.native
  
  var _tmpAmmoVectorA: js.Any = js.native
  
  var _tmpAmmoVectorB: js.Any = js.native
  
  var _tmpAmmoVectorC: js.Any = js.native
  
  var _tmpAmmoVectorD: js.Any = js.native
  
  var _tmpAmmoVectorRCA: js.Any = js.native
  
  var _tmpAmmoVectorRCB: js.Any = js.native
  
  var _tmpContactCallbackResult: js.Any = js.native
  
  var _tmpContactPoint: js.Any = js.native
  
  var _tmpMatrix: js.Any = js.native
  
  var _tmpQuaternion: js.Any = js.native
  
  var _useDeltaForWorldStep: js.Any = js.native
  
  /**
    * Append an anchor to a cloth object
    * @param impostor is the cloth impostor to add anchor to
    * @param otherImpostor is the rigid impostor to anchor to
    * @param width ratio across width from 0 to 1
    * @param height ratio up height from 0 to 1
    * @param influence the elasticity between cloth impostor and anchor from 0, very stretchy to 1, little strech
    * @param noCollisionBetweenLinkedBodies when true collisions between soft impostor and anchor are ignored; default false
    */
  @JSName("appendAnchor")
  def appendAnchor_MAmmoJSPlugin(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, width: Double, height: Double): Unit = js.native
  @JSName("appendAnchor")
  def appendAnchor_MAmmoJSPlugin(
    impostor: PhysicsImpostor,
    otherImpostor: PhysicsImpostor,
    width: Double,
    height: Double,
    influence: js.UndefOr[scala.Nothing],
    noCollisionBetweenLinkedBodies: Boolean
  ): Unit = js.native
  @JSName("appendAnchor")
  def appendAnchor_MAmmoJSPlugin(
    impostor: PhysicsImpostor,
    otherImpostor: PhysicsImpostor,
    width: Double,
    height: Double,
    influence: Double
  ): Unit = js.native
  @JSName("appendAnchor")
  def appendAnchor_MAmmoJSPlugin(
    impostor: PhysicsImpostor,
    otherImpostor: PhysicsImpostor,
    width: Double,
    height: Double,
    influence: Double,
    noCollisionBetweenLinkedBodies: Boolean
  ): Unit = js.native
  
  /**
    * Append an hook to a rope object
    * @param impostor is the rope impostor to add hook to
    * @param otherImpostor is the rigid impostor to hook to
    * @param length ratio along the rope from 0 to 1
    * @param influence the elasticity between soft impostor and anchor from 0, very stretchy to 1, little strech
    * @param noCollisionBetweenLinkedBodies when true collisions between soft impostor and anchor are ignored; default false
    */
  @JSName("appendHook")
  def appendHook_MAmmoJSPlugin(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, length: Double): Unit = js.native
  @JSName("appendHook")
  def appendHook_MAmmoJSPlugin(
    impostor: PhysicsImpostor,
    otherImpostor: PhysicsImpostor,
    length: Double,
    influence: js.UndefOr[scala.Nothing],
    noCollisionBetweenLinkedBodies: Boolean
  ): Unit = js.native
  @JSName("appendHook")
  def appendHook_MAmmoJSPlugin(impostor: PhysicsImpostor, otherImpostor: PhysicsImpostor, length: Double, influence: Double): Unit = js.native
  @JSName("appendHook")
  def appendHook_MAmmoJSPlugin(
    impostor: PhysicsImpostor,
    otherImpostor: PhysicsImpostor,
    length: Double,
    influence: Double,
    noCollisionBetweenLinkedBodies: Boolean
  ): Unit = js.native
  
  /**
    * Reference to the Ammo library
    */
  var bjsAMMO: js.Any = js.native
  
  /**
    * Gets positionIterations of the impostor
    * @param impostor impostor to get position iterations from
    * @returns positionIterations value
    */
  @JSName("getBodyPositionIterations")
  def getBodyPositionIterations_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
  
  /**
    * Gets pressure inside the impostor
    * @param impostor impostor to get pressure from
    * @returns pressure value
    */
  @JSName("getBodyPressure")
  def getBodyPressure_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
  
  /**
    * Gets stiffness of the impostor
    * @param impostor impostor to get stiffness from
    * @returns pressure value
    */
  @JSName("getBodyStiffness")
  def getBodyStiffness_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
  
  /**
    * Gets velocityIterations of the impostor
    * @param impostor impostor to get velocity iterations from
    * @returns velocityIterations value
    */
  @JSName("getBodyVelocityIterations")
  def getBodyVelocityIterations_MAmmoJSPlugin(impostor: PhysicsImpostor): Double = js.native
  
  /**
    * The create custom shape handler function to be called when using BABYLON.PhysicsImposter.CustomImpostor
    */
  def onCreateCustomShape(impostor: PhysicsImpostor): js.Any = js.native
  
  /**
    * Sets the angular velocity of the physics body
    * @param impostor imposter to set the velocity on
    * @param velocity velocity to set
    */
  def setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
  
  /**
    * Sets positionIterations of the impostor
    * @param impostor impostor to set position on
    * @param positionIterations positionIterations value
    */
  @JSName("setBodyPositionIterations")
  def setBodyPositionIterations_MAmmoJSPlugin(impostor: PhysicsImpostor, positionIterations: Double): Unit = js.native
  
  /**
    * Sets pressure inside a soft body impostor
    * Cloth and rope must remain 0 pressure
    * @param impostor impostor to set pressure on
    * @param pressure pressure value
    */
  @JSName("setBodyPressure")
  def setBodyPressure_MAmmoJSPlugin(impostor: PhysicsImpostor, pressure: Double): Unit = js.native
  
  /**
    * Sets stiffness of the impostor
    * @param impostor impostor to set stiffness on
    * @param stiffness stiffness value from 0 to 1
    */
  @JSName("setBodyStiffness")
  def setBodyStiffness_MAmmoJSPlugin(impostor: PhysicsImpostor, stiffness: Double): Unit = js.native
  
  /**
    * Sets velocityIterations of the impostor
    * @param impostor impostor to set velocity iterations on
    * @param velocityIterations velocityIterations value
    */
  @JSName("setBodyVelocityIterations")
  def setBodyVelocityIterations_MAmmoJSPlugin(impostor: PhysicsImpostor, velocityIterations: Double): Unit = js.native
  
  /**
    * Increment to step forward in the physics engine (If timeStep is set to 1/60 and fixedTimeStep is set to 1/120 the physics engine should run 2 steps per frame) (Default: 1/60)
    * @param fixedTimeStep fixedTimeStep to use in seconds
    */
  def setFixedTimeStep(fixedTimeStep: Double): Unit = js.native
  
  /**
    * Sets the linear velocity of the physics body
    * @param impostor imposter to set the velocity on
    * @param velocity velocity to set
    */
  def setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): Unit = js.native
  
  /**
    * Sets the maximum number of steps by the physics engine per frame (Default: 5)
    * @param maxSteps the maximum number of steps by the physics engine per frame
    */
  def setMaxSteps(maxSteps: Double): Unit = js.native
  
  /**
    * Sets a motor on the joint
    * @param joint joint to set motor on
    * @param speed speed of the motor
    * @param maxForce maximum force of the motor
    * @param motorIndex index of the motor
    */
  def setMotor(joint: IMotorEnabledJoint): Unit = js.native
  def setMotor(
    joint: IMotorEnabledJoint,
    speed: js.UndefOr[scala.Nothing],
    maxForce: js.UndefOr[scala.Nothing],
    motorIndex: Double
  ): Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: js.UndefOr[scala.Nothing], maxForce: Double): Unit = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: js.UndefOr[scala.Nothing], maxForce: Double, motorIndex: Double): Unit = js.native
}
