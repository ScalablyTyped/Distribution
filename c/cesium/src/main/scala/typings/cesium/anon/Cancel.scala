package typings.cesium.anon

import typings.cesium.mod.Camera.FlightCancelledCallback
import typings.cesium.mod.Camera.FlightCompleteCallback
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.EasingFunction
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends js.Object {
  
  var cancel: js.UndefOr[FlightCancelledCallback] = js.native
  
  var complete: js.UndefOr[FlightCompleteCallback] = js.native
  
  var convert: js.UndefOr[Boolean] = js.native
  
  var destination: Cartesian3 | typings.cesium.mod.Rectangle = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easingFunction: js.UndefOr[EasingFunction] = js.native
  
  var endTransform: js.UndefOr[Matrix4] = js.native
  
  var flyOverLongitude: js.UndefOr[Double] = js.native
  
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.native
  
  var maximumHeight: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[Direction | Heading] = js.native
  
  var pitchAdjustHeight: js.UndefOr[Double] = js.native
}
object Cancel {
  
  @scala.inline
  def apply(destination: Cartesian3 | typings.cesium.mod.Rectangle): Cancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Cartesian3 | typings.cesium.mod.Rectangle): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasingFunction(value: EasingFunction): Self = this.set("easingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasingFunction: Self = this.set("easingFunction", js.undefined)
    
    @scala.inline
    def setEndTransform(value: Matrix4): Self = this.set("endTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTransform: Self = this.set("endTransform", js.undefined)
    
    @scala.inline
    def setFlyOverLongitude(value: Double): Self = this.set("flyOverLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlyOverLongitude: Self = this.set("flyOverLongitude", js.undefined)
    
    @scala.inline
    def setFlyOverLongitudeWeight(value: Double): Self = this.set("flyOverLongitudeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlyOverLongitudeWeight: Self = this.set("flyOverLongitudeWeight", js.undefined)
    
    @scala.inline
    def setMaximumHeight(value: Double): Self = this.set("maximumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumHeight: Self = this.set("maximumHeight", js.undefined)
    
    @scala.inline
    def setOrientation(value: Direction | Heading): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPitchAdjustHeight(value: Double): Self = this.set("pitchAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchAdjustHeight: Self = this.set("pitchAdjustHeight", js.undefined)
  }
}
