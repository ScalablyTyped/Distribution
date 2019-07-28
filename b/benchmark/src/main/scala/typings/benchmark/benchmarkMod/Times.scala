package typings.benchmark.benchmarkMod

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
    val __obj = js.Dynamic.literal(cycle = cycle, elapsed = elapsed, period = period, timeStamp = timeStamp)
  
    __obj.asInstanceOf[Times]
  }
}

