package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Particle")
@js.native
class Particle protected ()
  extends typings.babylonjs.BABYLON.Particle {
  /**
    * Creates a new instance Particle
    * @param particleSystem the particle system the particle belongs to
    */
  def this(/**
    * The particle system the particle belongs to.
    */
  particleSystem: typings.babylonjs.BABYLON.ParticleSystem) = this()
}
/* static members */
object Particle {
  
  @JSGlobal("BABYLON.Particle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.Particle._Count")
  @js.native
  def _Count: js.Any = js.native
  @scala.inline
  def _Count_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Count")(x.asInstanceOf[js.Any])
}
