package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Particle emitter emitting particles from the inside of a cone.
  * It emits the particles alongside the cone volume from the base to the particle.
  * The emission direction might be randomized.
  */
@JSImport("babylonjs", "ConeParticleEmitter")
@js.native
/**
  * Creates a new instance ConeParticleEmitter
  * @param radius the radius of the emission cone (1 by default)
  * @param angles the cone base angle (PI by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
  */
class ConeParticleEmitter ()
  extends babylonjsLib.BABYLONNs.ConeParticleEmitter {
  def this(radius: scala.Double) = this()
  def this(radius: scala.Double, angle: scala.Double) = this()
  def this(radius: scala.Double, angle: scala.Double, /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: scala.Double) = this()
}

