package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumFrameRateAfterWarmup extends StObject {
  
  var minimumFrameRateAfterWarmup: js.UndefOr[Double] = js.undefined
  
  var minimumFrameRateDuringWarmup: js.UndefOr[Double] = js.undefined
  
  var quietPeriod: js.UndefOr[Double] = js.undefined
  
  var samplingWindow: js.UndefOr[Double] = js.undefined
  
  var scene: typings.cesium.mod.Scene
  
  var warmupPeriod: js.UndefOr[Double] = js.undefined
}
object MinimumFrameRateAfterWarmup {
  
  @scala.inline
  def apply(scene: typings.cesium.mod.Scene): MinimumFrameRateAfterWarmup = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumFrameRateAfterWarmup]
  }
  
  @scala.inline
  implicit class MinimumFrameRateAfterWarmupMutableBuilder[Self <: MinimumFrameRateAfterWarmup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimumFrameRateAfterWarmup(value: Double): Self = StObject.set(x, "minimumFrameRateAfterWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFrameRateAfterWarmupUndefined: Self = StObject.set(x, "minimumFrameRateAfterWarmup", js.undefined)
    
    @scala.inline
    def setMinimumFrameRateDuringWarmup(value: Double): Self = StObject.set(x, "minimumFrameRateDuringWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFrameRateDuringWarmupUndefined: Self = StObject.set(x, "minimumFrameRateDuringWarmup", js.undefined)
    
    @scala.inline
    def setQuietPeriod(value: Double): Self = StObject.set(x, "quietPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietPeriodUndefined: Self = StObject.set(x, "quietPeriod", js.undefined)
    
    @scala.inline
    def setSamplingWindow(value: Double): Self = StObject.set(x, "samplingWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingWindowUndefined: Self = StObject.set(x, "samplingWindow", js.undefined)
    
    @scala.inline
    def setScene(value: typings.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmupPeriod(value: Double): Self = StObject.set(x, "warmupPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmupPeriodUndefined: Self = StObject.set(x, "warmupPeriod", js.undefined)
  }
}
