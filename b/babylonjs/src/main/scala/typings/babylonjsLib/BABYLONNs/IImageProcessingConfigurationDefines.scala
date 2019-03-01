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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COLORCURVES")(COLORCURVES)
    __obj.updateDynamic("COLORGRADING")(COLORGRADING)
    __obj.updateDynamic("COLORGRADING3D")(COLORGRADING3D)
    __obj.updateDynamic("CONTRAST")(CONTRAST)
    __obj.updateDynamic("EXPOSURE")(EXPOSURE)
    __obj.updateDynamic("IMAGEPROCESSING")(IMAGEPROCESSING)
    __obj.updateDynamic("IMAGEPROCESSINGPOSTPROCESS")(IMAGEPROCESSINGPOSTPROCESS)
    __obj.updateDynamic("SAMPLER3DBGRMAP")(SAMPLER3DBGRMAP)
    __obj.updateDynamic("SAMPLER3DGREENDEPTH")(SAMPLER3DGREENDEPTH)
    __obj.updateDynamic("TONEMAPPING")(TONEMAPPING)
    __obj.updateDynamic("TONEMAPPING_ACES")(TONEMAPPING_ACES)
    __obj.updateDynamic("VIGNETTE")(VIGNETTE)
    __obj.updateDynamic("VIGNETTEBLENDMODEMULTIPLY")(VIGNETTEBLENDMODEMULTIPLY)
    __obj.updateDynamic("VIGNETTEBLENDMODEOPAQUE")(VIGNETTEBLENDMODEOPAQUE)
    __obj.asInstanceOf[IImageProcessingConfigurationDefines]
  }
}

