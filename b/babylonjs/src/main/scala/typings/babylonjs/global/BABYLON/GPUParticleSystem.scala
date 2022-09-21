package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Partialcapacitynumberrand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GPUParticleSystem")
@js.native
open class GPUParticleSystem protected ()
  extends StObject
     with typings.babylonjs.BABYLON.GPUParticleSystem {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
    * @param customEffect a custom effect used to change the way particles are rendered by default
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    */
  def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object GPUParticleSystem {
  
  @JSGlobal("BABYLON.GPUParticleSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON object to create a GPU particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns the parsed GPU particle system
    */
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine, rootUrl: String): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.BABYLON.GPUParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.GPUParticleSystem]
  
  /**
    * @param hasColorGradients
    * @param isAnimationSheetEnabled
    * @param isBillboardBased
    * @param isBillboardStretched
    * @hidden
    */
  inline def _GetAttributeNamesOrOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")().asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean, isAnimationSheetEnabled: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean, isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Boolean, isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Boolean,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Unit, isAnimationSheetEnabled: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Unit, isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(hasColorGradients: Unit, isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Boolean,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(
    hasColorGradients: Unit,
    isAnimationSheetEnabled: Unit,
    isBillboardBased: Unit,
    isBillboardStretched: Boolean
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(hasColorGradients.asInstanceOf[js.Any], isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], isBillboardStretched.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * @param isAnimationSheetEnabled
    * @hidden
    */
  inline def _GetEffectCreationOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")().asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
