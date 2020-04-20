package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaterialBRDFDefines extends js.Object {
  var BRDF_V_HEIGHT_CORRELATED: Boolean
  var MS_BRDF_ENERGY_CONSERVATION: Boolean
  var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean
  var SPHERICAL_HARMONICS: Boolean
  /** @hidden */
  var _areMiscDirty: Boolean
}

object IMaterialBRDFDefines {
  @scala.inline
  def apply(
    BRDF_V_HEIGHT_CORRELATED: Boolean,
    MS_BRDF_ENERGY_CONSERVATION: Boolean,
    SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean,
    SPHERICAL_HARMONICS: Boolean,
    _areMiscDirty: Boolean
  ): IMaterialBRDFDefines = {
    val __obj = js.Dynamic.literal(BRDF_V_HEIGHT_CORRELATED = BRDF_V_HEIGHT_CORRELATED.asInstanceOf[js.Any], MS_BRDF_ENERGY_CONSERVATION = MS_BRDF_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPECULAR_GLOSSINESS_ENERGY_CONSERVATION = SPECULAR_GLOSSINESS_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPHERICAL_HARMONICS = SPHERICAL_HARMONICS.asInstanceOf[js.Any], _areMiscDirty = _areMiscDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialBRDFDefines]
  }
}

