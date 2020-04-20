package typings.babylonjs.pbrSubSurfaceConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaterialSubSurfaceDefines extends js.Object {
  var SS_GAMMAREFRACTION: Boolean
  var SS_LINEARSPECULARREFRACTION: Boolean
  var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean
  var SS_LODINREFRACTIONALPHA: Boolean
  var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean
  var SS_REFRACTION: Boolean
  var SS_REFRACTIONMAP_3D: Boolean
  var SS_REFRACTIONMAP_OPPOSITEZ: Boolean
  var SS_RGBDREFRACTION: Boolean
  var SS_SCATERRING: Boolean
  var SS_THICKNESSANDMASK_TEXTURE: Boolean
  var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double
  var SS_TRANSLUCENCY: Boolean
  var SUBSURFACE: Boolean
  /** @hidden */
  var _areTexturesDirty: Boolean
}

object IMaterialSubSurfaceDefines {
  @scala.inline
  def apply(
    SS_GAMMAREFRACTION: Boolean,
    SS_LINEARSPECULARREFRACTION: Boolean,
    SS_LINKREFRACTIONTOTRANSPARENCY: Boolean,
    SS_LODINREFRACTIONALPHA: Boolean,
    SS_MASK_FROM_THICKNESS_TEXTURE: Boolean,
    SS_REFRACTION: Boolean,
    SS_REFRACTIONMAP_3D: Boolean,
    SS_REFRACTIONMAP_OPPOSITEZ: Boolean,
    SS_RGBDREFRACTION: Boolean,
    SS_SCATERRING: Boolean,
    SS_THICKNESSANDMASK_TEXTURE: Boolean,
    SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double,
    SS_TRANSLUCENCY: Boolean,
    SUBSURFACE: Boolean,
    _areTexturesDirty: Boolean
  ): IMaterialSubSurfaceDefines = {
    val __obj = js.Dynamic.literal(SS_GAMMAREFRACTION = SS_GAMMAREFRACTION.asInstanceOf[js.Any], SS_LINEARSPECULARREFRACTION = SS_LINEARSPECULARREFRACTION.asInstanceOf[js.Any], SS_LINKREFRACTIONTOTRANSPARENCY = SS_LINKREFRACTIONTOTRANSPARENCY.asInstanceOf[js.Any], SS_LODINREFRACTIONALPHA = SS_LODINREFRACTIONALPHA.asInstanceOf[js.Any], SS_MASK_FROM_THICKNESS_TEXTURE = SS_MASK_FROM_THICKNESS_TEXTURE.asInstanceOf[js.Any], SS_REFRACTION = SS_REFRACTION.asInstanceOf[js.Any], SS_REFRACTIONMAP_3D = SS_REFRACTIONMAP_3D.asInstanceOf[js.Any], SS_REFRACTIONMAP_OPPOSITEZ = SS_REFRACTIONMAP_OPPOSITEZ.asInstanceOf[js.Any], SS_RGBDREFRACTION = SS_RGBDREFRACTION.asInstanceOf[js.Any], SS_SCATERRING = SS_SCATERRING.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTURE = SS_THICKNESSANDMASK_TEXTURE.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTUREDIRECTUV = SS_THICKNESSANDMASK_TEXTUREDIRECTUV.asInstanceOf[js.Any], SS_TRANSLUCENCY = SS_TRANSLUCENCY.asInstanceOf[js.Any], SUBSURFACE = SUBSURFACE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialSubSurfaceDefines]
  }
}

