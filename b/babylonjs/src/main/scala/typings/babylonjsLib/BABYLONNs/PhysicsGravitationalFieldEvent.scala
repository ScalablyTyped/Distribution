package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a gravitational field event
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsGravitationalFieldEvent")
@js.native
class PhysicsGravitationalFieldEvent protected () extends js.Object {
  /**
    * Initializes the physics gravitational field event
    * @param physicsHelper A physics helper
    * @param scene BabylonJS scene
    * @param origin The origin position of the gravitational field event
    * @param radius The radius of the gravitational field event
    * @param strength The strength of the gravitational field event
    * @param falloff The falloff for the gravitational field event
    */
  def this(physicsHelper: PhysicsHelper, scene: Scene, origin: Vector3, radius: scala.Double, strength: scala.Double) = this()
  def this(physicsHelper: PhysicsHelper, scene: Scene, origin: Vector3, radius: scala.Double, strength: scala.Double, falloff: PhysicsRadialImpulseFalloff) = this()
  var _dataFetched: js.Any = js.native
  var _falloff: js.Any = js.native
  var _origin: js.Any = js.native
  var _physicsHelper: js.Any = js.native
  var _radius: js.Any = js.native
  var _scene: js.Any = js.native
  var _sphere: js.Any = js.native
  var _strength: js.Any = js.native
  var _tick: js.Any = js.native
  var _tickCallback: js.Any = js.native
  /**
    * Disables the gravitational field.
    */
  def disable(): scala.Unit = js.native
  /**
    * Disposes the sphere.
    * @param force The force to dispose from the gravitational field event
    */
  def dispose(): scala.Unit = js.native
  def dispose(force: scala.Boolean): scala.Unit = js.native
  /**
    * Enables the gravitational field.
    */
  def enable(): scala.Unit = js.native
  /**
    * Returns the data related to the gravitational field event (sphere).
    * @returns A gravitational field event
    */
  def getData(): PhysicsGravitationalFieldEventData = js.native
}

