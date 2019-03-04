package typings
package benchmarkLib.benchmarkMod.BenchmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred extends js.Object {
  var benchmark: benchmarkLib.benchmarkMod.Benchmark
  var cycles: scala.Double
  var elapsed: scala.Double
  var timeStamp: scala.Double
}

object Deferred {
  @scala.inline
  def apply(
    benchmark: benchmarkLib.benchmarkMod.Benchmark,
    cycles: scala.Double,
    elapsed: scala.Double,
    timeStamp: scala.Double
  ): Deferred = {
    val __obj = js.Dynamic.literal(benchmark = benchmark, cycles = cycles, elapsed = elapsed, timeStamp = timeStamp)
  
    __obj.asInstanceOf[Deferred]
  }
}

