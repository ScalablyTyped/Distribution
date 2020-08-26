package typings.cesium.anon

import typings.cesium.mod.ClockRange
import typings.cesium.mod.ClockStep
import typings.cesium.mod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanAnimate extends js.Object {
  var canAnimate: js.UndefOr[Boolean] = js.native
  var clockRange: js.UndefOr[ClockRange] = js.native
  var clockStep: js.UndefOr[ClockStep] = js.native
  var currentTime: js.UndefOr[JulianDate] = js.native
  var multiplier: js.UndefOr[Double] = js.native
  var shouldAnimate: js.UndefOr[Boolean] = js.native
  var startTime: js.UndefOr[JulianDate] = js.native
  var stopTime: js.UndefOr[JulianDate] = js.native
}

object CanAnimate {
  @scala.inline
  def apply(): CanAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanAnimate]
  }
  @scala.inline
  implicit class CanAnimateOps[Self <: CanAnimate] (val x: Self) extends AnyVal {
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
    def setCanAnimate(value: Boolean): Self = this.set("canAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanAnimate: Self = this.set("canAnimate", js.undefined)
    @scala.inline
    def setClockRange(value: ClockRange): Self = this.set("clockRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockRange: Self = this.set("clockRange", js.undefined)
    @scala.inline
    def setClockStep(value: ClockStep): Self = this.set("clockStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockStep: Self = this.set("clockStep", js.undefined)
    @scala.inline
    def setCurrentTime(value: JulianDate): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    @scala.inline
    def setMultiplier(value: Double): Self = this.set("multiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplier: Self = this.set("multiplier", js.undefined)
    @scala.inline
    def setShouldAnimate(value: Boolean): Self = this.set("shouldAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldAnimate: Self = this.set("shouldAnimate", js.undefined)
    @scala.inline
    def setStartTime(value: JulianDate): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStopTime(value: JulianDate): Self = this.set("stopTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopTime: Self = this.set("stopTime", js.undefined)
  }
  
}

