package typings.babylonjs.indexMod

import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ParticleSystem")
@js.native
open class ParticleSystem protected ()
  extends typings.babylonjs.particlesIndexMod.ParticleSystem {
  def this(name: String, capacity: Double, sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine) = this()
  /**
    * Instantiates a particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param capacity The max number of particles alive at the same time
    * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
    * @param customEffect a custom effect used to change the way particles are rendered by default
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    * @param epsilon Offset used to render the particles
    */
  def this(name: String, capacity: Double, sceneOrEngine: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect]
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect]
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect],
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Nullable[typings.babylonjs.materialsEffectMod.Effect],
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
}
/* static members */
object ParticleSystem {
  
  @JSImport("babylonjs/index", "ParticleSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Billboard mode will apply to all axes
    */
  @JSImport("babylonjs/index", "ParticleSystem.BILLBOARDMODE_ALL")
  @js.native
  val BILLBOARDMODE_ALL: Double = js.native
  
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  @JSImport("babylonjs/index", "ParticleSystem.BILLBOARDMODE_STRETCHED")
  @js.native
  val BILLBOARDMODE_STRETCHED: Double = js.native
  
  /**
    * Special billboard mode where the particle will be billboard to the camera but only around the axis of the direction of particle emission
    */
  @JSImport("babylonjs/index", "ParticleSystem.BILLBOARDMODE_STRETCHED_LOCAL")
  @js.native
  val BILLBOARDMODE_STRETCHED_LOCAL: Double = js.native
  
  /**
    * Billboard mode will only apply to Y axis
    */
  @JSImport("babylonjs/index", "ParticleSystem.BILLBOARDMODE_Y")
  @js.native
  val BILLBOARDMODE_Y: Double = js.native
  
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String
  ): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  /**
    * Parses a JSON object to create a particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns the Parsed particle system
    */
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.particlesParticleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particlesParticleSystemMod.ParticleSystem]
  
  /**
    * @internal
    */
  inline def _GetAttributeNamesOrOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")().asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * @internal
    */
  inline def _GetEffectCreationOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")().asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Unit, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def _Parse(
    parsedParticleSystem: Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @internal
    */
  inline def _Parse(
    parsedParticleSystem: Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _Serialize(serializationObject: Any, particleSystem: IParticleSystem, serializeTexture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Serialize")(serializationObject.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], serializeTexture.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
