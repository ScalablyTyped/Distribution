package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ISortableLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.LightConstants")
@js.native
open class LightConstants ()
  extends StObject
     with typings.babylonjs.BABYLON.LightConstants
/* static members */
object LightConstants {
  
  @JSGlobal("BABYLON.LightConstants")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sort function to order lights for rendering.
    * @param a First Light object to compare to second.
    * @param b Second Light object to compare first.
    * @returns -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
    */
  inline def CompareLightsPriority(a: ISortableLight, b: ISortableLight): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CompareLightsPriority")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Falloff Default: light is falling off following the material specification:
    * standard material is using standard falloff whereas pbr material can request special falloff per materials.
    */
  @JSGlobal("BABYLON.LightConstants.FALLOFF_DEFAULT")
  @js.native
  val FALLOFF_DEFAULT: /* 0 */ Double = js.native
  
  /**
    * Falloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  @JSGlobal("BABYLON.LightConstants.FALLOFF_GLTF")
  @js.native
  val FALLOFF_GLTF: /* 2 */ Double = js.native
  
  /**
    * Falloff Physical: light is falling off following the inverse squared distance law.
    */
  @JSGlobal("BABYLON.LightConstants.FALLOFF_PHYSICAL")
  @js.native
  val FALLOFF_PHYSICAL: /* 1 */ Double = js.native
  
  /**
    * Falloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  @JSGlobal("BABYLON.LightConstants.FALLOFF_STANDARD")
  @js.native
  val FALLOFF_STANDARD: /* 3 */ Double = js.native
  
  /**
    * Each light type uses the default quantity according to its type:
    *      point/spot lights use luminous intensity
    *      directional lights use illuminance
    */
  @JSGlobal("BABYLON.LightConstants.INTENSITYMODE_AUTOMATIC")
  @js.native
  val INTENSITYMODE_AUTOMATIC: /* 0 */ Double = js.native
  
  /**
    * lux (lm/m^2)
    */
  @JSGlobal("BABYLON.LightConstants.INTENSITYMODE_ILLUMINANCE")
  @js.native
  val INTENSITYMODE_ILLUMINANCE: /* 3 */ Double = js.native
  
  /**
    * nit (cd/m^2)
    */
  @JSGlobal("BABYLON.LightConstants.INTENSITYMODE_LUMINANCE")
  @js.native
  val INTENSITYMODE_LUMINANCE: /* 4 */ Double = js.native
  
  /**
    * candela (lm/sr)
    */
  @JSGlobal("BABYLON.LightConstants.INTENSITYMODE_LUMINOUSINTENSITY")
  @js.native
  val INTENSITYMODE_LUMINOUSINTENSITY: /* 2 */ Double = js.native
  
  /**
    * lumen (lm)
    */
  @JSGlobal("BABYLON.LightConstants.INTENSITYMODE_LUMINOUSPOWER")
  @js.native
  val INTENSITYMODE_LUMINOUSPOWER: /* 1 */ Double = js.native
  
  /**
    * If every light affecting the material is in this lightmapMode,
    * material.lightmapTexture adds or multiplies
    * (depends on material.useLightmapAsShadowmap)
    * after every other light calculations.
    */
  @JSGlobal("BABYLON.LightConstants.LIGHTMAP_DEFAULT")
  @js.native
  val LIGHTMAP_DEFAULT: /* 0 */ Double = js.native
  
  /**
    * material.lightmapTexture as only lighting
    * no light calculation from this light
    * only adds dynamic shadows from this light
    */
  @JSGlobal("BABYLON.LightConstants.LIGHTMAP_SHADOWSONLY")
  @js.native
  val LIGHTMAP_SHADOWSONLY: /* 2 */ Double = js.native
  
  /**
    * material.lightmapTexture as only diffuse lighting from this light
    * adds only specular lighting from this light
    * adds dynamic shadows
    */
  @JSGlobal("BABYLON.LightConstants.LIGHTMAP_SPECULAR")
  @js.native
  val LIGHTMAP_SPECULAR: /* 1 */ Double = js.native
  
  /**
    * Light type var id of the directional light.
    */
  @JSGlobal("BABYLON.LightConstants.LIGHTTYPEID_DIRECTIONALLIGHT")
  @js.native
  val LIGHTTYPEID_DIRECTIONALLIGHT: /* 1 */ Double = js.native
  
  /**
    * Light type var id of the hemispheric light.
    */
  @JSGlobal("BABYLON.LightConstants.LIGHTTYPEID_HEMISPHERICLIGHT")
  @js.native
  val LIGHTTYPEID_HEMISPHERICLIGHT: /* 3 */ Double = js.native
  
  /**
    * Light type var id of the point light.
    */
  @JSGlobal("BABYLON.LightConstants.LIGHTTYPEID_POINTLIGHT")
  @js.native
  val LIGHTTYPEID_POINTLIGHT: /* 0 */ Double = js.native
  
  /**
    * Light type var id of the spot light.
    */
  @JSGlobal("BABYLON.LightConstants.LIGHTTYPEID_SPOTLIGHT")
  @js.native
  val LIGHTTYPEID_SPOTLIGHT: /* 2 */ Double = js.native
}
