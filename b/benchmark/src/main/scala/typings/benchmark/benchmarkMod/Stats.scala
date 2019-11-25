package typings.benchmark.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var deviation: Double
  var mean: Double
  var moe: Double
  var rme: Double
  var sample: js.Array[_]
  var sem: Double
  var variance: Double
}

object Stats {
  @scala.inline
  def apply(
    deviation: Double,
    mean: Double,
    moe: Double,
    rme: Double,
    sample: js.Array[_],
    sem: Double,
    variance: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(deviation = deviation.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], moe = moe.asInstanceOf[js.Any], rme = rme.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any], sem = sem.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stats]
  }
}

