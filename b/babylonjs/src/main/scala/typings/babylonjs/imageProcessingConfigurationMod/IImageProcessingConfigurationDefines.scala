package typings.babylonjs.imageProcessingConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IImageProcessingConfigurationDefines extends js.Object {
  
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
  implicit class IImageProcessingConfigurationDefinesOps[Self <: IImageProcessingConfigurationDefines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCOLORCURVES(value: Boolean): Self = this.set("COLORCURVES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOLORGRADING(value: Boolean): Self = this.set("COLORGRADING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOLORGRADING3D(value: Boolean): Self = this.set("COLORGRADING3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONTRAST(value: Boolean): Self = this.set("CONTRAST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXPOSURE(value: Boolean): Self = this.set("EXPOSURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMAGEPROCESSING(value: Boolean): Self = this.set("IMAGEPROCESSING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIMAGEPROCESSINGPOSTPROCESS(value: Boolean): Self = this.set("IMAGEPROCESSINGPOSTPROCESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAMPLER3DBGRMAP(value: Boolean): Self = this.set("SAMPLER3DBGRMAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAMPLER3DGREENDEPTH(value: Boolean): Self = this.set("SAMPLER3DGREENDEPTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTONEMAPPING(value: Boolean): Self = this.set("TONEMAPPING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTONEMAPPING_ACES(value: Boolean): Self = this.set("TONEMAPPING_ACES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIGNETTE(value: Boolean): Self = this.set("VIGNETTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIGNETTEBLENDMODEMULTIPLY(value: Boolean): Self = this.set("VIGNETTEBLENDMODEMULTIPLY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIGNETTEBLENDMODEOPAQUE(value: Boolean): Self = this.set("VIGNETTEBLENDMODEOPAQUE", value.asInstanceOf[js.Any])
  }
}
