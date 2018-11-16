package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A helper for physics simulations
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSGlobal("BABYLON.PhysicsHelper")
@js.native
class PhysicsHelper protected () extends js.Object {
  /**
           * Initializes the Physics helper
           * @param scene Babylon.js scene
           */
  def this(scene: Scene) = this()
  var _physicsEngine: js.Any = js.native
  var _scene: js.Any = js.native
  /**
           * Applies a radial explosion force
           * @param origin the origin of the explosion
           * @param radius the explosion radius
           * @param strength the explosion strength
           * @param falloff possible options: Constant & Linear. Defaults to Constant
           * @returns A physics radial explosion event, or null
           */
  def applyRadialExplosionForce(origin: Vector3, radius: scala.Double, strength: scala.Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  /**
           * Applies a radial explosion force
           * @param origin the origin of the explosion
           * @param radius the explosion radius
           * @param strength the explosion strength
           * @param falloff possible options: Constant & Linear. Defaults to Constant
           * @returns A physics radial explosion event, or null
           */
  def applyRadialExplosionForce(
    origin: Vector3,
    radius: scala.Double,
    strength: scala.Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  /**
           * Applies a radial explosion impulse
           * @param origin the origin of the explosion
           * @param radius the explosion radius
           * @param strength the explosion strength
           * @param falloff possible options: Constant & Linear. Defaults to Constant
           * @returns A physics radial explosion event, or null
           */
  def applyRadialExplosionImpulse(origin: Vector3, radius: scala.Double, strength: scala.Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  /**
           * Applies a radial explosion impulse
           * @param origin the origin of the explosion
           * @param radius the explosion radius
           * @param strength the explosion strength
           * @param falloff possible options: Constant & Linear. Defaults to Constant
           * @returns A physics radial explosion event, or null
           */
  def applyRadialExplosionImpulse(
    origin: Vector3,
    radius: scala.Double,
    strength: scala.Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  /**
           * Creates a gravitational field
           * @param origin the origin of the explosion
           * @param radius the explosion radius
           * @param strength the explosion strength
           * @param falloff possible options: Constant & Linear. Defaults to Constant
           * @returns A physics gravitational field event, or null
           */
  def gravitationalField(origin: Vector3, radius: scala.Double, strength: scala.Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
  /**
           * Creates a gravitational field
           * @param origin the origin of the explosion
           * @param radius the explosion radius
           * @param strength the explosion strength
           * @param falloff possible options: Constant & Linear. Defaults to Constant
           * @returns A physics gravitational field event, or null
           */
  def gravitationalField(
    origin: Vector3,
    radius: scala.Double,
    strength: scala.Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsGravitationalFieldEvent] = js.native
  /**
           * Creates a physics updraft event
           * @param origin the origin of the updraft
           * @param radius the radius of the updraft
           * @param strength the strength of the updraft
           * @param height the height of the updraft
           * @param updraftMode possible options: Center & Perpendicular. Defaults to Center
           * @returns A physics updraft event, or null
           */
  def updraft(origin: Vector3, radius: scala.Double, strength: scala.Double, height: scala.Double): Nullable[PhysicsUpdraftEvent] = js.native
  /**
           * Creates a physics updraft event
           * @param origin the origin of the updraft
           * @param radius the radius of the updraft
           * @param strength the strength of the updraft
           * @param height the height of the updraft
           * @param updraftMode possible options: Center & Perpendicular. Defaults to Center
           * @returns A physics updraft event, or null
           */
  def updraft(
    origin: Vector3,
    radius: scala.Double,
    strength: scala.Double,
    height: scala.Double,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  /**
           * Creates a physics vortex event
           * @param origin the of the vortex
           * @param radius the radius of the vortex
           * @param strength the strength of the vortex
           * @param height   the height of the vortex
           * @returns a Physics vortex event, or null
           * A physics vortex event or null
           */
  def vortex(origin: Vector3, radius: scala.Double, strength: scala.Double, height: scala.Double): Nullable[PhysicsVortexEvent] = js.native
}

