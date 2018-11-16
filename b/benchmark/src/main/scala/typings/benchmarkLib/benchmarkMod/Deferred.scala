package typings
package benchmarkLib.benchmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("benchmark", "Deferred")
@js.native
class Deferred protected ()
  extends benchmarkLib.benchmarkMod.BenchmarkNs.Deferred {
  def this(clone: Benchmark) = this()
  /* CompleteClass */
  override var benchmark: Benchmark = js.native
  /* CompleteClass */
  override var cycles: scala.Double = js.native
  /* CompleteClass */
  override var elapsed: scala.Double = js.native
  /* CompleteClass */
  override var timeStamp: scala.Double = js.native
}

