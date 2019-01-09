package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a GPU particle system in Babylon
  * This is the fastest particle system in Babylon as it uses the GPU to update the individual particle data
  * @see https://www.babylonjs-playground.com/#PU4WYI#4
  */
@JSImport("babylonjs", "GPUParticleSystem")
@js.native
class GPUParticleSystem protected ()
  extends babylonjsLib.BABYLONNs.GPUParticleSystem {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param scene The scene the particle system belongs to
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    */
  def this(name: java.lang.String, options: stdLib.Partial[babylonjsLib.Anon_Capacity], scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, options: stdLib.Partial[babylonjsLib.Anon_Capacity], scene: babylonjsLib.BABYLONNs.Scene, isAnimationSheetEnabled: scala.Boolean) = this()
}

/**
  * This represents a GPU particle system in Babylon
  * This is the fastest particle system in Babylon as it uses the GPU to update the individual particle data
  * @see https://www.babylonjs-playground.com/#PU4WYI#4
  */
@JSImport("babylonjs", "GPUParticleSystem")
@js.native
object GPUParticleSystem extends js.Object {
  /**
    * Gets a boolean indicating if the GPU particles can be rendered on current browser
    */
  val IsSupported: scala.Boolean = js.native
  /**
    * Parses a JSON object to create a GPU particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param scene The scene to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the parsed GPU particle system
    */
  def Parse(parsedParticleSystem: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.GPUParticleSystem = js.native
  def Parse(
    parsedParticleSystem: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String,
    doNotStart: scala.Boolean
  ): babylonjsLib.BABYLONNs.GPUParticleSystem = js.native
}

