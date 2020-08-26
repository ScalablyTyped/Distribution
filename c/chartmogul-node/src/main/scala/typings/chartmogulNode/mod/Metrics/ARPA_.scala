package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARPA_ extends js.Object {
  var arpa: Double = js.native
  var date: String = js.native
}

object ARPA_ {
  @scala.inline
  def apply(arpa: Double, date: String): ARPA_ = {
    val __obj = js.Dynamic.literal(arpa = arpa.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARPA_]
  }
  @scala.inline
  implicit class ARPA_Ops[Self <: ARPA_] (val x: Self) extends AnyVal {
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
    def setArpa(value: Double): Self = this.set("arpa", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
  }
  
}

