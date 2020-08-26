package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YAxisConfigurationWithTime extends YAxisConfiguration {
  @JSName("tick")
  var tick_YAxisConfigurationWithTime: js.UndefOr[YTickConfigurationWithTime] = js.native
  var `type`: js.UndefOr[js.Any] = js.native
}

object YAxisConfigurationWithTime {
  @scala.inline
  def apply(): YAxisConfigurationWithTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisConfigurationWithTime]
  }
  @scala.inline
  implicit class YAxisConfigurationWithTimeOps[Self <: YAxisConfigurationWithTime] (val x: Self) extends AnyVal {
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
    def setTick(value: YTickConfigurationWithTime): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

