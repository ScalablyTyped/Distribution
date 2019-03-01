package typings
package benchmarkLib.benchmarkMod.BenchmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Times extends js.Object {
  var cycle: scala.Double
  var elapsed: scala.Double
  var period: scala.Double
  var timeStamp: scala.Double
}

object Times {
  @scala.inline
  def apply(cycle: scala.Double, elapsed: scala.Double, period: scala.Double, timeStamp: scala.Double): Times = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cycle")(cycle)
    __obj.updateDynamic("elapsed")(elapsed)
    __obj.updateDynamic("period")(period)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[Times]
  }
}

