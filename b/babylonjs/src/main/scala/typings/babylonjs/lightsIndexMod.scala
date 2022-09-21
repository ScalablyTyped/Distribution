package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowLightMod.IShadowLight
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsIndexMod {
  
  @JSImport("babylonjs/Lights/index", "CascadedShadowGenerator")
  @js.native
  open class CascadedShadowGenerator protected ()
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
  /* static members */
  object CascadedShadowGenerator {
    
    @JSImport("babylonjs/Lights/index", "CascadedShadowGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Name of the CSM class
      */
    @JSImport("babylonjs/Lights/index", "CascadedShadowGenerator.CLASSNAME")
    @js.native
    def CLASSNAME: String = js.native
    inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * Defines the default number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/index", "CascadedShadowGenerator.DEFAULT_CASCADES_COUNT")
    @js.native
    val DEFAULT_CASCADES_COUNT: Double = js.native
    
    /**
      * Defines the maximum number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/index", "CascadedShadowGenerator.MAX_CASCADES_COUNT")
    @js.native
    val MAX_CASCADES_COUNT: Double = js.native
    
    /**
      * Defines the minimum number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/index", "CascadedShadowGenerator.MIN_CASCADES_COUNT")
    @js.native
    val MIN_CASCADES_COUNT: Double = js.native
    
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @returns The parsed shadow generator
      */
    inline def Parse(parsedShadowGenerator: Any, scene: Scene): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.shadowGeneratorMod.ShadowGenerator]
    
    @JSImport("babylonjs/Lights/index", "CascadedShadowGenerator._FrustumCornersNDCSpace")
    @js.native
    val _FrustumCornersNDCSpace: Any = js.native
    
    /**
      * @param _
      * @hidden
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Lights/index", "DirectionalLight")
  @js.native
  open class DirectionalLight protected ()
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
  
  @JSImport("babylonjs/Lights/index", "HemisphericLight")
  @js.native
  open class HemisphericLight protected ()
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
  
  @JSImport("babylonjs/Lights/index", "Light")
  @js.native
  abstract class Light protected ()
    extends typings.babylonjs.lightMod.Light {
    /**
      * Creates a Light object in the scene.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The friendly name of the light
      * @param scene The scene the light belongs too
      */
    def this(name: String, scene: Scene) = this()
  }
  /* static members */
  object Light {
    
    @JSImport("babylonjs/Lights/index", "Light")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Falloff Default: light is falling off following the material specification:
      * standard material is using standard falloff whereas pbr material can request special falloff per materials.
      */
    @JSImport("babylonjs/Lights/index", "Light.FALLOFF_DEFAULT")
    @js.native
    val FALLOFF_DEFAULT: Double = js.native
    
    /**
      * Falloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    @JSImport("babylonjs/Lights/index", "Light.FALLOFF_GLTF")
    @js.native
    val FALLOFF_GLTF: Double = js.native
    
    /**
      * Falloff Physical: light is falling off following the inverse squared distance law.
      */
    @JSImport("babylonjs/Lights/index", "Light.FALLOFF_PHYSICAL")
    @js.native
    val FALLOFF_PHYSICAL: Double = js.native
    
    /**
      * Falloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    @JSImport("babylonjs/Lights/index", "Light.FALLOFF_STANDARD")
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
    inline def GetConstructorFromName(`type`: Double, name: String, scene: Scene): Nullable[js.Function0[this.type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetConstructorFromName")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[js.Function0[this.type]]]
    
    /**
      * Each light type uses the default quantity according to its type:
      *      point/spot lights use luminous intensity
      *      directional lights use illuminance
      */
    @JSImport("babylonjs/Lights/index", "Light.INTENSITYMODE_AUTOMATIC")
    @js.native
    val INTENSITYMODE_AUTOMATIC: Double = js.native
    
    /**
      * lux (lm/m^2)
      */
    @JSImport("babylonjs/Lights/index", "Light.INTENSITYMODE_ILLUMINANCE")
    @js.native
    val INTENSITYMODE_ILLUMINANCE: Double = js.native
    
    /**
      * nit (cd/m^2)
      */
    @JSImport("babylonjs/Lights/index", "Light.INTENSITYMODE_LUMINANCE")
    @js.native
    val INTENSITYMODE_LUMINANCE: Double = js.native
    
    /**
      * candela (lm/sr)
      */
    @JSImport("babylonjs/Lights/index", "Light.INTENSITYMODE_LUMINOUSINTENSITY")
    @js.native
    val INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
    
    /**
      * lumen (lm)
      */
    @JSImport("babylonjs/Lights/index", "Light.INTENSITYMODE_LUMINOUSPOWER")
    @js.native
    val INTENSITYMODE_LUMINOUSPOWER: Double = js.native
    
    /**
      * If every light affecting the material is in this lightmapMode,
      * material.lightmapTexture adds or multiplies
      * (depends on material.useLightmapAsShadowmap)
      * after every other light calculations.
      */
    @JSImport("babylonjs/Lights/index", "Light.LIGHTMAP_DEFAULT")
    @js.native
    val LIGHTMAP_DEFAULT: Double = js.native
    
    /**
      * material.lightmapTexture as only lighting
      * no light calculation from this light
      * only adds dynamic shadows from this light
      */
    @JSImport("babylonjs/Lights/index", "Light.LIGHTMAP_SHADOWSONLY")
    @js.native
    val LIGHTMAP_SHADOWSONLY: Double = js.native
    
    /**
      * material.lightmapTexture as only diffuse lighting from this light
      * adds only specular lighting from this light
      * adds dynamic shadows
      */
    @JSImport("babylonjs/Lights/index", "Light.LIGHTMAP_SPECULAR")
    @js.native
    val LIGHTMAP_SPECULAR: Double = js.native
    
    /**
      * Light type const id of the directional light.
      */
    @JSImport("babylonjs/Lights/index", "Light.LIGHTTYPEID_DIRECTIONALLIGHT")
    @js.native
    val LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
    
    /**
      * Light type const id of the hemispheric light.
      */
    @JSImport("babylonjs/Lights/index", "Light.LIGHTTYPEID_HEMISPHERICLIGHT")
    @js.native
    val LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
    
    /**
      * Light type const id of the point light.
      */
    @JSImport("babylonjs/Lights/index", "Light.LIGHTTYPEID_POINTLIGHT")
    @js.native
    val LIGHTTYPEID_POINTLIGHT: Double = js.native
    
    /**
      * Light type const id of the spot light.
      */
    @JSImport("babylonjs/Lights/index", "Light.LIGHTTYPEID_SPOTLIGHT")
    @js.native
    val LIGHTTYPEID_SPOTLIGHT: Double = js.native
    
    /**
      * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
      * @param parsedLight The JSON representation of the light
      * @param scene The scene to create the parsed light in
      * @returns the created light after parsing
      */
    inline def Parse(parsedLight: Any, scene: Scene): Nullable[typings.babylonjs.lightMod.Light] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedLight.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.lightMod.Light]]
  }
  
  @JSImport("babylonjs/Lights/index", "PointLight")
  @js.native
  open class PointLight protected ()
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
  
  @JSImport("babylonjs/Lights/index", "ShadowGenerator")
  @js.native
  open class ShadowGenerator protected ()
    extends typings.babylonjs.shadowsIndexMod.ShadowGenerator {
    /**
      * Creates a ShadowGenerator object.
      * A ShadowGenerator is the required tool to use the shadows.
      * Each light casting shadows needs to use its own ShadowGenerator.
      * Documentation : https://doc.babylonjs.com/babylon101/shadows
      * @param mapSize The size of the texture what stores the shadows. Example : 1024.
      * @param light The light object generating the shadows.
      * @param usefullFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
      */
    def this(mapSize: Double, light: IShadowLight) = this()
    def this(mapSize: Double, light: IShadowLight, usefullFloatFirst: Boolean) = this()
  }
  /* static members */
  object ShadowGenerator {
    
    @JSImport("babylonjs/Lights/index", "ShadowGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Name of the shadow generator class
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.CLASSNAME")
    @js.native
    def CLASSNAME: String = js.native
    inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * Defines the default alpha cutoff value used for transparent alpha tested materials.
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.DEFAULT_ALPHA_CUTOFF")
    @js.native
    def DEFAULT_ALPHA_CUTOFF: Double = js.native
    inline def DEFAULT_ALPHA_CUTOFF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALPHA_CUTOFF")(x.asInstanceOf[js.Any])
    
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_BLURCLOSEEXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_BLUREXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_BLUREXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_CLOSEEXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_CLOSEEXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_EXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_EXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode None: no filtering applied.
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_NONE")
    @js.native
    val FILTER_NONE: Double = js.native
    
    /**
      * Shadow generator mode PCF: Percentage Closer Filtering
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_PCF")
    @js.native
    val FILTER_PCF: Double = js.native
    
    /**
      * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * Contact Hardening
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_PCSS")
    @js.native
    val FILTER_PCSS: Double = js.native
    
    /**
      * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
      * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.FILTER_POISSONSAMPLING")
    @js.native
    val FILTER_POISSONSAMPLING: Double = js.native
    
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @param constr A function that builds a shadow generator or undefined to create an instance of the default shadow generator
      * @returns The parsed shadow generator
      */
    inline def Parse(parsedShadowGenerator: Any, scene: Scene): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.shadowGeneratorMod.ShadowGenerator]
    inline def Parse(
      parsedShadowGenerator: Any,
      scene: Scene,
      constr: js.Function2[/* mapSize */ Double, /* light */ IShadowLight, this.type]
    ): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], constr.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.shadowGeneratorMod.ShadowGenerator]
    
    /**
      * Reserved for PCF and PCSS
      * Highest Quality.
      *
      * Execute PCF on a 5*5 kernel improving a lot the shadow aliasing artifacts.
      *
      * Execute PCSS with 32 taps blocker search and 64 taps PCF.
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.QUALITY_HIGH")
    @js.native
    val QUALITY_HIGH: Double = js.native
    
    /**
      * Reserved for PCF and PCSS
      * The lowest quality but the fastest.
      *
      * Execute PCF on a 1*1 kernel.
      *
      * Execute PCSS with 16 taps blocker search and 16 taps PCF.
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.QUALITY_LOW")
    @js.native
    val QUALITY_LOW: Double = js.native
    
    /**
      * Reserved for PCF and PCSS
      * Good tradeoff for quality/perf cross devices
      *
      * Execute PCF on a 3*3 kernel.
      *
      * Execute PCSS with 16 taps blocker search and 32 taps PCF.
      */
    @JSImport("babylonjs/Lights/index", "ShadowGenerator.QUALITY_MEDIUM")
    @js.native
    val QUALITY_MEDIUM: Double = js.native
    
    /**
      * @param _
      * @hidden
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Lights/index", "ShadowGeneratorSceneComponent")
  @js.native
  open class ShadowGeneratorSceneComponent protected ()
    extends typings.babylonjs.shadowsIndexMod.ShadowGeneratorSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Lights/index", "ShadowLight")
  @js.native
  abstract class ShadowLight protected ()
    extends typings.babylonjs.shadowLightMod.ShadowLight {
    /**
      * Creates a Light object in the scene.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The friendly name of the light
      * @param scene The scene the light belongs too
      */
    def this(name: String, scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Lights/index", "SpotLight")
  @js.native
  open class SpotLight protected ()
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
  object SpotLight {
    
    @JSImport("babylonjs/Lights/index", "SpotLight")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Lights/index", "SpotLight._IsProceduralTexture")
    @js.native
    def _IsProceduralTexture: Any = js.native
    inline def _IsProceduralTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsProceduralTexture")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Lights/index", "SpotLight._IsTexture")
    @js.native
    def _IsTexture: Any = js.native
    inline def _IsTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsTexture")(x.asInstanceOf[js.Any])
  }
}
