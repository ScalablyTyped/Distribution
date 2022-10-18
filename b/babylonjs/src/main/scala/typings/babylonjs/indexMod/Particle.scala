package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Particle")
@js.native
open class Particle protected ()
  extends typings.babylonjs.particlesIndexMod.Particle {
  /**
    * Creates a new instance Particle
    * @param particleSystem the particle system the particle belongs to
    */
  def this(/**
    * The particle system the particle belongs to.
    */
  particleSystem: typings.babylonjs.particlesParticleSystemMod.ParticleSystem) = this()
}
/* static members */
object Particle {
  
  @JSImport("babylonjs/index", "Particle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "Particle._Count")
  @js.native
  def _Count: Any = js.native
  inline def _Count_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Count")(x.asInstanceOf[js.Any])
}
