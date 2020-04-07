package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "ConeParticleEmitter")
@js.native
/**
  * Creates a new instance ConeParticleEmitter
  * @param radius the radius of the emission cone (1 by default)
  * @param angle the cone base angle (PI by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
  */
class ConeParticleEmitter ()
  extends typings.babylonjs.legacyMod.ConeParticleEmitter {
  def this(radius: Double) = this()
  def this(radius: Double, angle: Double) = this()
  def this(
    radius: Double,
    angle: Double,
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: Double
  ) = this()
}

