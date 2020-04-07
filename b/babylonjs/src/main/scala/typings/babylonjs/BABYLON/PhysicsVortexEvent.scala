package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a physics vortex event
  */
@JSGlobal("BABYLON.PhysicsVortexEvent")
@js.native
class PhysicsVortexEvent protected () extends js.Object {
  /**
    * Initializes the physics vortex event
    * @param _scene The BabylonJS scene
    * @param _origin The origin position of the vortex
    * @param _options The options for the vortex event
    */
  def this(_scene: Scene, _origin: Vector3, _options: PhysicsVortexEventOptions) = this()
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
  var getImpostorHitData: js.Any = js.native
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

