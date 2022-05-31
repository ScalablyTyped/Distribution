package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics updraft event
  */
@js.native
trait PhysicsUpdraftEvent extends StObject {
  
  /* private */ var _cylinder: js.Any = js.native
  
  /* private */ var _cylinderPosition: js.Any = js.native
  
  /* private */ var _dataFetched: js.Any = js.native
  
  /* private */ var _intersectsWithCylinder: js.Any = js.native
  
  /* private */ var _options: js.Any = js.native
  
  /* private */ var _origin: js.Any = js.native
  
  /* private */ var _originDirection: js.Any = js.native
  
  /* private */ var _originTop: js.Any = js.native
  
  /* private */ var _physicsEngine: js.Any = js.native
  
  /*** Helpers ***/
  /* private */ var _prepareCylinder: js.Any = js.native
  
  /* private */ var _scene: js.Any = js.native
  
  /* private */ var _tick: js.Any = js.native
  
  /* private */ var _tickCallback: js.Any = js.native
  
  /**
    * Disables the updraft.
    */
  def disable(): Unit = js.native
  
  /**
    * Disposes the cylinder.
    * @param force Specifies if the updraft should be disposed by force
    */
  def dispose(): Unit = js.native
  def dispose(force: Boolean): Unit = js.native
  
  /**
    * Enables the updraft.
    */
  def enable(): Unit = js.native
  
  /**
    * Returns the data related to the updraft event (cylinder).
    * @returns A physics updraft event
    */
  def getData(): PhysicsUpdraftEventData = js.native
  
  /* private */ var getImpostorHitData: js.Any = js.native
}
