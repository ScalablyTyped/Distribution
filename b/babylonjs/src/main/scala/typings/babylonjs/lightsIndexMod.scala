package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowLightMod.IShadowLight
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Lights/index", JSImport.Namespace)
@js.native
object lightsIndexMod extends js.Object {
  @js.native
  class CascadedShadowGenerator protected ()
    extends typings.babylonjs.shadowsIndexMod.CascadedShadowGenerator {
    /**
      * Creates a Cascaded Shadow Generator object.
      * A ShadowGenerator is the required tool to use the shadows.
      * Each directional light casting shadows needs to use its own ShadowGenerator.
      * Documentation : https://doc.babylonjs.com/babylon101/cascadedShadows
      * @param mapSize The size of the texture what stores the shadows. Example : 1024.
      * @param light The directional light object generating the shadows.
      * @param usefulFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
      */
    def this(mapSize: Double, light: typings.babylonjs.directionalLightMod.DirectionalLight) = this()
    def this(
      mapSize: Double,
      light: typings.babylonjs.directionalLightMod.DirectionalLight,
      usefulFloatFirst: Boolean
    ) = this()
  }
  
  @js.native
  class DirectionalLight protected ()
    extends typings.babylonjs.directionalLightMod.DirectionalLight {
    /**
      * Creates a DirectionalLight object in the scene, oriented towards the passed direction (Vector3).
      * The directional light is emitted from everywhere in the given direction.
      * It can cast shadows.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The friendly name of the light
      * @param direction The direction of the light
      * @param scene The scene the light belongs to
      */
    def this(name: String, direction: Vector3, scene: Scene) = this()
  }
  
  @js.native
  class HemisphericLight protected ()
    extends typings.babylonjs.hemisphericLightMod.HemisphericLight {
    /**
      * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
      * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
      * The HemisphericLight can't cast shadows.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The friendly name of the light
      * @param direction The direction of the light reflection
      * @param scene The scene the light belongs to
      */
    def this(name: String, direction: Vector3, scene: Scene) = this()
  }
  
  @js.native
  abstract class Light protected ()
    extends typings.babylonjs.lightMod.Light {
    /**
      * Creates a Light object in the scene.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The firendly name of the light
      * @param scene The scene the light belongs too
      */
    def this(name: String, scene: Scene) = this()
  }
  
  @js.native
  class PointLight protected ()
    extends typings.babylonjs.pointLightMod.PointLight {
    /**
      * Creates a PointLight object from the passed name and position (Vector3) and adds it in the scene.
      * A PointLight emits the light in every direction.
      * It can cast shadows.
      * If the scene camera is already defined and you want to set your PointLight at the camera position, just set it :
      * ```javascript
      * var pointLight = new PointLight("pl", camera.position, scene);
      * ```
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The light friendly name
      * @param position The position of the point light in the scene
      * @param scene The scene the lights belongs to
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
  }
  
  @js.native
  class ShadowGenerator protected ()
    extends typings.babylonjs.shadowsIndexMod.ShadowGenerator {
    /**
      * Creates a ShadowGenerator object.
      * A ShadowGenerator is the required tool to use the shadows.
      * Each light casting shadows needs to use its own ShadowGenerator.
      * Documentation : https://doc.babylonjs.com/babylon101/shadows
      * @param mapSize The size of the texture what stores the shadows. Example : 1024.
      * @param light The light object generating the shadows.
      * @param usefulFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
      */
    def this(mapSize: Double, light: IShadowLight) = this()
    def this(mapSize: Double, light: IShadowLight, usefulFloatFirst: Boolean) = this()
  }
  
  @js.native
  class ShadowGeneratorSceneComponent protected ()
    extends typings.babylonjs.shadowsIndexMod.ShadowGeneratorSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @js.native
  abstract class ShadowLight ()
    extends typings.babylonjs.shadowLightMod.ShadowLight
  
  @js.native
  class SpotLight protected ()
    extends typings.babylonjs.spotLightMod.SpotLight {
    /**
      * Creates a SpotLight object in the scene. A spot light is a simply light oriented cone.
      * It can cast shadows.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The light friendly name
      * @param position The position of the spot light in the scene
      * @param direction The direction of the light in the scene
      * @param angle The cone angle of the light in Radians
      * @param exponent The light decay speed with the distance from the emission spot
      * @param scene The scene the lights belongs to
      */
    def this(name: String, position: Vector3, direction: Vector3, angle: Double, exponent: Double, scene: Scene) = this()
  }
  
  /* static members */
  @js.native
  object CascadedShadowGenerator extends js.Object {
    /**
      * Name of the CSM class
      */
    var CLASSNAME: String = js.native
    /**
      * Defines the default number of cascades used by the CSM.
      */
    val DEFAULT_CASCADES_COUNT: Double = js.native
    /**
      * Defines the maximum number of cascades used by the CSM.
      */
    val MAX_CASCADES_COUNT: Double = js.native
    /**
      * Defines the minimum number of cascades used by the CSM.
      */
    val MIN_CASCADES_COUNT: Double = js.native
    val frustumCornersNDCSpace: js.Any = js.native
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @returns The parsed shadow generator
      */
    def Parse(parsedShadowGenerator: js.Any, scene: Scene): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = js.native
    /** @hidden */
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Light extends js.Object {
    /**
      * Falloff Default: light is falling off following the material specification:
      * standard material is using standard falloff whereas pbr material can request special falloff per materials.
      */
    val FALLOFF_DEFAULT: Double = js.native
    /**
      * Falloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    val FALLOFF_GLTF: Double = js.native
    /**
      * Falloff Physical: light is falling off following the inverse squared distance law.
      */
    val FALLOFF_PHYSICAL: Double = js.native
    /**
      * Falloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    val FALLOFF_STANDARD: Double = js.native
    /**
      * Each light type uses the default quantity according to its type:
      *      point/spot lights use luminous intensity
      *      directional lights use illuminance
      */
    val INTENSITYMODE_AUTOMATIC: Double = js.native
    /**
      * lux (lm/m^2)
      */
    val INTENSITYMODE_ILLUMINANCE: Double = js.native
    /**
      * nit (cd/m^2)
      */
    val INTENSITYMODE_LUMINANCE: Double = js.native
    /**
      * candela (lm/sr)
      */
    val INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
    /**
      * lumen (lm)
      */
    val INTENSITYMODE_LUMINOUSPOWER: Double = js.native
    /**
      * If every light affecting the material is in this lightmapMode,
      * material.lightmapTexture adds or multiplies
      * (depends on material.useLightmapAsShadowmap)
      * after every other light calculations.
      */
    val LIGHTMAP_DEFAULT: Double = js.native
    /**
      * material.lightmapTexture as only lighting
      * no light calculation from this light
      * only adds dynamic shadows from this light
      */
    val LIGHTMAP_SHADOWSONLY: Double = js.native
    /**
      * material.lightmapTexture as only diffuse lighting from this light
      * adds only specular lighting from this light
      * adds dynamic shadows
      */
    val LIGHTMAP_SPECULAR: Double = js.native
    /**
      * Light type const id of the directional light.
      */
    val LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
    /**
      * Light type const id of the hemispheric light.
      */
    val LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
    /**
      * Light type const id of the point light.
      */
    val LIGHTTYPEID_POINTLIGHT: Double = js.native
    /**
      * Light type const id of the spot light.
      */
    val LIGHTTYPEID_SPOTLIGHT: Double = js.native
    /**
      * Sort function to order lights for rendering.
      * @param a First Light object to compare to second.
      * @param b Second Light object to compare first.
      * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
      */
    def CompareLightsPriority(a: typings.babylonjs.lightMod.Light, b: typings.babylonjs.lightMod.Light): Double = js.native
    /**
      * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
      * This new light is named "name" and added to the passed scene.
      * @param type Type according to the types available in Light.LIGHTTYPEID_x
      * @param name The friendly name of the light
      * @param scene The scene the new light will belong to
      * @returns the constructor function
      */
    def GetConstructorFromName(`type`: Double, name: String, scene: Scene): Nullable[js.Function0[this.type]] = js.native
    /**
      * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
      * @param parsedLight The JSON representation of the light
      * @param scene The scene to create the parsed light in
      * @returns the created light after parsing
      */
    def Parse(parsedLight: js.Any, scene: Scene): Nullable[typings.babylonjs.lightMod.Light] = js.native
  }
  
  /* static members */
  @js.native
  object ShadowGenerator extends js.Object {
    /**
      * Name of the shadow generator class
      */
    var CLASSNAME: String = js.native
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Double = js.native
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    val FILTER_BLUREXPONENTIALSHADOWMAP: Double = js.native
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    val FILTER_CLOSEEXPONENTIALSHADOWMAP: Double = js.native
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    val FILTER_EXPONENTIALSHADOWMAP: Double = js.native
    /**
      * Shadow generator mode None: no filtering applied.
      */
    val FILTER_NONE: Double = js.native
    /**
      * Shadow generator mode PCF: Percentage Closer Filtering
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
      */
    val FILTER_PCF: Double = js.native
    /**
      * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * Contact Hardening
      */
    val FILTER_PCSS: Double = js.native
    /**
      * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
      * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
      */
    val FILTER_POISSONSAMPLING: Double = js.native
    /**
      * Reserved for PCF and PCSS
      * Highest Quality.
      *
      * Execute PCF on a 5*5 kernel improving a lot the shadow aliasing artifacts.
      *
      * Execute PCSS with 32 taps blocker search and 64 taps PCF.
      */
    val QUALITY_HIGH: Double = js.native
    /**
      * Reserved for PCF and PCSS
      * The lowest quality but the fastest.
      *
      * Execute PCF on a 1*1 kernel.
      *
      * Execute PCSS with 16 taps blocker search and 16 taps PCF.
      */
    val QUALITY_LOW: Double = js.native
    /**
      * Reserved for PCF and PCSS
      * Good tradeoff for quality/perf cross devices
      *
      * Execute PCF on a 3*3 kernel.
      *
      * Execute PCSS with 16 taps blocker search and 32 taps PCF.
      */
    val QUALITY_MEDIUM: Double = js.native
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @param constr A function that builds a shadow generator or undefined to create an instance of the default shadow generator
      * @returns The parsed shadow generator
      */
    def Parse(parsedShadowGenerator: js.Any, scene: Scene): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = js.native
    def Parse(
      parsedShadowGenerator: js.Any,
      scene: Scene,
      constr: js.Function2[/* mapSize */ Double, /* light */ IShadowLight, this.type]
    ): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = js.native
    /** @hidden */
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
  
}

