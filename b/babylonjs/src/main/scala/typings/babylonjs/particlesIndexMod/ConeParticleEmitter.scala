package typings.babylonjs.particlesIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "ConeParticleEmitter")
@js.native
/**
  * Creates a new instance ConeParticleEmitter
  * @param radius the radius of the emission cone (1 by default)
  * @param angle the cone base angle (PI by default)
  * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
  */
class ConeParticleEmitter ()
  extends typings.babylonjs.emitterTypesIndexMod.ConeParticleEmitter {
  def this(radius: Double) = this()
  def this(radius: js.UndefOr[scala.Nothing], angle: Double) = this()
  def this(radius: Double, angle: Double) = this()
  def this(
    radius: js.UndefOr[scala.Nothing],
    angle: js.UndefOr[scala.Nothing],
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: Double
  ) = this()
  def this(
    radius: js.UndefOr[scala.Nothing],
    angle: Double,
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: Double
  ) = this()
  def this(
    radius: Double,
    angle: js.UndefOr[scala.Nothing],
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: Double
  ) = this()
  def this(
    radius: Double,
    angle: Double,
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: Double
  ) = this()
}
