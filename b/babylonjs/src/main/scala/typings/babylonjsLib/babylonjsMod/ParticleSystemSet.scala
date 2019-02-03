package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of particle systems working together to create a specific effect
  */
@JSImport("babylonjs", "ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends babylonjsLib.BABYLONNs.ParticleSystemSet

/* static members */
@JSImport("babylonjs", "ParticleSystemSet")
@js.native
object ParticleSystemSet extends js.Object {
  /**
    * Parse a new ParticleSystemSet from a serialized source
    * @param data defines a JSON compatible representation of the set
    * @param scene defines the hosting scene
    * @param gpu defines if we want GPU particles or CPU particles
    * @returns a new ParticleSystemSet
    */
  def Parse(data: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.ParticleSystemSet = js.native
  def Parse(data: js.Any, scene: babylonjsLib.BABYLONNs.Scene, gpu: scala.Boolean): babylonjsLib.BABYLONNs.ParticleSystemSet = js.native
}

