package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "Particle")
@js.native
class Particle protected ()
  extends typings.babylonjs.legacyMod.Particle {
  /**
    * Creates a new instance Particle
    * @param particleSystem the particle system the particle belongs to
    */
  def this(/**
    * The particle system the particle belongs to.
    */
  particleSystem: typings.babylonjs.particleSystemMod.ParticleSystem) = this()
}

/* static members */
@JSImport("babylonjs", "Particle")
@js.native
object Particle extends js.Object {
  var _Count: js.Any = js.native
}

