package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ImageProcessingPostProcess")
@js.native
class ImageProcessingPostProcess protected () extends PostProcess {
  def this(
    name: String,
    options: Double,
    camera: js.UndefOr[Nullable[Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[ImageProcessingConfiguration]
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: js.UndefOr[Nullable[Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[ImageProcessingConfiguration]
  ) = this()
  /**
    * Defines cache preventing GC.
    */
  var _defines: js.Any = js.native
  var _fromLinearSpace: js.Any = js.native
  /**
    * Default configuration related to image processing available in the PBR Material.
    */
  var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * Keep track of the image processing observer to allow dispose and replace.
    */
  var _imageProcessingObserver: js.Any = js.native
  /**
    * Attaches a new image processing configuration to the PBR Material.
    * @param configuration
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration], doNotBuild: Boolean): Unit = js.native
  /* protected */ def _updateParameters(): Unit = js.native
  /**
    * Gets Color curves setup used in the effect if colorCurvesEnabled is set to true .
    */
  def colorCurves: Nullable[ColorCurves] = js.native
  /**
    * Sets Color curves setup used in the effect if colorCurvesEnabled is set to true .
    */
  def colorCurves(value: Nullable[ColorCurves]): js.Any = js.native
  /**
    * Gets wether the color curves effect is enabled.
    */
  def colorCurvesEnabled: Boolean = js.native
  /**
    * Sets wether the color curves effect is enabled.
    */
  def colorCurvesEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  def colorGradingEnabled: Boolean = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  def colorGradingEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets Color grading LUT texture used in the effect if colorGradingEnabled is set to true.
    */
  def colorGradingTexture: Nullable[BaseTexture] = js.native
  /**
    * Sets Color grading LUT texture used in the effect if colorGradingEnabled is set to true.
    */
  def colorGradingTexture(value: Nullable[BaseTexture]): js.Any = js.native
  /**
    * Gets contrast used in the effect.
    */
  def contrast: Double = js.native
  /**
    * Sets contrast used in the effect.
    */
  def contrast(value: Double): js.Any = js.native
  /**
    * Gets exposure used in the effect.
    */
  def exposure: Double = js.native
  /**
    * Sets exposure used in the effect.
    */
  def exposure(value: Double): js.Any = js.native
  /**
    * Gets wether the input of the processing is in Gamma or Linear Space.
    */
  def fromLinearSpace: Boolean = js.native
  /**
    * Sets wether the input of the processing is in Gamma or Linear Space.
    */
  def fromLinearSpace(value: Boolean): js.Any = js.native
  /**
    * Gets the image processing configuration used either in this material.
    */
  def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * Sets the Default image processing configuration used either in the this material.
    *
    * If sets to null, the scene one is in use.
    */
  def imageProcessingConfiguration(value: ImageProcessingConfiguration): js.Any = js.native
  /**
    * Gets wether tonemapping is enabled or not.
    */
  def toneMappingEnabled: Boolean = js.native
  /**
    * Sets wether tonemapping is enabled or not
    */
  def toneMappingEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets the type of tone mapping effect.
    */
  def toneMappingType: Double = js.native
  /**
    * Sets the type of tone mapping effect.
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
    * Gets Camera field of view used by the Vignette effect.
    */
  def vignetteCameraFov: Double = js.native
  /**
    * Sets Camera field of view used by the Vignette effect.
    */
  def vignetteCameraFov(value: Double): js.Any = js.native
  /**
    * Gets Vignette centre X Offset.
    */
  def vignetteCentreX: Double = js.native
  /**
    * Sets Vignette centre X Offset.
    */
  def vignetteCentreX(value: Double): js.Any = js.native
  /**
    * Gets Vignette centre Y Offset.
    */
  def vignetteCentreY: Double = js.native
  /**
    * Sets Vignette centre Y Offset.
    */
  def vignetteCentreY(value: Double): js.Any = js.native
  /**
    * Gets Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
    * if vignetteEnabled is set to true.
    */
  def vignetteColor: Color4 = js.native
  /**
    * Sets Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
    * if vignetteEnabled is set to true.
    */
  def vignetteColor(value: Color4): js.Any = js.native
  /**
    * Gets wether the vignette effect is enabled.
    */
  def vignetteEnabled: Boolean = js.native
  /**
    * Sets wether the vignette effect is enabled.
    */
  def vignetteEnabled(value: Boolean): js.Any = js.native
  /**
    * Gets Vignette stretch size.
    */
  def vignetteStretch: Double = js.native
  /**
    * Sets Vignette stretch size.
    */
  def vignetteStretch(value: Double): js.Any = js.native
  /**
    * Gets Vignette weight or intensity of the vignette effect.
    */
  def vignetteWeight: Double = js.native
  /**
    * Sets Vignette weight or intensity of the vignette effect.
    */
  def vignetteWeight(value: Double): js.Any = js.native
}

