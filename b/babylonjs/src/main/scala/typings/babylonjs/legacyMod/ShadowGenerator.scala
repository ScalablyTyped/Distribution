package typings.babylonjs.legacyMod

import typings.babylonjs.shadowLightMod.IShadowLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ShadowGenerator")
@js.native
open class ShadowGenerator protected ()
  extends typings.babylonjs.indexMod.ShadowGenerator {
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
  
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Name of the shadow generator class
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.CLASSNAME")
  @js.native
  def CLASSNAME: String = js.native
  inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
  
  /**
    * Defines the default alpha cutoff value used for transparent alpha tested materials.
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.DEFAULT_ALPHA_CUTOFF")
  @js.native
  def DEFAULT_ALPHA_CUTOFF: Double = js.native
  inline def DEFAULT_ALPHA_CUTOFF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALPHA_CUTOFF")(x.asInstanceOf[js.Any])
  
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_BLURCLOSEEXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_BLUREXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_BLUREXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_CLOSEEXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_CLOSEEXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_EXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_EXPONENTIALSHADOWMAP: Double = js.native
  
  /**
    * Shadow generator mode None: no filtering applied.
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_NONE")
  @js.native
  val FILTER_NONE: Double = js.native
  
  /**
    * Shadow generator mode PCF: Percentage Closer Filtering
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_PCF")
  @js.native
  val FILTER_PCF: Double = js.native
  
  /**
    * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * Contact Hardening
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_PCSS")
  @js.native
  val FILTER_PCSS: Double = js.native
  
  /**
    * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
    * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
    */
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.FILTER_POISSONSAMPLING")
  @js.native
  val FILTER_POISSONSAMPLING: Double = js.native
  
  /**
    * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
    * @param parsedShadowGenerator The JSON object to parse
    * @param scene The scene to create the shadow map for
    * @param constr A function that builds a shadow generator or undefined to create an instance of the default shadow generator
    * @returns The parsed shadow generator
    */
  inline def Parse(parsedShadowGenerator: Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.shadowGeneratorMod.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.shadowGeneratorMod.ShadowGenerator]
  inline def Parse(
    parsedShadowGenerator: Any,
    scene: typings.babylonjs.sceneMod.Scene,
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
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.QUALITY_HIGH")
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
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.QUALITY_LOW")
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
  @JSImport("babylonjs/Legacy/legacy", "ShadowGenerator.QUALITY_MEDIUM")
  @js.native
  val QUALITY_MEDIUM: Double = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
