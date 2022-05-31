package typings.babylonjs.indexMod

import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ParticleSystem")
@js.native
class ParticleSystem protected ()
  extends typings.babylonjs.particlesIndexMod.ParticleSystem {
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
  def this(name: String, capacity: Double, sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect]
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect]
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
    customEffect: Nullable[typings.babylonjs.effectMod.Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect],
    isAnimationSheetEnabled: Boolean
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
    customEffect: Nullable[typings.babylonjs.effectMod.Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect],
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect],
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
    * Billboard mode will only apply to Y axis
    */
  @JSImport("babylonjs/index", "ParticleSystem.BILLBOARDMODE_Y")
  @js.native
  val BILLBOARDMODE_Y: Double = js.native
  
  /**
    * Parses a JSON object to create a particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the Parsed particle system
    */
  inline def Parse(parsedParticleSystem: js.Any, sceneOrEngine: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.particleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String
  ): typings.babylonjs.particleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particleSystemMod.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.particleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particleSystemMod.ParticleSystem]
  
  /** @hidden */
  inline def _GetAttributeNamesOrOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")().asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /** @hidden */
  inline def _GetEffectCreationOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")().asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /** @hidden */
  inline def _Parse(
    parsedParticleSystem: js.Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _Parse(
    parsedParticleSystem: js.Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @hidden */
  inline def _Serialize(serializationObject: js.Any, particleSystem: IParticleSystem, serializeTexture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Serialize")(serializationObject.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], serializeTexture.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
