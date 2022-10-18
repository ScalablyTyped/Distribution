package typings.babylonjs.particlesIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "ParticleSystemSet")
@js.native
open class ParticleSystemSet ()
  extends typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet
/* static members */
object ParticleSystemSet {
  
  @JSImport("babylonjs/Particles/index", "ParticleSystemSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets base Assets URL
    */
  @JSImport("babylonjs/Particles/index", "ParticleSystemSet.BaseAssetsUrl")
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
  inline def Parse(data: Any, scene: Scene): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
  inline def Parse(data: Any, scene: Scene, gpu: Boolean): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
  inline def Parse(data: Any, scene: Scene, gpu: Boolean, capacity: Double): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
  inline def Parse(data: Any, scene: Scene, gpu: Unit, capacity: Double): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
}
