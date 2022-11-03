package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IShadowLight
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShadowGenerator")
@js.native
open class ShadowGenerator protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ShadowGenerator {
  /**
    * Creates a ShadowGenerator object.
    * A ShadowGenerator is the required tool to use the shadows.
    * Each light casting shadows needs to use its own ShadowGenerator.
    * Documentation : https://doc.babylonjs.com/babylon101/shadows
    * @param mapSize The size of the texture what stores the shadows. Example : 1024.
    * @param light The light object generating the shadows.
    * @param usefullFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
    * @param camera Camera associated with this shadow generator (default: null). If null, takes the scene active camera at the time we need to access it
    */
  def this(mapSize: Double, light: IShadowLight) = this()
  def this(mapSize: Double, light: IShadowLight, usefullFloatFirst: Boolean) = this()
  def this(
    mapSize: Double,
    light: IShadowLight,
    usefullFloatFirst: Boolean,
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    mapSize: Double,
    light: IShadowLight,
    usefullFloatFirst: Unit,
    camera: Nullable[typings.babylonjs.BABYLON.Camera]
  ) = this()
}
/* static members */
object ShadowGenerator {
  
  @JSGlobal("BABYLON.ShadowGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Name of the shadow generator class
    */
  @JSGlobal("BABYLON.ShadowGenerator.CLASSNAME")
  @js.native
  def CLASSNAME: String = js.native
  inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
  
  /**
    * Defines the default alpha cutoff value used for transparent alpha tested materials.
    */
  @JSGlobal("BABYLON.ShadowGenerator.DEFAULT_ALPHA_CUTOFF")
  @js.native
  def DEFAULT_ALPHA_CUTOFF: Double = js.native
  inline def DEFAULT_ALPHA_CUTOFF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALPHA_CUTOFF")(x.asInstanceOf[js.Any])
  
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_BLURCLOSEEXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: /* 5 */ Double = js.native
  
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_BLUREXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_BLUREXPONENTIALSHADOWMAP: /* 3 */ Double = js.native
  
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_CLOSEEXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_CLOSEEXPONENTIALSHADOWMAP: /* 4 */ Double = js.native
  
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_EXPONENTIALSHADOWMAP")
  @js.native
  val FILTER_EXPONENTIALSHADOWMAP: /* 1 */ Double = js.native
  
  /**
    * Shadow generator mode None: no filtering applied.
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_NONE")
  @js.native
  val FILTER_NONE: /* 0 */ Double = js.native
  
  /**
    * Shadow generator mode PCF: Percentage Closer Filtering
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_PCF")
  @js.native
  val FILTER_PCF: /* 6 */ Double = js.native
  
  /**
    * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * Contact Hardening
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_PCSS")
  @js.native
  val FILTER_PCSS: /* 7 */ Double = js.native
  
  /**
    * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
    * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
    */
  @JSGlobal("BABYLON.ShadowGenerator.FILTER_POISSONSAMPLING")
  @js.native
  val FILTER_POISSONSAMPLING: /* 2 */ Double = js.native
  
  /**
    * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
    * @param parsedShadowGenerator The JSON object to parse
    * @param scene The scene to create the shadow map for
    * @param constr A function that builds a shadow generator or undefined to create an instance of the default shadow generator
    * @returns The parsed shadow generator
    */
  inline def Parse(parsedShadowGenerator: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ShadowGenerator]
  inline def Parse(
    parsedShadowGenerator: Any,
    scene: typings.babylonjs.BABYLON.Scene,
    constr: js.Function3[
      /* mapSize */ Double, 
      /* light */ IShadowLight, 
      /* camera */ Nullable[typings.babylonjs.BABYLON.Camera], 
      this.type
    ]
  ): typings.babylonjs.BABYLON.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], constr.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ShadowGenerator]
  
  /**
    * Reserved for PCF and PCSS
    * Highest Quality.
    *
    * Execute PCF on a 5*5 kernel improving a lot the shadow aliasing artifacts.
    *
    * Execute PCSS with 32 taps blocker search and 64 taps PCF.
    */
  @JSGlobal("BABYLON.ShadowGenerator.QUALITY_HIGH")
  @js.native
  val QUALITY_HIGH: /* 0 */ Double = js.native
  
  /**
    * Reserved for PCF and PCSS
    * The lowest quality but the fastest.
    *
    * Execute PCF on a 1*1 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 16 taps PCF.
    */
  @JSGlobal("BABYLON.ShadowGenerator.QUALITY_LOW")
  @js.native
  val QUALITY_LOW: /* 2 */ Double = js.native
  
  /**
    * Reserved for PCF and PCSS
    * Good tradeoff for quality/perf cross devices
    *
    * Execute PCF on a 3*3 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 32 taps PCF.
    */
  @JSGlobal("BABYLON.ShadowGenerator.QUALITY_MEDIUM")
  @js.native
  val QUALITY_MEDIUM: /* 1 */ Double = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
