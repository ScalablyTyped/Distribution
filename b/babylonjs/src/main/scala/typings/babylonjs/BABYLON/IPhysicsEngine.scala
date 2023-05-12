package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPhysicsEngine extends StObject {
  
  /**
    * Called by the scene. No need to call it.
    * @param delta defines the timespan between frames
    */
  def _step(delta: Double): Unit
  
  /**
    * Release all resources
    */
  def dispose(): Unit
  
  /**
    * Gets the current plugin used to run the simulation
    * @returns current plugin
    */
  def getPhysicsPlugin(): IPhysicsEnginePlugin | IPhysicsEnginePluginV2 | Null
  
  /**
    * Gets the name of the current physics plugin
    * @returns the name of the plugin
    */
  def getPhysicsPluginName(): String
  
  /**
    *
    */
  def getPluginVersion(): Double
  
  /**
    * Get the sub time step of the physics engine.
    * @returns the current sub time step
    */
  def getSubTimeStep(): Double
  
  /**
    * Get the time step of the physics engine.
    * @returns the current time step
    */
  def getTimeStep(): Double
  
  /**
    * Gets the gravity vector used by the simulation
    */
  var gravity: Vector3
  
  /**
    * Does a raycast in the physics world
    * @param from when should the ray start?
    * @param to when should the ray end?
    * @returns PhysicsRaycastResult
    */
  def raycast(from: Vector3, to: Vector3): PhysicsRaycastResult
  
  /**
    * Sets the gravity vector used by the simulation
    * @param gravity defines the gravity vector to use
    */
  def setGravity(gravity: Vector3): Unit
  
  /**
    * Set the sub time step of the physics engine.
    * Default is 0 meaning there is no sub steps
    * To increase physics resolution precision, set a small value (like 1 ms)
    * @param subTimeStep defines the new sub timestep used for physics resolution.
    */
  def setSubTimeStep(subTimeStep: Double): Unit
  
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep the new timestep to apply to this world.
    */
  def setTimeStep(newTimeStep: Double): Unit
}
object IPhysicsEngine {
  
  inline def apply(
    _step: Double => Unit,
    dispose: () => Unit,
    getPhysicsPlugin: () => IPhysicsEnginePlugin | IPhysicsEnginePluginV2 | Null,
    getPhysicsPluginName: () => String,
    getPluginVersion: () => Double,
    getSubTimeStep: () => Double,
    getTimeStep: () => Double,
    gravity: Vector3,
    raycast: (Vector3, Vector3) => PhysicsRaycastResult,
    setGravity: Vector3 => Unit,
    setSubTimeStep: Double => Unit,
    setTimeStep: Double => Unit
  ): IPhysicsEngine = {
    val __obj = js.Dynamic.literal(_step = js.Any.fromFunction1(_step), dispose = js.Any.fromFunction0(dispose), getPhysicsPlugin = js.Any.fromFunction0(getPhysicsPlugin), getPhysicsPluginName = js.Any.fromFunction0(getPhysicsPluginName), getPluginVersion = js.Any.fromFunction0(getPluginVersion), getSubTimeStep = js.Any.fromFunction0(getSubTimeStep), getTimeStep = js.Any.fromFunction0(getTimeStep), gravity = gravity.asInstanceOf[js.Any], raycast = js.Any.fromFunction2(raycast), setGravity = js.Any.fromFunction1(setGravity), setSubTimeStep = js.Any.fromFunction1(setSubTimeStep), setTimeStep = js.Any.fromFunction1(setTimeStep))
    __obj.asInstanceOf[IPhysicsEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPhysicsEngine] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setGetPhysicsPlugin(value: () => IPhysicsEnginePlugin | IPhysicsEnginePluginV2 | Null): Self = StObject.set(x, "getPhysicsPlugin", js.Any.fromFunction0(value))
    
    inline def setGetPhysicsPluginName(value: () => String): Self = StObject.set(x, "getPhysicsPluginName", js.Any.fromFunction0(value))
    
    inline def setGetPluginVersion(value: () => Double): Self = StObject.set(x, "getPluginVersion", js.Any.fromFunction0(value))
    
    inline def setGetSubTimeStep(value: () => Double): Self = StObject.set(x, "getSubTimeStep", js.Any.fromFunction0(value))
    
    inline def setGetTimeStep(value: () => Double): Self = StObject.set(x, "getTimeStep", js.Any.fromFunction0(value))
    
    inline def setGravity(value: Vector3): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setRaycast(value: (Vector3, Vector3) => PhysicsRaycastResult): Self = StObject.set(x, "raycast", js.Any.fromFunction2(value))
    
    inline def setSetGravity(value: Vector3 => Unit): Self = StObject.set(x, "setGravity", js.Any.fromFunction1(value))
    
    inline def setSetSubTimeStep(value: Double => Unit): Self = StObject.set(x, "setSubTimeStep", js.Any.fromFunction1(value))
    
    inline def setSetTimeStep(value: Double => Unit): Self = StObject.set(x, "setTimeStep", js.Any.fromFunction1(value))
    
    inline def set_step(value: Double => Unit): Self = StObject.set(x, "_step", js.Any.fromFunction1(value))
  }
}
