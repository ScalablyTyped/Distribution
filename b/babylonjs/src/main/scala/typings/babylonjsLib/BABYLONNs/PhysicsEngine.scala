package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to control physics engine
  * @see http://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsEngine")
@js.native
class PhysicsEngine protected () extends IPhysicsEngine {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[Vector3]) = this()
  def this(gravity: Nullable[Vector3], _physicsPlugin: IPhysicsEnginePlugin) = this()
  var _impostors: js.Any = js.native
  var _joints: js.Any = js.native
  var _physicsPlugin: js.Any = js.native
  /**
    * Gets the gravity vector used by the simulation
    */
  /* CompleteClass */
  override var gravity: Vector3 = js.native
  /**
    * Called by the scene. No need to call it.
    * @param delta defines the timespam between frames
    */
  /* CompleteClass */
  override def _step(delta: scala.Double): scala.Unit = js.native
  /**
    * Adding a new impostor for the impostor tracking.
    * This will be done by the impostor itself.
    * @param impostor the impostor to add
    */
  /* CompleteClass */
  override def addImpostor(impostor: PhysicsImpostor): scala.Unit = js.native
  /**
    * Add a joint to the physics engine
    * @param mainImpostor defines the main impostor to which the joint is added.
    * @param connectedImpostor defines the impostor that is connected to the main impostor using this joint
    * @param joint defines the joint that will connect both impostors.
    */
  /* CompleteClass */
  override def addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): scala.Unit = js.native
  /**
    * Release all resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Gets the impostor for a physics enabled object
    * @param object defines the object impersonated by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  /* CompleteClass */
  override def getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): Nullable[PhysicsImpostor] = js.native
  /**
    * Gets the impostor for a physics body object
    * @param body defines physics body used by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  /* CompleteClass */
  override def getImpostorWithPhysicsBody(body: js.Any): Nullable[PhysicsImpostor] = js.native
  /**
    * Gets the list of physic impostors
    * @returns an array of PhysicsImpostor
    */
  /* CompleteClass */
  override def getImpostors(): js.Array[PhysicsImpostor] = js.native
  /**
    * Gets the current plugin used to run the simulation
    * @returns current plugin
    */
  /* CompleteClass */
  override def getPhysicsPlugin(): IPhysicsEnginePlugin = js.native
  /**
    * Gets the name of the current physics plugin
    * @returns the name of the plugin
    */
  /* CompleteClass */
  override def getPhysicsPluginName(): java.lang.String = js.native
  /**
    * Get the time step of the physics engine.
    * @returns the current time step
    */
  /* CompleteClass */
  override def getTimeStep(): scala.Double = js.native
  /**
    * Remove an impostor from the engine.
    * This impostor and its mesh will not longer be updated by the physics engine.
    * @param impostor the impostor to remove
    */
  /* CompleteClass */
  override def removeImpostor(impostor: PhysicsImpostor): scala.Unit = js.native
  /**
    * Removes a joint from the simulation
    * @param mainImpostor defines the impostor used with the joint
    * @param connectedImpostor defines the other impostor connected to the main one by the joint
    * @param joint defines the joint to remove
    */
  /* CompleteClass */
  override def removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): scala.Unit = js.native
  /**
    * Sets the gravity vector used by the simulation
    * @param gravity defines the gravity vector to use
    */
  /* CompleteClass */
  override def setGravity(gravity: Vector3): scala.Unit = js.native
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep defines the new timestep to apply to this world.
    */
  def setTimeStep(): scala.Unit = js.native
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep the new timestep to apply to this world.
    */
  /* CompleteClass */
  override def setTimeStep(newTimeStep: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.PhysicsEngine")
@js.native
object PhysicsEngine extends js.Object {
  /**
    * Global value used to control the smallest number supported by the simulation
    */
  var Epsilon: scala.Double = js.native
}

