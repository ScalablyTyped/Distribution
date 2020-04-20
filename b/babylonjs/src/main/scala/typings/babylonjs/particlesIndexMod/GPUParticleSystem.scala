package typings.babylonjs.particlesIndexMod

import typings.babylonjs.Partialcapacitynumberrand
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/index", "GPUParticleSystem")
@js.native
class GPUParticleSystem protected ()
  extends typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param scene The scene the particle system belongs to
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    */
  def this(name: String, options: Partialcapacitynumberrand, scene: Scene) = this()
  def this(name: String, options: Partialcapacitynumberrand, scene: Scene, isAnimationSheetEnabled: Boolean) = this()
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
    * @param scene The scene to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the parsed GPU particle system
    */
  def Parse(parsedParticleSystem: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  def Parse(parsedParticleSystem: js.Any, scene: Scene, rootUrl: String, doNotStart: Boolean): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
}

