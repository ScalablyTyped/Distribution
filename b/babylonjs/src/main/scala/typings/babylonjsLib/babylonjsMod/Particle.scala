package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A particle represents one of the element emitted by a particle system.
  * This is mainly define by its coordinates, direction, velocity and age.
  */
@JSImport("babylonjs", "Particle")
@js.native
class Particle protected ()
  extends babylonjsLib.BABYLONNs.Particle {
  /**
    * Creates a new instance Particle
    * @param particleSystem the particle system the particle belongs to
    */
  def this(/**
    * The particle system the particle belongs to.
    */
  particleSystem: babylonjsLib.BABYLONNs.ParticleSystem) = this()
}

/* static members */
@JSImport("babylonjs", "Particle")
@js.native
object Particle extends js.Object {
  var _Count: js.Any = js.native
}

