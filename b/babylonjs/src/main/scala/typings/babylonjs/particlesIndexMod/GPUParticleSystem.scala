package typings.babylonjs.particlesIndexMod

import typings.babylonjs.anon.Partialcapacitynumberrand
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/index", "GPUParticleSystem")
@js.native
class GPUParticleSystem protected ()
  extends typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    * @param customEffect a custom effect used to change the way particles are rendered by default
    */
  def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: Scene) = this()
  def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: ThinEngine) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: Scene,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: ThinEngine,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: Scene,
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    customEffect: Nullable[Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: Scene,
    isAnimationSheetEnabled: Boolean,
    customEffect: Nullable[Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: ThinEngine,
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    customEffect: Nullable[Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: ThinEngine,
    isAnimationSheetEnabled: Boolean,
    customEffect: Nullable[Effect]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Particles/index", "GPUParticleSystem")
@js.native
object GPUParticleSystem extends js.Object {
  
  /**
    * Gets a boolean indicating if the GPU particles can be rendered on current browser
    */
  def IsSupported: Boolean = js.native
  
  /**
    * Parses a JSON object to create a GPU particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the parsed GPU particle system
    */
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String, doNotStart: Boolean): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String, doNotStart: Boolean): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
}
