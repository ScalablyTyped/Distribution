package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMotionEventRotationRateInit extends StObject {
  
  var alpha: js.UndefOr[Double | Null] = js.undefined
  
  var beta: js.UndefOr[Double | Null] = js.undefined
  
  var gamma: js.UndefOr[Double | Null] = js.undefined
}
object DeviceMotionEventRotationRateInit {
  
  inline def apply(): DeviceMotionEventRotationRateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventRotationRateInit]
  }
  
  extension [Self <: DeviceMotionEventRotationRateInit](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    inline def setBetaNull: Self = StObject.set(x, "beta", null)
    
    inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaNull: Self = StObject.set(x, "gamma", null)
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
  }
}
