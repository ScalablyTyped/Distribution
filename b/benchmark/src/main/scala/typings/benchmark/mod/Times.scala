package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Times extends js.Object {
  var cycle: Double
  var elapsed: Double
  var period: Double
  var timeStamp: Double
}

object Times {
  @scala.inline
  def apply(cycle: Double, elapsed: Double, period: Double, timeStamp: Double): Times = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Times]
  }
}

