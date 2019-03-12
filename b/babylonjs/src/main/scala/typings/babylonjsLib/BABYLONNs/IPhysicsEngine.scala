package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used to define a physics engine
  * @see http://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait IPhysicsEngine extends js.Object {
  /**
    * Gets the gravity vector used by the simulation
    */
  var gravity: Vector3
  /**
    * Called by the scene. No need to call it.
    * @param delta defines the timespam between frames
    */
  def _step(delta: scala.Double): scala.Unit
  /**
    * Adding a new impostor for the impostor tracking.
    * This will be done by the impostor itself.
    * @param impostor the impostor to add
    */
  def addImpostor(impostor: PhysicsImpostor): scala.Unit
  /**
    * Add a joint to the physics engine
    * @param mainImpostor defines the main impostor to which the joint is added.
    * @param connectedImpostor defines the impostor that is connected to the main impostor using this joint
    * @param joint defines the joint that will connect both impostors.
    */
  def addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): scala.Unit
  /**
    * Release all resources
    */
  def dispose(): scala.Unit
  /**
    * Gets the impostor for a physics enabled object
    * @param object defines the object impersonated by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  def getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): Nullable[PhysicsImpostor]
  /**
    * Gets the impostor for a physics body object
    * @param body defines physics body used by the impostor
    * @returns the PhysicsImpostor or null if not found
    */
  def getImpostorWithPhysicsBody(body: js.Any): Nullable[PhysicsImpostor]
  /**
    * Gets the list of physic impostors
    * @returns an array of PhysicsImpostor
    */
  def getImpostors(): js.Array[PhysicsImpostor]
  /**
    * Gets the current plugin used to run the simulation
    * @returns current plugin
    */
  def getPhysicsPlugin(): IPhysicsEnginePlugin
  /**
    * Gets the name of the current physics plugin
    * @returns the name of the plugin
    */
  def getPhysicsPluginName(): java.lang.String
  /**
    * Get the time step of the physics engine.
    * @returns the current time step
    */
  def getTimeStep(): scala.Double
  /**
    * Remove an impostor from the engine.
    * This impostor and its mesh will not longer be updated by the physics engine.
    * @param impostor the impostor to remove
    */
  def removeImpostor(impostor: PhysicsImpostor): scala.Unit
  /**
    * Removes a joint from the simulation
    * @param mainImpostor defines the impostor used with the joint
    * @param connectedImpostor defines the other impostor connected to the main one by the joint
    * @param joint defines the joint to remove
    */
  def removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): scala.Unit
  /**
    * Sets the gravity vector used by the simulation
    * @param gravity defines the gravity vector to use
    */
  def setGravity(gravity: Vector3): scala.Unit
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep the new timestep to apply to this world.
    */
  def setTimeStep(newTimeStep: scala.Double): scala.Unit
}

object IPhysicsEngine {
  @scala.inline
  def apply(
    _step: scala.Double => scala.Unit,
    addImpostor: PhysicsImpostor => scala.Unit,
    addJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => scala.Unit,
    dispose: () => scala.Unit,
    getImpostorForPhysicsObject: IPhysicsEnabledObject => Nullable[PhysicsImpostor],
    getImpostorWithPhysicsBody: js.Any => Nullable[PhysicsImpostor],
    getImpostors: () => js.Array[PhysicsImpostor],
    getPhysicsPlugin: () => IPhysicsEnginePlugin,
    getPhysicsPluginName: () => java.lang.String,
    getTimeStep: () => scala.Double,
    gravity: Vector3,
    removeImpostor: PhysicsImpostor => scala.Unit,
    removeJoint: (PhysicsImpostor, PhysicsImpostor, PhysicsJoint) => scala.Unit,
    setGravity: Vector3 => scala.Unit,
    setTimeStep: scala.Double => scala.Unit
  ): IPhysicsEngine = {
    val __obj = js.Dynamic.literal(_step = js.Any.fromFunction1(_step), addImpostor = js.Any.fromFunction1(addImpostor), addJoint = js.Any.fromFunction3(addJoint), dispose = js.Any.fromFunction0(dispose), getImpostorForPhysicsObject = js.Any.fromFunction1(getImpostorForPhysicsObject), getImpostorWithPhysicsBody = js.Any.fromFunction1(getImpostorWithPhysicsBody), getImpostors = js.Any.fromFunction0(getImpostors), getPhysicsPlugin = js.Any.fromFunction0(getPhysicsPlugin), getPhysicsPluginName = js.Any.fromFunction0(getPhysicsPluginName), getTimeStep = js.Any.fromFunction0(getTimeStep), gravity = gravity, removeImpostor = js.Any.fromFunction1(removeImpostor), removeJoint = js.Any.fromFunction3(removeJoint), setGravity = js.Any.fromFunction1(setGravity), setTimeStep = js.Any.fromFunction1(setTimeStep))
  
    __obj.asInstanceOf[IPhysicsEngine]
  }
}

