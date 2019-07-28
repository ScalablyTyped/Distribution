package typings.benchmark.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("benchmark", "Deferred")
@js.native
class Deferred protected () extends js.Object {
  def this(clone: Benchmark) = this()
  var benchmark: Benchmark = js.native
  var cycles: Double = js.native
  var elapsed: Double = js.native
  var timeStamp: Double = js.native
}

