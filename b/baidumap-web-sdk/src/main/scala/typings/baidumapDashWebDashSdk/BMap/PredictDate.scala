package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictDate extends js.Object {
  var hour: Double
  var weekday: Double
}

object PredictDate {
  @scala.inline
  def apply(hour: Double, weekday: Double): PredictDate = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PredictDate]
  }
}

