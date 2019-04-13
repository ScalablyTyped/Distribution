package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var deviation: scala.Double
  var mean: scala.Double
  var moe: scala.Double
  var rme: scala.Double
  var sample: js.Array[_]
  var sem: scala.Double
  var variance: scala.Double
}

object Stats {
  @scala.inline
  def apply(
    deviation: scala.Double,
    mean: scala.Double,
    moe: scala.Double,
    rme: scala.Double,
    sample: js.Array[_],
    sem: scala.Double,
    variance: scala.Double
  ): Stats = {
    val __obj = js.Dynamic.literal(deviation = deviation, mean = mean, moe = moe, rme = rme, sample = sample, sem = sem, variance = variance)
  
    __obj.asInstanceOf[Stats]
  }
}

