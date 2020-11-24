package typings.babylonjs

import typings.babylonjs.directionalLightMod.DirectionalLight
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowLightMod.IShadowLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Lights/Shadows/index", JSImport.Namespace)
@js.native
object shadowsIndexMod extends js.Object {
  
  @js.native
  class CascadedShadowGenerator protected ()
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
      *  Support test.
      */
    def IsSupported: Boolean = js.native
    
    /**
      * Defines the maximum number of cascades used by the CSM.
      */
    val MAX_CASCADES_COUNT: Double = js.native
    
    /**
      * Defines the minimum number of cascades used by the CSM.
      */
    val MIN_CASCADES_COUNT: Double = js.native
    
    /**
      * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
      * @param parsedShadowGenerator The JSON object to parse
      * @param scene The scene to create the shadow map for
      * @returns The parsed shadow generator
      */
    def Parse(parsedShadowGenerator: js.Any, scene: Scene): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = js.native
    
    /** @hidden */
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
    
    val frustumCornersNDCSpace: js.Any = js.native
  }
  
  @js.native
  class ShadowGenerator protected ()
    extends typings.babylonjs.shadowGeneratorMod.ShadowGenerator {
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
    
    /** @hidden */
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
  
  @js.native
  class ShadowGeneratorSceneComponent protected ()
    extends typings.babylonjs.shadowGeneratorSceneComponentMod.ShadowGeneratorSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
}
