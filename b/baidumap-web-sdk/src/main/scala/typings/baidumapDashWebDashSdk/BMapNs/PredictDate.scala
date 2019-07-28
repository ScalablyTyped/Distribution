package typings.baidumapDashWebDashSdk.BMapNs

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
    val __obj = js.Dynamic.literal(hour = hour, weekday = weekday)
  
    __obj.asInstanceOf[PredictDate]
  }
}

