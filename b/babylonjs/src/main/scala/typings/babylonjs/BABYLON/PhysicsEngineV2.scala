package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsEngineV2
  extends StObject
     with IPhysicsEngine {
  
  /** @internal */
  /* private */ var _physicsBodies: Any = js.native
  
  /* private */ var _physicsPlugin: Any = js.native
  
  /* private */ var _subTimeStep: Any = js.native
  
  /**
    * Add a body as an active component of this engine
    * @param body
    */
  def addBody(physicsBody: PhysicsBody): Unit = js.native
  
  /**
    * Returns an array of bodies added to this engine
    */
  def getBodies(): js.Array[PhysicsBody] = js.native
  
  /**
    * Does a raycast in the physics world
    * @param from when should the ray start?
    * @param to when should the ray end?
    * @param result resulting PhysicsRaycastResult
    */
  def raycastToRef(from: Vector3, to: Vector3, result: PhysicsRaycastResult): Unit = js.native
  
  /**
    * Removes a particular body from this engine
    */
  def removeBody(physicsBody: PhysicsBody): Unit = js.native
  
  /**
    * Set the sub time step of the physics engine.
    * Default is 0 meaning there is no sub steps
    * To increase physics resolution precision, set a small value (like 1 ms)
    * @param subTimeStep defines the new sub timestep used for physics resolution.
    */
  def setSubTimeStep(): Unit = js.native
  
  /**
    * Set the time step of the physics engine.
    * Default is 1/60.
    * To slow it down, enter 1/600 for example.
    * To speed it up, 1/30
    * @param newTimeStep defines the new timestep to apply to this world.
    */
  def setTimeStep(): Unit = js.native
}
