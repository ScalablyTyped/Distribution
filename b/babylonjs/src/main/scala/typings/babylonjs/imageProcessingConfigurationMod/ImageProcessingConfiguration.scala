package typings.babylonjs.imageProcessingConfigurationMod

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.colorCurvesMod.ColorCurves
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration")
@js.native
class ImageProcessingConfiguration () extends js.Object {
  
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
  
  /**
    * Method called each time the image processing information changes requires to recompile the effect.
    */
  /* protected */ def _updateParameters(): Unit = js.native
  
  var _vignetteBlendMode: js.Any = js.native
  
  var _vignetteEnabled: js.Any = js.native
  
  /**
    * Gets wether the image processing is applied through a post process or not.
    */
  def applyByPostProcess: Boolean = js.native
  /**
    * Sets wether the image processing is applied through a post process or not.
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
    * Gets wether the color curves effect is enabled.
    */
  def colorCurvesEnabled: Boolean = js.native
  /**
    * Sets wether the color curves effect is enabled.
    */
  def colorCurvesEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Gets wether the color grading texture contains BGR values.
    */
  def colorGradingBGR: Boolean = js.native
  /**
    * Sets wether the color grading texture contains BGR values.
    */
  def colorGradingBGR_=(value: Boolean): Unit = js.native
  
  /**
    * Gets wether the color grading effect is enabled.
    */
  def colorGradingEnabled: Boolean = js.native
  /**
    * Sets wether the color grading effect is enabled.
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
    * Gets wether the color grading effect is using a green depth for the 3d Texture.
    */
  def colorGradingWithGreenDepth: Boolean = js.native
  /**
    * Sets wether the color grading effect is using a green depth for the 3d Texture.
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
    * Gets the Exposure used in the effect.
    */
  def exposure: Double = js.native
  /**
    * Sets the Exposure used in the effect.
    */
  def exposure_=(value: Double): Unit = js.native
  
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
    * Gets wether the vignette effect is enabled.
    */
  def vignetteEnabled: Boolean = js.native
  /**
    * Sets wether the vignette effect is enabled.
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
/* static members */
@JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration")
@js.native
object ImageProcessingConfiguration extends js.Object {
  
  /**
    * Parses the image processing from a json representation.
    * @param source the JSON source to parse
    * @return The parsed image processing
    */
  def Parse(source: js.Any): ImageProcessingConfiguration = js.native
  
  /**
    * Prepare the list of samplers associated with the Image Processing effects.
    * @param samplersList The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  
  /**
    * Prepare the list of uniforms associated with the Image Processing effects.
    * @param uniforms The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  
  /**
    * ACES Tone mapping (used by default in unreal and unity). This can help getting closer
    * to other engines rendering to increase portability.
    */
  val TONEMAPPING_ACES: Double = js.native
  
  /**
    * Default tone mapping applied in BabylonJS.
    */
  val TONEMAPPING_STANDARD: Double = js.native
  
  /**
    * Used to apply the vignette as a mix with the pixel color.
    */
  def VIGNETTEMODE_MULTIPLY: Double = js.native
  
  /**
    * Used to apply the vignette as a replacement of the pixel color.
    */
  def VIGNETTEMODE_OPAQUE: Double = js.native
  
  var _VIGNETTEMODE_MULTIPLY: js.Any = js.native
  
  var _VIGNETTEMODE_OPAQUE: js.Any = js.native
}
