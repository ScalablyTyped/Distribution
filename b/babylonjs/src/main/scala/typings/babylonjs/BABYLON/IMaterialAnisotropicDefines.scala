package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaterialAnisotropicDefines extends StObject {
  
  var ANISOTROPIC: Boolean
  
  var ANISOTROPIC_TEXTURE: Boolean
  
  var ANISOTROPIC_TEXTUREDIRECTUV: Double
  
  var MAINUV1: Boolean
  
  var _areTexturesDirty: Boolean
  
  var _needUVs: Boolean
}
object IMaterialAnisotropicDefines {
  
  inline def apply(
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
  
  extension [Self <: IMaterialAnisotropicDefines](x: Self) {
    
    inline def setANISOTROPIC(value: Boolean): Self = StObject.set(x, "ANISOTROPIC", value.asInstanceOf[js.Any])
    
    inline def setANISOTROPIC_TEXTURE(value: Boolean): Self = StObject.set(x, "ANISOTROPIC_TEXTURE", value.asInstanceOf[js.Any])
    
    inline def setANISOTROPIC_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "ANISOTROPIC_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    inline def setMAINUV1(value: Boolean): Self = StObject.set(x, "MAINUV1", value.asInstanceOf[js.Any])
    
    inline def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
    
    inline def set_needUVs(value: Boolean): Self = StObject.set(x, "_needUVs", value.asInstanceOf[js.Any])
  }
}
