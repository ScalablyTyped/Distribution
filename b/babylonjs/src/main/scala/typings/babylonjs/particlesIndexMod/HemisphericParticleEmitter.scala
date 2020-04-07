package typings.babylonjs.particlesIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/index", "HemisphericParticleEmitter")
@js.native
/**
  * Creates a new instance HemisphericParticleEmitter
  * @param radius the radius of the emission hemisphere (1 by default)
  * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1]
  */
class HemisphericParticleEmitter ()
  extends typings.babylonjs.emitterTypesIndexMod.HemisphericParticleEmitter {
  def this(/**
    * The radius of the emission hemisphere.
    */
  radius: Double) = this()
  def this(
    /**
    * The radius of the emission hemisphere.
    */
  radius: Double,
    /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  radiusRange: Double
  ) = this()
  def this(
    /**
    * The radius of the emission hemisphere.
    */
  radius: Double,
    /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  radiusRange: Double,
    /**
    * How much to randomize the particle direction [0-1].
    */
  directionRandomizer: Double
  ) = this()
}

