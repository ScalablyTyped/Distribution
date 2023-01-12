package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IImageProcessingConfigurationDefines] (val x: Self) extends AnyVal {
    
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
