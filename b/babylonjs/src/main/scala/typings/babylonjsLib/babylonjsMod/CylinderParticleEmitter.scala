package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Particle emitter emitting particles from the inside of a cylinder.
     * It emits the particles alongside the cylinder radius. The emission direction might be randomized.
     */
@JSImport("babylonjs", "CylinderParticleEmitter")
@js.native
class CylinderParticleEmitter ()
  extends babylonjsLib.BABYLONNs.CylinderParticleEmitter {
  /**
          * Creates a new instance CylinderParticleEmitter
          * @param radius the radius of the emission cylinder (1 by default)
          * @param height the height of the emission cylinder (1 by default)
          * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission cylinder.
           */
  radius: scala.Double) = this()
  /**
          * Creates a new instance CylinderParticleEmitter
          * @param radius the radius of the emission cylinder (1 by default)
          * @param height the height of the emission cylinder (1 by default)
          * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission cylinder.
           */
  radius: scala.Double, /**
           * The height of the emission cylinder.
           */
  height: scala.Double) = this()
  /**
          * Creates a new instance CylinderParticleEmitter
          * @param radius the radius of the emission cylinder (1 by default)
          * @param height the height of the emission cylinder (1 by default)
          * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission cylinder.
           */
  radius: scala.Double, /**
           * The height of the emission cylinder.
           */
  height: scala.Double, /**
           * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
           */
  radiusRange: scala.Double) = this()
  /**
          * Creates a new instance CylinderParticleEmitter
          * @param radius the radius of the emission cylinder (1 by default)
          * @param height the height of the emission cylinder (1 by default)
          * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission cylinder.
           */
  radius: scala.Double, /**
           * The height of the emission cylinder.
           */
  height: scala.Double, /**
           * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
           */
  radiusRange: scala.Double, /**
           * How much to randomize the particle direction [0-1].
           */
  directionRandomizer: scala.Double) = this()
}

