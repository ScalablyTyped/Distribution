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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageProcessingConfigurationMod {
  
  @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration")
  @js.native
  open class ImageProcessingConfiguration () extends StObject {
    
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
  /* static members */
  object ImageProcessingConfiguration {
    
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses the image processing from a json representation.
      * @param source the JSON source to parse
      * @returns The parsed image processing
      */
    inline def Parse(source: Any): ImageProcessingConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any]).asInstanceOf[ImageProcessingConfiguration]
    
    /**
      * Prepare the list of samplers associated with the Image Processing effects.
      * @param samplersList The list of uniforms used in the effect
      * @param defines the list of defines currently in use
      */
    inline def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareSamplers")(samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Prepare the list of uniforms associated with the Image Processing effects.
      * @param uniforms The list of uniforms used in the effect
      * @param defines the list of defines currently in use
      */
    inline def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniforms")(uniforms.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    def _VIGNETTEMODE_MULTIPLY: Any = js.native
    inline def _VIGNETTEMODE_MULTIPLY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_MULTIPLY")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfiguration._VIGNETTEMODE_OPAQUE")
    @js.native
    def _VIGNETTEMODE_OPAQUE: Any = js.native
    inline def _VIGNETTEMODE_OPAQUE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_OPAQUE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Materials/imageProcessingConfiguration", "ImageProcessingConfigurationDefines")
  @js.native
  open class ImageProcessingConfigurationDefines ()
    extends MaterialDefines
       with IImageProcessingConfigurationDefines {
    
    /* CompleteClass */
    var COLORCURVES: Boolean = js.native
    
    /* CompleteClass */
    var COLORGRADING: Boolean = js.native
    
    /* CompleteClass */
    var COLORGRADING3D: Boolean = js.native
    
    /* CompleteClass */
    var CONTRAST: Boolean = js.native
    
    /* CompleteClass */
    var DITHER: Boolean = js.native
    
    /* CompleteClass */
    var EXPOSURE: Boolean = js.native
    
    /* CompleteClass */
    var IMAGEPROCESSING: Boolean = js.native
    
    /* CompleteClass */
    var IMAGEPROCESSINGPOSTPROCESS: Boolean = js.native
    
    /* CompleteClass */
    var SAMPLER3DBGRMAP: Boolean = js.native
    
    /* CompleteClass */
    var SAMPLER3DGREENDEPTH: Boolean = js.native
    
    /* CompleteClass */
    var SKIPFINALCOLORCLAMP: Boolean = js.native
    
    /* CompleteClass */
    var TONEMAPPING: Boolean = js.native
    
    /* CompleteClass */
    var TONEMAPPING_ACES: Boolean = js.native
    
    /* CompleteClass */
    var VIGNETTE: Boolean = js.native
    
    /* CompleteClass */
    var VIGNETTEBLENDMODEMULTIPLY: Boolean = js.native
    
    /* CompleteClass */
    var VIGNETTEBLENDMODEOPAQUE: Boolean = js.native
  }
  
  trait IImageProcessingConfigurationDefines extends StObject {
    
    var COLORCURVES: Boolean
    
    var COLORGRADING: Boolean
    
    var COLORGRADING3D: Boolean
    
    var CONTRAST: Boolean
    
    var DITHER: Boolean
    
    var EXPOSURE: Boolean
    
    var IMAGEPROCESSING: Boolean
    
    var IMAGEPROCESSINGPOSTPROCESS: Boolean
    
    var SAMPLER3DBGRMAP: Boolean
    
    var SAMPLER3DGREENDEPTH: Boolean
    
    var SKIPFINALCOLORCLAMP: Boolean
    
    var TONEMAPPING: Boolean
    
    var TONEMAPPING_ACES: Boolean
    
    var VIGNETTE: Boolean
    
    var VIGNETTEBLENDMODEMULTIPLY: Boolean
    
    var VIGNETTEBLENDMODEOPAQUE: Boolean
  }
  object IImageProcessingConfigurationDefines {
    
    inline def apply(
      COLORCURVES: Boolean,
      COLORGRADING: Boolean,
      COLORGRADING3D: Boolean,
      CONTRAST: Boolean,
      DITHER: Boolean,
      EXPOSURE: Boolean,
      IMAGEPROCESSING: Boolean,
      IMAGEPROCESSINGPOSTPROCESS: Boolean,
      SAMPLER3DBGRMAP: Boolean,
      SAMPLER3DGREENDEPTH: Boolean,
      SKIPFINALCOLORCLAMP: Boolean,
      TONEMAPPING: Boolean,
      TONEMAPPING_ACES: Boolean,
      VIGNETTE: Boolean,
      VIGNETTEBLENDMODEMULTIPLY: Boolean,
      VIGNETTEBLENDMODEOPAQUE: Boolean
    ): IImageProcessingConfigurationDefines = {
      val __obj = js.Dynamic.literal(COLORCURVES = COLORCURVES.asInstanceOf[js.Any], COLORGRADING = COLORGRADING.asInstanceOf[js.Any], COLORGRADING3D = COLORGRADING3D.asInstanceOf[js.Any], CONTRAST = CONTRAST.asInstanceOf[js.Any], DITHER = DITHER.asInstanceOf[js.Any], EXPOSURE = EXPOSURE.asInstanceOf[js.Any], IMAGEPROCESSING = IMAGEPROCESSING.asInstanceOf[js.Any], IMAGEPROCESSINGPOSTPROCESS = IMAGEPROCESSINGPOSTPROCESS.asInstanceOf[js.Any], SAMPLER3DBGRMAP = SAMPLER3DBGRMAP.asInstanceOf[js.Any], SAMPLER3DGREENDEPTH = SAMPLER3DGREENDEPTH.asInstanceOf[js.Any], SKIPFINALCOLORCLAMP = SKIPFINALCOLORCLAMP.asInstanceOf[js.Any], TONEMAPPING = TONEMAPPING.asInstanceOf[js.Any], TONEMAPPING_ACES = TONEMAPPING_ACES.asInstanceOf[js.Any], VIGNETTE = VIGNETTE.asInstanceOf[js.Any], VIGNETTEBLENDMODEMULTIPLY = VIGNETTEBLENDMODEMULTIPLY.asInstanceOf[js.Any], VIGNETTEBLENDMODEOPAQUE = VIGNETTEBLENDMODEOPAQUE.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageProcessingConfigurationDefines]
    }
    
    extension [Self <: IImageProcessingConfigurationDefines](x: Self) {
      
      inline def setCOLORCURVES(value: Boolean): Self = StObject.set(x, "COLORCURVES", value.asInstanceOf[js.Any])
      
      inline def setCOLORGRADING(value: Boolean): Self = StObject.set(x, "COLORGRADING", value.asInstanceOf[js.Any])
      
      inline def setCOLORGRADING3D(value: Boolean): Self = StObject.set(x, "COLORGRADING3D", value.asInstanceOf[js.Any])
      
      inline def setCONTRAST(value: Boolean): Self = StObject.set(x, "CONTRAST", value.asInstanceOf[js.Any])
      
      inline def setDITHER(value: Boolean): Self = StObject.set(x, "DITHER", value.asInstanceOf[js.Any])
      
      inline def setEXPOSURE(value: Boolean): Self = StObject.set(x, "EXPOSURE", value.asInstanceOf[js.Any])
      
      inline def setIMAGEPROCESSING(value: Boolean): Self = StObject.set(x, "IMAGEPROCESSING", value.asInstanceOf[js.Any])
      
      inline def setIMAGEPROCESSINGPOSTPROCESS(value: Boolean): Self = StObject.set(x, "IMAGEPROCESSINGPOSTPROCESS", value.asInstanceOf[js.Any])
      
      inline def setSAMPLER3DBGRMAP(value: Boolean): Self = StObject.set(x, "SAMPLER3DBGRMAP", value.asInstanceOf[js.Any])
      
      inline def setSAMPLER3DGREENDEPTH(value: Boolean): Self = StObject.set(x, "SAMPLER3DGREENDEPTH", value.asInstanceOf[js.Any])
      
      inline def setSKIPFINALCOLORCLAMP(value: Boolean): Self = StObject.set(x, "SKIPFINALCOLORCLAMP", value.asInstanceOf[js.Any])
      
      inline def setTONEMAPPING(value: Boolean): Self = StObject.set(x, "TONEMAPPING", value.asInstanceOf[js.Any])
      
      inline def setTONEMAPPING_ACES(value: Boolean): Self = StObject.set(x, "TONEMAPPING_ACES", value.asInstanceOf[js.Any])
      
      inline def setVIGNETTE(value: Boolean): Self = StObject.set(x, "VIGNETTE", value.asInstanceOf[js.Any])
      
      inline def setVIGNETTEBLENDMODEMULTIPLY(value: Boolean): Self = StObject.set(x, "VIGNETTEBLENDMODEMULTIPLY", value.asInstanceOf[js.Any])
      
      inline def setVIGNETTEBLENDMODEOPAQUE(value: Boolean): Self = StObject.set(x, "VIGNETTEBLENDMODEOPAQUE", value.asInstanceOf[js.Any])
    }
  }
}
