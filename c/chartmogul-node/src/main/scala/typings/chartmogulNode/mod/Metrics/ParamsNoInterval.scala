package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsNoInterval extends js.Object {
  var `end-date`: String = js.native
  var geo: js.UndefOr[String] = js.native
  var plans: js.UndefOr[String] = js.native
  var `start-date`: String = js.native
}

object ParamsNoInterval {
  @scala.inline
  def apply(`end-date`: String, `start-date`: String): ParamsNoInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsNoInterval]
  }
  @scala.inline
  implicit class ParamsNoIntervalOps[Self <: ParamsNoInterval] (val x: Self) extends AnyVal {
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
    def `setEnd-date`(value: String): Self = this.set("end-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `setStart-date`(value: String): Self = this.set("start-date", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeo(value: String): Self = this.set("geo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeo: Self = this.set("geo", js.undefined)
    @scala.inline
    def setPlans(value: String): Self = this.set("plans", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlans: Self = this.set("plans", js.undefined)
  }
  
}

