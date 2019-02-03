package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This groups together the common properties used for image processing either in direct forward pass
  * or through post processing effect depending on the use of the image processing pipeline in your scene
  * or not.
  */
@JSGlobal("BABYLON.ImageProcessingConfiguration")
@js.native
class ImageProcessingConfiguration () extends js.Object {
  var _applyByPostProcess: js.Any = js.native
  var _colorCurvesEnabled: js.Any = js.native
  var _colorGradingBGR: js.Any = js.native
  var _colorGradingEnabled: js.Any = js.native
  var _colorGradingTexture: js.Any = js.native
  var _colorGradingWithGreenDepth: js.Any = js.native
  var _contrast: scala.Double = js.native
  /** @hidden */
  var _exposure: scala.Double = js.native
  var _isEnabled: js.Any = js.native
  var _toneMappingEnabled: js.Any = js.native
  var _toneMappingType: js.Any = js.native
  var _vignetteBlendMode: js.Any = js.native
  var _vignetteEnabled: js.Any = js.native
  /**
    * Gets wether the image processing is applied through a post process or not.
    */
  /**
    * Sets wether the image processing is applied through a post process or not.
    */
  var applyByPostProcess: scala.Boolean = js.native
  /**
    * Color curves setup used in the effect if colorCurvesEnabled is set to true
    */
  var colorCurves: Nullable[ColorCurves] = js.native
  /**
    * Gets wether the color curves effect is enabled.
    */
  /**
    * Sets wether the color curves effect is enabled.
    */
  var colorCurvesEnabled: scala.Boolean = js.native
  /**
    * Gets wether the color grading texture contains BGR values.
    */
  /**
    * Sets wether the color grading texture contains BGR values.
    */
  var colorGradingBGR: scala.Boolean = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  /**
    * Sets wether the color grading effect is enabled.
    */
  var colorGradingEnabled: scala.Boolean = js.native
  /**
    * Color grading LUT texture used in the effect if colorGradingEnabled is set to true
    */
  /**
    * Color grading LUT texture used in the effect if colorGradingEnabled is set to true
    */
  var colorGradingTexture: Nullable[BaseTexture] = js.native
  /**
    * Gets wether the color grading effect is using a green depth for the 3d Texture.
    */
  /**
    * Sets wether the color grading effect is using a green depth for the 3d Texture.
    */
  var colorGradingWithGreenDepth: scala.Boolean = js.native
  /**
    * Gets the contrast used in the effect.
    */
  /**
    * Sets the contrast used in the effect.
    */
  var contrast: scala.Double = js.native
  /**
    * Gets the Exposure used in the effect.
    */
  /**
    * Sets the Exposure used in the effect.
    */
  var exposure: scala.Double = js.native
  /**
    * Gets wether the image processing is enabled or not.
    */
  /**
    * Sets wether the image processing is enabled or not.
    */
  var isEnabled: scala.Boolean = js.native
  /**
    * An event triggered when the configuration changes and requires Shader to Update some parameters.
    */
  var onUpdateParameters: Observable[ImageProcessingConfiguration] = js.native
  /**
    * Gets wether the tone mapping effect is enabled.
    */
  /**
    * Sets wether the tone mapping effect is enabled.
    */
  var toneMappingEnabled: scala.Boolean = js.native
  /**
    * Gets the type of tone mapping effect.
    */
  /**
    * Sets the type of tone mapping effect used in BabylonJS.
    */
  var toneMappingType: scala.Double = js.native
  /**
    * Gets the vignette blend mode allowing different kind of effect.
    */
  /**
    * Sets the vignette blend mode allowing different kind of effect.
    */
  var vignetteBlendMode: scala.Double = js.native
  /**
    * Camera field of view used by the Vignette effect.
    */
  var vignetteCameraFov: scala.Double = js.native
  /**
    * Vignette centre X Offset.
    */
  var vignetteCentreX: scala.Double = js.native
  /**
    * Vignette centre Y Offset.
    */
  var vignetteCentreY: scala.Double = js.native
  /**
    * Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
    * if vignetteEnabled is set to true.
    */
  var vignetteColor: Color4 = js.native
  /**
    * Gets wether the vignette effect is enabled.
    */
  /**
    * Sets wether the vignette effect is enabled.
    */
  var vignetteEnabled: scala.Boolean = js.native
  /**
    * Vignette stretch size.
    */
  var vignetteStretch: scala.Double = js.native
  /**
    * Vignette weight or intensity of the vignette effect.
    */
  var vignetteWeight: scala.Double = js.native
  /**
    * Method called each time the image processing information changes requires to recompile the effect.
    */
  /* protected */ def _updateParameters(): scala.Unit = js.native
  /**
    * Binds the image processing to the shader.
    * @param effect The effect to bind to
    * @param aspectRatio Define the current aspect ratio of the effect
    */
  def bind(effect: Effect): scala.Unit = js.native
  def bind(effect: Effect, aspectRatio: scala.Double): scala.Unit = js.native
  /**
    * Gets the current class name.
    * @return "ImageProcessingConfiguration"
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Returns true if all the image processing information are ready.
    * @returns True if ready, otherwise, false
    */
  def isReady(): scala.Boolean = js.native
  /**
    * Prepare the list of defines associated to the shader.
    * @param defines the list of defines to complete
    * @param forPostProcess Define if we are currently in post process mode or not
    */
  def prepareDefines(defines: IImageProcessingConfigurationDefines): scala.Unit = js.native
  def prepareDefines(defines: IImageProcessingConfigurationDefines, forPostProcess: scala.Boolean): scala.Unit = js.native
  /**
    * Serializes the current image processing instance to a json representation.
    * @return a JSON representation
    */
  def serialize(): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.ImageProcessingConfiguration")
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

