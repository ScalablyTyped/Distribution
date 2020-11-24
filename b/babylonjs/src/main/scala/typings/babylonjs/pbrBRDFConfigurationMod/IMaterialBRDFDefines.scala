package typings.babylonjs.pbrBRDFConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialBRDFDefines extends js.Object {
  
  var BRDF_V_HEIGHT_CORRELATED: Boolean = js.native
  
  var MS_BRDF_ENERGY_CONSERVATION: Boolean = js.native
  
  var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean = js.native
  
  var SPHERICAL_HARMONICS: Boolean = js.native
  
  /** @hidden */
  var _areMiscDirty: Boolean = js.native
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
  
  @scala.inline
  implicit class IMaterialBRDFDefinesOps[Self <: IMaterialBRDFDefines] (val x: Self) extends AnyVal {
    
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
    def setBRDF_V_HEIGHT_CORRELATED(value: Boolean): Self = this.set("BRDF_V_HEIGHT_CORRELATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMS_BRDF_ENERGY_CONSERVATION(value: Boolean): Self = this.set("MS_BRDF_ENERGY_CONSERVATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPECULAR_GLOSSINESS_ENERGY_CONSERVATION(value: Boolean): Self = this.set("SPECULAR_GLOSSINESS_ENERGY_CONSERVATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSPHERICAL_HARMONICS(value: Boolean): Self = this.set("SPHERICAL_HARMONICS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_areMiscDirty(value: Boolean): Self = this.set("_areMiscDirty", value.asInstanceOf[js.Any])
  }
}
