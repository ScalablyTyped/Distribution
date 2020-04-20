package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LTV_ extends js.Object {
  var date: String
  var ltv: Double
}

object LTV_ {
  @scala.inline
  def apply(date: String, ltv: Double): LTV_ = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ltv = ltv.asInstanceOf[js.Any])
    __obj.asInstanceOf[LTV_]
  }
}

