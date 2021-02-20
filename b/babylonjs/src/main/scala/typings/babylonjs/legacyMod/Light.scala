package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Light")
@js.native
abstract class Light protected ()
  extends typings.babylonjs.indexMod.Light {
  /**
    * Creates a Light object in the scene.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The firendly name of the light
    * @param scene The scene the light belongs too
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object Light {
  
  /**
    * Sort function to order lights for rendering.
    * @param a First Light object to compare to second.
    * @param b Second Light object to compare first.
    * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.CompareLightsPriority")
  @js.native
  def CompareLightsPriority(a: typings.babylonjs.lightMod.Light, b: typings.babylonjs.lightMod.Light): Double = js.native
  
  /**
    * Falloff Default: light is falling off following the material specification:
    * standard material is using standard falloff whereas pbr material can request special falloff per materials.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.FALLOFF_DEFAULT")
  @js.native
  val FALLOFF_DEFAULT: Double = js.native
  
  /**
    * Falloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.FALLOFF_GLTF")
  @js.native
  val FALLOFF_GLTF: Double = js.native
  
  /**
    * Falloff Physical: light is falling off following the inverse squared distance law.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.FALLOFF_PHYSICAL")
  @js.native
  val FALLOFF_PHYSICAL: Double = js.native
  
  /**
    * Falloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.FALLOFF_STANDARD")
  @js.native
  val FALLOFF_STANDARD: Double = js.native
  
  /**
    * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
    * This new light is named "name" and added to the passed scene.
    * @param type Type according to the types available in Light.LIGHTTYPEID_x
    * @param name The friendly name of the light
    * @param scene The scene the new light will belong to
    * @returns the constructor function
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.GetConstructorFromName")
  @js.native
  def GetConstructorFromName(`type`: Double, name: String, scene: typings.babylonjs.sceneMod.Scene): Nullable[js.Function0[this.type]] = js.native
  
  /**
    * Each light type uses the default quantity according to its type:
    *      point/spot lights use luminous intensity
    *      directional lights use illuminance
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.INTENSITYMODE_AUTOMATIC")
  @js.native
  val INTENSITYMODE_AUTOMATIC: Double = js.native
  
  /**
    * lux (lm/m^2)
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.INTENSITYMODE_ILLUMINANCE")
  @js.native
  val INTENSITYMODE_ILLUMINANCE: Double = js.native
  
  /**
    * nit (cd/m^2)
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.INTENSITYMODE_LUMINANCE")
  @js.native
  val INTENSITYMODE_LUMINANCE: Double = js.native
  
  /**
    * candela (lm/sr)
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.INTENSITYMODE_LUMINOUSINTENSITY")
  @js.native
  val INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
  
  /**
    * lumen (lm)
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.INTENSITYMODE_LUMINOUSPOWER")
  @js.native
  val INTENSITYMODE_LUMINOUSPOWER: Double = js.native
  
  /**
    * If every light affecting the material is in this lightmapMode,
    * material.lightmapTexture adds or multiplies
    * (depends on material.useLightmapAsShadowmap)
    * after every other light calculations.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.LIGHTMAP_DEFAULT")
  @js.native
  val LIGHTMAP_DEFAULT: Double = js.native
  
  /**
    * material.lightmapTexture as only lighting
    * no light calculation from this light
    * only adds dynamic shadows from this light
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.LIGHTMAP_SHADOWSONLY")
  @js.native
  val LIGHTMAP_SHADOWSONLY: Double = js.native
  
  /**
    * material.lightmapTexture as only diffuse lighting from this light
    * adds only specular lighting from this light
    * adds dynamic shadows
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.LIGHTMAP_SPECULAR")
  @js.native
  val LIGHTMAP_SPECULAR: Double = js.native
  
  /**
    * Light type const id of the directional light.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.LIGHTTYPEID_DIRECTIONALLIGHT")
  @js.native
  val LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
  
  /**
    * Light type const id of the hemispheric light.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.LIGHTTYPEID_HEMISPHERICLIGHT")
  @js.native
  val LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
  
  /**
    * Light type const id of the point light.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.LIGHTTYPEID_POINTLIGHT")
  @js.native
  val LIGHTTYPEID_POINTLIGHT: Double = js.native
  
  /**
    * Light type const id of the spot light.
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.LIGHTTYPEID_SPOTLIGHT")
  @js.native
  val LIGHTTYPEID_SPOTLIGHT: Double = js.native
  
  /**
    * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
    * @param parsedLight The JSON representation of the light
    * @param scene The scene to create the parsed light in
    * @returns the created light after parsing
    */
  @JSImport("babylonjs/Legacy/legacy", "Light.Parse")
  @js.native
  def Parse(parsedLight: js.Any, scene: typings.babylonjs.sceneMod.Scene): Nullable[typings.babylonjs.lightMod.Light] = js.native
}
