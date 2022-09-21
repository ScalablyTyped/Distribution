package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsEngine
  extends StObject
     with IPhysicsEngine {
  
  /* private */ var _impostors: Any = js.native
  
  /* private */ var _joints: Any = js.native
  
  /* private */ var _physicsPlugin: Any = js.native
  
  /* private */ var _subTimeStep: Any = js.native
  
  /* private */ var _uniqueIdCounter: Any = js.native
  
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
