package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to follow in your material defines to integrate easily the
  * Image proccessing functions.
  * @hidden
  */
trait IImageProcessingConfigurationDefines extends js.Object {
  var COLORCURVES: scala.Boolean
  var COLORGRADING: scala.Boolean
  var COLORGRADING3D: scala.Boolean
  var CONTRAST: scala.Boolean
  var EXPOSURE: scala.Boolean
  var IMAGEPROCESSING: scala.Boolean
  var IMAGEPROCESSINGPOSTPROCESS: scala.Boolean
  var SAMPLER3DBGRMAP: scala.Boolean
  var SAMPLER3DGREENDEPTH: scala.Boolean
  var TONEMAPPING: scala.Boolean
  var TONEMAPPING_ACES: scala.Boolean
  var VIGNETTE: scala.Boolean
  var VIGNETTEBLENDMODEMULTIPLY: scala.Boolean
  var VIGNETTEBLENDMODEOPAQUE: scala.Boolean
}

object IImageProcessingConfigurationDefines {
  @scala.inline
  def apply(
    COLORCURVES: scala.Boolean,
    COLORGRADING: scala.Boolean,
    COLORGRADING3D: scala.Boolean,
    CONTRAST: scala.Boolean,
    EXPOSURE: scala.Boolean,
    IMAGEPROCESSING: scala.Boolean,
    IMAGEPROCESSINGPOSTPROCESS: scala.Boolean,
    SAMPLER3DBGRMAP: scala.Boolean,
    SAMPLER3DGREENDEPTH: scala.Boolean,
    TONEMAPPING: scala.Boolean,
    TONEMAPPING_ACES: scala.Boolean,
    VIGNETTE: scala.Boolean,
    VIGNETTEBLENDMODEMULTIPLY: scala.Boolean,
    VIGNETTEBLENDMODEOPAQUE: scala.Boolean
  ): IImageProcessingConfigurationDefines = {
    val __obj = js.Dynamic.literal(COLORCURVES = COLORCURVES, COLORGRADING = COLORGRADING, COLORGRADING3D = COLORGRADING3D, CONTRAST = CONTRAST, EXPOSURE = EXPOSURE, IMAGEPROCESSING = IMAGEPROCESSING, IMAGEPROCESSINGPOSTPROCESS = IMAGEPROCESSINGPOSTPROCESS, SAMPLER3DBGRMAP = SAMPLER3DBGRMAP, SAMPLER3DGREENDEPTH = SAMPLER3DGREENDEPTH, TONEMAPPING = TONEMAPPING, TONEMAPPING_ACES = TONEMAPPING_ACES, VIGNETTE = VIGNETTE, VIGNETTEBLENDMODEMULTIPLY = VIGNETTEBLENDMODEMULTIPLY, VIGNETTEBLENDMODEOPAQUE = VIGNETTEBLENDMODEOPAQUE)
  
    __obj.asInstanceOf[IImageProcessingConfigurationDefines]
  }
}

