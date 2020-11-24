package typings.babylonjs.particlesIndexMod

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "ParticleSystem")
@js.native
class ParticleSystem protected ()
  extends typings.babylonjs.particleSystemMod.ParticleSystem {
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
  def this(name: String, capacity: Double, sceneOrEngine: Scene) = this()
  def this(name: String, capacity: Double, sceneOrEngine: ThinEngine) = this()
  def this(name: String, capacity: Double, sceneOrEngine: Scene, customEffect: Nullable[Effect]) = this()
  def this(name: String, capacity: Double, sceneOrEngine: ThinEngine, customEffect: Nullable[Effect]) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: js.UndefOr[Nullable[Effect]],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: js.UndefOr[Nullable[Effect]],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: js.UndefOr[Nullable[Effect]],
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: Scene,
    customEffect: js.UndefOr[Nullable[Effect]],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: js.UndefOr[Nullable[Effect]],
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: ThinEngine,
    customEffect: js.UndefOr[Nullable[Effect]],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
}
/* static members */
@JSImport("babylonjs/Particles/index", "ParticleSystem")
@js.native
object ParticleSystem extends js.Object {
  
  /**
    * Billboard mode will apply to all axes
    */
  val BILLBOARDMODE_ALL: Double = js.native
  
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  val BILLBOARDMODE_STRETCHED: Double = js.native
  
  /**
    * Billboard mode will only apply to Y axis
    */
  val BILLBOARDMODE_Y: Double = js.native
  
  /**
    * Parses a JSON object to create a particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the Parsed particle system
    */
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String, doNotStart: Boolean): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String, doNotStart: Boolean): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
  
  /** @hidden */
  def _GetAttributeNamesOrOptions(): js.Array[String] = js.native
  def _GetAttributeNamesOrOptions(
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    isBillboardBased: js.UndefOr[scala.Nothing],
    useRampGradients: Boolean
  ): js.Array[String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: js.UndefOr[scala.Nothing], isBillboardBased: Boolean): js.Array[String] = js.native
  def _GetAttributeNamesOrOptions(
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    isBillboardBased: Boolean,
    useRampGradients: Boolean
  ): js.Array[String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = js.native
  def _GetAttributeNamesOrOptions(
    isAnimationSheetEnabled: Boolean,
    isBillboardBased: js.UndefOr[scala.Nothing],
    useRampGradients: Boolean
  ): js.Array[String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = js.native
  
  /** @hidden */
  def _GetEffectCreationOptions(): js.Array[String] = js.native
  def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = js.native
  
  /** @hidden */
  def _Parse(
    parsedParticleSystem: js.Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: Scene,
    rootUrl: String
  ): Unit = js.native
  def _Parse(
    parsedParticleSystem: js.Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: ThinEngine,
    rootUrl: String
  ): Unit = js.native
  
  /** @hidden */
  def _Serialize(serializationObject: js.Any, particleSystem: IParticleSystem, serializeTexture: Boolean): Unit = js.native
}
