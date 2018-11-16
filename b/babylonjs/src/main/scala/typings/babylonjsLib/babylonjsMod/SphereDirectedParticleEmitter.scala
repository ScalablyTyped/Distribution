package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Particle emitter emitting particles from the inside of a sphere.
     * It emits the particles randomly between two vectors.
     */
@JSImport("babylonjs", "SphereDirectedParticleEmitter")
@js.native
class SphereDirectedParticleEmitter ()
  extends babylonjsLib.BABYLONNs.SphereDirectedParticleEmitter {
  /**
           * Creates a new instance SphereDirectedParticleEmitter
           * @param radius the radius of the emission sphere (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double) = this()
  /**
           * Creates a new instance SphereDirectedParticleEmitter
           * @param radius the radius of the emission sphere (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double, /**
           * The min limit of the emission direction.
           */
  direction1: babylonjsLib.BABYLONNs.Vector3) = this()
  /**
           * Creates a new instance SphereDirectedParticleEmitter
           * @param radius the radius of the emission sphere (1 by default)
           * @param direction1 the min limit of the emission direction (up vector by default)
           * @param direction2 the max limit of the emission direction (up vector by default)
           */
  def this(radius: scala.Double, /**
           * The min limit of the emission direction.
           */
  direction1: babylonjsLib.BABYLONNs.Vector3, /**
           * The max limit of the emission direction.
           */
  direction2: babylonjsLib.BABYLONNs.Vector3) = this()
}

