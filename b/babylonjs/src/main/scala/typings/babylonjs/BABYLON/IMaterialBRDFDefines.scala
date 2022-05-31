package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaterialBRDFDefines extends StObject {
  
  var BRDF_V_HEIGHT_CORRELATED: Boolean
  
  var MS_BRDF_ENERGY_CONSERVATION: Boolean
  
  var SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean
  
  var SPHERICAL_HARMONICS: Boolean
  
  /** @hidden */
  var _areMiscDirty: Boolean
}
object IMaterialBRDFDefines {
  
  inline def apply(
    BRDF_V_HEIGHT_CORRELATED: Boolean,
    MS_BRDF_ENERGY_CONSERVATION: Boolean,
    SPECULAR_GLOSSINESS_ENERGY_CONSERVATION: Boolean,
    SPHERICAL_HARMONICS: Boolean,
    _areMiscDirty: Boolean
  ): IMaterialBRDFDefines = {
    val __obj = js.Dynamic.literal(BRDF_V_HEIGHT_CORRELATED = BRDF_V_HEIGHT_CORRELATED.asInstanceOf[js.Any], MS_BRDF_ENERGY_CONSERVATION = MS_BRDF_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPECULAR_GLOSSINESS_ENERGY_CONSERVATION = SPECULAR_GLOSSINESS_ENERGY_CONSERVATION.asInstanceOf[js.Any], SPHERICAL_HARMONICS = SPHERICAL_HARMONICS.asInstanceOf[js.Any], _areMiscDirty = _areMiscDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialBRDFDefines]
  }
  
  extension [Self <: IMaterialBRDFDefines](x: Self) {
    
    inline def setBRDF_V_HEIGHT_CORRELATED(value: Boolean): Self = StObject.set(x, "BRDF_V_HEIGHT_CORRELATED", value.asInstanceOf[js.Any])
    
    inline def setMS_BRDF_ENERGY_CONSERVATION(value: Boolean): Self = StObject.set(x, "MS_BRDF_ENERGY_CONSERVATION", value.asInstanceOf[js.Any])
    
    inline def setSPECULAR_GLOSSINESS_ENERGY_CONSERVATION(value: Boolean): Self = StObject.set(x, "SPECULAR_GLOSSINESS_ENERGY_CONSERVATION", value.asInstanceOf[js.Any])
    
    inline def setSPHERICAL_HARMONICS(value: Boolean): Self = StObject.set(x, "SPHERICAL_HARMONICS", value.asInstanceOf[js.Any])
    
    inline def set_areMiscDirty(value: Boolean): Self = StObject.set(x, "_areMiscDirty", value.asInstanceOf[js.Any])
  }
}
