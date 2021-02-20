package typings.babylonjs.legacyMod

import typings.babylonjs.anon.Partialcapacitynumberrand
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GPUParticleSystem")
@js.native
class GPUParticleSystem protected ()
  extends typings.babylonjs.indexMod.GPUParticleSystem {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    * @param customEffect a custom effect used to change the way particles are rendered by default
    */
  def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    customEffect: Nullable[typings.babylonjs.effectMod.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    isAnimationSheetEnabled: Boolean,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
    customEffect: Nullable[typings.babylonjs.effectMod.Effect]
  ) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    isAnimationSheetEnabled: Boolean,
    customEffect: Nullable[typings.babylonjs.effectMod.Effect]
  ) = this()
}
/* static members */
object GPUParticleSystem {
  
  /**
    * Parses a JSON object to create a GPU particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the parsed GPU particle system
    */
  @JSImport("babylonjs/Legacy/legacy", "GPUParticleSystem.Parse")
  @js.native
  def Parse(parsedParticleSystem: js.Any, sceneOrEngine: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  @JSImport("babylonjs/Legacy/legacy", "GPUParticleSystem.Parse")
  @js.native
  def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typings.babylonjs.sceneMod.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  @JSImport("babylonjs/Legacy/legacy", "GPUParticleSystem.Parse")
  @js.native
  def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String
  ): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  @JSImport("babylonjs/Legacy/legacy", "GPUParticleSystem.Parse")
  @js.native
  def Parse(
    parsedParticleSystem: js.Any,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
}
