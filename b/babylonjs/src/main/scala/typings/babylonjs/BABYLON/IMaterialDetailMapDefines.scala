package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaterialDetailMapDefines extends StObject {
  
  var DETAIL: Boolean
  
  var DETAILDIRECTUV: Double
  
  var DETAIL_NORMALBLENDMETHOD: Double
  
  /** @hidden */
  var _areTexturesDirty: Boolean
}
object IMaterialDetailMapDefines {
  
  inline def apply(
    DETAIL: Boolean,
    DETAILDIRECTUV: Double,
    DETAIL_NORMALBLENDMETHOD: Double,
    _areTexturesDirty: Boolean
  ): IMaterialDetailMapDefines = {
    val __obj = js.Dynamic.literal(DETAIL = DETAIL.asInstanceOf[js.Any], DETAILDIRECTUV = DETAILDIRECTUV.asInstanceOf[js.Any], DETAIL_NORMALBLENDMETHOD = DETAIL_NORMALBLENDMETHOD.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialDetailMapDefines]
  }
  
  extension [Self <: IMaterialDetailMapDefines](x: Self) {
    
    inline def setDETAIL(value: Boolean): Self = StObject.set(x, "DETAIL", value.asInstanceOf[js.Any])
    
    inline def setDETAILDIRECTUV(value: Double): Self = StObject.set(x, "DETAILDIRECTUV", value.asInstanceOf[js.Any])
    
    inline def setDETAIL_NORMALBLENDMETHOD(value: Double): Self = StObject.set(x, "DETAIL_NORMALBLENDMETHOD", value.asInstanceOf[js.Any])
    
    inline def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
