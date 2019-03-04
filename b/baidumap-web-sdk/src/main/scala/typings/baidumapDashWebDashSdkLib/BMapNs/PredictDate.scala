package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictDate extends js.Object {
  var hour: scala.Double
  var weekday: scala.Double
}

object PredictDate {
  @scala.inline
  def apply(hour: scala.Double, weekday: scala.Double): PredictDate = {
    val __obj = js.Dynamic.literal(hour = hour, weekday = weekday)
  
    __obj.asInstanceOf[PredictDate]
  }
}

