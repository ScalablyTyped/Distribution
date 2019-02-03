package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of all the lights in Babylon. It groups all the generic information about lights.
  * Lights are used, as you would expect, to affect how meshes are seen, in terms of both illumination and colour.
  * All meshes allow light to pass through them unless shadow generation is activated. The default number of lights allowed is four but this can be increased.
  */
@JSImport("babylonjs", "Light")
@js.native
abstract class Light protected ()
  extends babylonjsLib.BABYLONNs.Light {
  /**
    * Creates a Light object in the scene.
    * Documentation : http://doc.babylonjs.com/tutorials/lights
    * @param name The firendly name of the light
    * @param scene The scene the light belongs too
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "Light")
@js.native
object Light extends js.Object {
  /**
    * Falloff Default: light is falling off following the material specification:
    * standard material is using standard falloff whereas pbr material can request special falloff per materials.
    */
  val FALLOFF_DEFAULT: scala.Double = js.native
  /**
    * Falloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  val FALLOFF_GLTF: scala.Double = js.native
  /**
    * Falloff Physical: light is falling off following the inverse squared distance law.
    */
  val FALLOFF_PHYSICAL: scala.Double = js.native
  /**
    * Falloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  val FALLOFF_STANDARD: scala.Double = js.native
  /**
    * Each light type uses the default quantity according to its type:
    *      point/spot lights use luminous intensity
    *      directional lights use illuminance
    */
  val INTENSITYMODE_AUTOMATIC: scala.Double = js.native
  /**
    * lux (lm/m^2)
    */
  val INTENSITYMODE_ILLUMINANCE: scala.Double = js.native
  /**
    * nit (cd/m^2)
    */
  val INTENSITYMODE_LUMINANCE: scala.Double = js.native
  /**
    * candela (lm/sr)
    */
  val INTENSITYMODE_LUMINOUSINTENSITY: scala.Double = js.native
  /**
    * lumen (lm)
    */
  val INTENSITYMODE_LUMINOUSPOWER: scala.Double = js.native
  /**
    * If every light affecting the material is in this lightmapMode,
    * material.lightmapTexture adds or multiplies
    * (depends on material.useLightmapAsShadowmap)
    * after every other light calculations.
    */
  val LIGHTMAP_DEFAULT: scala.Double = js.native
  /**
    * material.lightmapTexture as only lighting
    * no light calculation from this light
    * only adds dynamic shadows from this light
    */
  val LIGHTMAP_SHADOWSONLY: scala.Double = js.native
  /**
    * material.lightmapTexture as only diffuse lighting from this light
    * adds only specular lighting from this light
    * adds dynamic shadows
    */
  val LIGHTMAP_SPECULAR: scala.Double = js.native
  /**
    * Light type const id of the directional light.
    */
  val LIGHTTYPEID_DIRECTIONALLIGHT: scala.Double = js.native
  /**
    * Light type const id of the hemispheric light.
    */
  val LIGHTTYPEID_HEMISPHERICLIGHT: scala.Double = js.native
  /**
    * Light type const id of the point light.
    */
  val LIGHTTYPEID_POINTLIGHT: scala.Double = js.native
  /**
    * Light type const id of the spot light.
    */
  val LIGHTTYPEID_SPOTLIGHT: scala.Double = js.native
  /**
    * Sort function to order lights for rendering.
    * @param a First Light object to compare to second.
    * @param b Second Light object to compare first.
    * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
    */
  def CompareLightsPriority(a: babylonjsLib.BABYLONNs.Light, b: babylonjsLib.BABYLONNs.Light): scala.Double = js.native
  /**
    * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
    * This new light is named "name" and added to the passed scene.
    * @param type Type according to the types available in Light.LIGHTTYPEID_x
    * @param name The friendly name of the light
    * @param scene The scene the new light will belong to
    * @returns the constructor function
    */
  def GetConstructorFromName(`type`: scala.Double, name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[js.Function0[this.type]] = js.native
  /**
    * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
    * @param parsedLight The JSON representation of the light
    * @param scene The scene to create the parsed light in
    * @returns the created light after parsing
    */
  def Parse(parsedLight: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Light] = js.native
}

