package typings.babylonjs.pbrSheenConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaterialSheenDefines extends js.Object {
  var SHEEN: Boolean
  var SHEEN_LINKWITHALBEDO: Boolean
  var SHEEN_TEXTURE: Boolean
  var SHEEN_TEXTUREDIRECTUV: Double
  /** @hidden */
  var _areTexturesDirty: Boolean
}

object IMaterialSheenDefines {
  @scala.inline
  def apply(
    SHEEN: Boolean,
    SHEEN_LINKWITHALBEDO: Boolean,
    SHEEN_TEXTURE: Boolean,
    SHEEN_TEXTUREDIRECTUV: Double,
    _areTexturesDirty: Boolean
  ): IMaterialSheenDefines = {
    val __obj = js.Dynamic.literal(SHEEN = SHEEN.asInstanceOf[js.Any], SHEEN_LINKWITHALBEDO = SHEEN_LINKWITHALBEDO.asInstanceOf[js.Any], SHEEN_TEXTURE = SHEEN_TEXTURE.asInstanceOf[js.Any], SHEEN_TEXTUREDIRECTUV = SHEEN_TEXTUREDIRECTUV.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMaterialSheenDefines]
  }
}

