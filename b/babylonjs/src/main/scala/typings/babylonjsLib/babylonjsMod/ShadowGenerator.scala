package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default implementation IShadowGenerator.
  * This is the main object responsible of generating shadows in the framework.
  * Documentation: https://doc.babylonjs.com/babylon101/shadows
  */
@JSImport("babylonjs", "ShadowGenerator")
@js.native
class ShadowGenerator protected ()
  extends babylonjsLib.BABYLONNs.ShadowGenerator {
  /**
    * Creates a ShadowGenerator object.
    * A ShadowGenerator is the required tool to use the shadows.
    * Each light casting shadows needs to use its own ShadowGenerator.
    * Documentation : http://doc.babylonjs.com/tutorials/shadows
    * @param mapSize The size of the texture what stores the shadows. Example : 1024.
    * @param light The light object generating the shadows.
    * @param useFullFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
    */
  def this(mapSize: scala.Double, light: babylonjsLib.BABYLONNs.IShadowLight) = this()
  def this(mapSize: scala.Double, light: babylonjsLib.BABYLONNs.IShadowLight, useFullFloatFirst: scala.Boolean) = this()
}

/* static members */
@JSImport("babylonjs", "ShadowGenerator")
@js.native
object ShadowGenerator extends js.Object {
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode ESM: Blurred Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_BLUREXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping using the inverse of the exponential preventing
    * edge artifacts on steep falloff.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_CLOSEEXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode ESM: Exponential Shadow Mapping.
    * (http://developer.download.nvidia.com/presentations/2008/GDC/GDC08_SoftShadowMapping.pdf)
    */
  val FILTER_EXPONENTIALSHADOWMAP: scala.Double = js.native
  /**
    * Shadow generator mode None: no filtering applied.
    */
  val FILTER_NONE: scala.Double = js.native
  /**
    * Shadow generator mode PCF: Percentage Closer Filtering
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * (https://developer.nvidia.com/gpugems/GPUGems/gpugems_ch11.html)
    */
  val FILTER_PCF: scala.Double = js.native
  /**
    * Shadow generator mode PCSS: Percentage Closering Soft Shadow.
    * benefits from Webgl 2 shadow samplers. Fallback to Poisson Sampling in Webgl 1
    * Contact Hardening
    */
  val FILTER_PCSS: scala.Double = js.native
  /**
    * Shadow generator mode Poisson Sampling: Percentage Closer Filtering.
    * (Multiple Tap around evenly distributed around the pixel are used to evaluate the shadow strength)
    */
  val FILTER_POISSONSAMPLING: scala.Double = js.native
  /**
    * Reserved for PCF and PCSS
    * Highest Quality.
    *
    * Execute PCF on a 5*5 kernel improving a lot the shadow aliasing artifacts.
    *
    * Execute PCSS with 32 taps blocker search and 64 taps PCF.
    */
  val QUALITY_HIGH: scala.Double = js.native
  /**
    * Reserved for PCF and PCSS
    * The lowest quality but the fastest.
    *
    * Execute PCF on a 1*1 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 16 taps PCF.
    */
  val QUALITY_LOW: scala.Double = js.native
  /**
    * Reserved for PCF and PCSS
    * Good tradeoff for quality/perf cross devices
    *
    * Execute PCF on a 3*3 kernel.
    *
    * Execute PCSS with 16 taps blocker search and 32 taps PCF.
    */
  val QUALITY_MEDIUM: scala.Double = js.native
  /**
    * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
    * @param parsedShadowGenerator The JSON object to parse
    * @param scene The scene to create the shadow map for
    * @returns The parsed shadow generator
    */
  def Parse(parsedShadowGenerator: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.ShadowGenerator = js.native
}

