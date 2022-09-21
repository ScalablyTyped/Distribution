package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a gravitational field event
  */
@js.native
trait PhysicsGravitationalFieldEvent extends StObject {
  
  /* private */ var _dataFetched: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _origin: Any = js.native
  
  /* private */ var _physicsHelper: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _sphere: Any = js.native
  
  /* private */ var _tick: Any = js.native
  
  /* private */ var _tickCallback: Any = js.native
  
  /**
    * Disables the gravitational field.
    */
  def disable(): Unit = js.native
  
  /**
    * Disposes the sphere.
    * @param force The force to dispose from the gravitational field event
    */
  def dispose(): Unit = js.native
  def dispose(force: Boolean): Unit = js.native
  
  /**
    * Enables the gravitational field.
    */
  def enable(): Unit = js.native
  
  /**
    * Returns the data related to the gravitational field event (sphere).
    * @returns A gravitational field event
    */
  def getData(): PhysicsGravitationalFieldEventData = js.native
}
