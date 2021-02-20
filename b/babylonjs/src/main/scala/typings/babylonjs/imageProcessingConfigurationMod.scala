package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.colorCurvesMod.ColorCurves
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageProcessingConfigurationMod {
  
  @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration")
  @js.native
  class ImageProcessingConfiguration () extends StObject {
    
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
  object ImageProcessingConfiguration {
    
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the image processing from a json representation.
      * @param source the JSON source to parse
      * @return The parsed image processing
      */
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration.Parse")
    @js.native
    def Parse(source: js.Any): ImageProcessingConfiguration = js.native
    
    /**
      * Prepare the list of samplers associated with the Image Processing effects.
      * @param samplersList The list of uniforms used in the effect
      * @param defines the list of defines currently in use
      */
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration.PrepareSamplers")
    @js.native
    def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
    
    /**
      * Prepare the list of uniforms associated with the Image Processing effects.
      * @param uniforms The list of uniforms used in the effect
      * @param defines the list of defines currently in use
      */
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration.PrepareUniforms")
    @js.native
    def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
    
    /**
      * ACES Tone mapping (used by default in unreal and unity). This can help getting closer
      * to other engines rendering to increase portability.
      */
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration.TONEMAPPING_ACES")
    @js.native
    val TONEMAPPING_ACES: Double = js.native
    
    /**
      * Default tone mapping applied in BabylonJS.
      */
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration.TONEMAPPING_STANDARD")
    @js.native
    val TONEMAPPING_STANDARD: Double = js.native
    
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration._VIGNETTEMODE_MULTIPLY")
    @js.native
    def _VIGNETTEMODE_MULTIPLY: js.Any = js.native
    @scala.inline
    def _VIGNETTEMODE_MULTIPLY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_MULTIPLY")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration._VIGNETTEMODE_OPAQUE")
    @js.native
    def _VIGNETTEMODE_OPAQUE: js.Any = js.native
    @scala.inline
    def _VIGNETTEMODE_OPAQUE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_OPAQUE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfigurationDefines")
  @js.native
  class ImageProcessingConfigurationDefines ()
    extends MaterialDefines
       with IImageProcessingConfigurationDefines
  
  @js.native
  trait IImageProcessingConfigurationDefines extends StObject {
    
    var COLORCURVES: Boolean = js.native
    
    var COLORGRADING: Boolean = js.native
    
    var COLORGRADING3D: Boolean = js.native
    
    var CONTRAST: Boolean = js.native
    
    var EXPOSURE: Boolean = js.native
    
    var IMAGEPROCESSING: Boolean = js.native
    
    var IMAGEPROCESSINGPOSTPROCESS: Boolean = js.native
    
    var SAMPLER3DBGRMAP: Boolean = js.native
    
    var SAMPLER3DGREENDEPTH: Boolean = js.native
    
    var TONEMAPPING: Boolean = js.native
    
    var TONEMAPPING_ACES: Boolean = js.native
    
    var VIGNETTE: Boolean = js.native
    
    var VIGNETTEBLENDMODEMULTIPLY: Boolean = js.native
    
    var VIGNETTEBLENDMODEOPAQUE: Boolean = js.native
  }
  object IImageProcessingConfigurationDefines {
    
    @scala.inline
    def apply(
      COLORCURVES: Boolean,
      COLORGRADING: Boolean,
      COLORGRADING3D: Boolean,
      CONTRAST: Boolean,
      EXPOSURE: Boolean,
      IMAGEPROCESSING: Boolean,
      IMAGEPROCESSINGPOSTPROCESS: Boolean,
      SAMPLER3DBGRMAP: Boolean,
      SAMPLER3DGREENDEPTH: Boolean,
      TONEMAPPING: Boolean,
      TONEMAPPING_ACES: Boolean,
      VIGNETTE: Boolean,
      VIGNETTEBLENDMODEMULTIPLY: Boolean,
      VIGNETTEBLENDMODEOPAQUE: Boolean
    ): IImageProcessingConfigurationDefines = {
      val __obj = js.Dynamic.literal(COLORCURVES = COLORCURVES.asInstanceOf[js.Any], COLORGRADING = COLORGRADING.asInstanceOf[js.Any], COLORGRADING3D = COLORGRADING3D.asInstanceOf[js.Any], CONTRAST = CONTRAST.asInstanceOf[js.Any], EXPOSURE = EXPOSURE.asInstanceOf[js.Any], IMAGEPROCESSING = IMAGEPROCESSING.asInstanceOf[js.Any], IMAGEPROCESSINGPOSTPROCESS = IMAGEPROCESSINGPOSTPROCESS.asInstanceOf[js.Any], SAMPLER3DBGRMAP = SAMPLER3DBGRMAP.asInstanceOf[js.Any], SAMPLER3DGREENDEPTH = SAMPLER3DGREENDEPTH.asInstanceOf[js.Any], TONEMAPPING = TONEMAPPING.asInstanceOf[js.Any], TONEMAPPING_ACES = TONEMAPPING_ACES.asInstanceOf[js.Any], VIGNETTE = VIGNETTE.asInstanceOf[js.Any], VIGNETTEBLENDMODEMULTIPLY = VIGNETTEBLENDMODEMULTIPLY.asInstanceOf[js.Any], VIGNETTEBLENDMODEOPAQUE = VIGNETTEBLENDMODEOPAQUE.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageProcessingConfigurationDefines]
    }
    
    @scala.inline
    implicit class IImageProcessingConfigurationDefinesMutableBuilder[Self <: IImageProcessingConfigurationDefines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCOLORCURVES(value: Boolean): Self = StObject.set(x, "COLORCURVES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOLORGRADING(value: Boolean): Self = StObject.set(x, "COLORGRADING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOLORGRADING3D(value: Boolean): Self = StObject.set(x, "COLORGRADING3D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONTRAST(value: Boolean): Self = StObject.set(x, "CONTRAST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXPOSURE(value: Boolean): Self = StObject.set(x, "EXPOSURE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIMAGEPROCESSING(value: Boolean): Self = StObject.set(x, "IMAGEPROCESSING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIMAGEPROCESSINGPOSTPROCESS(value: Boolean): Self = StObject.set(x, "IMAGEPROCESSINGPOSTPROCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSAMPLER3DBGRMAP(value: Boolean): Self = StObject.set(x, "SAMPLER3DBGRMAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSAMPLER3DGREENDEPTH(value: Boolean): Self = StObject.set(x, "SAMPLER3DGREENDEPTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTONEMAPPING(value: Boolean): Self = StObject.set(x, "TONEMAPPING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTONEMAPPING_ACES(value: Boolean): Self = StObject.set(x, "TONEMAPPING_ACES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIGNETTE(value: Boolean): Self = StObject.set(x, "VIGNETTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIGNETTEBLENDMODEMULTIPLY(value: Boolean): Self = StObject.set(x, "VIGNETTEBLENDMODEMULTIPLY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIGNETTEBLENDMODEOPAQUE(value: Boolean): Self = StObject.set(x, "VIGNETTEBLENDMODEOPAQUE", value.asInstanceOf[js.Any])
    }
  }
}
