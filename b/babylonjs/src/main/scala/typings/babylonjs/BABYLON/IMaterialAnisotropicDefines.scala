package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaterialAnisotropicDefines extends js.Object {
  var ANISOTROPIC: Boolean
  var ANISOTROPIC_TEXTURE: Boolean
  var ANISOTROPIC_TEXTUREDIRECTUV: Double
  var MAINUV1: Boolean
  var _areTexturesDirty: Boolean
  var _needUVs: Boolean
}

object IMaterialAnisotropicDefines {
  @scala.inline
  def apply(
    ANISOTROPIC: Boolean,
    ANISOTROPIC_TEXTURE: Boolean,
    ANISOTROPIC_TEXTUREDIRECTUV: Double,
    MAINUV1: Boolean,
    _areTexturesDirty: Boolean,
    _needUVs: Boolean
  ): IMaterialAnisotropicDefines = {
    val __obj = js.Dynamic.literal(ANISOTROPIC = ANISOTROPIC.asInstanceOf[js.Any], ANISOTROPIC_TEXTURE = ANISOTROPIC_TEXTURE.asInstanceOf[js.Any], ANISOTROPIC_TEXTUREDIRECTUV = ANISOTROPIC_TEXTUREDIRECTUV.asInstanceOf[js.Any], MAINUV1 = MAINUV1.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any], _needUVs = _needUVs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMaterialAnisotropicDefines]
  }
}

