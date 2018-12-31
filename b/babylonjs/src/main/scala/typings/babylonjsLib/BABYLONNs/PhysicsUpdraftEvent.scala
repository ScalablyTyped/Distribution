package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a physics updraft event
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsUpdraftEvent")
@js.native
class PhysicsUpdraftEvent protected () extends js.Object {
  /**
    * Initializes the physics updraft event
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the updraft
    * @param _radius The radius of the updraft
    * @param _strength The strength of the updraft
    * @param _height The height of the updraft
    * @param _updraftMode The mode of the updraft
    */
  def this(_scene: Scene, _origin: Vector3, _radius: scala.Double, _strength: scala.Double, _height: scala.Double, _updraftMode: PhysicsUpdraftMode) = this()
  var _cylinder: js.Any = js.native
  var _cylinderPosition: js.Any = js.native
  var _dataFetched: js.Any = js.native
  var _height: js.Any = js.native
  var _intersectsWithCylinder: js.Any = js.native
  var _origin: js.Any = js.native
  var _originDirection: js.Any = js.native
  var _originTop: js.Any = js.native
  var _physicsEngine: js.Any = js.native
  /*** Helpers ***/
  var _prepareCylinder: js.Any = js.native
  var _radius: js.Any = js.native
  var _scene: js.Any = js.native
  var _strength: js.Any = js.native
  var _tick: js.Any = js.native
  var _tickCallback: js.Any = js.native
  var _updraftMode: js.Any = js.native
  var getImpostorForceAndContactPoint: js.Any = js.native
  /**
    * Disables the cortex.
    */
  def disable(): scala.Unit = js.native
  /**
    * Disposes the sphere.
    * @param force Specifies if the updraft should be disposed by force
    */
  def dispose(): scala.Unit = js.native
  def dispose(force: scala.Boolean): scala.Unit = js.native
  /**
    * Enables the updraft.
    */
  def enable(): scala.Unit = js.native
  /**
    * Returns the data related to the updraft event (cylinder).
    * @returns A physics updraft event
    */
  def getData(): PhysicsUpdraftEventData = js.native
}

