package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "CylinderDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance CylinderDirectedParticleEmitter
  * @param radius the radius of the emission cylinder (1 by default)
  * @param height the height of the emission cylinder (1 by default)
  * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
class CylinderDirectedParticleEmitter ()
  extends typings.babylonjs.particlesIndexMod.CylinderDirectedParticleEmitter {
  def this(radius: Double) = this()
  def this(radius: Double, height: Double) = this()
  def this(radius: Double, height: Double, radiusRange: Double) = this()
  def this(
    radius: Double,
    height: Double,
    radiusRange: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typings.babylonjs.mathVectorMod.Vector3
  ) = this()
  def this(
    radius: Double,
    height: Double,
    radiusRange: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typings.babylonjs.mathVectorMod.Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: typings.babylonjs.mathVectorMod.Vector3
  ) = this()
}

