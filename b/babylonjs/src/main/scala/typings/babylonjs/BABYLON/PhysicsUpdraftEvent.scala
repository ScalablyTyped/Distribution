package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics updraft event
  */
@js.native
trait PhysicsUpdraftEvent extends StObject {
  
  var _cylinder: js.Any = js.native
  
  var _cylinderPosition: js.Any = js.native
  
  var _dataFetched: js.Any = js.native
  
  var _intersectsWithCylinder: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _origin: js.Any = js.native
  
  var _originDirection: js.Any = js.native
  
  var _originTop: js.Any = js.native
  
  var _physicsEngine: js.Any = js.native
  
  /*** Helpers ***/
  var _prepareCylinder: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _tick: js.Any = js.native
  
  var _tickCallback: js.Any = js.native
  
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
  
  var getImpostorHitData: js.Any = js.native
}
