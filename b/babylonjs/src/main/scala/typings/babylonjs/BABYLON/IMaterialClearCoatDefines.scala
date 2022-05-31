package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaterialClearCoatDefines extends StObject {
  
  var CLEARCOAT: Boolean
  
  var CLEARCOAT_BUMP: Boolean
  
  var CLEARCOAT_BUMPDIRECTUV: Double
  
  var CLEARCOAT_DEFAULTIOR: Boolean
  
  var CLEARCOAT_REMAP_F0: Boolean
  
  var CLEARCOAT_TEXTURE: Boolean
  
  var CLEARCOAT_TEXTUREDIRECTUV: Double
  
  var CLEARCOAT_TEXTURE_ROUGHNESS: Boolean
  
  var CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double
  
  var CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean
  
  var CLEARCOAT_TINT: Boolean
  
  var CLEARCOAT_TINT_TEXTURE: Boolean
  
  var CLEARCOAT_TINT_TEXTUREDIRECTUV: Double
  
  var CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean
  
  /** @hidden */
  var _areTexturesDirty: Boolean
}
object IMaterialClearCoatDefines {
  
  inline def apply(
    CLEARCOAT: Boolean,
    CLEARCOAT_BUMP: Boolean,
    CLEARCOAT_BUMPDIRECTUV: Double,
    CLEARCOAT_DEFAULTIOR: Boolean,
    CLEARCOAT_REMAP_F0: Boolean,
    CLEARCOAT_TEXTURE: Boolean,
    CLEARCOAT_TEXTUREDIRECTUV: Double,
    CLEARCOAT_TEXTURE_ROUGHNESS: Boolean,
    CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV: Double,
    CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL: Boolean,
    CLEARCOAT_TINT: Boolean,
    CLEARCOAT_TINT_TEXTURE: Boolean,
    CLEARCOAT_TINT_TEXTUREDIRECTUV: Double,
    CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE: Boolean,
    _areTexturesDirty: Boolean
  ): IMaterialClearCoatDefines = {
    val __obj = js.Dynamic.literal(CLEARCOAT = CLEARCOAT.asInstanceOf[js.Any], CLEARCOAT_BUMP = CLEARCOAT_BUMP.asInstanceOf[js.Any], CLEARCOAT_BUMPDIRECTUV = CLEARCOAT_BUMPDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_DEFAULTIOR = CLEARCOAT_DEFAULTIOR.asInstanceOf[js.Any], CLEARCOAT_REMAP_F0 = CLEARCOAT_REMAP_F0.asInstanceOf[js.Any], CLEARCOAT_TEXTURE = CLEARCOAT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TEXTUREDIRECTUV = CLEARCOAT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESS = CLEARCOAT_TEXTURE_ROUGHNESS.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV = CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL = CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL.asInstanceOf[js.Any], CLEARCOAT_TINT = CLEARCOAT_TINT.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTURE = CLEARCOAT_TINT_TEXTURE.asInstanceOf[js.Any], CLEARCOAT_TINT_TEXTUREDIRECTUV = CLEARCOAT_TINT_TEXTUREDIRECTUV.asInstanceOf[js.Any], CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE = CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialClearCoatDefines]
  }
  
  extension [Self <: IMaterialClearCoatDefines](x: Self) {
    
    inline def setCLEARCOAT(value: Boolean): Self = StObject.set(x, "CLEARCOAT", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_BUMP(value: Boolean): Self = StObject.set(x, "CLEARCOAT_BUMP", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_BUMPDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_BUMPDIRECTUV", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_DEFAULTIOR(value: Boolean): Self = StObject.set(x, "CLEARCOAT_DEFAULTIOR", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_REMAP_F0(value: Boolean): Self = StObject.set(x, "CLEARCOAT_REMAP_F0", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TEXTURE(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TEXTURE", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TEXTURE_ROUGHNESS(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TEXTURE_ROUGHNESS", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_TEXTURE_ROUGHNESSDIRECTUV", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TEXTURE_ROUGHNESS_IDENTICAL", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TINT(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TINT", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TINT_TEXTURE(value: Boolean): Self = StObject.set(x, "CLEARCOAT_TINT_TEXTURE", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_TINT_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "CLEARCOAT_TINT_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    inline def setCLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE(value: Boolean): Self = StObject.set(x, "CLEARCOAT_USE_ROUGHNESS_FROM_MAINTEXTURE", value.asInstanceOf[js.Any])
    
    inline def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
