package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProcessingConfiguration extends js.Object {
  var _applyByPostProcess: js.Any = js.native
  var _colorCurvesEnabled: js.Any = js.native
  var _colorGradingBGR: js.Any = js.native
  var _colorGradingEnabled: js.Any = js.native
  var _colorGradingTexture: js.Any = js.native
  var _colorGradingWithGreenDepth: js.Any = js.native
  var _contrast: Double = js.native
  /** @hidden */
  var _exposure: Double = js.native
  var _isEnabled: js.Any = js.native
  var _toneMappingEnabled: js.Any = js.native
  var _toneMappingType: js.Any = js.native
  var _vignetteBlendMode: js.Any = js.native
  var _vignetteEnabled: js.Any = js.native
  /**
    * Color curves setup used in the effect if colorCurvesEnabled is set to true
    */
  var colorCurves: Nullable[ColorCurves] = js.native
  /**
    * An event triggered when the configuration changes and requires Shader to Update some parameters.
    */
  var onUpdateParameters: Observable[ImageProcessingConfiguration] = js.native
  /**
    * Camera field of view used by the Vignette effect.
    */
  var vignetteCameraFov: Double = js.native
  /**
    * Vignette centre X Offset.
    */
  var vignetteCentreX: Double = js.native
  /**
    * Vignette centre Y Offset.
    */
  var vignetteCentreY: Double = js.native
  /**
    * Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
    * if vignetteEnabled is set to true.
    */
  var vignetteColor: Color4 = js.native
  /**
    * Vignette stretch size.
    */
  var vignetteStretch: Double = js.native
  /**
    * Vignette weight or intensity of the vignette effect.
    */
  var vignetteWeight: Double = js.native
  /**
    * Method called each time the image processing information changes requires to recompile the effect.
    */
  /* protected */ def _updateParameters(): Unit = js.native
  /**
    * Gets wether the image processing is applied through a post process or not.
    */
  def applyByPostProcess: Boolean = js.native
  /**
    * Sets wether the image processing is applied through a post process or not.
    */
  def applyByPostProcess(value: Boolean): js.Any = js.native
  /**
    * Binds the image processing to the shader.
    * @param effect The effect to bind to
    * @param overrideAspectRatio Override the aspect ratio of the effect
    */
  def bind(effect: Effect): Unit = js.native
  def bind(effect: Effect, overrideAspectRatio: Double): Unit = js.native
  /**
    * Gets wether the color curves effect is enabled.
    */
  def colorCurvesEnabled: Boolean = js.native
  /**
    * Sets wether the color curves effect is enabled.
    */
  def colorCurvesEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets wether the color grading texture contains BGR values.
    */
  def colorGradingBGR: Boolean = js.native
  /**
    * Sets wether the color grading texture contains BGR values.
    */
  def colorGradingBGR(value: Boolean): js.Any = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  def colorGradingEnabled: Boolean = js.native
  /**
    * Sets wether the color grading effect is enabled.
    */
  def colorGradingEnabled(value: Boolean): js.Any = js.native
  /**
    * Color grading LUT texture used in the effect if colorGradingEnabled is set to true
    */
  def colorGradingTexture: Nullable[BaseTexture] = js.native
  /**
    * Color grading LUT texture used in the effect if colorGradingEnabled is set to true
    */
  def colorGradingTexture(value: Nullable[BaseTexture]): js.Any = js.native
  /**
    * Gets wether the color grading effect is using a green depth for the 3d Texture.
    */
  def colorGradingWithGreenDepth: Boolean = js.native
  /**
    * Sets wether the color grading effect is using a green depth for the 3d Texture.
    */
  def colorGradingWithGreenDepth(value: Boolean): js.Any = js.native
  /**
    * Gets the contrast used in the effect.
    */
  def contrast: Double = js.native
  /**
    * Sets the contrast used in the effect.
    */
  def contrast(value: Double): js.Any = js.native
  /**
    * Gets the Exposure used in the effect.
    */
  def exposure: Double = js.native
  /**
    * Sets the Exposure used in the effect.
    */
  def exposure(value: Double): js.Any = js.native
  /**
    * Gets the current class name.
    * @return "ImageProcessingConfiguration"
    */
  def getClassName(): String = js.native
  /**
    * Gets wether the image processing is enabled or not.
    */
  def isEnabled: Boolean = js.native
  /**
    * Sets wether the image processing is enabled or not.
    */
  def isEnabled(value: Boolean): js.Any = js.native
  /**
    * Returns true if all the image processing information are ready.
    * @returns True if ready, otherwise, false
    */
  def isReady(): Boolean = js.native
  /**
    * Prepare the list of defines associated to the shader.
    * @param defines the list of defines to complete
    * @param forPostProcess Define if we are currently in post process mode or not
    */
  def prepareDefines(defines: IImageProcessingConfigurationDefines): Unit = js.native
  def prepareDefines(defines: IImageProcessingConfigurationDefines, forPostProcess: Boolean): Unit = js.native
  /**
    * Serializes the current image processing instance to a json representation.
    * @return a JSON representation
    */
  def serialize(): js.Any = js.native
  /**
    * Gets wether the tone mapping effect is enabled.
    */
  def toneMappingEnabled: Boolean = js.native
  /**
    * Sets wether the tone mapping effect is enabled.
    */
  def toneMappingEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets the type of tone mapping effect.
    */
  def toneMappingType: Double = js.native
  /**
    * Sets the type of tone mapping effect used in BabylonJS.
    */
  def toneMappingType(value: Double): js.Any = js.native
  /**
    * Gets the vignette blend mode allowing different kind of effect.
    */
  def vignetteBlendMode: Double = js.native
  /**
    * Sets the vignette blend mode allowing different kind of effect.
    */
  def vignetteBlendMode(value: Double): js.Any = js.native
  /**
    * Gets wether the vignette effect is enabled.
    */
  def vignetteEnabled: Boolean = js.native
  /**
    * Sets wether the vignette effect is enabled.
    */
  def vignetteEnabled(value: Boolean): js.Any = js.native
}

