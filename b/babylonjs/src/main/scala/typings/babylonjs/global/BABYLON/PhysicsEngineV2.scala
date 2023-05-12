package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IPhysicsEnginePlugin
import typings.babylonjs.BABYLON.IPhysicsEnginePluginV2
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsEngineV2")
@js.native
open class PhysicsEngineV2 protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsEngineV2 {
  /**
    * Creates a new Physics Engine
    * @param gravity defines the gravity vector used by the simulation
    * @param _physicsPlugin defines the plugin to use (CannonJS by default)
    */
  def this(gravity: Nullable[typings.babylonjs.BABYLON.Vector3]) = this()
  def this(gravity: Nullable[typings.babylonjs.BABYLON.Vector3], _physicsPlugin: IPhysicsEnginePluginV2) = this()
  
  /**
    * Called by the scene. No need to call it.
    * @param delta defines the timespan between frames
    */
  /* CompleteClass */
  override def _step(delta: Double): Unit = js.native
  
  /**
    * Release all resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets the current plugin used to run the simulation
    * @returns current plugin
    */
  /* CompleteClass */
  override def getPhysicsPlugin(): IPhysicsEnginePlugin | IPhysicsEnginePluginV2 | Null = js.native
  
  /**
    * Gets the name of the current physics plugin
    * @returns the name of the plugin
    */
  /* CompleteClass */
  override def getPhysicsPluginName(): String = js.native
  
  /**
    *
    */
  /* CompleteClass */
  override def getPluginVersion(): Double = js.native
  
  /**
    * Get the sub time step of the physics engine.
    * @returns the current sub time step
    */
  /* CompleteClass */
  override def getSubTimeStep(): Double = js.native
  
  /**
    * Get the time step of the physics engine.
    * @returns the current time step
    */
  /* CompleteClass */
  override def getTimeStep(): Double = js.native
  
  /**
    * Gets the gravity vector used by the simulation
    */
  /* CompleteClass */
  var gravity: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Does a raycast in the physics world
    * @param from when should the ray start?
    * @param to when should the ray end?
    * @returns PhysicsRaycastResult
    */
  /* CompleteClass */
  override def raycast(from: typings.babylonjs.BABYLON.Vector3, to: typings.babylonjs.BABYLON.Vector3): typings.babylonjs.BABYLON.PhysicsRaycastResult = js.native
  
  /**
    * Sets the gravity vector used by the simulation
    * @param gravity defines the gravity vector to use
    */
  /* CompleteClass */
  override def setGravity(gravity: typings.babylonjs.BABYLON.Vector3): Unit = js.native
  
  /**
    * Set the sub time step of the physics engine.
    * Default is 0 meaning there is no sub steps
    * To increase physics resolution precision, set a small value (like 1 ms)
    * @param subTimeStep defines the new sub timestep used for physics resolution.
    */
  /* CompleteClass */
  override def setSubTimeStep(subTimeStep: Double): Unit = js.native
  
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep the new timestep to apply to this world.
    */
  /* CompleteClass */
  override def setTimeStep(newTimeStep: Double): Unit = js.native
}
/* static members */
object PhysicsEngineV2 {
  
  @JSGlobal("BABYLON.PhysicsEngineV2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Factory used to create the default physics plugin.
    * @returns The default physics plugin
    */
  inline def DefaultPluginFactory(): IPhysicsEnginePluginV2 = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPluginFactory")().asInstanceOf[IPhysicsEnginePluginV2]
}
