package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ParticleSystemSet")
@js.native
open class ParticleSystemSet ()
  extends typings.babylonjs.legacyLegacyMod.ParticleSystemSet
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
  inline def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Parse a new ParticleSystemSet from a serialized source
    * @param data defines a JSON compatible representation of the set
    * @param scene defines the hosting scene
    * @param gpu defines if we want GPU particles or CPU particles
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns a new ParticleSystemSet
    */
  inline def Parse(data: Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
  inline def Parse(data: Any, scene: typings.babylonjs.sceneMod.Scene, gpu: Boolean): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
  inline def Parse(data: Any, scene: typings.babylonjs.sceneMod.Scene, gpu: Boolean, capacity: Double): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
  inline def Parse(data: Any, scene: typings.babylonjs.sceneMod.Scene, gpu: Unit, capacity: Double): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
}
