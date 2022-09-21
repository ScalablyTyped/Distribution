package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageProcessingConfiguration extends StObject {
  
  /** @hidden */
  var _applyByPostProcess: Boolean = js.native
  
  /* private */ var _colorCurvesEnabled: Any = js.native
  
  /* private */ var _colorGradingBGR: Any = js.native
  
  /* private */ var _colorGradingEnabled: Any = js.native
  
  /* private */ var _colorGradingTexture: Any = js.native
  
  /* private */ var _colorGradingWithGreenDepth: Any = js.native
  
  /* protected */ var _contrast: Double = js.native
  
  /* private */ var _ditheringEnabled: Any = js.native
  
  /* private */ var _ditheringIntensity: Any = js.native
  
  /** @hidden */
  var _exposure: Double = js.native
  
  /* private */ var _isEnabled: Any = js.native
  
  /** @hidden */
  var _skipFinalColorClamp: Boolean = js.native
  
  /* private */ var _toneMappingEnabled: Any = js.native
  
  /* private */ var _toneMappingType: Any = js.native
  
  /**
    * Method called each time the image processing information changes requires to recompile the effect.
    */
  /* protected */ def _updateParameters(): Unit = js.native
  
  /* private */ var _vignetteBlendMode: Any = js.native
  
  /* private */ var _vignetteEnabled: Any = js.native
  
  /**
    * Gets whether the image processing is applied through a post process or not.
    */
  def applyByPostProcess: Boolean = js.native
  /**
    * Sets whether the image processing is applied through a post process or not.
    */
  def applyByPostProcess_=(value: Boolean): Unit = js.native
  
  /**
    * Binds the image processing to the shader.
    * @param effect The effect to bind to
    * @param overrideAspectRatio Override the aspect ratio of the effect
    */
  def bind(effect: Effect): Unit = js.native
  def bind(effect: Effect, overrideAspectRatio: Double): Unit = js.native
  
  /**
    * Color curves setup used in the effect if colorCurvesEnabled is set to true
    */
  var colorCurves: Nullable[ColorCurves] = js.native
  
  /**
    * Gets whether the color curves effect is enabled.
    */
  def colorCurvesEnabled: Boolean = js.native
  /**
    * Sets whether the color curves effect is enabled.
    */
  def colorCurvesEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Gets whether the color grading texture contains BGR values.
    */
  def colorGradingBGR: Boolean = js.native
  /**
    * Sets whether the color grading texture contains BGR values.
    */
  def colorGradingBGR_=(value: Boolean): Unit = js.native
  
  /**
    * Gets whether the color grading effect is enabled.
    */
  def colorGradingEnabled: Boolean = js.native
  /**
    * Sets whether the color grading effect is enabled.
    */
  def colorGradingEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Color grading LUT texture used in the effect if colorGradingEnabled is set to true
    */
  def colorGradingTexture: Nullable[BaseTexture] = js.native
  /**
    * Color grading LUT texture used in the effect if colorGradingEnabled is set to true
    */
  def colorGradingTexture_=(value: Nullable[BaseTexture]): Unit = js.native
  
  /**
    * Gets whether the color grading effect is using a green depth for the 3d Texture.
    */
  def colorGradingWithGreenDepth: Boolean = js.native
  /**
    * Sets whether the color grading effect is using a green depth for the 3d Texture.
    */
  def colorGradingWithGreenDepth_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the contrast used in the effect.
    */
  def contrast: Double = js.native
  /**
    * Sets the contrast used in the effect.
    */
  def contrast_=(value: Double): Unit = js.native
  
  /**
    * Gets whether the dithering effect is enabled.
    * The dithering effect can be used to reduce banding.
    */
  def ditheringEnabled: Boolean = js.native
  /**
    * Sets whether the dithering effect is enabled.
    * The dithering effect can be used to reduce banding.
    */
  def ditheringEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the dithering intensity. 0 is no dithering. Default is 1.0 / 255.0.
    */
  def ditheringIntensity: Double = js.native
  /**
    * Sets the dithering intensity. 0 is no dithering. Default is 1.0 / 255.0.
    */
  def ditheringIntensity_=(value: Double): Unit = js.native
  
  /**
    * Gets the Exposure used in the effect.
    */
  def exposure: Double = js.native
  /**
    * Sets the Exposure used in the effect.
    */
  def exposure_=(value: Double): Unit = js.native
  
  /**
    * Gets the current class name.
    * @returns "ImageProcessingConfiguration"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets whether the image processing is enabled or not.
    */
  def isEnabled: Boolean = js.native
  /**
    * Sets whether the image processing is enabled or not.
    */
  def isEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Returns true if all the image processing information are ready.
    * @returns True if ready, otherwise, false
    */
  def isReady(): Boolean = js.native
  
  /**
    * An event triggered when the configuration changes and requires Shader to Update some parameters.
    */
  var onUpdateParameters: Observable[ImageProcessingConfiguration] = js.native
  
  /**
    * Prepare the list of defines associated to the shader.
    * @param defines the list of defines to complete
    * @param forPostProcess Define if we are currently in post process mode or not
    */
  def prepareDefines(defines: IImageProcessingConfigurationDefines): Unit = js.native
  def prepareDefines(defines: IImageProcessingConfigurationDefines, forPostProcess: Boolean): Unit = js.native
  
  /**
    * Serializes the current image processing instance to a json representation.
    * @returns a JSON representation
    */
  def serialize(): Any = js.native
  
  /**
    * If apply by post process is set to true, setting this to true will skip the the final color clamp step in the fragment shader
    * Applies to PBR materials.
    */
  def skipFinalColorClamp: Boolean = js.native
  /**
    * If apply by post process is set to true, setting this to true will skip the the final color clamp step in the fragment shader
    * Applies to PBR materials.
    */
  def skipFinalColorClamp_=(value: Boolean): Unit = js.native
  
  /**
    * Gets whether the tone mapping effect is enabled.
    */
  def toneMappingEnabled: Boolean = js.native
  /**
    * Sets whether the tone mapping effect is enabled.
    */
  def toneMappingEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the type of tone mapping effect.
    */
  def toneMappingType: Double = js.native
  /**
    * Sets the type of tone mapping effect used in BabylonJS.
    */
  def toneMappingType_=(value: Double): Unit = js.native
  
  /**
    * Gets the vignette blend mode allowing different kind of effect.
    */
  def vignetteBlendMode: Double = js.native
  /**
    * Sets the vignette blend mode allowing different kind of effect.
    */
  def vignetteBlendMode_=(value: Double): Unit = js.native
  
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
    * Gets whether the vignette effect is enabled.
    */
  def vignetteEnabled: Boolean = js.native
  /**
    * Sets whether the vignette effect is enabled.
    */
  def vignetteEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Vignette stretch size.
    */
  var vignetteStretch: Double = js.native
  
  /**
    * Vignette weight or intensity of the vignette effect.
    */
  var vignetteWeight: Double = js.native
}
