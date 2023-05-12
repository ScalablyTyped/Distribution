package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Bursts
import typings.cesiumEngine.mod.ParticleSystem.updateCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ParticleSystem")
@js.native
open class ParticleSystem () extends StObject {
  def this(options: Bursts) = this()
  
  /**
    * An array of {@link ParticleBurst}, emitting bursts of particles at periodic times.
    */
  var bursts: js.Array[ParticleBurst] = js.native
  
  /**
    * Fires an event when the particle system has reached the end of its lifetime.
    */
  var complete: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    */
  def destroy(): Unit = js.native
  
  /**
    * The number of particles to emit per second.
    */
  var emissionRate: Double = js.native
  
  /**
    * The particle emitter for this
    */
  var emitter: ParticleEmitter = js.native
  
  /**
    * The 4x4 transformation matrix that transforms the particle system emitter within the particle systems local coordinate system.
    */
  var emitterModelMatrix: Matrix4 = js.native
  
  /**
    * The color of the particle at the end of its life.
    */
  var endColor: Color = js.native
  
  /**
    * The final scale to apply to the image of the particle at the end of its life.
    */
  var endScale: Double = js.native
  
  /**
    * The URI, HTMLImageElement, or HTMLCanvasElement to use for the billboard.
    */
  var image: Any = js.native
  
  /**
    * When <code>true</code>, the particle system has reached the end of its lifetime; <code>false</code> otherwise.
    */
  var isComplete: Boolean = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * How long the particle system will emit particles, in seconds.
    */
  var lifetime: Double = js.native
  
  /**
    * Whether the particle system should loop it's bursts when it is complete.
    */
  var loop: Boolean = js.native
  
  /**
    * Sets the maximum bound, width by height, below which to randomly scale the particle image's dimensions in pixels.
    */
  var maximumImageSize: Cartesian2 = js.native
  
  /**
    * Sets the maximum mass of particles in kilograms.
    */
  var maximumMass: Double = js.native
  
  /**
    * Sets the maximum bound in seconds for the possible duration of a particle's life below which a particle's actual life will be randomly chosen.
    */
  var maximumParticleLife: Double = js.native
  
  /**
    * Sets the maximum bound in meters per second below which a particle's actual speed will be randomly chosen.
    */
  var maximumSpeed: Double = js.native
  
  /**
    * Sets the minimum bound, width by height, above which to randomly scale the particle image's dimensions in pixels.
    */
  var minimumImageSize: Cartesian2 = js.native
  
  /**
    * Sets the minimum mass of particles in kilograms.
    */
  var minimumMass: Double = js.native
  
  /**
    * Sets the minimum bound in seconds for the possible duration of a particle's life above which a particle's actual life will be randomly chosen.
    */
  var minimumParticleLife: Double = js.native
  
  /**
    * Sets the minimum bound in meters per second above which a particle's actual speed will be randomly chosen.
    */
  var minimumSpeed: Double = js.native
  
  /**
    * The 4x4 transformation matrix that transforms the particle system from model to world coordinates.
    */
  var modelMatrix: Matrix4 = js.native
  
  /**
    * Whether to display the particle system.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets if the particle size is in meters or pixels. <code>true</code> to size particles in meters; otherwise, the size is in pixels.
    */
  var sizeInMeters: Boolean = js.native
  
  /**
    * The color of the particle at the beginning of its life.
    */
  var startColor: Color = js.native
  
  /**
    * The initial scale to apply to the image of the particle at the beginning of its life.
    */
  var startScale: Double = js.native
  
  /**
    * An array of force callbacks. The callback is passed a {@link Particle} and the difference from the last time
    */
  def updateCallback(particle: Particle, dt: Double): Unit = js.native
  /**
    * An array of force callbacks. The callback is passed a {@link Particle} and the difference from the last time
    */
  @JSName("updateCallback")
  var updateCallback_Original: updateCallback = js.native
}
object ParticleSystem {
  
  /**
    * A function used to modify attributes of the particle at each time step. This can include force modifications,
    * color, sizing, etc.
    * @example
    * function applyGravity(particle, dt) {
    *    const position = particle.position;
    *    const gravityVector = Cesium.Cartesian3.normalize(position, new Cesium.Cartesian3());
    *    Cesium.Cartesian3.multiplyByScalar(gravityVector, GRAVITATIONAL_CONSTANT * dt, gravityVector);
    *    particle.velocity = Cesium.Cartesian3.add(particle.velocity, gravityVector, particle.velocity);
    * }
    * @param particle - The particle being updated.
    * @param dt - The time in seconds since the last update.
    */
  type updateCallback = js.Function2[/* particle */ Particle, /* dt */ Double, Unit]
}
