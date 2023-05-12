package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsHelper extends StObject {
  
  /* private */ var _applicationForBodies: Any = js.native
  
  /* private */ var _copyPhysicsHitData: Any = js.native
  
  /* private */ var _hitData: Any = js.native
  
  /* private */ var _physicsEngine: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /**
    * Applies a radial explosion force
    * @param origin the origin of the explosion
    * @param radiusOrEventOptions the radius or the options of radial explosion
    * @param strength the explosion strength
    * @param falloff possible options: Constant & Linear. Defaults to Constant
    * @returns A physics radial explosion event, or null
    */
  def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionForce(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionForce(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Unit,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionForce(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionForce(
    origin: Vector3,
    radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
    strength: Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionForce(
    origin: Vector3,
    radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
    strength: Unit,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  
  /**
    * Applies a radial explosion impulse
    * @param origin the origin of the explosion
    * @param radiusOrEventOptions the radius or the options of radial explosion
    * @param strength the explosion strength
    * @param falloff possible options: Constant & Linear. Defaults to Constant
    * @returns A physics radial explosion event, or null
    */
  def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionImpulse(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionImpulse(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Unit,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionImpulse(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionImpulse(
    origin: Vector3,
    radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
    strength: Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  def applyRadialExplosionImpulse(
    origin: Vector3,
    radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
    strength: Unit,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsRadialExplosionEvent] = js.native
  
  /**
    * Creates a gravitational field
    * @param origin the origin of the gravitational field
    * @param radiusOrEventOptions the radius or the options of radial gravitational field
    * @param strength the gravitational field strength
    * @param falloff possible options: Constant & Linear. Defaults to Constant
    * @returns A physics gravitational field event, or null
    */
  def gravitationalField(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
  def gravitationalField(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
  def gravitationalField(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsGravitationalFieldEvent] = js.native
  def gravitationalField(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Unit,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsGravitationalFieldEvent] = js.native
  def gravitationalField(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions): Nullable[PhysicsGravitationalFieldEvent] = js.native
  def gravitationalField(origin: Vector3, radiusOrEventOptions: PhysicsRadialExplosionEventOptions, strength: Double): Nullable[PhysicsGravitationalFieldEvent] = js.native
  def gravitationalField(
    origin: Vector3,
    radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
    strength: Double,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsGravitationalFieldEvent] = js.native
  def gravitationalField(
    origin: Vector3,
    radiusOrEventOptions: PhysicsRadialExplosionEventOptions,
    strength: Unit,
    falloff: PhysicsRadialImpulseFalloff
  ): Nullable[PhysicsGravitationalFieldEvent] = js.native
  
  /**
    * Creates a physics updraft event
    * @param origin the origin of the updraft
    * @param radiusOrEventOptions the radius or the options of the updraft
    * @param strength the strength of the updraft
    * @param height the height of the updraft
    * @param updraftMode possible options: Center & Perpendicular. Defaults to Center
    * @returns A physics updraft event, or null
    */
  def updraft(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Double, height: Double): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Double,
    height: Double,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Double,
    height: Unit,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(origin: Vector3, radiusOrEventOptions: Double, strength: Unit, height: Double): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Unit,
    height: Double,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: Double,
    strength: Unit,
    height: Unit,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions, strength: Double): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: PhysicsUpdraftEventOptions,
    strength: Double,
    height: Double
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: PhysicsUpdraftEventOptions,
    strength: Double,
    height: Double,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: PhysicsUpdraftEventOptions,
    strength: Double,
    height: Unit,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(origin: Vector3, radiusOrEventOptions: PhysicsUpdraftEventOptions, strength: Unit, height: Double): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: PhysicsUpdraftEventOptions,
    strength: Unit,
    height: Double,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  def updraft(
    origin: Vector3,
    radiusOrEventOptions: PhysicsUpdraftEventOptions,
    strength: Unit,
    height: Unit,
    updraftMode: PhysicsUpdraftMode
  ): Nullable[PhysicsUpdraftEvent] = js.native
  
  /**
    * Creates a physics vortex event
    * @param origin the of the vortex
    * @param radiusOrEventOptions the radius or the options of the vortex
    * @param strength the strength of the vortex
    * @param height   the height of the vortex
    * @returns a Physics vortex event, or null
    * A physics vortex event or null
    */
  def vortex(origin: Vector3, radiusOrEventOptions: Double): Nullable[PhysicsVortexEvent] = js.native
  def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Double): Nullable[PhysicsVortexEvent] = js.native
  def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Double, height: Double): Nullable[PhysicsVortexEvent] = js.native
  def vortex(origin: Vector3, radiusOrEventOptions: Double, strength: Unit, height: Double): Nullable[PhysicsVortexEvent] = js.native
  def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions): Nullable[PhysicsVortexEvent] = js.native
  def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Double): Nullable[PhysicsVortexEvent] = js.native
  def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Double, height: Double): Nullable[PhysicsVortexEvent] = js.native
  def vortex(origin: Vector3, radiusOrEventOptions: PhysicsVortexEventOptions, strength: Unit, height: Double): Nullable[PhysicsVortexEvent] = js.native
}
