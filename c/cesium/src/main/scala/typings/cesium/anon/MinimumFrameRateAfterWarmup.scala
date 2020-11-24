package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimumFrameRateAfterWarmup extends js.Object {
  
  var minimumFrameRateAfterWarmup: js.UndefOr[Double] = js.native
  
  var minimumFrameRateDuringWarmup: js.UndefOr[Double] = js.native
  
  var quietPeriod: js.UndefOr[Double] = js.native
  
  var samplingWindow: js.UndefOr[Double] = js.native
  
  var scene: typings.cesium.mod.Scene = js.native
  
  var warmupPeriod: js.UndefOr[Double] = js.native
}
object MinimumFrameRateAfterWarmup {
  
  @scala.inline
  def apply(scene: typings.cesium.mod.Scene): MinimumFrameRateAfterWarmup = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumFrameRateAfterWarmup]
  }
  
  @scala.inline
  implicit class MinimumFrameRateAfterWarmupOps[Self <: MinimumFrameRateAfterWarmup] (val x: Self) extends AnyVal {
    
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
    def setScene(value: typings.cesium.mod.Scene): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFrameRateAfterWarmup(value: Double): Self = this.set("minimumFrameRateAfterWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFrameRateAfterWarmup: Self = this.set("minimumFrameRateAfterWarmup", js.undefined)
    
    @scala.inline
    def setMinimumFrameRateDuringWarmup(value: Double): Self = this.set("minimumFrameRateDuringWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFrameRateDuringWarmup: Self = this.set("minimumFrameRateDuringWarmup", js.undefined)
    
    @scala.inline
    def setQuietPeriod(value: Double): Self = this.set("quietPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuietPeriod: Self = this.set("quietPeriod", js.undefined)
    
    @scala.inline
    def setSamplingWindow(value: Double): Self = this.set("samplingWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingWindow: Self = this.set("samplingWindow", js.undefined)
    
    @scala.inline
    def setWarmupPeriod(value: Double): Self = this.set("warmupPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarmupPeriod: Self = this.set("warmupPeriod", js.undefined)
  }
}
