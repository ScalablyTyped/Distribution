package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ParticleSystemSet")
@js.native
class ParticleSystemSet ()
  extends typings.babylonjs.legacyMod.ParticleSystemSet
/* static members */
object ParticleSystemSet {
  
  @JSImport("babylonjs", "ParticleSystemSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets base Assets URL
    */
  @JSImport("babylonjs", "ParticleSystemSet.BaseAssetsUrl")
  @js.native
  def BaseAssetsUrl: String = js.native
  @scala.inline
  def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Parse a new ParticleSystemSet from a serialized source
    * @param data defines a JSON compatible representation of the set
    * @param scene defines the hosting scene
    * @param gpu defines if we want GPU particles or CPU particles
    * @returns a new ParticleSystemSet
    */
  @JSImport("babylonjs", "ParticleSystemSet.Parse")
  @js.native
  def Parse(data: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
  @JSImport("babylonjs", "ParticleSystemSet.Parse")
  @js.native
  def Parse(data: js.Any, scene: typings.babylonjs.sceneMod.Scene, gpu: Boolean): typings.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
}
