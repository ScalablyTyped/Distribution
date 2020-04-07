package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "CylinderParticleEmitter")
@js.native
/**
  * Creates a new instance CylinderParticleEmitter
  * @param radius the radius of the emission cylinder (1 by default)
  * @param height the height of the emission cylinder (1 by default)
  * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1]
  */
class CylinderParticleEmitter ()
  extends typings.babylonjs.legacyMod.CylinderParticleEmitter {
  def this(/**
    * The radius of the emission cylinder.
    */
  radius: Double) = this()
  def this(
    /**
    * The radius of the emission cylinder.
    */
  radius: Double,
    /**
    * The height of the emission cylinder.
    */
  height: Double
  ) = this()
  def this(
    /**
    * The radius of the emission cylinder.
    */
  radius: Double,
    /**
    * The height of the emission cylinder.
    */
  height: Double,
    /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  radiusRange: Double
  ) = this()
  def this(
    /**
    * The radius of the emission cylinder.
    */
  radius: Double,
    /**
    * The height of the emission cylinder.
    */
  height: Double,
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

