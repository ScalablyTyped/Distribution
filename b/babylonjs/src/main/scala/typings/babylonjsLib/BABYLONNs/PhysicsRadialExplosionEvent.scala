package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a physics radial explosion event
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsRadialExplosionEvent")
@js.native
class PhysicsRadialExplosionEvent protected () extends js.Object {
  /**
    * Initializes a radial explosioin event
    * @param scene BabylonJS scene
    */
  def this(scene: Scene) = this()
  var _dataFetched: js.Any = js.native
  var _intersectsWithSphere: js.Any = js.native
  /*** Helpers ***/
  var _prepareSphere: js.Any = js.native
  var _rays: js.Any = js.native
  var _scene: js.Any = js.native
  var _sphere: js.Any = js.native
  var _sphereOptions: js.Any = js.native
  /**
    * Disposes the sphere.
    * @param force Specifies if the sphere should be disposed by force
    */
  def dispose(): scala.Unit = js.native
  def dispose(force: scala.Boolean): scala.Unit = js.native
  /**
    * Returns the data related to the radial explosion event (sphere & rays).
    * @returns The radial explosion event data
    */
  def getData(): PhysicsRadialExplosionEventData = js.native
  /**
    * Returns the force and contact point of the impostor or false, if the impostor is not affected by the force/impulse.
    * @param impostor A physics imposter
    * @param origin the origin of the explosion
    * @param radius the explosion radius
    * @param strength the explosion strength
    * @param falloff possible options: Constant & Linear
    * @returns {Nullable<PhysicsForceAndContactPoint>} A physics force and contact point, or null
    */
  def getImpostorForceAndContactPoint(
    impostor: PhysicsImpostor,
    origin: Vector3,
    radius: scala.Double,
    strength: scala.Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsForceAndContactPoint] = js.native
}

