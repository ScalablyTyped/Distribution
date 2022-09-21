package typings.babylonjs

import typings.babylonjs.directionalLightMod.DirectionalLight
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowLightMod.IShadowLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowsIndexMod {
  
  @JSImport("babylonjs/Lights/Shadows/index", "CascadedShadowGenerator")
  @js.native
  open class CascadedShadowGenerator protected ()
    extends typings.babylonjs.cascadedShadowGeneratorMod.CascadedShadowGenerator {
    /**
      * Creates a Cascaded Shadow Generator object.
      * A ShadowGenerator is the required tool to use the shadows.
      * Each directional light casting shadows needs to use its own ShadowGenerator.
      * Documentation : https://doc.babylonjs.com/babylon101/cascadedShadows
      * @param mapSize The size of the texture what stores the shadows. Example : 1024.
      * @param light The directional light object generating the shadows.
      * @param usefulFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
      */
    def this(mapSize: Double, light: DirectionalLight) = this()
    def this(mapSize: Double, light: DirectionalLight, usefulFloatFirst: Boolean) = this()
  }
  /* static members */
  object CascadedShadowGenerator {
    
    @JSImport("babylonjs/Lights/Shadows/index", "CascadedShadowGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Name of the CSM class
      */
    @JSImport("babylonjs/Lights/Shadows/index", "CascadedShadowGenerator.CLASSNAME")
    @js.native
    def CLASSNAME: String = js.native
    inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * Defines the default number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/Shadows/index", "CascadedShadowGenerator.DEFAULT_CASCADES_COUNT")
    @js.native
    val DEFAULT_CASCADES_COUNT: Double = js.native
    
    /**
      * Defines the maximum number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/Shadows/index", "CascadedShadowGenerator.MAX_CASCADES_COUNT")
    @js.native
    val MAX_CASCADES_COUNT: Double = js.native
    
    /**
      * Defines the minimum number of cascades used by the CSM.
      */
    @JSImport("babylonjs/Lights/Shadows/index", "CascadedShadowGenerator.MIN_CASCADES_COUNT")
    @js.native
    val MIN_CASCADES_COUNT: Double = js.native
    
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @returns The parsed shadow generator
      */
    inline def Parse(parsedShadowGenerator: Any, scene: Scene): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.shadowGeneratorMod.ShadowGenerator]
    
    @JSImport("babylonjs/Lights/Shadows/index", "CascadedShadowGenerator._FrustumCornersNDCSpace")
    @js.native
    val _FrustumCornersNDCSpace: Any = js.native
    
    /**
      * @param _
      * @hidden
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator")
  @js.native
  open class ShadowGenerator protected ()
    extends typings.babylonjs.shadowGeneratorMod.ShadowGenerator {
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
    
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Name of the shadow generator class
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.CLASSNAME")
    @js.native
    def CLASSNAME: String = js.native
    inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
    
    /**
      * Defines the default alpha cutoff value used for transparent alpha tested materials.
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.DEFAULT_ALPHA_CUTOFF")
    @js.native
    def DEFAULT_ALPHA_CUTOFF: Double = js.native
    inline def DEFAULT_ALPHA_CUTOFF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALPHA_CUTOFF")(x.asInstanceOf[js.Any])
    
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_BLURCLOSEEXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_BLUREXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_BLUREXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
      * edge artifacts on steep falloff.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_CLOSEEXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_CLOSEEXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode ESM: Exponential Shadow Mapping.
      * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_EXPONENTIALSHADOWMAP")
    @js.native
    val FILTER_EXPONENTIALSHADOWMAP: Double = js.native
    
    /**
      * Shadow generator mode None: no filtering applied.
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_NONE")
    @js.native
    val FILTER_NONE: Double = js.native
    
    /**
      * Shadow generator mode PCF: Percentage Closer Filtering
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_PCF")
    @js.native
    val FILTER_PCF: Double = js.native
    
    /**
      * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
      * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
      * Contact Hardening
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_PCSS")
    @js.native
    val FILTER_PCSS: Double = js.native
    
    /**
      * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
      * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
      */
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.FILTER_POISSONSAMPLING")
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
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.QUALITY_HIGH")
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
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.QUALITY_LOW")
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
    @JSImport("babylonjs/Lights/Shadows/index", "ShadowGenerator.QUALITY_MEDIUM")
    @js.native
    val QUALITY_MEDIUM: Double = js.native
    
    /**
      * @param _
      * @hidden
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Lights/Shadows/index", "ShadowGeneratorSceneComponent")
  @js.native
  open class ShadowGeneratorSceneComponent protected ()
    extends typings.babylonjs.shadowGeneratorSceneComponentMod.ShadowGeneratorSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
}
