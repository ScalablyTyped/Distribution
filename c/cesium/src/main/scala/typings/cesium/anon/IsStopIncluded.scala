package typings.cesium.anon

import typings.cesium.mod.JulianDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsStopIncluded extends js.Object {
  var isStartIncluded: js.UndefOr[Boolean] = js.native
  var isStopIncluded: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[JulianDate] = js.native
  var stop: js.UndefOr[JulianDate] = js.native
}

object IsStopIncluded {
  @scala.inline
  def apply(): IsStopIncluded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsStopIncluded]
  }
  @scala.inline
  implicit class IsStopIncludedOps[Self <: IsStopIncluded] (val x: Self) extends AnyVal {
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
    def setIsStartIncluded(value: Boolean): Self = this.set("isStartIncluded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStartIncluded: Self = this.set("isStartIncluded", js.undefined)
    @scala.inline
    def setIsStopIncluded(value: Boolean): Self = this.set("isStopIncluded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStopIncluded: Self = this.set("isStopIncluded", js.undefined)
    @scala.inline
    def setStart(value: JulianDate): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: JulianDate): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

