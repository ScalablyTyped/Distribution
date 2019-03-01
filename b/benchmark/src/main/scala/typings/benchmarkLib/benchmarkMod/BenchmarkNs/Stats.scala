package typings
package benchmarkLib.benchmarkMod.BenchmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviation")(deviation)
    __obj.updateDynamic("mean")(mean)
    __obj.updateDynamic("moe")(moe)
    __obj.updateDynamic("rme")(rme)
    __obj.updateDynamic("sample")(sample)
    __obj.updateDynamic("sem")(sem)
    __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[Stats]
  }
}

