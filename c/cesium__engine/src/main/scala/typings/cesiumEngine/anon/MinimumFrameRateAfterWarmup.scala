package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumFrameRateAfterWarmup extends StObject {
  
  var minimumFrameRateAfterWarmup: js.UndefOr[Double] = js.undefined
  
  var minimumFrameRateDuringWarmup: js.UndefOr[Double] = js.undefined
  
  var quietPeriod: js.UndefOr[Double] = js.undefined
  
  var samplingWindow: js.UndefOr[Double] = js.undefined
  
  var scene: Scene
  
  var warmupPeriod: js.UndefOr[Double] = js.undefined
}
object MinimumFrameRateAfterWarmup {
  
  inline def apply(scene: Scene): MinimumFrameRateAfterWarmup = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumFrameRateAfterWarmup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinimumFrameRateAfterWarmup] (val x: Self) extends AnyVal {
    
    inline def setMinimumFrameRateAfterWarmup(value: Double): Self = StObject.set(x, "minimumFrameRateAfterWarmup", value.asInstanceOf[js.Any])
    
    inline def setMinimumFrameRateAfterWarmupUndefined: Self = StObject.set(x, "minimumFrameRateAfterWarmup", js.undefined)
    
    inline def setMinimumFrameRateDuringWarmup(value: Double): Self = StObject.set(x, "minimumFrameRateDuringWarmup", value.asInstanceOf[js.Any])
    
    inline def setMinimumFrameRateDuringWarmupUndefined: Self = StObject.set(x, "minimumFrameRateDuringWarmup", js.undefined)
    
    inline def setQuietPeriod(value: Double): Self = StObject.set(x, "quietPeriod", value.asInstanceOf[js.Any])
    
    inline def setQuietPeriodUndefined: Self = StObject.set(x, "quietPeriod", js.undefined)
    
    inline def setSamplingWindow(value: Double): Self = StObject.set(x, "samplingWindow", value.asInstanceOf[js.Any])
    
    inline def setSamplingWindowUndefined: Self = StObject.set(x, "samplingWindow", js.undefined)
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setWarmupPeriod(value: Double): Self = StObject.set(x, "warmupPeriod", value.asInstanceOf[js.Any])
    
    inline def setWarmupPeriodUndefined: Self = StObject.set(x, "warmupPeriod", js.undefined)
  }
}
