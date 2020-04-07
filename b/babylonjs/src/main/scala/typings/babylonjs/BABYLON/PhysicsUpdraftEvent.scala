package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a physics updraft event
  */
@JSGlobal("BABYLON.PhysicsUpdraftEvent")
@js.native
class PhysicsUpdraftEvent protected () extends js.Object {
  /**
    * Initializes the physics updraft event
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the updraft
    * @param _options The options for the updraft event
    */
  def this(_scene: Scene, _origin: Vector3, _options: PhysicsUpdraftEventOptions) = this()
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
  var getImpostorHitData: js.Any = js.native
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
}

