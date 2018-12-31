package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particle system in Babylon.
  * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
  * Particles can take different shapes while emitted like box, sphere, cone or you can write your custom function.
  * @example https://doc.babylonjs.com/babylon101/particles
  */
@JSImport("babylonjs", "ParticleSystem")
@js.native
class ParticleSystem protected ()
  extends babylonjsLib.BABYLONNs.ParticleSystem {
  /**
    * Instantiates a particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param capacity The max number of particles alive at the same time
    * @param scene The scene the particle system belongs to
    * @param customEffect a custom effect used to change the way particles are rendered by default
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    * @param epsilon Offset used to render the particles
    */
  def this(name: java.lang.String, capacity: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, capacity: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, customEffect: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Effect]) = this()
  def this(name: java.lang.String, capacity: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, customEffect: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Effect], isAnimationSheetEnabled: scala.Boolean) = this()
  def this(name: java.lang.String, capacity: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, customEffect: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Effect], isAnimationSheetEnabled: scala.Boolean, epsilon: scala.Double) = this()
}

/**
  * This represents a particle system in Babylon.
  * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
  * Particles can take different shapes while emitted like box, sphere, cone or you can write your custom function.
  * @example https://doc.babylonjs.com/babylon101/particles
  */
@JSImport("babylonjs", "ParticleSystem")
@js.native
object ParticleSystem extends js.Object {
  /**
    * Billboard mode will apply to all axes
    */
  val BILLBOARDMODE_ALL: scala.Double = js.native
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  val BILLBOARDMODE_STRETCHED: scala.Double = js.native
  /**
    * Billboard mode will only apply to Y axis
    */
  val BILLBOARDMODE_Y: scala.Double = js.native
  /**
    * Parses a JSON object to create a particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param scene The scene to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the Parsed particle system
    */
  def Parse(parsedParticleSystem: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.ParticleSystem = js.native
  def Parse(
    parsedParticleSystem: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String,
    doNotStart: scala.Boolean
  ): babylonjsLib.BABYLONNs.ParticleSystem = js.native
  /** @hidden */
  def _GetAttributeNamesOrOptions(): js.Array[java.lang.String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: scala.Boolean): js.Array[java.lang.String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: scala.Boolean, isBillboardBased: scala.Boolean): js.Array[java.lang.String] = js.native
  def _GetAttributeNamesOrOptions(
    isAnimationSheetEnabled: scala.Boolean,
    isBillboardBased: scala.Boolean,
    useRampGradients: scala.Boolean
  ): js.Array[java.lang.String] = js.native
  /** @hidden */
  def _GetEffectCreationOptions(): js.Array[java.lang.String] = js.native
  def _GetEffectCreationOptions(isAnimationSheetEnabled: scala.Boolean): js.Array[java.lang.String] = js.native
  /** @hidden */
  def _Parse(
    parsedParticleSystem: js.Any,
    particleSystem: babylonjsLib.BABYLONNs.IParticleSystem,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String
  ): scala.Unit = js.native
  /** @hidden */
  def _Serialize(serializationObject: js.Any, particleSystem: babylonjsLib.BABYLONNs.IParticleSystem): scala.Unit = js.native
}

