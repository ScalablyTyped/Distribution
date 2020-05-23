package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Partialcapacitynumberrand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.GPUParticleSystem")
@js.native
class GPUParticleSystem protected ()
  extends typings.babylonjs.BABYLON.GPUParticleSystem {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param scene The scene the particle system belongs to
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    */
  def this(name: String, options: Partialcapacitynumberrand, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    options: Partialcapacitynumberrand,
    scene: typings.babylonjs.BABYLON.Scene,
    isAnimationSheetEnabled: Boolean
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.GPUParticleSystem")
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
  def Parse(parsedParticleSystem: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.GPUParticleSystem = js.native
  def Parse(
    parsedParticleSystem: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.BABYLON.GPUParticleSystem = js.native
}

