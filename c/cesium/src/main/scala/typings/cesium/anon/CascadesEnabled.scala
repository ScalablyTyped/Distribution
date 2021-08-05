package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CascadesEnabled extends StObject {
  
  var cascadesEnabled: js.UndefOr[Boolean] = js.undefined
  
  var darkness: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var isPointLight: js.UndefOr[Boolean] = js.undefined
  
  var lightCamera: typings.cesium.mod.Camera
  
  var maximumDistance: js.UndefOr[Double] = js.undefined
  
  var normalOffset: js.UndefOr[Boolean] = js.undefined
  
  var numberOfCascades: js.UndefOr[Double] = js.undefined
  
  var pointLightRadius: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var softShadows: js.UndefOr[Boolean] = js.undefined
}
object CascadesEnabled {
  
  inline def apply(lightCamera: typings.cesium.mod.Camera): CascadesEnabled = {
    val __obj = js.Dynamic.literal(lightCamera = lightCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadesEnabled]
  }
  
  extension [Self <: CascadesEnabled](x: Self) {
    
    inline def setCascadesEnabled(value: Boolean): Self = StObject.set(x, "cascadesEnabled", value.asInstanceOf[js.Any])
    
    inline def setCascadesEnabledUndefined: Self = StObject.set(x, "cascadesEnabled", js.undefined)
    
    inline def setDarkness(value: Double): Self = StObject.set(x, "darkness", value.asInstanceOf[js.Any])
    
    inline def setDarknessUndefined: Self = StObject.set(x, "darkness", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIsPointLight(value: Boolean): Self = StObject.set(x, "isPointLight", value.asInstanceOf[js.Any])
    
    inline def setIsPointLightUndefined: Self = StObject.set(x, "isPointLight", js.undefined)
    
    inline def setLightCamera(value: typings.cesium.mod.Camera): Self = StObject.set(x, "lightCamera", value.asInstanceOf[js.Any])
    
    inline def setMaximumDistance(value: Double): Self = StObject.set(x, "maximumDistance", value.asInstanceOf[js.Any])
    
    inline def setMaximumDistanceUndefined: Self = StObject.set(x, "maximumDistance", js.undefined)
    
    inline def setNormalOffset(value: Boolean): Self = StObject.set(x, "normalOffset", value.asInstanceOf[js.Any])
    
    inline def setNormalOffsetUndefined: Self = StObject.set(x, "normalOffset", js.undefined)
    
    inline def setNumberOfCascades(value: Double): Self = StObject.set(x, "numberOfCascades", value.asInstanceOf[js.Any])
    
    inline def setNumberOfCascadesUndefined: Self = StObject.set(x, "numberOfCascades", js.undefined)
    
    inline def setPointLightRadius(value: Double): Self = StObject.set(x, "pointLightRadius", value.asInstanceOf[js.Any])
    
    inline def setPointLightRadiusUndefined: Self = StObject.set(x, "pointLightRadius", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSoftShadows(value: Boolean): Self = StObject.set(x, "softShadows", value.asInstanceOf[js.Any])
    
    inline def setSoftShadowsUndefined: Self = StObject.set(x, "softShadows", js.undefined)
  }
}
