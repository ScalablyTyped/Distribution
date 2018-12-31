package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Particle emitter emitting particles from the inside of a hemisphere.
  * It emits the particles alongside the hemisphere radius. The emission direction might be randomized.
  */
@JSImport("babylonjs", "HemisphericParticleEmitter")
@js.native
/**
  * Creates a new instance HemisphericParticleEmitter
  * @param radius the radius of the emission hemisphere (1 by default)
  * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1]
  */
class HemisphericParticleEmitter ()
  extends babylonjsLib.BABYLONNs.HemisphericParticleEmitter {
  def this(/**
    * The radius of the emission hemisphere.
    */
  radius: scala.Double) = this()
  def this(/**
    * The radius of the emission hemisphere.
    */
  radius: scala.Double, /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  radiusRange: scala.Double) = this()
  def this(/**
    * The radius of the emission hemisphere.
    */
  radius: scala.Double, /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  radiusRange: scala.Double, /**
    * How much to randomize the particle direction [0-1].
    */
  directionRandomizer: scala.Double) = this()
}

