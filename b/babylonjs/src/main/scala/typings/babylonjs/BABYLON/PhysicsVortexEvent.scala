package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics vortex event
  */
@js.native
trait PhysicsVortexEvent extends StObject {
  
  /* private */ var _cylinder: Any = js.native
  
  /* private */ var _cylinderPosition: Any = js.native
  
  /* private */ var _dataFetched: Any = js.native
  
  /* private */ var _getImpostorHitData: Any = js.native
  
  /* private */ var _intersectsWithCylinder: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _origin: Any = js.native
  
  /* private */ var _originTop: Any = js.native
  
  /* private */ var _physicsEngine: Any = js.native
  
  /*** Helpers ***/
  /* private */ var _prepareCylinder: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _tick: Any = js.native
  
  /* private */ var _tickCallback: Any = js.native
  
  /**
    * Disables the cortex.
    */
  def disable(): Unit = js.native
  
  /**
    * Disposes the sphere.
    * @param force
    */
  def dispose(): Unit = js.native
  def dispose(force: Boolean): Unit = js.native
  
  /**
    * Enables the vortex.
    */
  def enable(): Unit = js.native
  
  /**
    * Returns the data related to the vortex event (cylinder).
    * @returns The physics vortex event data
    */
  def getData(): PhysicsVortexEventData = js.native
}
