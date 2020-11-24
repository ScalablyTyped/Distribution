package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics vortex event
  */
@js.native
trait PhysicsVortexEvent extends js.Object {
  
  var _cylinder: js.Any = js.native
  
  var _cylinderPosition: js.Any = js.native
  
  var _dataFetched: js.Any = js.native
  
  var _intersectsWithCylinder: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _origin: js.Any = js.native
  
  var _originTop: js.Any = js.native
  
  var _physicsEngine: js.Any = js.native
  
  /*** Helpers ***/
  var _prepareCylinder: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _tick: js.Any = js.native
  
  var _tickCallback: js.Any = js.native
  
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
  
  var getImpostorHitData: js.Any = js.native
}
