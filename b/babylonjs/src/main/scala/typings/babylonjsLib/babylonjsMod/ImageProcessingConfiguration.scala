package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This groups together the common properties used for image processing either in direct forward pass
  * or through post processing effect depending on the use of the image processing pipeline in your scene
  * or not.
  */
@JSImport("babylonjs", "ImageProcessingConfiguration")
@js.native
class ImageProcessingConfiguration ()
  extends babylonjsLib.BABYLONNs.ImageProcessingConfiguration

/**
  * This groups together the common properties used for image processing either in direct forward pass
  * or through post processing effect depending on the use of the image processing pipeline in your scene
  * or not.
  */
@JSImport("babylonjs", "ImageProcessingConfiguration")
@js.native
object ImageProcessingConfiguration extends js.Object {
  /**
    * ACES Tone mapping (used by default in unreal and unity). This can help getting closer
    * to other engines rendering to increase portability.
    */
  val TONEMAPPING_ACES: scala.Double = js.native
  /**
    * Default tone mapping applied in BabylonJS.
    */
  val TONEMAPPING_STANDARD: scala.Double = js.native
  /**
    * Used to apply the vignette as a mix with the pixel color.
    */
  val VIGNETTEMODE_MULTIPLY: scala.Double = js.native
  /**
    * Used to apply the vignette as a replacement of the pixel color.
    */
  val VIGNETTEMODE_OPAQUE: scala.Double = js.native
  var _VIGNETTEMODE_MULTIPLY: js.Any = js.native
  var _VIGNETTEMODE_OPAQUE: js.Any = js.native
  /**
    * Parses the image processing from a json representation.
    * @param source the JSON source to parse
    * @return The parsed image processing
    */
  def Parse(source: js.Any): babylonjsLib.BABYLONNs.ImageProcessingConfiguration = js.native
  /**
    * Prepare the list of samplers associated with the Image Processing effects.
    * @param samplersList The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  def PrepareSamplers(
    samplersList: js.Array[java.lang.String],
    defines: babylonjsLib.BABYLONNs.IImageProcessingConfigurationDefines
  ): scala.Unit = js.native
  /**
    * Prepare the list of uniforms associated with the Image Processing effects.
    * @param uniforms The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  def PrepareUniforms(
    uniforms: js.Array[java.lang.String],
    defines: babylonjsLib.BABYLONNs.IImageProcessingConfigurationDefines
  ): scala.Unit = js.native
}

