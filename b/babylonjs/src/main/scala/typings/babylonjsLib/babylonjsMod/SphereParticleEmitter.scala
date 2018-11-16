package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Particle emitter emitting particles from the inside of a sphere.
     * It emits the particles alongside the sphere radius. The emission direction might be randomized.
     */
@JSImport("babylonjs", "SphereParticleEmitter")
@js.native
class SphereParticleEmitter ()
  extends babylonjsLib.BABYLONNs.SphereParticleEmitter {
  /**
          * Creates a new instance SphereParticleEmitter
          * @param radius the radius of the emission sphere (1 by default)
          * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission sphere.
           */
  radius: scala.Double) = this()
  /**
          * Creates a new instance SphereParticleEmitter
          * @param radius the radius of the emission sphere (1 by default)
          * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission sphere.
           */
  radius: scala.Double, /**
           * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
           */
  radiusRange: scala.Double) = this()
  /**
          * Creates a new instance SphereParticleEmitter
          * @param radius the radius of the emission sphere (1 by default)
          * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission sphere.
           */
  radius: scala.Double, /**
           * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
           */
  radiusRange: scala.Double, /**
           * How much to randomize the particle direction [0-1].
           */
  directionRandomizer: scala.Double) = this()
}

