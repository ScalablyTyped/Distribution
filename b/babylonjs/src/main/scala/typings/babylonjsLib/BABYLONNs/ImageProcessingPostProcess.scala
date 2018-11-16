package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * ImageProcessingPostProcess
     * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#imageprocessing
     */
@JSGlobal("BABYLON.ImageProcessingPostProcess")
@js.native
class ImageProcessingPostProcess protected () extends PostProcess {
  def this(name: java.lang.String, options: PostProcessOptions, camera: js.UndefOr[Nullable[Camera]], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], imageProcessingConfiguration: js.UndefOr[ImageProcessingConfiguration]) = this()
  def this(name: java.lang.String, options: scala.Double, camera: js.UndefOr[Nullable[Camera]], samplingMode: js.UndefOr[scala.Double], engine: js.UndefOr[Engine], reusable: js.UndefOr[scala.Boolean], textureType: js.UndefOr[scala.Double], imageProcessingConfiguration: js.UndefOr[ImageProcessingConfiguration]) = this()
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
           * Gets Color curves setup used in the effect if colorCurvesEnabled is set to true .
           */
  /**
          * Sets Color curves setup used in the effect if colorCurvesEnabled is set to true .
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
           * Gets wether the color grading effect is enabled.
           */
  /**
          * Gets wether the color grading effect is enabled.
          */
  var colorGradingEnabled: scala.Boolean = js.native
  /**
           * Gets Color grading LUT texture used in the effect if colorGradingEnabled is set to true.
           */
  /**
          * Sets Color grading LUT texture used in the effect if colorGradingEnabled is set to true.
          */
  var colorGradingTexture: Nullable[BaseTexture] = js.native
  /**
           * Gets contrast used in the effect.
           */
  /**
          * Sets contrast used in the effect.
          */
  var contrast: scala.Double = js.native
  /**
           * Gets exposure used in the effect.
           */
  /**
          * Sets exposure used in the effect.
          */
  var exposure: scala.Double = js.native
  /**
           * Gets wether the input of the processing is in Gamma or Linear Space.
           */
  /**
          * Sets wether the input of the processing is in Gamma or Linear Space.
          */
  var fromLinearSpace: scala.Boolean = js.native
  /**
           * Gets the image processing configuration used either in this material.
           */
  /**
          * Sets the Default image processing configuration used either in the this material.
          *
          * If sets to null, the scene one is in use.
          */
  var imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
           * Gets wether tonemapping is enabled or not.
           */
  /**
          * Sets wether tonemapping is enabled or not
          */
  var toneMappingEnabled: scala.Boolean = js.native
  /**
           * Gets the vignette blend mode allowing different kind of effect.
           */
  /**
          * Sets the vignette blend mode allowing different kind of effect.
          */
  var vignetteBlendMode: scala.Double = js.native
  /**
           * Gets Camera field of view used by the Vignette effect.
           */
  /**
          * Sets Camera field of view used by the Vignette effect.
          */
  var vignetteCameraFov: scala.Double = js.native
  /**
           * Gets Vignette centre X Offset.
           */
  /**
          * Sets Vignette centre X Offset.
          */
  var vignetteCentreX: scala.Double = js.native
  /**
           * Gets Vignette centre Y Offset.
           */
  /**
          * Sets Vignette centre Y Offset.
          */
  var vignetteCentreY: scala.Double = js.native
  /**
           * Gets Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
           * if vignetteEnabled is set to true.
           */
  /**
          * Sets Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
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
           * Gets Vignette stretch size.
           */
  /**
          * Sets Vignette stretch size.
          */
  var vignetteStretch: scala.Double = js.native
  /**
           * Gets Vignette weight or intensity of the vignette effect.
           */
  /**
          * Sets Vignette weight or intensity of the vignette effect.
          */
  var vignetteWeight: scala.Double = js.native
  /**
           * Attaches a new image processing configuration to the PBR Material.
           * @param configuration
           */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): scala.Unit = js.native
  /**
           * Attaches a new image processing configuration to the PBR Material.
           * @param configuration
           */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration], doNotBuild: scala.Boolean): scala.Unit = js.native
  /* protected */ def _updateParameters(): scala.Unit = js.native
  /**
           *  "ImageProcessingPostProcess"
           * @returns "ImageProcessingPostProcess"
           */
  def getClassName(): java.lang.String = js.native
}

