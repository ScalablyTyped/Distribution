package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a physics vortex event
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsVortexEvent")
@js.native
class PhysicsVortexEvent protected () extends js.Object {
  /**
    * Initializes the physics vortex event
    * @param _scene The BabylonJS scene
    * @param _origin The origin position of the vortex
    * @param _radius The radius of the vortex
    * @param _strength The strength of the vortex
    * @param _height The height of the vortex
    */
  def this(_scene: Scene, _origin: Vector3, _radius: scala.Double, _strength: scala.Double, _height: scala.Double) = this()
  var _centripetalForceThreshold: js.Any = js.native
  var _cylinder: js.Any = js.native
  var _cylinderPosition: js.Any = js.native
  var _dataFetched: js.Any = js.native
  var _height: js.Any = js.native
  var _intersectsWithCylinder: js.Any = js.native
  var _origin: js.Any = js.native
  var _originTop: js.Any = js.native
  var _physicsEngine: js.Any = js.native
  /*** Helpers ***/
  var _prepareCylinder: js.Any = js.native
  var _radius: js.Any = js.native
  var _scene: js.Any = js.native
  var _strength: js.Any = js.native
  var _tick: js.Any = js.native
  var _tickCallback: js.Any = js.native
  var _updraftMultiplier: js.Any = js.native
  var getImpostorForceAndContactPoint: js.Any = js.native
  /**
    * Disables the cortex.
    */
  def disable(): scala.Unit = js.native
  /**
    * Disposes the sphere.
    * @param force
    */
  def dispose(): scala.Unit = js.native
  def dispose(force: scala.Boolean): scala.Unit = js.native
  /**
    * Enables the vortex.
    */
  def enable(): scala.Unit = js.native
  /**
    * Returns the data related to the vortex event (cylinder).
    * @returns The physics vortex event data
    */
  def getData(): PhysicsVortexEventData = js.native
}

