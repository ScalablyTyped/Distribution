package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaterialClearCoatDefines extends js.Object {
  var CLEARCOAT: Boolean
  var CLEARCOAT_BUMP: Boolean
  var CLEARCOAT_BUMPDIRECTUV: Double
  var CLEARCOAT_DEFAULTIOR: Boolean
  var CLEARCOAT_TEXTURE: Boolean
  var CLEARCOAT_TEXTUREDIRECTUV: Double
  var CLEARCOAT_TINT: Boolean
  var CLEARCOAT_TINT_TEXTURE: Boolean
  var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double
  /** @hidden */
  var _areTexturesDirty: Boolean
}

object IMaterialClearCoatDefines {
  @scala.inline
  def apply(
    CLEARCOAT: Boolean,
    CLEARCOAT_BUMP: Boolean,
    CLEARCOAT_BUMPDIRECTUV: Double,
    CLEARCOAT_DEFAULTIOR: Boolean,
    CLEARCOAT_TEXTURE: Boolean,
    CLEARCOAT_TEXTUREDIRECTUV: Double,
    CLEARCOAT_TINT: Boolean,
    CLEARCOAT_TINT_TEXTURE: Boolean,
    CLEARCOAT_TINT_TEXTUREDIRECTUV: Double,
    _areTexturesDirty: Boolean
  ): IMaterialClearCoatDefines = {
    val __obj = js.Dynamic.literal(CLEARCOAT = CLEARCOAT.asInstanceOf[js.Any], CLEARCOAT_BUMP = CLEARCOAT_BUMP.asInstanceOf[js.Any], CLEARCOAT_BUMPDIRECTUV = CLEARCOAT_BUMPDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_DEFAULTIOR = CLEARCOAT_DEFAULTIOR.asInstanceOf[js.Any], CLEARCOAT_TEXTURE = CLEARCOAT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TEXTUREDIRECTUV = CLEARCOAT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TINT = CLEARCOAT_TINT.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTURE = CLEARCOAT_TINT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTUREDIRECTUV = CLEARCOAT_TINT_TEXTUREDIRECTUV.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialClearCoatDefines]
  }
}

