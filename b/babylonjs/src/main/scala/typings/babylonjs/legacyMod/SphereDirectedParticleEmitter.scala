package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "SphereDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance SphereDirectedParticleEmitter
  * @param radius the radius of the emission sphere (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
class SphereDirectedParticleEmitter ()
  extends typings.babylonjs.indexMod.SphereDirectedParticleEmitter {
  def this(radius: Double) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typings.babylonjs.mathVectorMod.Vector3
  ) = this()
  def this(
    radius: Double,
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

