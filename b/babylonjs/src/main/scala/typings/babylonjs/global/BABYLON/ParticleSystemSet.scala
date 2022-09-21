package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ParticleSystemSet")
@js.native
open class ParticleSystemSet ()
  extends StObject
     with typings.babylonjs.BABYLON.ParticleSystemSet {
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object ParticleSystemSet {
  
  @JSGlobal("BABYLON.ParticleSystemSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets base Assets URL
    */
  @JSGlobal("BABYLON.ParticleSystemSet.BaseAssetsUrl")
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
  inline def Parse(data: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystemSet]
  inline def Parse(data: Any, scene: typings.babylonjs.BABYLON.Scene, gpu: Boolean): typings.babylonjs.BABYLON.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystemSet]
  inline def Parse(data: Any, scene: typings.babylonjs.BABYLON.Scene, gpu: Boolean, capacity: Double): typings.babylonjs.BABYLON.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystemSet]
  inline def Parse(data: Any, scene: typings.babylonjs.BABYLON.Scene, gpu: Unit, capacity: Double): typings.babylonjs.BABYLON.ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystemSet]
}
