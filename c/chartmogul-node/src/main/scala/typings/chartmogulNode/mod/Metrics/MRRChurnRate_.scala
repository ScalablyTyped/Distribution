package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MRRChurnRate_ extends js.Object {
  var date: String = js.native
  var `mrr-churn-rate`: Double = js.native
}

object MRRChurnRate_ {
  @scala.inline
  def apply(date: String, `mrr-churn-rate`: Double): MRRChurnRate_ = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.updateDynamic("mrr-churn-rate")(`mrr-churn-rate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRRChurnRate_]
  }
  @scala.inline
  implicit class MRRChurnRate_Ops[Self <: MRRChurnRate_] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMrr-churn-rate`(value: Double): Self = this.set("mrr-churn-rate", value.asInstanceOf[js.Any])
  }
  
}

