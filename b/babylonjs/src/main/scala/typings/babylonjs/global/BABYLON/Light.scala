package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Light")
@js.native
abstract class Light protected ()
  extends typings.babylonjs.BABYLON.Light {
  /**
    * Creates a Light object in the scene.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The firendly name of the light
    * @param scene The scene the light belongs too
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object Light {
  
  /**
    * Sort function to order lights for rendering.
    * @param a First Light object to compare to second.
    * @param b Second Light object to compare first.
    * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
    */
  @JSGlobal("BABYLON.Light.CompareLightsPriority")
  @js.native
  def CompareLightsPriority(a: typings.babylonjs.BABYLON.Light, b: typings.babylonjs.BABYLON.Light): Double = js.native
  
  /**
    * Falloff Default: light is falling off following the material specification:
    * standard material is using standard falloff whereas pbr material can request special falloff per materials.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_DEFAULT")
  @js.native
  val FALLOFF_DEFAULT: Double = js.native
  
  /**
    * Falloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_GLTF")
  @js.native
  val FALLOFF_GLTF: Double = js.native
  
  /**
    * Falloff Physical: light is falling off following the inverse squared distance law.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_PHYSICAL")
  @js.native
  val FALLOFF_PHYSICAL: Double = js.native
  
  /**
    * Falloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  @JSGlobal("BABYLON.Light.FALLOFF_STANDARD")
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
  @JSGlobal("BABYLON.Light.GetConstructorFromName")
  @js.native
  def GetConstructorFromName(`type`: Double, name: String, scene: typings.babylonjs.BABYLON.Scene): Nullable[js.Function0[this.type]] = js.native
  
  /**
    * Each light type uses the default quantity according to its type:
    *      point/spot lights use luminous intensity
    *      directional lights use illuminance
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_AUTOMATIC")
  @js.native
  val INTENSITYMODE_AUTOMATIC: Double = js.native
  
  /**
    * lux (lm/m^2)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_ILLUMINANCE")
  @js.native
  val INTENSITYMODE_ILLUMINANCE: Double = js.native
  
  /**
    * nit (cd/m^2)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_LUMINANCE")
  @js.native
  val INTENSITYMODE_LUMINANCE: Double = js.native
  
  /**
    * candela (lm/sr)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_LUMINOUSINTENSITY")
  @js.native
  val INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
  
  /**
    * lumen (lm)
    */
  @JSGlobal("BABYLON.Light.INTENSITYMODE_LUMINOUSPOWER")
  @js.native
  val INTENSITYMODE_LUMINOUSPOWER: Double = js.native
  
  /**
    * If every light affecting the material is in this lightmapMode,
    * material.lightmapTexture adds or multiplies
    * (depends on material.useLightmapAsShadowmap)
    * after every other light calculations.
    */
  @JSGlobal("BABYLON.Light.LIGHTMAP_DEFAULT")
  @js.native
  val LIGHTMAP_DEFAULT: Double = js.native
  
  /**
    * material.lightmapTexture as only lighting
    * no light calculation from this light
    * only adds dynamic shadows from this light
    */
  @JSGlobal("BABYLON.Light.LIGHTMAP_SHADOWSONLY")
  @js.native
  val LIGHTMAP_SHADOWSONLY: Double = js.native
  
  /**
    * material.lightmapTexture as only diffuse lighting from this light
    * adds only specular lighting from this light
    * adds dynamic shadows
    */
  @JSGlobal("BABYLON.Light.LIGHTMAP_SPECULAR")
  @js.native
  val LIGHTMAP_SPECULAR: Double = js.native
  
  /**
    * Light type const id of the directional light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_DIRECTIONALLIGHT")
  @js.native
  val LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
  
  /**
    * Light type const id of the hemispheric light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_HEMISPHERICLIGHT")
  @js.native
  val LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
  
  /**
    * Light type const id of the point light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_POINTLIGHT")
  @js.native
  val LIGHTTYPEID_POINTLIGHT: Double = js.native
  
  /**
    * Light type const id of the spot light.
    */
  @JSGlobal("BABYLON.Light.LIGHTTYPEID_SPOTLIGHT")
  @js.native
  val LIGHTTYPEID_SPOTLIGHT: Double = js.native
  
  /**
    * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
    * @param parsedLight The JSON representation of the light
    * @param scene The scene to create the parsed light in
    * @returns the created light after parsing
    */
  @JSGlobal("BABYLON.Light.Parse")
  @js.native
  def Parse(parsedLight: js.Any, scene: typings.babylonjs.BABYLON.Scene): Nullable[typings.babylonjs.BABYLON.Light] = js.native
}
