package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attenuation extends StObject {
  
  var attenuation: js.UndefOr[Boolean] = js.undefined
  
  var backFaceCulling: js.UndefOr[Boolean] = js.undefined
  
  var baseResolution: js.UndefOr[Double] = js.undefined
  
  var eyeDomeLighting: js.UndefOr[Boolean] = js.undefined
  
  var eyeDomeLightingRadius: js.UndefOr[Double] = js.undefined
  
  var eyeDomeLightingStrength: js.UndefOr[Double] = js.undefined
  
  var geometricErrorScale: js.UndefOr[Double] = js.undefined
  
  var maximumAttenuation: js.UndefOr[Double] = js.undefined
  
  var normalShading: js.UndefOr[Boolean] = js.undefined
}
object Attenuation {
  
  inline def apply(): Attenuation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attenuation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attenuation] (val x: Self) extends AnyVal {
    
    inline def setAttenuation(value: Boolean): Self = StObject.set(x, "attenuation", value.asInstanceOf[js.Any])
    
    inline def setAttenuationUndefined: Self = StObject.set(x, "attenuation", js.undefined)
    
    inline def setBackFaceCulling(value: Boolean): Self = StObject.set(x, "backFaceCulling", value.asInstanceOf[js.Any])
    
    inline def setBackFaceCullingUndefined: Self = StObject.set(x, "backFaceCulling", js.undefined)
    
    inline def setBaseResolution(value: Double): Self = StObject.set(x, "baseResolution", value.asInstanceOf[js.Any])
    
    inline def setBaseResolutionUndefined: Self = StObject.set(x, "baseResolution", js.undefined)
    
    inline def setEyeDomeLighting(value: Boolean): Self = StObject.set(x, "eyeDomeLighting", value.asInstanceOf[js.Any])
    
    inline def setEyeDomeLightingRadius(value: Double): Self = StObject.set(x, "eyeDomeLightingRadius", value.asInstanceOf[js.Any])
    
    inline def setEyeDomeLightingRadiusUndefined: Self = StObject.set(x, "eyeDomeLightingRadius", js.undefined)
    
    inline def setEyeDomeLightingStrength(value: Double): Self = StObject.set(x, "eyeDomeLightingStrength", value.asInstanceOf[js.Any])
    
    inline def setEyeDomeLightingStrengthUndefined: Self = StObject.set(x, "eyeDomeLightingStrength", js.undefined)
    
    inline def setEyeDomeLightingUndefined: Self = StObject.set(x, "eyeDomeLighting", js.undefined)
    
    inline def setGeometricErrorScale(value: Double): Self = StObject.set(x, "geometricErrorScale", value.asInstanceOf[js.Any])
    
    inline def setGeometricErrorScaleUndefined: Self = StObject.set(x, "geometricErrorScale", js.undefined)
    
    inline def setMaximumAttenuation(value: Double): Self = StObject.set(x, "maximumAttenuation", value.asInstanceOf[js.Any])
    
    inline def setMaximumAttenuationUndefined: Self = StObject.set(x, "maximumAttenuation", js.undefined)
    
    inline def setNormalShading(value: Boolean): Self = StObject.set(x, "normalShading", value.asInstanceOf[js.Any])
    
    inline def setNormalShadingUndefined: Self = StObject.set(x, "normalShading", js.undefined)
  }
}
